package typings.openui5.anon

import typings.openui5.sapMUploadCollectionItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentIdFileName extends StObject {
  
  /**
    * A unique Id of the attached document. This parameter is deprecated since 1.28.0. Use the `item` parameter
    * instead.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * The new file name. This parameter is deprecated since 1.28.0. Use the `item` parameter instead.
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * The renamed UI element as an UploadCollectionItem. Since 1.28.0.
    */
  var item: js.UndefOr[default] = js.undefined
}
object DocumentIdFileName {
  
  inline def apply(): DocumentIdFileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentIdFileName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentIdFileName] (val x: Self) extends AnyVal {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
