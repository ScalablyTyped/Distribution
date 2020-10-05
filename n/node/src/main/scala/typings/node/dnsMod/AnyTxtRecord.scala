package typings.node.dnsMod

import typings.node.nodeStrings.TXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnyTxtRecord extends AnyRecord {
  var entries: js.Array[String] = js.native
  var `type`: TXT = js.native
}

object AnyTxtRecord {
  @scala.inline
  def apply(entries: js.Array[String], `type`: TXT): AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyTxtRecord]
  }
  @scala.inline
  implicit class AnyTxtRecordOps[Self <: AnyTxtRecord] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: String*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[String]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TXT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

