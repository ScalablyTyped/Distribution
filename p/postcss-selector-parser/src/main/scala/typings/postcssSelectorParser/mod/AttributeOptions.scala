package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.After
import typings.postcssSelectorParser.anon.Insensitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeOptions
  extends NamespaceOptions[js.UndefOr[String]] {
  var attribute: String = js.native
  var insensitive: js.UndefOr[Boolean] = js.native
  var operator: js.UndefOr[AttributeOperator] = js.native
  var quoteMark: js.UndefOr[QuoteMark] = js.native
  /** @deprecated Use quoteMark instead. */
  var quoted: js.UndefOr[Boolean] = js.native
  var raws: Insensitive = js.native
  @JSName("spaces")
  var spaces_AttributeOptions: js.UndefOr[After] = js.native
}

object AttributeOptions {
  @scala.inline
  def apply(attribute: String, raws: Insensitive): AttributeOptions = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], raws = raws.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeOptions]
  }
  @scala.inline
  implicit class AttributeOptionsOps[Self <: AttributeOptions] (val x: Self) extends AnyVal {
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
    def setRaws(value: Insensitive): Self = this.set("raws", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsensitive(value: Boolean): Self = this.set("insensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsensitive: Self = this.set("insensitive", js.undefined)
    @scala.inline
    def setOperator(value: AttributeOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    @scala.inline
    def setQuoteMark(value: QuoteMark): Self = this.set("quoteMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteMark: Self = this.set("quoteMark", js.undefined)
    @scala.inline
    def setQuoteMarkNull: Self = this.set("quoteMark", null)
    @scala.inline
    def setQuoted(value: Boolean): Self = this.set("quoted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoted: Self = this.set("quoted", js.undefined)
    @scala.inline
    def setSpaces(value: After): Self = this.set("spaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaces: Self = this.set("spaces", js.undefined)
  }
  
}

