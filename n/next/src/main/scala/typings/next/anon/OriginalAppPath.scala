package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalAppPath extends StObject {
  
  var originalAppPath: js.UndefOr[String] = js.undefined
  
  var pathname: String
}
object OriginalAppPath {
  
  inline def apply(pathname: String): OriginalAppPath = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalAppPath]
  }
  
  extension [Self <: OriginalAppPath](x: Self) {
    
    inline def setOriginalAppPath(value: String): Self = StObject.set(x, "originalAppPath", value.asInstanceOf[js.Any])
    
    inline def setOriginalAppPathUndefined: Self = StObject.set(x, "originalAppPath", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
  }
}
