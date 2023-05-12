package typings.mirada

import typings.mirada.distSrcTypesOpencvMod.Mat
import typings.std.HTMLInputElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBrowserImageCreationMod {
  
  @JSImport("mirada/dist/src/browser/imageCreation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asHtmlImageData(img: Mat): ImageData = ^.asInstanceOf[js.Dynamic].applyDynamic("asHtmlImageData")(img.asInstanceOf[js.Any]).asInstanceOf[ImageData]
  
  inline def fetchImageData(url: String): js.Promise[ImageData] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchImageData")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageData]]
  
  inline def fromInputFileElement(a: HTMLInputElement): js.Promise[js.Array[Mat]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInputFileElement")(a.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Mat]]]
}
