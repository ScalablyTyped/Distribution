package typings.postcssSelectorParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insensitive extends js.Object {
  var attribute: js.UndefOr[String] = js.native
  var insensitive: js.UndefOr[String] = js.native
  var operator: js.UndefOr[String] = js.native
  var spaces: js.UndefOr[Attribute] = js.native
  /** @deprecated The attribute value is unquoted, use that instead.. */
  var unquoted: js.UndefOr[String] = js.native
  /** The value of the attribute with quotes and escapes. */
  var value: js.UndefOr[String] = js.native
}

object Insensitive {
  @scala.inline
  def apply(): Insensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Insensitive]
  }
  @scala.inline
  implicit class InsensitiveOps[Self <: Insensitive] (val x: Self) extends AnyVal {
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    @scala.inline
    def setInsensitive(value: String): Self = this.set("insensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsensitive: Self = this.set("insensitive", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setSpaces(value: Attribute): Self = this.set("spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
    @scala.inline
    def setUnquoted(value: String): Self = this.set("unquoted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnquoted: Self = this.set("unquoted", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

