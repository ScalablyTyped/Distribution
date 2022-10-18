package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.SortDirection")
@js.native
open class SortDirection protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.SortDirection {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SortDirection {
  
  @JSImport("mendixmodelsdk", "pages.SortDirection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.SortDirection.Ascending")
  @js.native
  def Ascending: typings.mendixmodelsdk.srcGenPagesMod.pages.SortDirection = js.native
  inline def Ascending_=(x: typings.mendixmodelsdk.srcGenPagesMod.pages.SortDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ascending")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.SortDirection.Descending")
  @js.native
  def Descending: typings.mendixmodelsdk.srcGenPagesMod.pages.SortDirection = js.native
  inline def Descending_=(x: typings.mendixmodelsdk.srcGenPagesMod.pages.SortDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Descending")(x.asInstanceOf[js.Any])
}
