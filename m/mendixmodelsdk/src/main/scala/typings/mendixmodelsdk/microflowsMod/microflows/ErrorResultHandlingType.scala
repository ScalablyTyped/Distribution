package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorResultHandlingType")
@js.native
class ErrorResultHandlingType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ErrorResultHandlingType {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorResultHandlingType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorResultHandlingType.HttpResponse")
  @js.native
  def HttpResponse: ErrorResultHandlingType = js.native
  inline def HttpResponse_=(x: ErrorResultHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpResponse")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ErrorResultHandlingType.None")
  @js.native
  def None: ErrorResultHandlingType = js.native
  inline def None_=(x: ErrorResultHandlingType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
}
