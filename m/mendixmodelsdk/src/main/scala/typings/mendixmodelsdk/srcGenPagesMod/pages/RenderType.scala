package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.RenderType")
@js.native
open class RenderType protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object RenderType {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RenderType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RenderType.Button")
  @js.native
  def Button: RenderType = js.native
  inline def Button_=(x: RenderType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.RenderType.Link")
  @js.native
  def Link: RenderType = js.native
  inline def Link_=(x: RenderType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
}
