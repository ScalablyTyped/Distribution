package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiScriptFileConfig extends StObject {
  
  /**
    * The default file extension to use if no url is provided.
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * The key of the file. Must be unique within the Loader.
    */
  var key: String = js.native
  
  /**
    * An array of absolute or relative URLs to load the script files from. They are processed in the order given in the array.
    */
  var url: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Extra XHR Settings specifically for these files.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.native
}
object MultiScriptFileConfig {
  
  @scala.inline
  def apply(key: String): MultiScriptFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiScriptFileConfig]
  }
  
  @scala.inline
  implicit class MultiScriptFileConfigMutableBuilder[Self <: MultiScriptFileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: js.Array[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
    
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
