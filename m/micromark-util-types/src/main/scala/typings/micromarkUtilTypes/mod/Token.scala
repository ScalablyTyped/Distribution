package typings.micromarkUtilTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  /**
    * A boolean used internally to figure out if a link opening is balanced: it’s
    * not a link opening but has a balanced closing.
    */
  var _balanced: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A marker used to parse attention, depending on the characters after
    * sequences (`**`), the sequence can open, close, both, or none
    */
  var _close: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean used internally to figure out if a token is a container token.
    */
  var _container: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean used internally to figure out if a link opening can’t be used
    * (because links in links are incorrect).
    */
  var _inactive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean used internally to figure out if a token is in the first content
    * of a list item construct.
    */
  var _isInFirstContentOfListItem: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A boolean used internally to figure out if a list is loose or not.
    */
  var _loose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A marker used to parse attention, depending on the characters before
    * sequences (`**`), the sequence can open, close, both, or none
    */
  var _open: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Used when dealing with linked tokens.
    * A child tokenizer is needed to tokenize them, which is stored on those
    * tokens.
    */
  var _tokenizer: js.UndefOr[TokenizeContext] = js.undefined
  
  /**
    * Declares a token as having content of a certain type.
    */
  var contentType: js.UndefOr[ContentType] = js.undefined
  
  var end: Point
  
  /**
    * The next token in a list of linked tokens
    */
  var next: js.UndefOr[Token] = js.undefined
  
  /**
    * The previous token in a list of linked tokens.
    */
  var previous: js.UndefOr[Token] = js.undefined
  
  var start: Point
  
  var `type`: String
}
object Token {
  
  inline def apply(end: Point, start: Point, `type`: String): Token = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setNext(value: Token): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrevious(value: Token): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_balanced(value: Boolean): Self = StObject.set(x, "_balanced", value.asInstanceOf[js.Any])
    
    inline def set_balancedUndefined: Self = StObject.set(x, "_balanced", js.undefined)
    
    inline def set_close(value: Boolean): Self = StObject.set(x, "_close", value.asInstanceOf[js.Any])
    
    inline def set_closeUndefined: Self = StObject.set(x, "_close", js.undefined)
    
    inline def set_container(value: Boolean): Self = StObject.set(x, "_container", value.asInstanceOf[js.Any])
    
    inline def set_containerUndefined: Self = StObject.set(x, "_container", js.undefined)
    
    inline def set_inactive(value: Boolean): Self = StObject.set(x, "_inactive", value.asInstanceOf[js.Any])
    
    inline def set_inactiveUndefined: Self = StObject.set(x, "_inactive", js.undefined)
    
    inline def set_isInFirstContentOfListItem(value: Boolean): Self = StObject.set(x, "_isInFirstContentOfListItem", value.asInstanceOf[js.Any])
    
    inline def set_isInFirstContentOfListItemUndefined: Self = StObject.set(x, "_isInFirstContentOfListItem", js.undefined)
    
    inline def set_loose(value: Boolean): Self = StObject.set(x, "_loose", value.asInstanceOf[js.Any])
    
    inline def set_looseUndefined: Self = StObject.set(x, "_loose", js.undefined)
    
    inline def set_open(value: Boolean): Self = StObject.set(x, "_open", value.asInstanceOf[js.Any])
    
    inline def set_openUndefined: Self = StObject.set(x, "_open", js.undefined)
    
    inline def set_tokenizer(value: TokenizeContext): Self = StObject.set(x, "_tokenizer", value.asInstanceOf[js.Any])
    
    inline def set_tokenizerUndefined: Self = StObject.set(x, "_tokenizer", js.undefined)
  }
}
