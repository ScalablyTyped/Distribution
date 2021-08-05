package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanPullDown extends StObject {
  
  var canPullDown: Boolean
}
object CanPullDown {
  
  inline def apply(canPullDown: Boolean): CanPullDown = {
    val __obj = js.Dynamic.literal(canPullDown = canPullDown.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanPullDown]
  }
  
  extension [Self <: CanPullDown](x: Self) {
    
    inline def setCanPullDown(value: Boolean): Self = StObject.set(x, "canPullDown", value.asInstanceOf[js.Any])
  }
}
