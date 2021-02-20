package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.SortDirection")
@js.native
class SortDirection protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.pages.SortDirection {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SortDirection {
  
  @JSImport("mendixmodelsdk", "pages.SortDirection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.SortDirection.Ascending")
  @js.native
  def Ascending: typings.mendixmodelsdk.pagesMod.pages.SortDirection = js.native
  @scala.inline
  def Ascending_=(x: typings.mendixmodelsdk.pagesMod.pages.SortDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.SortDirection.Descending")
  @js.native
  def Descending: typings.mendixmodelsdk.pagesMod.pages.SortDirection = js.native
  @scala.inline
  def Descending_=(x: typings.mendixmodelsdk.pagesMod.pages.SortDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
}
