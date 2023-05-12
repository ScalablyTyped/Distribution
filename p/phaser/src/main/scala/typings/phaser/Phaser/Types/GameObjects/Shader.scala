package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.Display.BaseShader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Shader {
  
  trait ShaderConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * The height of the Game Object.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * The key of the shader to use from the shader cache, or a BaseShader instance.
      */
    var key: String | BaseShader
    
    /**
      * The width of the Game Object.
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ShaderConfig {
    
    inline def apply(key: String | BaseShader): ShaderConfig = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShaderConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShaderConfig] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setKey(value: String | BaseShader): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
