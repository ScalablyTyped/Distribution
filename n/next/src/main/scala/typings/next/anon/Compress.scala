package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compress extends StObject {
  
  var compress: js.UndefOr[js.Object] = js.undefined
  
  var mangle: js.UndefOr[js.Object] = js.undefined
}
object Compress {
  
  inline def apply(): Compress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compress]
  }
  
  extension [Self <: Compress](x: Self) {
    
    inline def setCompress(value: js.Object): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setMangle(value: js.Object): Self = StObject.set(x, "mangle", value.asInstanceOf[js.Any])
    
    inline def setMangleUndefined: Self = StObject.set(x, "mangle", js.undefined)
  }
}
