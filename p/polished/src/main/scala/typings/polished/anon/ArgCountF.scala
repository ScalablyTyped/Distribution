package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedNumbers.`3`
import typings.polished.polishedStrings.Plussign
import typings.polished.polishedStrings.prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgCountF extends js.Object {
  var argCount: `1` = js.native
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any = js.native
  var notation: prefix = js.native
  var precedence: `3` = js.native
  var rightToLeft: `0` = js.native
  var symbol: Plussign = js.native
}

object ArgCountF {
  @scala.inline
  def apply(
    argCount: `1`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any,
    notation: prefix,
    precedence: `3`,
    rightToLeft: `0`,
    symbol: Plussign
  ): ArgCountF = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgCountF]
  }
  @scala.inline
  implicit class ArgCountFOps[Self <: ArgCountF] (val x: Self) extends AnyVal {
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
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any
    ): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotation(value: prefix): Self = this.set("notation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecedence(value: `3`): Self = this.set("precedence", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightToLeft(value: `0`): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: Plussign): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

