package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonDeclaration extends JsonNode {
  /**
    * True if the declaration has an !important annotation.
    */
  var important: js.UndefOr[Boolean] = js.native
}

object JsonDeclaration {
  @scala.inline
  def apply(): JsonDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonDeclaration]
  }
  @scala.inline
  implicit class JsonDeclarationOps[Self <: JsonDeclaration] (val x: Self) extends AnyVal {
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
    def setImportant(value: Boolean): Self = this.set("important", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportant: Self = this.set("important", js.undefined)
  }
  
}

