package typings.next.anon

import typings.next.nextInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotFoundRoutes extends StObject {
  
  var notFoundRoutes: js.Array[scala.Nothing]
  
  var preview: PreviewModeEncryptionKey
  
  var version: `3`
}
object NotFoundRoutes {
  
  inline def apply(notFoundRoutes: js.Array[scala.Nothing], preview: PreviewModeEncryptionKey): NotFoundRoutes = {
    val __obj = js.Dynamic.literal(notFoundRoutes = notFoundRoutes.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], version = 3)
    __obj.asInstanceOf[NotFoundRoutes]
  }
  
  extension [Self <: NotFoundRoutes](x: Self) {
    
    inline def setNotFoundRoutes(value: js.Array[scala.Nothing]): Self = StObject.set(x, "notFoundRoutes", value.asInstanceOf[js.Any])
    
    inline def setNotFoundRoutesVarargs(value: scala.Nothing*): Self = StObject.set(x, "notFoundRoutes", js.Array(value*))
    
    inline def setPreview(value: PreviewModeEncryptionKey): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: `3`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
