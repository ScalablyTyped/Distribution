package typings.polished.anon

import typings.polished.polishedNumbers.`1`
import typings.polished.polishedNumbers.`2`
import typings.polished.polishedNumbers.`5`
import typings.polished.polishedStrings.^
import typings.polished.polishedStrings.infix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait F extends js.Object {
  var argCount: `2` = js.native
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify power */ js.Any = js.native
  var notation: infix = js.native
  var precedence: `5` = js.native
  var rightToLeft: `1` = js.native
  var symbol: ^ = js.native
}

object F {
  @scala.inline
  def apply(
    argCount: `2`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify power */ js.Any,
    notation: infix,
    precedence: `5`,
    rightToLeft: `1`,
    symbol: ^
  ): F = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[F]
  }
  @scala.inline
  implicit class FOps[Self <: F] (val x: Self) extends AnyVal {
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
    def setArgCount(value: `2`): Self = this.set("argCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setF(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify power */ js.Any
    ): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotation(value: infix): Self = this.set("notation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrecedence(value: `5`): Self = this.set("precedence", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightToLeft(value: `1`): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbol(value: ^): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
  
}

