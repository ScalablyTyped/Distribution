package typings.powerbiVisualsTools.mod.extensibility

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITooltipService extends StObject {
  
  def enabled(): Boolean
  
  def hide(options: TooltipHideOptions): Unit
  
  def move(options: TooltipMoveOptions): Unit
  
  def show(options: TooltipShowOptions): Unit
}
object ITooltipService {
  
  inline def apply(
    enabled: () => Boolean,
    hide: TooltipHideOptions => Unit,
    move: TooltipMoveOptions => Unit,
    show: TooltipShowOptions => Unit
  ): ITooltipService = {
    val __obj = js.Dynamic.literal(enabled = js.Any.fromFunction0(enabled), hide = js.Any.fromFunction1(hide), move = js.Any.fromFunction1(move), show = js.Any.fromFunction1(show))
    __obj.asInstanceOf[ITooltipService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITooltipService] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: () => Boolean): Self = StObject.set(x, "enabled", js.Any.fromFunction0(value))
    
    inline def setHide(value: TooltipHideOptions => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
    
    inline def setMove(value: TooltipMoveOptions => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
    
    inline def setShow(value: TooltipShowOptions => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
  }
}
