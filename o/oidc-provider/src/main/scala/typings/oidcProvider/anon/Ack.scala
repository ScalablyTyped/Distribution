package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ack extends StObject {
  
  var ack: js.UndefOr[String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var iatTolerance: js.UndefOr[Double] = js.undefined
}
object Ack {
  
  inline def apply(): Ack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ack] (val x: Self) extends AnyVal {
    
    inline def setAck(value: String): Self = StObject.set(x, "ack", value.asInstanceOf[js.Any])
    
    inline def setAckUndefined: Self = StObject.set(x, "ack", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIatTolerance(value: Double): Self = StObject.set(x, "iatTolerance", value.asInstanceOf[js.Any])
    
    inline def setIatToleranceUndefined: Self = StObject.set(x, "iatTolerance", js.undefined)
  }
}
