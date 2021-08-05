package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriveItemVersion
  extends StObject
     with BaseItemVersion {
  
  // The content stream for this version of the item.
  var content: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Indicates the size of the content stream for this version of the item.
  var size: js.UndefOr[NullableOption[Double]] = js.undefined
}
object DriveItemVersion {
  
  inline def apply(): DriveItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveItemVersion]
  }
  
  extension [Self <: DriveItemVersion](x: Self) {
    
    inline def setContent(value: NullableOption[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setSize(value: NullableOption[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
