package typings.polished

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`2`
import typings.polished.polishedNumbers.`4`
import typings.polished.polishedStrings.Slash
import typings.polished.polishedStrings.infix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrecedence extends js.Object {
  var argCount: `2`
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify division */ js.Any
  var notation: infix
  var precedence: `4`
  var rightToLeft: `0`
  var symbol: Slash
}

object AnonPrecedence {
  @scala.inline
  def apply(
    argCount: `2`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify division */ js.Any,
    notation: infix,
    precedence: `4`,
    rightToLeft: `0`,
    symbol: Slash
  ): AnonPrecedence = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrecedence]
  }
}

