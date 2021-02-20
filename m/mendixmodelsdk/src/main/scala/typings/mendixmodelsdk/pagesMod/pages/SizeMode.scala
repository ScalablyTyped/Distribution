package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SizeMode")
@js.native
class SizeMode protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SizeMode {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SizeMode")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SizeMode.Auto")
  @js.native
  def Auto: SizeMode = js.native
  @scala.inline
  def Auto_=(x: SizeMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Auto")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SizeMode.Percentage")
  @js.native
  def Percentage: SizeMode = js.native
  @scala.inline
  def Percentage_=(x: SizeMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Percentage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.SizeMode.Pixels")
  @js.native
  def Pixels: SizeMode = js.native
  @scala.inline
  def Pixels_=(x: SizeMode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixels")(x.asInstanceOf[js.Any])
}
