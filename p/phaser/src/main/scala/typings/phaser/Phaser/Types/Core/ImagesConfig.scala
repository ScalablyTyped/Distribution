package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImagesConfig extends StObject {
  
  /**
    * URL to use for the 'default' texture.
    */
  var default: js.UndefOr[String] = js.undefined
  
  /**
    * URL to use for the 'missing' texture.
    */
  var missing: js.UndefOr[String] = js.undefined
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
  }
}
