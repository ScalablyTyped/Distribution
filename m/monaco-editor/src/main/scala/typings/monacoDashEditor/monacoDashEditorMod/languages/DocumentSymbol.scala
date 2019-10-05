package typings.monacoDashEditor.monacoDashEditorMod.languages

import typings.monacoDashEditor.monacoDashEditorMod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentSymbol extends js.Object {
  var children: js.UndefOr[js.Array[DocumentSymbol]] = js.undefined
  var containerName: js.UndefOr[String] = js.undefined
  var detail: String
  var kind: SymbolKind
  var name: String
  var range: IRange
  var selectionRange: IRange
  var tags: js.Array[SymbolTag]
}

object DocumentSymbol {
  @scala.inline
  def apply(
    detail: String,
    kind: SymbolKind,
    name: String,
    range: IRange,
    selectionRange: IRange,
    tags: js.Array[SymbolTag],
    children: js.Array[DocumentSymbol] = null,
    containerName: String = null
  ): DocumentSymbol = {
    val __obj = js.Dynamic.literal(detail = detail, kind = kind, name = name, range = range, selectionRange = selectionRange, tags = tags)
    if (children != null) __obj.updateDynamic("children")(children)
    if (containerName != null) __obj.updateDynamic("containerName")(containerName)
    __obj.asInstanceOf[DocumentSymbol]
  }
}

