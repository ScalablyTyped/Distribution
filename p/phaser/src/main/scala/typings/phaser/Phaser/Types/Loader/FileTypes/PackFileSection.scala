package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.FileConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackFileSection extends StObject {
  
  /**
    * A URL used to resolve paths in `files`. Example: 'http://labs.phaser.io/assets/'.
    */
  var baseURL: js.UndefOr[String] = js.undefined
  
  /**
    * The default {@link Phaser.Types.Loader.FileConfig} `type`.
    */
  var defaultType: js.UndefOr[String] = js.undefined
  
  /**
    * The files to load. See {@link Phaser.Types.Loader.FileTypes}.
    */
  var files: js.Array[FileConfig]
  
  /**
    * A URL path used to resolve relative paths in `files`. Example: 'images/sprites/'.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * An optional prefix that is automatically prepended to each file key.
    */
  var prefix: js.UndefOr[String] = js.undefined
}
object PackFileSection {
  
  inline def apply(files: js.Array[FileConfig]): PackFileSection = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackFileSection]
  }
  
  extension [Self <: PackFileSection](x: Self) {
    
    inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    inline def setDefaultType(value: String): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
    
    inline def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
    
    inline def setFiles(value: js.Array[FileConfig]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: FileConfig*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
