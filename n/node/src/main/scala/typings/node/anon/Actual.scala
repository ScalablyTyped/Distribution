package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actual extends StObject {
  
  /** The `actual` property on the error instance. */
  var actual: js.UndefOr[js.Any] = js.native
  
  /** The `expected` property on the error instance. */
  var expected: js.UndefOr[js.Any] = js.native
  
  /** If provided, the error message is set to this value. */
  var message: js.UndefOr[String] = js.native
  
  /** The `operator` property on the error instance. */
  var operator: js.UndefOr[String] = js.native
  
  /** If provided, the generated stack trace omits frames before this function. */
  var stackStartFn: js.UndefOr[js.Function] = js.native
}
object Actual {
  
  @scala.inline
  def apply(): Actual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actual]
  }
  
  @scala.inline
  implicit class ActualMutableBuilder[Self <: Actual] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    @scala.inline
    def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setStackStartFn(value: js.Function): Self = StObject.set(x, "stackStartFn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStartFnUndefined: Self = StObject.set(x, "stackStartFn", js.undefined)
  }
}
