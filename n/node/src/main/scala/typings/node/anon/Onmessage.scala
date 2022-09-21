package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Onmessage extends StObject {
  
  var URL: /* import warning: importer.ImportType#apply Failed type conversion: infer URL */ js.Any
  
  var onmessage: Any
}
object Onmessage {
  
  inline def apply(
    URL: /* import warning: importer.ImportType#apply Failed type conversion: infer URL */ js.Any,
    onmessage: Any
  ): Onmessage = {
    val __obj = js.Dynamic.literal(URL = URL.asInstanceOf[js.Any], onmessage = onmessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Onmessage]
  }
  
  extension [Self <: Onmessage](x: Self) {
    
    inline def setOnmessage(value: Any): Self = StObject.set(x, "onmessage", value.asInstanceOf[js.Any])
    
    inline def setURL(value: /* import warning: importer.ImportType#apply Failed type conversion: infer URL */ js.Any): Self = StObject.set(x, "URL", value.asInstanceOf[js.Any])
  }
}
