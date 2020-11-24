package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.FileConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackFileSection extends js.Object {
  
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
  implicit class PackFileSectionOps[Self <: PackFileSection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilesVarargs(value: FileConfig*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[FileConfig]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseURL: Self = this.set("baseURL", js.undefined)
    
    @scala.inline
    def setDefaultType(value: String): Self = this.set("defaultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultType: Self = this.set("defaultType", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
