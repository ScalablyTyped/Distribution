package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.FileConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackFileSection extends StObject {
  
  /**
    * A URL used to resolve paths in `files`. Example: 'http://labs.phaser.io/assets/'.
    */
  var baseURL: js.UndefOr[String] = js.native
  
  /**
    * The default {@link Phaser.Types.Loader.FileConfig} `type`.
    */
  var defaultType: js.UndefOr[String] = js.native
  
  /**
    * The files to load. See {@link Phaser.Types.Loader.FileTypes}.
    */
  var files: js.Array[FileConfig] = js.native
  
  /**
    * A URL path used to resolve relative paths in `files`. Example: 'images/sprites/'.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * An optional prefix that is automatically prepended to each file key.
    */
  var prefix: js.UndefOr[String] = js.native
}
object PackFileSection {
  
  @scala.inline
  def apply(files: js.Array[FileConfig]): PackFileSection = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackFileSection]
  }
  
  @scala.inline
  implicit class PackFileSectionMutableBuilder[Self <: PackFileSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    
    @scala.inline
    def setDefaultType(value: String): Self = StObject.set(x, "defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTypeUndefined: Self = StObject.set(x, "defaultType", js.undefined)
    
    @scala.inline
    def setFiles(value: js.Array[FileConfig]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: FileConfig*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
