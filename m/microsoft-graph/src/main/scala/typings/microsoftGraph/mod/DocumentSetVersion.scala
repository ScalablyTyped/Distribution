package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSetVersion
  extends StObject
     with ListItemVersion {
  
  // Comment about the captured version.
  var comment: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User who captured the version.
  var createdBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Date and time when this version was created.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Items within the document set that are captured as part of this version.
  var items: js.UndefOr[NullableOption[js.Array[DocumentSetVersionItem]]] = js.undefined
  
  /**
    * If true, minor versions of items are also captured; otherwise, only major versions will be captured. Default value is
    * false.
    */
  var shouldCaptureMinorVersion: js.UndefOr[NullableOption[Boolean]] = js.undefined
}
object DocumentSetVersion {
  
  inline def apply(): DocumentSetVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSetVersion]
  }
  
  extension [Self <: DocumentSetVersion](x: Self) {
    
    inline def setComment(value: NullableOption[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreatedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByNull: Self = StObject.set(x, "createdBy", null)
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "createdBy", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setItems(value: NullableOption[js.Array[DocumentSetVersionItem]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsNull: Self = StObject.set(x, "items", null)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DocumentSetVersionItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setShouldCaptureMinorVersion(value: NullableOption[Boolean]): Self = StObject.set(x, "shouldCaptureMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setShouldCaptureMinorVersionNull: Self = StObject.set(x, "shouldCaptureMinorVersion", null)
    
    inline def setShouldCaptureMinorVersionUndefined: Self = StObject.set(x, "shouldCaptureMinorVersion", js.undefined)
  }
}
