package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ShowPagingBarType")
@js.native
class ShowPagingBarType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ShowPagingBarType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ShowPagingBarType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ShowPagingBarType.No")
  @js.native
  def No: ShowPagingBarType = js.native
  inline def No_=(x: ShowPagingBarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("No")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ShowPagingBarType.YesWithTotalCount")
  @js.native
  def YesWithTotalCount: ShowPagingBarType = js.native
  inline def YesWithTotalCount_=(x: ShowPagingBarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YesWithTotalCount")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ShowPagingBarType.YesWithoutTotalCount")
  @js.native
  def YesWithoutTotalCount: ShowPagingBarType = js.native
  inline def YesWithoutTotalCount_=(x: ShowPagingBarType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YesWithoutTotalCount")(x.asInstanceOf[js.Any])
}
