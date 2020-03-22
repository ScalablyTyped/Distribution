package typings.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionItemLabel extends js.Object {
  /**
    * The function or variable. Rendered leftmost.
    */
  var name: String
  /**
    * The fully qualified name, like package name or file path. Rendered after `signature`.
    */
  var qualifier: js.UndefOr[String] = js.undefined
  /**
    * The signature without the return type. Render after `name`.
    */
  var signature: js.UndefOr[String] = js.undefined
  /**
    * The return-type of a function or type of a property/variable. Rendered rightmost.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CompletionItemLabel {
  @scala.inline
  def apply(name: String, qualifier: String = null, signature: String = null, `type`: String = null): CompletionItemLabel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionItemLabel]
  }
}

