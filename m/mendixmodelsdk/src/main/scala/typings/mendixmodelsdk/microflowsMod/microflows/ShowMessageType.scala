package typings.mendixmodelsdk.microflowsMod.microflows

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ShowMessageType")
@js.native
class ShowMessageType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ShowMessageType {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ShowMessageType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ShowMessageType.Error")
  @js.native
  def Error: ShowMessageType = js.native
  inline def Error_=(x: ShowMessageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ShowMessageType.Information")
  @js.native
  def Information: ShowMessageType = js.native
  inline def Information_=(x: ShowMessageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Information")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ShowMessageType.Warning")
  @js.native
  def Warning: ShowMessageType = js.native
  inline def Warning_=(x: ShowMessageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
}
