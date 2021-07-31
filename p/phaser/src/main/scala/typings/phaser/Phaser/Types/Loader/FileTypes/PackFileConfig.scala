package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackFileConfig extends StObject {
  
  /**
    * If specified instead of the whole JSON file being parsed, only the section corresponding to this property key will be added. If the property you want to extract is nested, use periods to divide it.
    */
  var dataKey: js.UndefOr[String] = js.undefined
  
  /**
    * The default file extension to use if no url is provided.
    */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
    * The key of the file. Must be unique within both the Loader and the JSON Cache.
    */
  var key: String
  
  /**
    * The absolute or relative URL to load the file from. Or can be a ready formed JSON object, in which case it will be directly processed.
    */
  var url: js.UndefOr[String | js.Any] = js.undefined
  
  /**
    * Extra XHR Settings specifically for this file.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
}
object PackFileConfig {
  
  @scala.inline
  def apply(key: String): PackFileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackFileConfig]
  }
  
  @scala.inline
  implicit class PackFileConfigMutableBuilder[Self <: PackFileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String | js.Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
