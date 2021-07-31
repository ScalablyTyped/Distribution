package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleRegion")
@js.native
class SidebarToggleRegion protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SidebarToggleRegion {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleRegion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleRegion.Left")
  @js.native
  def Left: SidebarToggleRegion = js.native
  @scala.inline
  def Left_=(x: SidebarToggleRegion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Left")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SidebarToggleRegion.Right")
  @js.native
  def Right: SidebarToggleRegion = js.native
  @scala.inline
  def Right_=(x: SidebarToggleRegion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Right")(x.asInstanceOf[js.Any])
}
