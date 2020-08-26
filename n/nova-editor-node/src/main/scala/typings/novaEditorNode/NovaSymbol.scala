package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// name change to avoid conflict with base ecmascript Symbol
@js.native
trait NovaSymbol extends js.Object {
  val comment: String | Null = js.native
  val displayName: String = js.native
  val name: String = js.native
  val nameRange: Range = js.native
  val parent: NovaSymbol | Null = js.native
  val range: Range = js.native
  val `type`: NovaSymbolType = js.native
}

object NovaSymbol {
  @scala.inline
  def apply(displayName: String, name: String, nameRange: Range, range: Range, `type`: NovaSymbolType): NovaSymbol = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameRange = nameRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NovaSymbol]
  }
  @scala.inline
  implicit class NovaSymbolOps[Self <: NovaSymbol] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameRange(value: Range): Self = this.set("nameRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange(value: Range): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NovaSymbolType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentNull: Self = this.set("comment", null)
    @scala.inline
    def setParent(value: NovaSymbol): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

