package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutModeType")
@js.native
class LayoutModeType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object LayoutModeType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutModeType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutModeType.Headline")
  @js.native
  def Headline: LayoutModeType = js.native
  inline def Headline_=(x: LayoutModeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Headline")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.LayoutModeType.Sidebar")
  @js.native
  def Sidebar: LayoutModeType = js.native
  inline def Sidebar_=(x: LayoutModeType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sidebar")(x.asInstanceOf[js.Any])
}
