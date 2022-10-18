package typings.nginstackEngine.anon

import typings.nginstackEngine.libDbkeyDbkeyMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassKey extends StObject {
  
  var classKey: js.UndefOr[Double | ^] = js.undefined
  
  var content: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[Double | ^] = js.undefined
  
  var version: js.UndefOr[Boolean] = js.undefined
}
object ClassKey {
  
  inline def apply(): ClassKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassKey]
  }
  
  extension [Self <: ClassKey](x: Self) {
    
    inline def setClassKey(value: Double | ^): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setClassKeyUndefined: Self = StObject.set(x, "classKey", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setKey(value: Double | ^): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
