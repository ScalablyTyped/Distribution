package typings.nodeZendesk.mod.Tickets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagsPayload extends StObject {
  
  val tags: js.Array[String]
}
object TagsPayload {
  
  @scala.inline
  def apply(tags: js.Array[String]): TagsPayload = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagsPayload]
  }
  
  @scala.inline
  implicit class TagsPayloadMutableBuilder[Self <: TagsPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
