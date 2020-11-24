package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordMeta extends js.Object {
  
  var `@rid`: ORID = js.native
  
  var `@version`: Version = js.native
}
object RecordMeta {
  
  @scala.inline
  def apply(`@rid`: ORID, `@version`: Version): RecordMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@rid")(`@rid`.asInstanceOf[js.Any])
    __obj.updateDynamic("@version")(`@version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordMeta]
  }
  
  @scala.inline
  implicit class RecordMetaOps[Self <: RecordMeta] (val x: Self) extends AnyVal {
    
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
    def `set@rid`(value: ORID): Self = this.set("@rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `set@version`(value: Version): Self = this.set("@version", value.asInstanceOf[js.Any])
  }
}
