package typings.parse5.tokenMod

import typings.parse5.htmlMod.TAG_ID
import typings.parse5.tokenMod.TokenType.END_TAG
import typings.parse5.tokenMod.TokenType.START_TAG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagToken
  extends StObject
     with TokenBase
     with Token {
  
  var ackSelfClosing: Boolean
  
  var attrs: js.Array[Attribute]
  
  @JSName("location")
  var location_TagToken: LocationWithAttributes | Null
  
  var selfClosing: Boolean
  
  /** Used to cache the ID of the tag name. */
  var tagID: TAG_ID
  
  var tagName: String
  
  @JSName("type")
  val type_TagToken: START_TAG | END_TAG
}
object TagToken {
  
  inline def apply(
    ackSelfClosing: Boolean,
    attrs: js.Array[Attribute],
    selfClosing: Boolean,
    tagID: TAG_ID,
    tagName: String,
    `type`: START_TAG | END_TAG
  ): TagToken = {
    val __obj = js.Dynamic.literal(ackSelfClosing = ackSelfClosing.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], tagID = tagID.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagToken]
  }
  
  extension [Self <: TagToken](x: Self) {
    
    inline def setAckSelfClosing(value: Boolean): Self = StObject.set(x, "ackSelfClosing", value.asInstanceOf[js.Any])
    
    inline def setAttrs(value: js.Array[Attribute]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsVarargs(value: Attribute*): Self = StObject.set(x, "attrs", js.Array(value*))
    
    inline def setLocation(value: LocationWithAttributes): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setTagID(value: TAG_ID): Self = StObject.set(x, "tagID", value.asInstanceOf[js.Any])
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setType(value: START_TAG | END_TAG): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
