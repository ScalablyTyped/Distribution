package typings.nextServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmpFirst extends StObject {
  
  var ampFirst: js.UndefOr[Boolean] = js.undefined
  
  var hasQuery: js.UndefOr[Boolean] = js.undefined
  
  var hybrid: js.UndefOr[Boolean] = js.undefined
}
object AmpFirst {
  
  inline def apply(): AmpFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmpFirst]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmpFirst] (val x: Self) extends AnyVal {
    
    inline def setAmpFirst(value: Boolean): Self = StObject.set(x, "ampFirst", value.asInstanceOf[js.Any])
    
    inline def setAmpFirstUndefined: Self = StObject.set(x, "ampFirst", js.undefined)
    
    inline def setHasQuery(value: Boolean): Self = StObject.set(x, "hasQuery", value.asInstanceOf[js.Any])
    
    inline def setHasQueryUndefined: Self = StObject.set(x, "hasQuery", js.undefined)
    
    inline def setHybrid(value: Boolean): Self = StObject.set(x, "hybrid", value.asInstanceOf[js.Any])
    
    inline def setHybridUndefined: Self = StObject.set(x, "hybrid", js.undefined)
  }
}
