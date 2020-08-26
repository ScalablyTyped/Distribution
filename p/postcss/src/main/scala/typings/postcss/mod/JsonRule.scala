package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonRule extends JsonContainer {
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: js.UndefOr[String] = js.native
  /**
    * An array containing the rule's individual selectors.
    * Groups of selectors are split at commas.
    */
  var selectors: js.UndefOr[js.Array[String]] = js.native
}

object JsonRule {
  @scala.inline
  def apply(): JsonRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonRule]
  }
  @scala.inline
  implicit class JsonRuleOps[Self <: JsonRule] (val x: Self) extends AnyVal {
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
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    @scala.inline
    def setSelectorsVarargs(value: String*): Self = this.set("selectors", js.Array(value :_*))
    @scala.inline
    def setSelectors(value: js.Array[String]): Self = this.set("selectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
  }
  
}

