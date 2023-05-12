package typings.multiformats.anon

import typings.multiformats.distTypesSrcBlockInterfaceMod.BlockCursorView
import typings.multiformats.distTypesSrcCidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemainingValue
  extends StObject
     with BlockCursorView[Any] {
  
  var remaining: String
  
  var value: CID[Any, Double, Double, Version]
}
object RemainingValue {
  
  inline def apply(remaining: String, value: CID[Any, Double, Double, Version]): RemainingValue = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemainingValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemainingValue] (val x: Self) extends AnyVal {
    
    inline def setRemaining(value: String): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CID[Any, Double, Double, Version]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
