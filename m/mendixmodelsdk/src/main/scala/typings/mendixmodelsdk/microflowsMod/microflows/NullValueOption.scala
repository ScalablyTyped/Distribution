package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/microflows", "microflows.NullValueOption")
@js.native
open class NullValueOption protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object NullValueOption {
  
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.NullValueOption")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.NullValueOption.LeaveOutElement")
  @js.native
  def LeaveOutElement: NullValueOption = js.native
  inline def LeaveOutElement_=(x: NullValueOption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeaveOutElement")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/microflows", "microflows.NullValueOption.SendAsNil")
  @js.native
  def SendAsNil: NullValueOption = js.native
  inline def SendAsNil_=(x: NullValueOption): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SendAsNil")(x.asInstanceOf[js.Any])
}
