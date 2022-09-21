package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `527` extends StObject {
  
  /** The full path, relative to the repository root, of the dependency manifest file. */
  var name: js.UndefOr[String] = js.undefined
}
object `527` {
  
  inline def apply(): `527` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`527`]
  }
  
  extension [Self <: `527`](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
