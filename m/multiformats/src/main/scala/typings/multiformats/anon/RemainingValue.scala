package typings.multiformats.anon

import typings.multiformats.blockInterfaceMod.BlockCursorView
import typings.multiformats.cidMod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemainingValue
  extends StObject
     with BlockCursorView[Any] {
  
  var remaining: String
  
  var value: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version]
}
object RemainingValue {
  
  inline def apply(remaining: String, value: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version]): RemainingValue = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemainingValue]
  }
  
  extension [Self <: RemainingValue](x: Self) {
    
    inline def setRemaining(value: String): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CID[Any, Double, Double, typings.multiformats.linkInterfaceMod.Version]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
