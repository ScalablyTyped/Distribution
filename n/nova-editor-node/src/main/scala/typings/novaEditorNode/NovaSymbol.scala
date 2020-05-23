package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// name change to avoid conflict with base ecmascript Symbol
trait NovaSymbol extends js.Object {
  val comment: String | Null
  val displayName: String
  val name: String
  val nameRange: Range
  val parent: NovaSymbol | Null
  val range: Range
  val `type`: NovaSymbolType
}

object NovaSymbol {
  @scala.inline
  def apply(
    displayName: String,
    name: String,
    nameRange: Range,
    range: Range,
    `type`: NovaSymbolType,
    comment: String = null,
    parent: NovaSymbol = null
  ): NovaSymbol = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameRange = nameRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NovaSymbol]
  }
}

