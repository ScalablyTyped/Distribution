package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `531` extends StObject {
  
  var version: js.UndefOr[String] = js.undefined
}
object `531` {
  
  inline def apply(): `531` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`531`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `531`] (val x: Self) extends AnyVal {
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
