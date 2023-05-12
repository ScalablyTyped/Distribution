package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Generator extends StObject {
  
  var generator: String
  
  var version: String
}
object Generator {
  
  inline def apply(generator: String, version: String): Generator = {
    val __obj = js.Dynamic.literal(generator = generator.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Generator] (val x: Self) extends AnyVal {
    
    inline def setGenerator(value: String): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
