package typings.mergeImages

import typings.mergeImages.mod.ImageSource
import typings.mergeImages.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * @returns A Promise which resolves to a base64 data URI.
    *
    * @example
    * import mergeImages = require('merge-images');
    *
    * mergeImages(['/body.png', '/eyes.png', '/mouth.png'])
    *   .then(b64 => document.querySelector('img').src = b64);
    *   // data:image/png;base64,iVBORw0KGgoAA...
    */
  inline def mergeImages(sources: js.Array[ImageSource]): js.Promise[String] = js.Dynamic.global.applyDynamic("mergeImages")(sources.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def mergeImages(sources: js.Array[ImageSource], options: Options): js.Promise[String] = (js.Dynamic.global.applyDynamic("mergeImages")(sources.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
