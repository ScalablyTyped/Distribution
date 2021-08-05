package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlookItem
  extends StObject
     with Entity {
  
  // The categories associated with the item
  var categories: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Identifies the version of the item. Every time the item is changed, changeKey changes as well. This allows Exchange to
    * apply changes to the correct version of the object. Read-only.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object OutlookItem {
  
  inline def apply(): OutlookItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlookItem]
  }
  
  extension [Self <: OutlookItem](x: Self) {
    
    inline def setCategories(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    inline def setChangeKey(value: NullableOption[String]): Self = StObject.set(x, "changeKey", value.asInstanceOf[js.Any])
    
    inline def setChangeKeyNull: Self = StObject.set(x, "changeKey", null)
    
    inline def setChangeKeyUndefined: Self = StObject.set(x, "changeKey", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
  }
}
