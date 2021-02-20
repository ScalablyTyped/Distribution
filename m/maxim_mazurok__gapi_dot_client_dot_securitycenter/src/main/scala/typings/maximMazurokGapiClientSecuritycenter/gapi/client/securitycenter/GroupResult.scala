package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupResult extends StObject {
  
  /** Total count of resources for the given properties. */
  var count: js.UndefOr[String] = js.native
  
  /** Properties matching the groupBy fields in the request. */
  var properties: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.GroupResult with TopLevel[js.Any]
  ] = js.native
}
object GroupResult {
  
  @scala.inline
  def apply(): GroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupResult]
  }
  
  @scala.inline
  implicit class GroupResultMutableBuilder[Self <: GroupResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientSecuritycenter.maximMazurokGapiClientSecuritycenterStrings.GroupResult with TopLevel[js.Any]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
