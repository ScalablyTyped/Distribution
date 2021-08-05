package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returned from a successful file picker operation.
  */
trait IFilePickerResult extends StObject {
  
  /**
    * Contains data concerning the user's picked files.
    */
  var data: Files
}
object IFilePickerResult {
  
  inline def apply(data: Files): IFilePickerResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilePickerResult]
  }
  
  extension [Self <: IFilePickerResult](x: Self) {
    
    inline def setData(value: Files): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
