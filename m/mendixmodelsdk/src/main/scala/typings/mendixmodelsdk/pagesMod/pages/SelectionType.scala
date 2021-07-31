package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectionType")
@js.native
class SelectionType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SelectionType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectionType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectionType.SelectAll")
  @js.native
  def SelectAll: SelectionType = js.native
  @scala.inline
  def SelectAll_=(x: SelectionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectAll")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SelectionType.SelectPage")
  @js.native
  def SelectPage: SelectionType = js.native
  @scala.inline
  def SelectPage_=(x: SelectionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectPage")(x.asInstanceOf[js.Any])
}
