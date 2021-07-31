package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormLocation")
@js.native
class FormLocation protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object FormLocation {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormLocation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormLocation.Content")
  @js.native
  def Content: FormLocation = js.native
  @scala.inline
  def Content_=(x: FormLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormLocation.ModalPopup")
  @js.native
  def ModalPopup: FormLocation = js.native
  @scala.inline
  def ModalPopup_=(x: FormLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ModalPopup")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.FormLocation.Popup")
  @js.native
  def Popup: FormLocation = js.native
  @scala.inline
  def Popup_=(x: FormLocation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Popup")(x.asInstanceOf[js.Any])
}
