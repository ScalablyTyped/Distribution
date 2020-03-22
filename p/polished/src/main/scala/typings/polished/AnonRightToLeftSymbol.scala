package typings.polished

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`1`
import typings.polished.polishedStrings.Leftparenthesis
import typings.polished.polishedStrings.prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRightToLeftSymbol extends js.Object {
  var argCount: `1`
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any
  var notation: prefix
  var precedence: `0`
  var rightToLeft: `0`
  var symbol: Leftparenthesis
}

object AnonRightToLeftSymbol {
  @scala.inline
  def apply(
    argCount: `1`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify last */ js.Any,
    notation: prefix,
    precedence: `0`,
    rightToLeft: `0`,
    symbol: Leftparenthesis
  ): AnonRightToLeftSymbol = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRightToLeftSymbol]
  }
}

