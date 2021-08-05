package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.SelectionType")
@js.native
class SelectionType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.SelectionType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SelectionType {
  
  @JSImport("mendixmodelsdk", "pages.SelectionType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.SelectionType.SelectAll")
  @js.native
  def SelectAll: typings.mendixmodelsdk.pagesMod.pages.SelectionType = js.native
  inline def SelectAll_=(x: typings.mendixmodelsdk.pagesMod.pages.SelectionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectAll")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.SelectionType.SelectPage")
  @js.native
  def SelectPage: typings.mendixmodelsdk.pagesMod.pages.SelectionType = js.native
  inline def SelectPage_=(x: typings.mendixmodelsdk.pagesMod.pages.SelectionType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectPage")(x.asInstanceOf[js.Any])
}
