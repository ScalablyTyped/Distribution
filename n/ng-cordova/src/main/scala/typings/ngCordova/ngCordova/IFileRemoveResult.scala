package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileRemoveResult[TEntry] extends StObject {
  
  var fileRemoved: TEntry
  
  var success: Boolean
}
object IFileRemoveResult {
  
  @scala.inline
  def apply[TEntry](fileRemoved: TEntry, success: Boolean): IFileRemoveResult[TEntry] = {
    val __obj = js.Dynamic.literal(fileRemoved = fileRemoved.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileRemoveResult[TEntry]]
  }
  
  @scala.inline
  implicit class IFileRemoveResultMutableBuilder[Self <: IFileRemoveResult[?], TEntry] (val x: Self & IFileRemoveResult[TEntry]) extends AnyVal {
    
    @scala.inline
    def setFileRemoved(value: TEntry): Self = StObject.set(x, "fileRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
