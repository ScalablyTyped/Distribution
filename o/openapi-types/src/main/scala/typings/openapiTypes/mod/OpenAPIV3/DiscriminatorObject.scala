package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscriminatorObject extends StObject {
  
  var mapping: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var propertyName: String
}
object DiscriminatorObject {
  
  @scala.inline
  def apply(propertyName: String): DiscriminatorObject = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscriminatorObject]
  }
  
  @scala.inline
  implicit class DiscriminatorObjectMutableBuilder[Self <: DiscriminatorObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMapping(value: StringDictionary[String]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
