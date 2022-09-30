package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.ShowMessageType")
@js.native
open class ShowMessageType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.ShowMessageType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ShowMessageType {
  
  @JSImport("mendixmodelsdk", "microflows.ShowMessageType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ShowMessageType.Error")
  @js.native
  def Error: typings.mendixmodelsdk.microflowsMod.microflows.ShowMessageType = js.native
  inline def Error_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ShowMessageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Error")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ShowMessageType.Information")
  @js.native
  def Information: typings.mendixmodelsdk.microflowsMod.microflows.ShowMessageType = js.native
  inline def Information_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ShowMessageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Information")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ShowMessageType.Warning")
  @js.native
  def Warning: typings.mendixmodelsdk.microflowsMod.microflows.ShowMessageType = js.native
  inline def Warning_=(x: typings.mendixmodelsdk.microflowsMod.microflows.ShowMessageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Warning")(x.asInstanceOf[js.Any])
}
