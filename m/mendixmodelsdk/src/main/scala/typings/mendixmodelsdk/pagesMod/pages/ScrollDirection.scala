package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollDirection")
@js.native
class ScrollDirection protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ScrollDirection {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollDirection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollDirection.Horizontal")
  @js.native
  def Horizontal: ScrollDirection = js.native
  @scala.inline
  def Horizontal_=(x: ScrollDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ScrollDirection.Vertical")
  @js.native
  def Vertical: ScrollDirection = js.native
  @scala.inline
  def Vertical_=(x: ScrollDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
}
