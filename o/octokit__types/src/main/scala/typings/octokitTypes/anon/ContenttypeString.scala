package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContenttypeString extends StObject {
  
  var `content-type`: String
}
object ContenttypeString {
  
  @scala.inline
  def apply(`content-type`: String): ContenttypeString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContenttypeString]
  }
  
  @scala.inline
  implicit class ContenttypeStringMutableBuilder[Self <: ContenttypeString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
  }
}
