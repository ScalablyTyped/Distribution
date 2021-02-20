package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunOptions[T] extends StObject {
  
  /**
    *  A previously-created context, or API object, or array of objects.
    * The batch will use the same RequestContext as the passed-in object, which means that any changes applied to the object will be picked up
    * by `context.sync()`.
    */
  var previousObjects: js.UndefOr[ClientObject | js.Array[ClientObject] | ClientRequestContext] = js.native
  
  /**
    * The URL of the remote workbook and the request headers to be sent.
    */
  var session: js.UndefOr[RequestUrlAndHeaderInfo | T] = js.native
}
object RunOptions {
  
  @scala.inline
  def apply[T](): RunOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions[T]]
  }
  
  @scala.inline
  implicit class RunOptionsMutableBuilder[Self <: RunOptions[_], T] (val x: Self with RunOptions[T]) extends AnyVal {
    
    @scala.inline
    def setPreviousObjects(value: ClientObject | js.Array[ClientObject] | ClientRequestContext): Self = StObject.set(x, "previousObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousObjectsUndefined: Self = StObject.set(x, "previousObjects", js.undefined)
    
    @scala.inline
    def setPreviousObjectsVarargs(value: ClientObject*): Self = StObject.set(x, "previousObjects", js.Array(value :_*))
    
    @scala.inline
    def setSession(value: RequestUrlAndHeaderInfo | T): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
