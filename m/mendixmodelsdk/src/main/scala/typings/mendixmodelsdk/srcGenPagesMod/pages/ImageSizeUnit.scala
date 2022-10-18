package typings.mendixmodelsdk.srcGenPagesMod.pages

import typings.mendixmodelsdk.srcSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/src/gen/pages", "pages.ImageSizeUnit")
@js.native
open class ImageSizeUnit protected () extends AbstractEnum {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ImageSizeUnit {
  
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ImageSizeUnit")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ImageSizeUnit.Auto")
  @js.native
  def Auto: ImageSizeUnit = js.native
  inline def Auto_=(x: ImageSizeUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Auto")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ImageSizeUnit.Percentage")
  @js.native
  def Percentage: ImageSizeUnit = js.native
  inline def Percentage_=(x: ImageSizeUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Percentage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/pages", "pages.ImageSizeUnit.Pixels")
  @js.native
  def Pixels: ImageSizeUnit = js.native
  inline def Pixels_=(x: ImageSizeUnit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pixels")(x.asInstanceOf[js.Any])
}
