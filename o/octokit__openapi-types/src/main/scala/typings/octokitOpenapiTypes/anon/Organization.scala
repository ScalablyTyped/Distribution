package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Organization extends StObject {
  
  var organization: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var other: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  
  var repository: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
}
object Organization {
  
  inline def apply(): Organization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Organization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Organization] (val x: Self) extends AnyVal {
    
    inline def setOrganization(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setOther(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setOtherUndefined: Self = StObject.set(x, "other", js.undefined)
    
    inline def setRepository(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
  }
}
