package typings.polished

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedStrings.func
import typings.polished.polishedStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFNotationPrecedence extends js.Object {
  var argCount: `1`
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ js.Any
  var notation: func
  var precedence: `0`
  var rightToLeft: `0`
  var symbol: min
}

object AnonFNotationPrecedence {
  @scala.inline
  def apply(
    argCount: `1`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify min */ js.Any,
    notation: func,
    precedence: `0`,
    rightToLeft: `0`,
    symbol: min
  ): AnonFNotationPrecedence = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFNotationPrecedence]
  }
}

