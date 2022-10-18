package typings.openui5.anon

import typings.openui5.sapMUploadCollectionItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentIdItem extends StObject {
  
  /**
    * A unique Id of the attached document. This parameter is deprecated since 1.28.0. Use the `item` parameter
    * instead.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * An item to be deleted from the collection. Since version 1.28.0.
    */
  var item: js.UndefOr[default] = js.undefined
}
object DocumentIdItem {
  
  inline def apply(): DocumentIdItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentIdItem]
  }
  
  extension [Self <: DocumentIdItem](x: Self) {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
