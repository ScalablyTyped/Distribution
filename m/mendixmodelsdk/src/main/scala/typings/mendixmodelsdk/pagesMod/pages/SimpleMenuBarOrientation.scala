package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.SimpleMenuBarOrientation")
@js.native
open class SimpleMenuBarOrientation protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SimpleMenuBarOrientation {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SimpleMenuBarOrientation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SimpleMenuBarOrientation.Horizontal")
  @js.native
  def Horizontal: SimpleMenuBarOrientation = js.native
  inline def Horizontal_=(x: SimpleMenuBarOrientation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.SimpleMenuBarOrientation.Vertical")
  @js.native
  def Vertical: SimpleMenuBarOrientation = js.native
  inline def Vertical_=(x: SimpleMenuBarOrientation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
}
