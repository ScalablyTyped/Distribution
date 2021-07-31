package typings.pgPromise.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreErrors extends StObject {
  
  var ignoreErrors: js.UndefOr[Boolean] = js.undefined
  
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object IgnoreErrors {
  
  @scala.inline
  def apply(): IgnoreErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreErrors]
  }
  
  @scala.inline
  implicit class IgnoreErrorsMutableBuilder[Self <: IgnoreErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
    
    @scala.inline
    def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
