package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonType extends StObject {
  
  // The type of data source, such as Person.
  var `class`: js.UndefOr[NullableOption[String]] = js.native
  
  // The secondary type of data source, such as OrganizationUser.
  var subclass: js.UndefOr[NullableOption[String]] = js.native
}
object PersonType {
  
  @scala.inline
  def apply(): PersonType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonType]
  }
  
  @scala.inline
  implicit class PersonTypeMutableBuilder[Self <: PersonType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClass(value: NullableOption[String]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNull: Self = StObject.set(x, "class", null)
    
    @scala.inline
    def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    @scala.inline
    def setSubclass(value: NullableOption[String]): Self = StObject.set(x, "subclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubclassNull: Self = StObject.set(x, "subclass", null)
    
    @scala.inline
    def setSubclassUndefined: Self = StObject.set(x, "subclass", js.undefined)
  }
}
