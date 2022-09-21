package typings.nginstackEngine.anon

import typings.nginstackEngine.dbkeyMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileName extends StObject {
  
  var extraAttributes: js.UndefOr[Any] = js.undefined
  
  var fileName: js.UndefOr[String] = js.undefined
  
  var mimeType: js.UndefOr[Double | ^] = js.undefined
}
object FileName {
  
  inline def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  
  extension [Self <: FileName](x: Self) {
    
    inline def setExtraAttributes(value: Any): Self = StObject.set(x, "extraAttributes", value.asInstanceOf[js.Any])
    
    inline def setExtraAttributesUndefined: Self = StObject.set(x, "extraAttributes", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setMimeType(value: Double | ^): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
