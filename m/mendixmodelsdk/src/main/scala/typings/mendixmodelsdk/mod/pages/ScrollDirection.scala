package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.ScrollDirection")
@js.native
open class ScrollDirection protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.ScrollDirection {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ScrollDirection {
  
  @JSImport("mendixmodelsdk", "pages.ScrollDirection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollDirection.Horizontal")
  @js.native
  def Horizontal: typings.mendixmodelsdk.srcGenPagesMod.pages.ScrollDirection = js.native
  inline def Horizontal_=(x: typings.mendixmodelsdk.srcGenPagesMod.pages.ScrollDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Horizontal")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.ScrollDirection.Vertical")
  @js.native
  def Vertical: typings.mendixmodelsdk.srcGenPagesMod.pages.ScrollDirection = js.native
  inline def Vertical_=(x: typings.mendixmodelsdk.srcGenPagesMod.pages.ScrollDirection): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Vertical")(x.asInstanceOf[js.Any])
}
