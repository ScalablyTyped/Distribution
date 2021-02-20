package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Files
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returned from a successful file picker operation.
  */
@js.native
trait IFilePickerResult extends StObject {
  
  /**
    * Contains data concerning the user's picked files.
    */
  var data: Files = js.native
}
object IFilePickerResult {
  
  @scala.inline
  def apply(data: Files): IFilePickerResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilePickerResult]
  }
  
  @scala.inline
  implicit class IFilePickerResultMutableBuilder[Self <: IFilePickerResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Files): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
