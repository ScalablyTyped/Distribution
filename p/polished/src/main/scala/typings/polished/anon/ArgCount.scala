package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedNumbers.`6`
import typings.polished.polishedStrings.Exclamationmark
import typings.polished.polishedStrings.postfix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCount extends js.Object {
  var argCount: `1` = js.native
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any = js.native
  var notation: postfix = js.native
  var precedence: `6` = js.native
  var rightToLeft: `0` = js.native
  var symbol: Exclamationmark = js.native
}

object ArgCount {
  @scala.inline
  def apply(
    argCount: `1`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any,
    notation: postfix,
    precedence: `6`,
    rightToLeft: `0`,
    symbol: Exclamationmark
  ): ArgCount = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgCount]
  }
  @scala.inline
  implicit class ArgCountOps[Self <: ArgCount] (val x: Self) extends AnyVal {
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
    def setArgCount(value: `1`): Self = this.set("argCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any
    ): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotation(value: postfix): Self = this.set("notation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecedence(value: `6`): Self = this.set("precedence", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightToLeft(value: `0`): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: Exclamationmark): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

