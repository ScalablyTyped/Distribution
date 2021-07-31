package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Provides information about the document that raised the DataRefreshComplete event.
  *
  * [Api set:  1.1]
  */
trait DataRefreshCompleteEventArgs extends StObject {
  
  /**
    *
    * Gets the document object that raised the DataRefreshComplete event.
    *
    * [Api set:  1.1]
    */
  var document: Document
  
  /**
    *
    * Gets the success or failure of the DataRefreshComplete event.
    *
    * [Api set:  1.1]
    */
  var success: Boolean
}
object DataRefreshCompleteEventArgs {
  
  @scala.inline
  def apply(document: Document, success: Boolean): DataRefreshCompleteEventArgs = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRefreshCompleteEventArgs]
  }
  
  @scala.inline
  implicit class DataRefreshCompleteEventArgsMutableBuilder[Self <: DataRefreshCompleteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
