package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libComponentsTooltipTooltipDottypesMod.TooltipDelay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  var delay: TooltipDelay
}
object Delay {
  
  inline def apply(delay: TooltipDelay): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  extension [Self <: Delay](x: Self) {
    
    inline def setDelay(value: TooltipDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
  }
}
