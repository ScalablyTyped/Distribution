package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paths extends StObject {
  
  var encodedPaths: js.Array[String]
  
  var paths: js.Array[String]
}
object Paths {
  
  inline def apply(encodedPaths: js.Array[String], paths: js.Array[String]): Paths = {
    val __obj = js.Dynamic.literal(encodedPaths = encodedPaths.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paths]
  }
  
  extension [Self <: Paths](x: Self) {
    
    inline def setEncodedPaths(value: js.Array[String]): Self = StObject.set(x, "encodedPaths", value.asInstanceOf[js.Any])
    
    inline def setEncodedPathsVarargs(value: String*): Self = StObject.set(x, "encodedPaths", js.Array(value*))
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
