package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeRenderMode")
@js.native
open class NativeRenderMode protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object NativeRenderMode {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeRenderMode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeRenderMode.CheckBox")
  @js.native
  def CheckBox: NativeRenderMode = js.native
  inline def CheckBox_=(x: NativeRenderMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CheckBox")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeRenderMode.Switch")
  @js.native
  def Switch: NativeRenderMode = js.native
  inline def Switch_=(x: NativeRenderMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Switch")(x.asInstanceOf[js.Any])
}
