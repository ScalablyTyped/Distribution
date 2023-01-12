package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiCoreLibraryMod.ScrollBarAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Forward extends StObject {
  
  /**
    * Actions are: Click on track, button, drag of thumb, or mouse wheel click.
    */
  var action: js.UndefOr[
    ScrollBarAction | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ScrollBarAction * / any */ String)
  ] = js.undefined
  
  /**
    * Direction of scrolling: back (up) or forward (down).
    */
  var forward: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Current Scroll position either in pixels or in steps.
    */
  var newScrollPos: js.UndefOr[int] = js.undefined
  
  /**
    * Old Scroll position - can be in pixels or in steps.
    */
  var oldScrollPos: js.UndefOr[int] = js.undefined
}
object Forward {
  
  inline def apply(): Forward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Forward]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Forward] (val x: Self) extends AnyVal {
    
    inline def setAction(
      value: ScrollBarAction | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ScrollBarAction * / any */ String)
    ): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setNewScrollPos(value: int): Self = StObject.set(x, "newScrollPos", value.asInstanceOf[js.Any])
    
    inline def setNewScrollPosUndefined: Self = StObject.set(x, "newScrollPos", js.undefined)
    
    inline def setOldScrollPos(value: int): Self = StObject.set(x, "oldScrollPos", value.asInstanceOf[js.Any])
    
    inline def setOldScrollPosUndefined: Self = StObject.set(x, "oldScrollPos", js.undefined)
  }
}
