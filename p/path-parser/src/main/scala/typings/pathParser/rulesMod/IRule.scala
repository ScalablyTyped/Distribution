package typings.pathParser.rulesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRule extends js.Object {
  var name: String = js.native
  var pattern: RegExp = js.native
  var regex: js.UndefOr[RegExp | RegExpFactory] = js.native
}

object IRule {
  @scala.inline
  def apply(name: String, pattern: RegExp): IRule = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRule]
  }
  @scala.inline
  implicit class IRuleOps[Self <: IRule] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexFunction1(value: /* match */ js.Any => RegExp): Self = this.set("regex", js.Any.fromFunction1(value))
    @scala.inline
    def setRegex(value: RegExp | RegExpFactory): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
  
}

