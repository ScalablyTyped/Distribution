package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileLobApp
  extends StObject
     with MobileApp {
  
  // The internal committed content version.
  var committedContentVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The list of content versions for this app.
  var contentVersions: js.UndefOr[NullableOption[js.Array[MobileAppContent]]] = js.undefined
  
  // The name of the main Lob application file.
  var fileName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The total size, including all uploaded files.
  var size: js.UndefOr[Double] = js.undefined
}
object MobileLobApp {
  
  inline def apply(): MobileLobApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileLobApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileLobApp] (val x: Self) extends AnyVal {
    
    inline def setCommittedContentVersion(value: NullableOption[String]): Self = StObject.set(x, "committedContentVersion", value.asInstanceOf[js.Any])
    
    inline def setCommittedContentVersionNull: Self = StObject.set(x, "committedContentVersion", null)
    
    inline def setCommittedContentVersionUndefined: Self = StObject.set(x, "committedContentVersion", js.undefined)
    
    inline def setContentVersions(value: NullableOption[js.Array[MobileAppContent]]): Self = StObject.set(x, "contentVersions", value.asInstanceOf[js.Any])
    
    inline def setContentVersionsNull: Self = StObject.set(x, "contentVersions", null)
    
    inline def setContentVersionsUndefined: Self = StObject.set(x, "contentVersions", js.undefined)
    
    inline def setContentVersionsVarargs(value: MobileAppContent*): Self = StObject.set(x, "contentVersions", js.Array(value*))
    
    inline def setFileName(value: NullableOption[String]): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
