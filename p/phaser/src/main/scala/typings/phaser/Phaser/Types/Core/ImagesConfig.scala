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
  
  @scala.inline
  def apply(): ImagesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagesConfig]
  }
  
  @scala.inline
  implicit class ImagesConfigMutableBuilder[Self <: ImagesConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
  }
}
