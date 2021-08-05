package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileRemoveResult[TEntry] extends StObject {
  
  var fileRemoved: TEntry
  
  var success: Boolean
}
object IFileRemoveResult {
  
  inline def apply[TEntry](fileRemoved: TEntry, success: Boolean): IFileRemoveResult[TEntry] = {
    val __obj = js.Dynamic.literal(fileRemoved = fileRemoved.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileRemoveResult[TEntry]]
  }
  
  extension [Self <: IFileRemoveResult[?], TEntry](x: Self & IFileRemoveResult[TEntry]) {
    
    inline def setFileRemoved(value: TEntry): Self = StObject.set(x, "fileRemoved", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
