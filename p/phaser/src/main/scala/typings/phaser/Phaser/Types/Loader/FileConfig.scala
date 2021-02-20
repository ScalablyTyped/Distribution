package typings.phaser.Phaser.Types.Loader

import typings.phaser.phaserBooleans.`false`
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileConfig extends StObject {
  
  /**
    * A config object that can be used by file types to store transitional data.
    */
  var config: js.UndefOr[js.Any] = js.native
  
  /**
    * The default extension this file uses.
    */
  var extension: js.UndefOr[String] = js.native
  
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String = js.native
  
  /**
    * The path of the file, not including the baseURL.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The responseType to be used by the XHR request.
    */
  var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.native
  
  /**
    * The file type string (image, json, etc) for sorting within the Loader.
    */
  var `type`: String = js.native
  
  /**
    * The URL of the file, not including baseURL.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * Custom XHR Settings specific to this file and merged with the Loader defaults.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject | `false`] = js.native
}
object FileConfig {
  
  @scala.inline
  def apply(key: String, `type`: String): FileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfig]
  }
  
  @scala.inline
  implicit class FileConfigMutableBuilder[Self <: FileConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setXhrSettings(value: XHRSettingsObject | `false`): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
