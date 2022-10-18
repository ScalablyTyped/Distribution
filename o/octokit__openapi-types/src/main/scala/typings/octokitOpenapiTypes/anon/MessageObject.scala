package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.blob
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.commit
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageObject extends StObject {
  
  /** @description The tag message. */
  var message: String
  
  /** @description The SHA of the git object this is tagging. */
  var `object`: String
  
  /** @description The tag's name. This is typically a version (e.g., "v0.0.1"). */
  var tag: String
  
  /** @description An object with information about the individual creating the tag. */
  var tagger: js.UndefOr[EmailString] = js.undefined
  
  /**
    * @description The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.
    * @enum {string}
    */
  var `type`: commit | tree | blob
}
object MessageObject {
  
  inline def apply(message: String, `object`: String, tag: String, `type`: commit | tree | blob): MessageObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageObject]
  }
  
  extension [Self <: MessageObject](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagger(value: EmailString): Self = StObject.set(x, "tagger", value.asInstanceOf[js.Any])
    
    inline def setTaggerUndefined: Self = StObject.set(x, "tagger", js.undefined)
    
    inline def setType(value: commit | tree | blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
