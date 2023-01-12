package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Debug extends StObject {
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var onlyHeader: js.UndefOr[Boolean] = js.undefined
}
object Debug {
  
  inline def apply(): Debug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debug]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setOnlyHeader(value: Boolean): Self = StObject.set(x, "onlyHeader", value.asInstanceOf[js.Any])
    
    inline def setOnlyHeaderUndefined: Self = StObject.set(x, "onlyHeader", js.undefined)
  }
}
