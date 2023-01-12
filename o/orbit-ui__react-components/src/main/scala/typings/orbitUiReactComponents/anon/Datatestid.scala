package typings.orbitUiReactComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datatestid extends StObject {
  
  var `data-testid`: js.UndefOr[String] = js.undefined
  
  /**
    * Default slot override. Added to every orbit component
    */
  var slot: js.UndefOr[String] = js.undefined
}
object Datatestid {
  
  inline def apply(): Datatestid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datatestid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Datatestid] (val x: Self) extends AnyVal {
    
    inline def `setData-testid`(value: String): Self = StObject.set(x, "data-testid", value.asInstanceOf[js.Any])
    
    inline def `setData-testidUndefined`: Self = StObject.set(x, "data-testid", js.undefined)
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
  }
}
