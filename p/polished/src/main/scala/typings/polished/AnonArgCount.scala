package typings.polished

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedNumbers.`6`
import typings.polished.polishedStrings.Exclamationmark
import typings.polished.polishedStrings.postfix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgCount extends js.Object {
  var argCount: `1`
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any
  var notation: postfix
  var precedence: `6`
  var rightToLeft: `0`
  var symbol: Exclamationmark
}

object AnonArgCount {
  @scala.inline
  def apply(
    argCount: `1`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify factorial */ js.Any,
    notation: postfix,
    precedence: `6`,
    rightToLeft: `0`,
    symbol: Exclamationmark
  ): AnonArgCount = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArgCount]
  }
}

