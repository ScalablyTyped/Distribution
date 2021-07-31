package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelectorRenderModeType")
@js.native
class ReferenceSelectorRenderModeType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ReferenceSelectorRenderModeType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelectorRenderModeType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelectorRenderModeType.DropDown")
  @js.native
  def DropDown: ReferenceSelectorRenderModeType = js.native
  @scala.inline
  def DropDown_=(x: ReferenceSelectorRenderModeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DropDown")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ReferenceSelectorRenderModeType.Form")
  @js.native
  def Form: ReferenceSelectorRenderModeType = js.native
  @scala.inline
  def Form_=(x: ReferenceSelectorRenderModeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
}
