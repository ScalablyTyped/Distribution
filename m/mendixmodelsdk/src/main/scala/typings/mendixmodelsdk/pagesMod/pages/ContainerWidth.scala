package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.ContainerWidth")
@js.native
open class ContainerWidth protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ContainerWidth {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ContainerWidth")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ContainerWidth.FixedWidth")
  @js.native
  def FixedWidth: ContainerWidth = js.native
  inline def FixedWidth_=(x: ContainerWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FixedWidth")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ContainerWidth.FullWidth")
  @js.native
  def FullWidth: ContainerWidth = js.native
  inline def FullWidth_=(x: ContainerWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FullWidth")(x.asInstanceOf[js.Any])
}
