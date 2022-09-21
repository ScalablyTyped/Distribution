package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobInvalidation
  extends StObject
     with FileCreateInvalidation {
  
  var glob: Glob
}
object GlobInvalidation {
  
  inline def apply(glob: Glob): GlobInvalidation = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobInvalidation]
  }
  
  extension [Self <: GlobInvalidation](x: Self) {
    
    inline def setGlob(value: Glob): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
  }
}
