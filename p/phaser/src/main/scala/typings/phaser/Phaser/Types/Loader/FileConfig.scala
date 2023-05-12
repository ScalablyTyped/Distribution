package typings.phaser.Phaser.Types.Loader

import typings.phaser.Phaser.Types.Loader.FileTypes.CompressedTextureFileEntry
import typings.phaser.Phaser.Types.Loader.FileTypes.ImageFrameConfig
import typings.phaser.Phaser.Types.Loader.FileTypes.SVGSizeConfig
import typings.phaser.phaserBooleans.`false`
import typings.std.AudioContext
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileConfig extends StObject {
  
  /**
    * The string, or file entry object, for an ASTC format texture.
    */
  var ASTC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an ATC format texture.
    */
  var ATC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an BPTC format texture.
    */
  var BPTC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an ETC format texture.
    */
  var ETC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an ETC1 format texture.
    */
  var ETC1: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for the fallback image file.
    */
  var IMG: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an PVRTC format texture.
    */
  var PVRTC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an RGTC format texture.
    */
  var RGTC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an S3TC format texture.
    */
  var S3TC: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The string, or file entry object, for an S3TCRGB format texture.
    */
  var S3TCRGB: js.UndefOr[CompressedTextureFileEntry | String] = js.undefined
  
  /**
    * The default file extension to use for the atlas json if no url is provided.
    */
  var atlasExtension: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute or relative URL to load the atlas json file from. Or, a well formed JSON object to use instead.
    */
  var atlasURL: js.UndefOr[js.Object | String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the atlas json file.
    */
  var atlasXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * The audio configuration options.
    */
  var audioConfig: js.UndefOr[Any] = js.undefined
  
  /**
    * The absolute or relative URL to load the audio file from.
    */
  var audioURL: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the audio file.
    */
  var audioXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * Optional Base URL to use when loading the textures defined in the atlas data.
    */
  var baseURL: js.UndefOr[String] = js.undefined
  
  /**
    * A config object that can be used by file types to store transitional data.
    */
  var config: js.UndefOr[Any] = js.undefined
  
  /**
    * The optional AudioContext this file will use to process itself (only used by Sound objects).
    */
  var context: js.UndefOr[AudioContext] = js.undefined
  
  /**
    * If specified instead of the whole JSON file being parsed and added to the Cache, only the section corresponding to this property key will be added. If the property you want to extract is nested, use periods to divide it.
    */
  var dataKey: js.UndefOr[String] = js.undefined
  
  /**
    * Optional type to cast the binary file to once loaded. For example, `Uint8Array`.
    */
  var dataType: js.UndefOr[Any] = js.undefined
  
  /**
    * The default extension this file uses.
    */
  var `extension`: js.UndefOr[String] = js.undefined
  
  /**
    * Flip the UV coordinates stored in the model data?
    */
  var flipUV: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default file extension to use for the font data xml if no url is provided.
    */
  var fontDataExtension: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute or relative URL to load the font data xml file from.
    */
  var fontDataURL: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the font data xml file.
    */
  var fontDataXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * The frame configuration object. Only provided for, and used by, Sprite Sheets.
    */
  var frameConfig: js.UndefOr[ImageFrameConfig] = js.undefined
  
  /**
    * The height of the texture the HTML will be rendered to.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The absolute or relative URL to load the json file from. Or a well formed JSON object to use instead.
    */
  var jsonURL: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the json file.
    */
  var jsonXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String
  
  /**
    * If this plugin is to be injected into the Scene, this is the property key used.
    */
  var mapping: js.UndefOr[String] = js.undefined
  
  /**
    * The default material file extension to use if no url is provided.
    */
  var matExtension: js.UndefOr[String] = js.undefined
  
  /**
    * An optional absolute or relative URL to the object material file from. If undefined or `null`, no material file will be loaded.
    */
  var matURL: js.UndefOr[String] = js.undefined
  
  /**
    * The filename of an associated normal map. It uses the same path and url to load as the texture image.
    */
  var normalMap: js.UndefOr[String] = js.undefined
  
  /**
    * The path of the file, not including the baseURL.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The responseType to be used by the XHR request.
    */
  var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.undefined
  
  /**
    * If this plugin is to be added to the Scene, this is the property key for it.
    */
  var sceneKey: js.UndefOr[String] = js.undefined
  
  /**
    * The type of shader. Either `fragment` for a fragment shader, or `vertex` for a vertex shader. This is ignored if you load a shader bundle.
    */
  var shaderType: js.UndefOr[String] = js.undefined
  
  /**
    * Automatically start the plugin after loading?
    */
  var start: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The svg size configuration object.
    */
  var svgConfig: js.UndefOr[SVGSizeConfig] = js.undefined
  
  /**
    * If this plugin is to be added to Scene.Systems, this is the property key for it.
    */
  var systemKey: js.UndefOr[String] = js.undefined
  
  /**
    * The default file extension to use for the image texture if no url is provided.
    */
  var textureExtension: js.UndefOr[String] = js.undefined
  
  /**
    * The absolute or relative URL to load the texture image file from.
    */
  var textureURL: js.UndefOr[String] = js.undefined
  
  /**
    * Extra XHR Settings specifically for the texture image file.
    */
  var textureXhrSettings: js.UndefOr[XHRSettingsObject] = js.undefined
  
  /**
    * The file type string (image, json, etc) for sorting within the Loader.
    */
  var `type`: String
  
  /**
    * The URL of the file, not including baseURL.
    */
  var url: js.UndefOr[js.Object | String] = js.undefined
  
  /**
    * The width of the texture the HTML will be rendered to.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * Custom XHR Settings specific to this file and merged with the Loader defaults.
    */
  var xhrSettings: js.UndefOr[XHRSettingsObject | `false`] = js.undefined
}
object FileConfig {
  
  inline def apply(key: String, `type`: String): FileConfig = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileConfig] (val x: Self) extends AnyVal {
    
    inline def setASTC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "ASTC", value.asInstanceOf[js.Any])
    
    inline def setASTCUndefined: Self = StObject.set(x, "ASTC", js.undefined)
    
    inline def setATC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "ATC", value.asInstanceOf[js.Any])
    
    inline def setATCUndefined: Self = StObject.set(x, "ATC", js.undefined)
    
    inline def setAtlasExtension(value: String): Self = StObject.set(x, "atlasExtension", value.asInstanceOf[js.Any])
    
    inline def setAtlasExtensionUndefined: Self = StObject.set(x, "atlasExtension", js.undefined)
    
    inline def setAtlasURL(value: js.Object | String): Self = StObject.set(x, "atlasURL", value.asInstanceOf[js.Any])
    
    inline def setAtlasURLUndefined: Self = StObject.set(x, "atlasURL", js.undefined)
    
    inline def setAtlasXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "atlasXhrSettings", value.asInstanceOf[js.Any])
    
    inline def setAtlasXhrSettingsUndefined: Self = StObject.set(x, "atlasXhrSettings", js.undefined)
    
    inline def setAudioConfig(value: Any): Self = StObject.set(x, "audioConfig", value.asInstanceOf[js.Any])
    
    inline def setAudioConfigUndefined: Self = StObject.set(x, "audioConfig", js.undefined)
    
    inline def setAudioURL(value: js.Object): Self = StObject.set(x, "audioURL", value.asInstanceOf[js.Any])
    
    inline def setAudioURLUndefined: Self = StObject.set(x, "audioURL", js.undefined)
    
    inline def setAudioXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "audioXhrSettings", value.asInstanceOf[js.Any])
    
    inline def setAudioXhrSettingsUndefined: Self = StObject.set(x, "audioXhrSettings", js.undefined)
    
    inline def setBPTC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "BPTC", value.asInstanceOf[js.Any])
    
    inline def setBPTCUndefined: Self = StObject.set(x, "BPTC", js.undefined)
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setContext(value: AudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    inline def setDataType(value: Any): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setETC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "ETC", value.asInstanceOf[js.Any])
    
    inline def setETC1(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "ETC1", value.asInstanceOf[js.Any])
    
    inline def setETC1Undefined: Self = StObject.set(x, "ETC1", js.undefined)
    
    inline def setETCUndefined: Self = StObject.set(x, "ETC", js.undefined)
    
    inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    inline def setFlipUV(value: Boolean): Self = StObject.set(x, "flipUV", value.asInstanceOf[js.Any])
    
    inline def setFlipUVUndefined: Self = StObject.set(x, "flipUV", js.undefined)
    
    inline def setFontDataExtension(value: String): Self = StObject.set(x, "fontDataExtension", value.asInstanceOf[js.Any])
    
    inline def setFontDataExtensionUndefined: Self = StObject.set(x, "fontDataExtension", js.undefined)
    
    inline def setFontDataURL(value: String): Self = StObject.set(x, "fontDataURL", value.asInstanceOf[js.Any])
    
    inline def setFontDataURLUndefined: Self = StObject.set(x, "fontDataURL", js.undefined)
    
    inline def setFontDataXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "fontDataXhrSettings", value.asInstanceOf[js.Any])
    
    inline def setFontDataXhrSettingsUndefined: Self = StObject.set(x, "fontDataXhrSettings", js.undefined)
    
    inline def setFrameConfig(value: ImageFrameConfig): Self = StObject.set(x, "frameConfig", value.asInstanceOf[js.Any])
    
    inline def setFrameConfigUndefined: Self = StObject.set(x, "frameConfig", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIMG(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "IMG", value.asInstanceOf[js.Any])
    
    inline def setIMGUndefined: Self = StObject.set(x, "IMG", js.undefined)
    
    inline def setJsonURL(value: String): Self = StObject.set(x, "jsonURL", value.asInstanceOf[js.Any])
    
    inline def setJsonURLUndefined: Self = StObject.set(x, "jsonURL", js.undefined)
    
    inline def setJsonXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "jsonXhrSettings", value.asInstanceOf[js.Any])
    
    inline def setJsonXhrSettingsUndefined: Self = StObject.set(x, "jsonXhrSettings", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: String): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    inline def setMatExtension(value: String): Self = StObject.set(x, "matExtension", value.asInstanceOf[js.Any])
    
    inline def setMatExtensionUndefined: Self = StObject.set(x, "matExtension", js.undefined)
    
    inline def setMatURL(value: String): Self = StObject.set(x, "matURL", value.asInstanceOf[js.Any])
    
    inline def setMatURLUndefined: Self = StObject.set(x, "matURL", js.undefined)
    
    inline def setNormalMap(value: String): Self = StObject.set(x, "normalMap", value.asInstanceOf[js.Any])
    
    inline def setNormalMapUndefined: Self = StObject.set(x, "normalMap", js.undefined)
    
    inline def setPVRTC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "PVRTC", value.asInstanceOf[js.Any])
    
    inline def setPVRTCUndefined: Self = StObject.set(x, "PVRTC", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRGTC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "RGTC", value.asInstanceOf[js.Any])
    
    inline def setRGTCUndefined: Self = StObject.set(x, "RGTC", js.undefined)
    
    inline def setResponseType(value: XMLHttpRequestResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setS3TC(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "S3TC", value.asInstanceOf[js.Any])
    
    inline def setS3TCRGB(value: CompressedTextureFileEntry | String): Self = StObject.set(x, "S3TCRGB", value.asInstanceOf[js.Any])
    
    inline def setS3TCRGBUndefined: Self = StObject.set(x, "S3TCRGB", js.undefined)
    
    inline def setS3TCUndefined: Self = StObject.set(x, "S3TC", js.undefined)
    
    inline def setSceneKey(value: String): Self = StObject.set(x, "sceneKey", value.asInstanceOf[js.Any])
    
    inline def setSceneKeyUndefined: Self = StObject.set(x, "sceneKey", js.undefined)
    
    inline def setShaderType(value: String): Self = StObject.set(x, "shaderType", value.asInstanceOf[js.Any])
    
    inline def setShaderTypeUndefined: Self = StObject.set(x, "shaderType", js.undefined)
    
    inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setSvgConfig(value: SVGSizeConfig): Self = StObject.set(x, "svgConfig", value.asInstanceOf[js.Any])
    
    inline def setSvgConfigUndefined: Self = StObject.set(x, "svgConfig", js.undefined)
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setSystemKeyUndefined: Self = StObject.set(x, "systemKey", js.undefined)
    
    inline def setTextureExtension(value: String): Self = StObject.set(x, "textureExtension", value.asInstanceOf[js.Any])
    
    inline def setTextureExtensionUndefined: Self = StObject.set(x, "textureExtension", js.undefined)
    
    inline def setTextureURL(value: String): Self = StObject.set(x, "textureURL", value.asInstanceOf[js.Any])
    
    inline def setTextureURLUndefined: Self = StObject.set(x, "textureURL", js.undefined)
    
    inline def setTextureXhrSettings(value: XHRSettingsObject): Self = StObject.set(x, "textureXhrSettings", value.asInstanceOf[js.Any])
    
    inline def setTextureXhrSettingsUndefined: Self = StObject.set(x, "textureXhrSettings", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: js.Object | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXhrSettings(value: XHRSettingsObject | `false`): Self = StObject.set(x, "xhrSettings", value.asInstanceOf[js.Any])
    
    inline def setXhrSettingsUndefined: Self = StObject.set(x, "xhrSettings", js.undefined)
  }
}
