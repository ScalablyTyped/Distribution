package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollBehavior")
@js.native
class ScrollBehavior protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ScrollBehavior {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollBehavior")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollBehavior.FullWidget")
  @js.native
  def FullWidget: ScrollBehavior = js.native
  @scala.inline
  def FullWidget_=(x: ScrollBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FullWidget")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollBehavior.PerRegion")
  @js.native
  def PerRegion: ScrollBehavior = js.native
  @scala.inline
  def PerRegion_=(x: ScrollBehavior): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PerRegion")(x.asInstanceOf[js.Any])
}
