package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MimeContent extends StObject {
  
  // Indicates the content mime type.
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The byte array that contains the actual content.
  var value: js.UndefOr[NullableOption[Double]] = js.undefined
}
object MimeContent {
  
  @scala.inline
  def apply(): MimeContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MimeContent]
  }
  
  @scala.inline
  implicit class MimeContentMutableBuilder[Self <: MimeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
