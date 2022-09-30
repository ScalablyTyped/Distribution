package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SidebarToggleMode")
@js.native
open class SidebarToggleMode protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SidebarToggleMode {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SidebarToggleMode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SidebarToggleMode.PushContentAside")
  @js.native
  def PushContentAside: SidebarToggleMode = js.native
  inline def PushContentAside_=(x: SidebarToggleMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PushContentAside")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SidebarToggleMode.ShrinkContent")
  @js.native
  def ShrinkContent: SidebarToggleMode = js.native
  inline def ShrinkContent_=(x: SidebarToggleMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShrinkContent")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SidebarToggleMode.SlideOverContent")
  @js.native
  def SlideOverContent: SidebarToggleMode = js.native
  inline def SlideOverContent_=(x: SidebarToggleMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SlideOverContent")(x.asInstanceOf[js.Any])
}
