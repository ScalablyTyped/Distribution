package typings.nodeJsonDb.jsonDBConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsonDBConfig extends js.Object {
  
  var filename: String = js.native
  
  var humanReadable: Boolean = js.native
  
  var saveOnPush: Boolean = js.native
  
  var separator: String = js.native
}
object JsonDBConfig {
  
  @scala.inline
  def apply(filename: String, humanReadable: Boolean, saveOnPush: Boolean, separator: String): JsonDBConfig = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], humanReadable = humanReadable.asInstanceOf[js.Any], saveOnPush = saveOnPush.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDBConfig]
  }
  
  @scala.inline
  implicit class JsonDBConfigOps[Self <: JsonDBConfig] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanReadable(value: Boolean): Self = this.set("humanReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveOnPush(value: Boolean): Self = this.set("saveOnPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
  }
}
