package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedStrings.func
import typings.polished.polishedStrings.sqrt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrecedenceRightToLeftSymbol extends js.Object {
  var argCount: `1`
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify sqrt */ js.Any
  var notation: func
  var precedence: `0`
  var rightToLeft: `0`
  var symbol: sqrt
}

object PrecedenceRightToLeftSymbol {
  @scala.inline
  def apply(
    argCount: `1`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify sqrt */ js.Any,
    notation: func,
    precedence: `0`,
    rightToLeft: `0`,
    symbol: sqrt
  ): PrecedenceRightToLeftSymbol = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecedenceRightToLeftSymbol]
  }
}

