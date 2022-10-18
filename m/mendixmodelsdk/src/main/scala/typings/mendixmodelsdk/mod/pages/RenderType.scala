package typings.mendixmodelsdk.mod.pages

import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.RenderType")
@js.native
open class RenderType protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.pages.RenderType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RenderType {
  
  @JSImport("mendixmodelsdk", "pages.RenderType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.RenderType.Button")
  @js.native
  def Button: typings.mendixmodelsdk.srcGenPagesMod.pages.RenderType = js.native
  inline def Button_=(x: typings.mendixmodelsdk.srcGenPagesMod.pages.RenderType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.RenderType.Link")
  @js.native
  def Link: typings.mendixmodelsdk.srcGenPagesMod.pages.RenderType = js.native
  inline def Link_=(x: typings.mendixmodelsdk.srcGenPagesMod.pages.RenderType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
}
