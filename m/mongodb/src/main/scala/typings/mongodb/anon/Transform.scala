package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform[T] extends StObject {
  
  var transform: js.UndefOr[js.Function1[/* document */ T, _]] = js.native
}
object Transform {
  
  @scala.inline
  def apply[T](): Transform[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transform[T]]
  }
  
  @scala.inline
  implicit class TransformMutableBuilder[Self <: Transform[_], T] (val x: Self with Transform[T]) extends AnyVal {
    
    @scala.inline
    def setTransform(value: /* document */ T => _): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
