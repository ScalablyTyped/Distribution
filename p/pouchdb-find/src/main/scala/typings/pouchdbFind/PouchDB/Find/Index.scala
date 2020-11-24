package typings.pouchdbFind.PouchDB.Find

import typings.pouchdbFind.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends js.Object {
  
  /** Design document name (i.e. the part after '_design/', auto-generated if you don't include it */
  var ddoc: String | Null = js.native
  
  var `def`: Fields = js.native
  
  /** Name of the index, auto-generated if you don't include it */
  var name: String = js.native
  
  /** Only supports 'json' */
  var `type`: String = js.native
}
object Index {
  
  @scala.inline
  def apply(`def`: Fields, name: String, `type`: String): Index = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit class IndexOps[Self <: Index] (val x: Self) extends AnyVal {
    
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
    def setDef(value: Fields): Self = this.set("def", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdoc(value: String): Self = this.set("ddoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdocNull: Self = this.set("ddoc", null)
  }
}
