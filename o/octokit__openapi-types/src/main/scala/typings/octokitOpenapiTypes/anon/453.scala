package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `453` extends StObject {
  
  var version: js.UndefOr[String] = js.undefined
}
object `453` {
  
  inline def apply(): `453` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`453`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `453`] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
