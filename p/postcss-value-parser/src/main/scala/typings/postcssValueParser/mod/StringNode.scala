package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserStrings.Apostrophe
import typings.postcssValueParser.postcssValueParserStrings.Quotationmark
import typings.postcssValueParser.postcssValueParserStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringNode
  extends BaseNode
     with ClosableNode
     with Node {
  
  /**
    * The quote type delimiting the string
    */
  var quote: Quotationmark | Apostrophe = js.native
  
  var `type`: string = js.native
}
object StringNode {
  
  @scala.inline
  def apply(quote: Quotationmark | Apostrophe, sourceIndex: Double, `type`: string, value: String): StringNode = {
    val __obj = js.Dynamic.literal(quote = quote.asInstanceOf[js.Any], sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringNode]
  }
  
  @scala.inline
  implicit class StringNodeOps[Self <: StringNode] (val x: Self) extends AnyVal {
    
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
    def setQuote(value: Quotationmark | Apostrophe): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
