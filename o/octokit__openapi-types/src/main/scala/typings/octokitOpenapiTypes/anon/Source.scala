package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /** @example C */
  var name: String
  
  /**
    * @example # Object files
    * *.o
    *
    * # Libraries
    * *.lib
    * *.a
    *
    * # Shared objects (inc. Windows DLLs)
    * *.dll
    * *.so
    * *.so.*
    * *.dylib
    *
    * # Executables
    * *.exe
    * *.out
    * *.app
    */
  var source: String
}
object Source {
  
  inline def apply(name: String, source: String): Source = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
