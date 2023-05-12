package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rope {
  
  trait RopeConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * An optional array containing the alpha data for this Rope. You should provide one alpha value per pair of vertices.
      */
    var alphas: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * An optional array containing the color data for this Rope. You should provide one color value per pair of vertices.
      */
    var colors: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * An optional frame from the Texture this Game Object is rendering with.
      */
    var frame: js.UndefOr[String | integer | Null] = js.undefined
    
    /**
      * Should the vertices of this Rope be aligned horizontally (`true`), or vertically (`false`)?
      */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key of the Texture this Game Object will use to render with, as stored in the Texture Manager. If not given, `__DEFAULT` is used.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * An array containing the vertices data for this Rope, or a number that indicates how many segments to split the texture frame into. If none is provided a simple quad is created. See `setPoints` to set this post-creation.
      */
    var points: js.UndefOr[integer | js.Array[Vector2Like]] = js.undefined
  }
  object RopeConfig {
    
    inline def apply(): RopeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RopeConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RopeConfig] (val x: Self) extends AnyVal {
      
      inline def setAlphas(value: js.Array[Double]): Self = StObject.set(x, "alphas", value.asInstanceOf[js.Any])
      
      inline def setAlphasUndefined: Self = StObject.set(x, "alphas", js.undefined)
      
      inline def setAlphasVarargs(value: Double*): Self = StObject.set(x, "alphas", js.Array(value*))
      
      inline def setColors(value: js.Array[Double]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: Double*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setFrame(value: String | integer): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setFrameNull: Self = StObject.set(x, "frame", null)
      
      inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPoints(value: integer | js.Array[Vector2Like]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPointsVarargs(value: Vector2Like*): Self = StObject.set(x, "points", js.Array(value*))
    }
  }
}
