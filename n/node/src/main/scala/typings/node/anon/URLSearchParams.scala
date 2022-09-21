package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URLSearchParams extends StObject {
  
  var URLSearchParams: /* import warning: importer.ImportType#apply Failed type conversion: infer URLSearchParams */ js.Any
  
  var onmessage: Any
}
object URLSearchParams {
  
  inline def apply(
    URLSearchParams: /* import warning: importer.ImportType#apply Failed type conversion: infer URLSearchParams */ js.Any,
    onmessage: Any
  ): URLSearchParams = {
    val __obj = js.Dynamic.literal(URLSearchParams = URLSearchParams.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLSearchParams]
  }
  
  extension [Self <: URLSearchParams](x: Self) {
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
    
    inline def setURLSearchParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer URLSearchParams */ js.Any
    ): Self = StObject.set(x, "URLSearchParams", value.asInstanceOf[js.Any])
  }
}
