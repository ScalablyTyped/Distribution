package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.UnitEnum")
@js.native
open class UnitEnum protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object UnitEnum {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.UnitEnum")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.UnitEnum.Pixels")
  @js.native
  def Pixels: UnitEnum = js.native
  inline def Pixels_=(x: UnitEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixels")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.UnitEnum.Weight")
  @js.native
  def Weight: UnitEnum = js.native
  inline def Weight_=(x: UnitEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Weight")(x.asInstanceOf[js.Any])
}
