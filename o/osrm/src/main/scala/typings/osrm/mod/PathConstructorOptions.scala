package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathConstructorOptions
  extends StObject
     with ConstructorOptions {
  
  /**
    * The path to the .osrm files. This is mutually exclusive with setting {options.shared_memory} to true.
    */
  var path: js.UndefOr[String] = js.undefined
}
object PathConstructorOptions {
  
  inline def apply(): PathConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
