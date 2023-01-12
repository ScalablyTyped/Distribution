package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiScriptFileConfig extends StObject {
  
  /**
    * The default file extension to use if no url is provided.
    */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: String
  
  /**
    * An array of absolute or relative URLs to load the script files from. They are processed in the order given in the array.
    */
  var url: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Extra XHR Settings specifically for these files.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}
object MultiScriptFileConfig {
  
  inline def apply(key: String): MultiScriptFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiScriptFileConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiScriptFileConfig] (val x: Self) extends AnyVal {
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value*))
    
    inline def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    inline def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
