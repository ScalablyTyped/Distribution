package typings.parse.mod.global.Parse.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CLP extends js.Object {
  
  var addField: js.UndefOr[CLPField] = js.native
  
  var count: js.UndefOr[CLPField] = js.native
  
  var create: js.UndefOr[CLPField] = js.native
  
  var delete: js.UndefOr[CLPField] = js.native
  
  var find: js.UndefOr[CLPField] = js.native
  
  var get: js.UndefOr[CLPField] = js.native
  
  /** Array of fields that point to a `_User` object's ID or a `Role` object's name */
  var readUserFields: js.UndefOr[js.Array[String]] = js.native
  
  var update: js.UndefOr[CLPField] = js.native
  
  /** Array of fields that point to a `_User` object's ID or a `Role` object's name */
  var writeUserFields: js.UndefOr[js.Array[String]] = js.native
}
object CLP {
  
  @scala.inline
  def apply(): CLP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CLP]
  }
  
  @scala.inline
  implicit class CLPOps[Self <: CLP] (val x: Self) extends AnyVal {
    
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
    def setAddField(value: CLPField): Self = this.set("addField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddField: Self = this.set("addField", js.undefined)
    
    @scala.inline
    def setCount(value: CLPField): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCreate(value: CLPField): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDelete(value: CLPField): Self = this.set("delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    
    @scala.inline
    def setFind(value: CLPField): Self = this.set("find", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFind: Self = this.set("find", js.undefined)
    
    @scala.inline
    def setGet(value: CLPField): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setReadUserFieldsVarargs(value: String*): Self = this.set("readUserFields", js.Array(value :_*))
    
    @scala.inline
    def setReadUserFields(value: js.Array[String]): Self = this.set("readUserFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadUserFields: Self = this.set("readUserFields", js.undefined)
    
    @scala.inline
    def setUpdate(value: CLPField): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setWriteUserFieldsVarargs(value: String*): Self = this.set("writeUserFields", js.Array(value :_*))
    
    @scala.inline
    def setWriteUserFields(value: js.Array[String]): Self = this.set("writeUserFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteUserFields: Self = this.set("writeUserFields", js.undefined)
  }
}
