package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFile extends StObject {
  
  var configFile: js.UndefOr[String] = js.undefined
  
  var configFileName: String
  
  var configOrigin: js.UndefOr[String] = js.undefined
  
  var images: RequiredImageConfigComple
  
  var typescript: RequiredTypeScriptConfig
}
object ConfigFile {
  
  inline def apply(configFileName: String, images: RequiredImageConfigComple, typescript: RequiredTypeScriptConfig): ConfigFile = {
    val __obj = js.Dynamic.literal(configFileName = configFileName.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], typescript = typescript.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFile]
  }
  
  extension [Self <: ConfigFile](x: Self) {
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileName(value: String): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    inline def setConfigOrigin(value: String): Self = StObject.set(x, "configOrigin", value.asInstanceOf[js.Any])
    
    inline def setConfigOriginUndefined: Self = StObject.set(x, "configOrigin", js.undefined)
    
    inline def setImages(value: RequiredImageConfigComple): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setTypescript(value: RequiredTypeScriptConfig): Self = StObject.set(x, "typescript", value.asInstanceOf[js.Any])
  }
}
