package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagesConfig extends StObject {
  
  /**
    * A base64 encoded image file to use as the 'default' texture.
    */
  var default: js.UndefOr[String] = js.undefined
  
  /**
    * A base64 encoded image file to use as the 'missing' texture.
    */
  var missing: js.UndefOr[String] = js.undefined
  
  /**
    * A base64 encoded image file to use as the 'white' texture.
    */
  var white: js.UndefOr[String] = js.undefined
}
object ImagesConfig {
  
  inline def apply(): ImagesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesConfig]
  }
  
  extension [Self <: ImagesConfig](x: Self) {
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    
    inline def setWhiteUndefined: Self = StObject.set(x, "white", js.undefined)
  }
}
