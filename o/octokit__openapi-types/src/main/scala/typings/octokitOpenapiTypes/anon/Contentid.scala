package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contentid extends StObject {
  
  /**
    * @description The unique identifier of the content associated with the card
    * @example 42
    */
  var content_id: Double
  
  /**
    * @description The piece of content associated with the card
    * @example PullRequest
    */
  var content_type: String
}
object Contentid {
  
  inline def apply(content_id: Double, content_type: String): Contentid = {
    val __obj = js.Dynamic.literal(content_id = content_id.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contentid] (val x: Self) extends AnyVal {
    
    inline def setContent_id(value: Double): Self = StObject.set(x, "content_id", value.asInstanceOf[js.Any])
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
  }
}
