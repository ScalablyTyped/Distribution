package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameSource extends StObject {
  
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
object NameSource {
  
  inline def apply(name: String, source: String): NameSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameSource] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
