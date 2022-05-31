package typings.mergeImages

import typings.mergeImages.mod.ImageSource
import typings.mergeImages.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def mergeImages(sources: js.Array[ImageSource]): js.Promise[String] = js.Dynamic.global.applyDynamic("mergeImages")(sources.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def mergeImages(sources: js.Array[ImageSource], options: Options): js.Promise[String] = (js.Dynamic.global.applyDynamic("mergeImages")(sources.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
}
