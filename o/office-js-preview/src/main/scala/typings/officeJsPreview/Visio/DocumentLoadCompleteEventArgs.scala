package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the success or failure of the DocumentLoadComplete event.
  *
  * [Api set:  1.1]
  */
trait DocumentLoadCompleteEventArgs extends StObject {
  
  /**
    *
    * Gets the success or failure of the DocumentLoadComplete event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean
}
object DocumentLoadCompleteEventArgs {
  
  @scala.inline
  def apply(success: Boolean): DocumentLoadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLoadCompleteEventArgs]
  }
  
  @scala.inline
  implicit class DocumentLoadCompleteEventArgsMutableBuilder[Self <: DocumentLoadCompleteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
