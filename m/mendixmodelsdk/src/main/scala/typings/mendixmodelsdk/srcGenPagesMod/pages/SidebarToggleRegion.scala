package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SidebarToggleRegion")
@js.native
open class SidebarToggleRegion protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SidebarToggleRegion {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SidebarToggleRegion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SidebarToggleRegion.Left")
  @js.native
  def Left: SidebarToggleRegion = js.native
  inline def Left_=(x: SidebarToggleRegion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Left")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SidebarToggleRegion.Right")
  @js.native
  def Right: SidebarToggleRegion = js.native
  inline def Right_=(x: SidebarToggleRegion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Right")(x.asInstanceOf[js.Any])
}
