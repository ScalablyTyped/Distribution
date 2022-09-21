package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Entity
import typings.microsoftGraph.mod.IdentitySet
import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSet
  extends StObject
     with Entity {
  
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DataSet {
  
  inline def apply(): DataSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSet]
  }
  
  extension [Self <: DataSet](x: Self) {
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
