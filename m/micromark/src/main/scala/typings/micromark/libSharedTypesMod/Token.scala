package typings.micromark.libSharedTypesMod

import typings.micromark.constantTypesMod.Type
import typings.micromark.micromarkStrings.content
import typings.micromark.micromarkStrings.flow
import typings.micromark.micromarkStrings.string
import typings.micromark.micromarkStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
  /**
    * Close and open are also used in attention:
    * depending on the characters before and after sequences (**),
    * the sequence can open, close, both, or none
    */
  var _close: js.UndefOr[Boolean] = js.native
  
  /**
    * Close and open are also used in attention:
    * depending on the characters before and after sequences (**),
    * the sequence can open, close, both, or none
    */
  var _open: js.UndefOr[Boolean] = js.native
  
  /**
    * Used when dealing with linked tokens. A child tokenizer is needed to tokenize them, which is stored on those tokens
    */
  var _tokenizer: js.UndefOr[Tokenizer] = js.native
  
  /**
    * Declares a token as having content of a certain type.
    * Because markdown requires to first parse containers, flow, content completely,
    * and then later go on to phrasing and such, it needs to be declared somewhere on the tokens.
    */
  var contentType: js.UndefOr[flow | content | string | text] = js.native
  
  var end: Point = js.native
  
  var next: js.UndefOr[Token] = js.native
  
  var previous: js.UndefOr[Token] = js.native
  
  var start: Point = js.native
  
  var `type`: Type = js.native
}
object Token {
  
  @scala.inline
  def apply(end: Point, start: Point, `type`: Type): Token = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Point): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_close(value: Boolean): Self = this.set("_close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_close: Self = this.set("_close", js.undefined)
    
    @scala.inline
    def set_open(value: Boolean): Self = this.set("_open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_open: Self = this.set("_open", js.undefined)
    
    @scala.inline
    def set_tokenizer(value: Tokenizer): Self = this.set("_tokenizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_tokenizer: Self = this.set("_tokenizer", js.undefined)
    
    @scala.inline
    def setContentType(value: flow | content | string | text): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setNext(value: Token): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    
    @scala.inline
    def setPrevious(value: Token): Self = this.set("previous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
}
