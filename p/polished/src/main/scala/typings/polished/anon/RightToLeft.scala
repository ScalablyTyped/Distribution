package typings.polished.anon

import typings.polished.polishedNumbers.`0`
import typings.polished.polishedNumbers.`2`
import typings.polished.polishedStrings.Plussign
import typings.polished.polishedStrings.infix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightToLeft extends js.Object {
  
  var argCount: `2` = js.native
  
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify addition */ js.Any = js.native
  
  var notation: infix = js.native
  
  var precedence: `2` = js.native
  
  var rightToLeft: `0` = js.native
  
  var symbol: Plussign = js.native
}
object RightToLeft {
  
  @scala.inline
  def apply(
    argCount: `2`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify addition */ js.Any,
    notation: infix,
    precedence: `2`,
    rightToLeft: `0`,
    symbol: Plussign
  ): RightToLeft = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightToLeft]
  }
  
  @scala.inline
  implicit class RightToLeftOps[Self <: RightToLeft] (val x: Self) extends AnyVal {
    
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
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify addition */ js.Any
    ): Self = this.set("f", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: infix): Self = this.set("notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecedence(value: `2`): Self = this.set("precedence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeft(value: `0`): Self = this.set("rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Plussign): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
