package typings.minappEnv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.Optional<minapp-env.Record<'complete' | 'success' | 'fail', (args : ...any): any>> */
@js.native
trait OptionalRecordcompletesuc extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
}
object OptionalRecordcompletesuc {
  
  @scala.inline
  def apply(): OptionalRecordcompletesuc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionalRecordcompletesuc]
  }
  
  @scala.inline
  implicit class OptionalRecordcompletesucMutableBuilder[Self <: OptionalRecordcompletesuc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* repeated */ js.Any => _): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* repeated */ js.Any => _): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* repeated */ js.Any => _): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
