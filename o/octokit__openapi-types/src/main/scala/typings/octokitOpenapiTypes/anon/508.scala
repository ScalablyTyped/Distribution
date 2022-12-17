package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `508` extends StObject {
  
  /** The full path, relative to the repository root, of the dependency manifest file. */
  var name: js.UndefOr[String] = js.undefined
}
object `508` {
  
  inline def apply(): `508` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`508`]
  }
  
  extension [Self <: `508`](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
