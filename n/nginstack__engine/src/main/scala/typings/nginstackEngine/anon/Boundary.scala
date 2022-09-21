package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Boundary extends StObject {
  
  var boundary: js.UndefOr[String] = js.undefined
  
  var charset: js.UndefOr[String] = js.undefined
}
object Boundary {
  
  inline def apply(): Boundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Boundary]
  }
  
  extension [Self <: Boundary](x: Self) {
    
    inline def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
  }
}
