package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharePointOneDriveOptions extends StObject {
  
  // The type of search content. The possible values are: sharedContent, privateContent, unknownFutureValue. Read-only.
  var includeContent: js.UndefOr[NullableOption[SearchContent]] = js.undefined
}
object SharePointOneDriveOptions {
  
  inline def apply(): SharePointOneDriveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharePointOneDriveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharePointOneDriveOptions] (val x: Self) extends AnyVal {
    
    inline def setIncludeContent(value: NullableOption[SearchContent]): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
    
    inline def setIncludeContentNull: Self = StObject.set(x, "includeContent", null)
    
    inline def setIncludeContentUndefined: Self = StObject.set(x, "includeContent", js.undefined)
  }
}
