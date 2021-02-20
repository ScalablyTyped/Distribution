package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingOperations extends StObject {
  
  // A property that indicates that an operation that might update the binary content of a file is pending completion.
  var pendingContentUpdate: js.UndefOr[NullableOption[PendingContentUpdate]] = js.native
}
object PendingOperations {
  
  @scala.inline
  def apply(): PendingOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingOperations]
  }
  
  @scala.inline
  implicit class PendingOperationsMutableBuilder[Self <: PendingOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPendingContentUpdate(value: NullableOption[PendingContentUpdate]): Self = StObject.set(x, "pendingContentUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingContentUpdateNull: Self = StObject.set(x, "pendingContentUpdate", null)
    
    @scala.inline
    def setPendingContentUpdateUndefined: Self = StObject.set(x, "pendingContentUpdate", js.undefined)
  }
}
