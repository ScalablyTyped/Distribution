package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119` extends StObject {
  
  /** The full path, relative to the repository root, of the dependency manifest file. */
  var name: js.UndefOr[String] = js.undefined
}
object `119` {
  
  inline def apply(): `119` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`119`]
  }
  
  extension [Self <: `119`](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
