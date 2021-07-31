package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentTypeInfo extends StObject {
  
  // The id of the content type.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the content type.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
}
object ContentTypeInfo {
  
  @scala.inline
  def apply(): ContentTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentTypeInfo]
  }
  
  @scala.inline
  implicit class ContentTypeInfoMutableBuilder[Self <: ContentTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
