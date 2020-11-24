package typings.ol.lrucacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry extends js.Object {
  
  var key_ : String = js.native
  
  var newer: js.Any = js.native
  
  var older: js.Any = js.native
  
  var value_ : js.Any = js.native
}
object Entry {
  
  @scala.inline
  def apply(key_ : String, newer: js.Any, older: js.Any, value_ : js.Any): Entry = {
    val __obj = js.Dynamic.literal(key_ = key_.asInstanceOf[js.Any], newer = newer.asInstanceOf[js.Any], older = older.asInstanceOf[js.Any], value_ = value_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entry]
  }
  
  @scala.inline
  implicit class EntryOps[Self <: Entry] (val x: Self) extends AnyVal {
    
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
    def setKey_(value: String): Self = this.set("key_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewer(value: js.Any): Self = this.set("newer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOlder(value: js.Any): Self = this.set("older", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue_(value: js.Any): Self = this.set("value_", value.asInstanceOf[js.Any])
  }
}
