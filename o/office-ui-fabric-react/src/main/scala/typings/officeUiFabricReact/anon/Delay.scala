package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.tooltipTypesMod.TooltipDelay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay extends StObject {
  
  var delay: TooltipDelay = js.native
}
object Delay {
  
  @scala.inline
  def apply(delay: TooltipDelay): Delay = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: TooltipDelay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
  }
}
