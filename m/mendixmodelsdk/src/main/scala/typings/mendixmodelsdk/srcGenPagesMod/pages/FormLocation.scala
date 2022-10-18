package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.FormLocation")
@js.native
open class FormLocation protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object FormLocation {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormLocation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormLocation.Content")
  @js.native
  def Content: FormLocation = js.native
  inline def Content_=(x: FormLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormLocation.ModalPopup")
  @js.native
  def ModalPopup: FormLocation = js.native
  inline def ModalPopup_=(x: FormLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModalPopup")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.FormLocation.Popup")
  @js.native
  def Popup: FormLocation = js.native
  inline def Popup_=(x: FormLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Popup")(x.asInstanceOf[js.Any])
}
