package typings.olMapboxStyle

import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShadersMod {
  
  @JSImport("ol-mapbox-style/dist/shaders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hillshade(inputs: js.Array[ImageData], data: Any): ImageData = (^.asInstanceOf[js.Dynamic].applyDynamic("hillshade")(inputs.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ImageData]
}
