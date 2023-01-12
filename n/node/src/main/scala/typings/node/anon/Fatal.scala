package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fatal extends StObject {
  
  var fatal: js.UndefOr[Boolean] = js.undefined
  
  var ignoreBOM: js.UndefOr[Boolean] = js.undefined
}
object Fatal {
  
  inline def apply(): Fatal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fatal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fatal] (val x: Self) extends AnyVal {
    
    inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
    
    inline def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
  }
}
