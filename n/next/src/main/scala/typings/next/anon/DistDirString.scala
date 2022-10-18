package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistDirString extends StObject {
  
  var distDir: String
}
object DistDirString {
  
  inline def apply(distDir: String): DistDirString = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistDirString]
  }
  
  extension [Self <: DistDirString](x: Self) {
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
  }
}
