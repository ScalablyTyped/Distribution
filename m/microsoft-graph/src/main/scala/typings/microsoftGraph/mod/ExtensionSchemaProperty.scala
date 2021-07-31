package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionSchemaProperty extends StObject {
  
  // The name of the strongly-typed property defined as part of a schema extension.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of the property that is defined as part of a schema extension. Allowed values are Binary, Boolean, DateTime,
    * Integer or String. See the table below for more details.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
}
object ExtensionSchemaProperty {
  
  @scala.inline
  def apply(): ExtensionSchemaProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionSchemaProperty]
  }
  
  @scala.inline
  implicit class ExtensionSchemaPropertyMutableBuilder[Self <: ExtensionSchemaProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
