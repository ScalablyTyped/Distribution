package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGSizeConfig extends StObject {
  
  /**
    * An optional height. The SVG will be resized to this size before being rendered to a texture.
    */
  var height: js.UndefOr[integer] = js.undefined
  
  /**
    * An optional scale. If given it overrides the width / height properties. The SVG is scaled by the scale factor before being rendered to a texture.
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional width. The SVG will be resized to this size before being rendered to a texture.
    */
  var width: js.UndefOr[integer] = js.undefined
}
object SVGSizeConfig {
  
  inline def apply(): SVGSizeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGSizeConfig]
  }
  
  extension [Self <: SVGSizeConfig](x: Self) {
    
    inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
