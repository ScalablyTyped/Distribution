package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MobileFooterType")
@js.native
class MobileFooterType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object MobileFooterType {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MobileFooterType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MobileFooterType.Custom")
  @js.native
  def Custom: MobileFooterType = js.native
  @scala.inline
  def Custom_=(x: MobileFooterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Custom")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MobileFooterType.MenuBar")
  @js.native
  def MenuBar: MobileFooterType = js.native
  @scala.inline
  def MenuBar_=(x: MobileFooterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuBar")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MobileFooterType.None")
  @js.native
  def None: MobileFooterType = js.native
  @scala.inline
  def None_=(x: MobileFooterType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("None")(x.asInstanceOf[js.Any])
}
