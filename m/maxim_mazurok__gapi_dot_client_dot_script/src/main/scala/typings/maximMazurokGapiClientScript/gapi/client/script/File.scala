package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  /** Creation date timestamp. This read-only field is only visible to users who have WRITER permission for the script project. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The defined set of functions in the script file, if any. */
  var functionSet: js.UndefOr[GoogleAppsScriptTypeFunctionSet] = js.native
  
  /** The user who modified the file most recently. This read-only field is only visible to users who have WRITER permission for the script project. */
  var lastModifyUser: js.UndefOr[GoogleAppsScriptTypeUser] = js.native
  
  /** The name of the file. The file extension is not part of the file name, which can be identified from the type field. */
  var name: js.UndefOr[String] = js.native
  
  /** The file content. */
  var source: js.UndefOr[String] = js.native
  
  /** The type of the file. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Last modified date timestamp. This read-only field is only visible to users who have WRITER permission for the script project. */
  var updateTime: js.UndefOr[String] = js.native
}
object File {
  
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setFunctionSet(value: GoogleAppsScriptTypeFunctionSet): Self = this.set("functionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctionSet: Self = this.set("functionSet", js.undefined)
    
    @scala.inline
    def setLastModifyUser(value: GoogleAppsScriptTypeUser): Self = this.set("lastModifyUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifyUser: Self = this.set("lastModifyUser", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
