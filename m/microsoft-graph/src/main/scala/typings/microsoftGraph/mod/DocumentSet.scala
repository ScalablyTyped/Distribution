package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentSet extends StObject {
  
  // Content types allowed in document set.
  var allowedContentTypes: js.UndefOr[NullableOption[js.Array[ContentTypeInfo]]] = js.undefined
  
  // Default contents of document set.
  var defaultContents: js.UndefOr[NullableOption[js.Array[DocumentSetContent]]] = js.undefined
  
  // Specifies whether to push welcome page changes to inherited content types.
  var propagateWelcomePageChanges: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var sharedColumns: js.UndefOr[NullableOption[js.Array[ColumnDefinition]]] = js.undefined
  
  // Indicates whether to add the name of the document set to each file name.
  var shouldPrefixNameToFile: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var welcomePageColumns: js.UndefOr[NullableOption[js.Array[ColumnDefinition]]] = js.undefined
  
  // Welcome page absolute URL.
  var welcomePageUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object DocumentSet {
  
  inline def apply(): DocumentSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentSet]
  }
  
  extension [Self <: DocumentSet](x: Self) {
    
    inline def setAllowedContentTypes(value: NullableOption[js.Array[ContentTypeInfo]]): Self = StObject.set(x, "allowedContentTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowedContentTypesNull: Self = StObject.set(x, "allowedContentTypes", null)
    
    inline def setAllowedContentTypesUndefined: Self = StObject.set(x, "allowedContentTypes", js.undefined)
    
    inline def setAllowedContentTypesVarargs(value: ContentTypeInfo*): Self = StObject.set(x, "allowedContentTypes", js.Array(value*))
    
    inline def setDefaultContents(value: NullableOption[js.Array[DocumentSetContent]]): Self = StObject.set(x, "defaultContents", value.asInstanceOf[js.Any])
    
    inline def setDefaultContentsNull: Self = StObject.set(x, "defaultContents", null)
    
    inline def setDefaultContentsUndefined: Self = StObject.set(x, "defaultContents", js.undefined)
    
    inline def setDefaultContentsVarargs(value: DocumentSetContent*): Self = StObject.set(x, "defaultContents", js.Array(value*))
    
    inline def setPropagateWelcomePageChanges(value: NullableOption[Boolean]): Self = StObject.set(x, "propagateWelcomePageChanges", value.asInstanceOf[js.Any])
    
    inline def setPropagateWelcomePageChangesNull: Self = StObject.set(x, "propagateWelcomePageChanges", null)
    
    inline def setPropagateWelcomePageChangesUndefined: Self = StObject.set(x, "propagateWelcomePageChanges", js.undefined)
    
    inline def setSharedColumns(value: NullableOption[js.Array[ColumnDefinition]]): Self = StObject.set(x, "sharedColumns", value.asInstanceOf[js.Any])
    
    inline def setSharedColumnsNull: Self = StObject.set(x, "sharedColumns", null)
    
    inline def setSharedColumnsUndefined: Self = StObject.set(x, "sharedColumns", js.undefined)
    
    inline def setSharedColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "sharedColumns", js.Array(value*))
    
    inline def setShouldPrefixNameToFile(value: NullableOption[Boolean]): Self = StObject.set(x, "shouldPrefixNameToFile", value.asInstanceOf[js.Any])
    
    inline def setShouldPrefixNameToFileNull: Self = StObject.set(x, "shouldPrefixNameToFile", null)
    
    inline def setShouldPrefixNameToFileUndefined: Self = StObject.set(x, "shouldPrefixNameToFile", js.undefined)
    
    inline def setWelcomePageColumns(value: NullableOption[js.Array[ColumnDefinition]]): Self = StObject.set(x, "welcomePageColumns", value.asInstanceOf[js.Any])
    
    inline def setWelcomePageColumnsNull: Self = StObject.set(x, "welcomePageColumns", null)
    
    inline def setWelcomePageColumnsUndefined: Self = StObject.set(x, "welcomePageColumns", js.undefined)
    
    inline def setWelcomePageColumnsVarargs(value: ColumnDefinition*): Self = StObject.set(x, "welcomePageColumns", js.Array(value*))
    
    inline def setWelcomePageUrl(value: NullableOption[String]): Self = StObject.set(x, "welcomePageUrl", value.asInstanceOf[js.Any])
    
    inline def setWelcomePageUrlNull: Self = StObject.set(x, "welcomePageUrl", null)
    
    inline def setWelcomePageUrlUndefined: Self = StObject.set(x, "welcomePageUrl", js.undefined)
  }
}
