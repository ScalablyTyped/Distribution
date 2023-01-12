package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSetVersionItem extends StObject {
  
  // The unique identifier for the item.
  var itemId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The title of the item.
  var title: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The version ID of the item.
  var versionId: js.UndefOr[NullableOption[String]] = js.undefined
}
object DocumentSetVersionItem {
  
  inline def apply(): DocumentSetVersionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSetVersionItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentSetVersionItem] (val x: Self) extends AnyVal {
    
    inline def setItemId(value: NullableOption[String]): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdNull: Self = StObject.set(x, "itemId", null)
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setTitle(value: NullableOption[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersionId(value: NullableOption[String]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdNull: Self = StObject.set(x, "versionId", null)
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
