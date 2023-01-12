package typings.node.streamWebMod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderlyingSource[R] extends StObject {
  
  var cancel: js.UndefOr[UnderlyingSourceCancelCallback] = js.undefined
  
  var pull: js.UndefOr[UnderlyingSourcePullCallback[R]] = js.undefined
  
  var start: js.UndefOr[UnderlyingSourceStartCallback[R]] = js.undefined
  
  var `type`: Unit
}
object UnderlyingSource {
  
  inline def apply[R](`type`: Unit): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnderlyingSource[?], R] (val x: Self & UnderlyingSource[R]) extends AnyVal {
    
    inline def setCancel(value: /* reason */ js.UndefOr[Any] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setPull(value: /* controller */ ReadableStreamController[R] => Unit | PromiseLike[Unit]): Self = StObject.set(x, "pull", js.Any.fromFunction1(value))
    
    inline def setPullUndefined: Self = StObject.set(x, "pull", js.undefined)
    
    inline def setStart(value: /* controller */ ReadableStreamController[R] => Any): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
