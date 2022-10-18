package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeLayoutType")
@js.native
open class NativeLayoutType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object NativeLayoutType {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeLayoutType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeLayoutType.Default")
  @js.native
  def Default: NativeLayoutType = js.native
  inline def Default_=(x: NativeLayoutType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeLayoutType.Popup")
  @js.native
  def Popup: NativeLayoutType = js.native
  inline def Popup_=(x: NativeLayoutType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Popup")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.NativeLayoutType.TopLevel")
  @js.native
  def TopLevel: NativeLayoutType = js.native
  inline def TopLevel_=(x: NativeLayoutType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TopLevel")(x.asInstanceOf[js.Any])
}
