package typings.parse5.tokenMod

import typings.parse5.htmlMod.TAG_ID
import typings.parse5.tokenMod.TokenType.CHARACTER
import typings.parse5.tokenMod.TokenType.COMMENT
import typings.parse5.tokenMod.TokenType.DOCTYPE
import typings.parse5.tokenMod.TokenType.END_TAG
import typings.parse5.tokenMod.TokenType.EOF
import typings.parse5.tokenMod.TokenType.NULL_CHARACTER
import typings.parse5.tokenMod.TokenType.START_TAG
import typings.parse5.tokenMod.TokenType.WHITESPACE_CHARACTER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parse5.tokenMod.DoctypeToken
  - typings.parse5.tokenMod.TagToken
  - typings.parse5.tokenMod.CommentToken
  - typings.parse5.tokenMod.EOFToken
  - typings.parse5.tokenMod.CharacterToken
*/
trait Token extends StObject
object Token {
  
  inline def CharacterToken(chars: String, `type`: CHARACTER | NULL_CHARACTER | WHITESPACE_CHARACTER): typings.parse5.tokenMod.CharacterToken = {
    val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parse5.tokenMod.CharacterToken]
  }
  
  inline def CommentToken(data: String, `type`: COMMENT): typings.parse5.tokenMod.CommentToken = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parse5.tokenMod.CommentToken]
  }
  
  inline def DoctypeToken(forceQuirks: Boolean, `type`: DOCTYPE): typings.parse5.tokenMod.DoctypeToken = {
    val __obj = js.Dynamic.literal(forceQuirks = forceQuirks.asInstanceOf[js.Any], location = null, name = null, publicId = null, systemId = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parse5.tokenMod.DoctypeToken]
  }
  
  inline def EOFToken(`type`: EOF): typings.parse5.tokenMod.EOFToken = {
    val __obj = js.Dynamic.literal(location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parse5.tokenMod.EOFToken]
  }
  
  inline def TagToken(
    ackSelfClosing: Boolean,
    attrs: js.Array[Attribute],
    selfClosing: Boolean,
    tagID: TAG_ID,
    tagName: String,
    `type`: START_TAG | END_TAG
  ): typings.parse5.tokenMod.TagToken = {
    val __obj = js.Dynamic.literal(ackSelfClosing = ackSelfClosing.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], tagID = tagID.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parse5.tokenMod.TagToken]
  }
}
