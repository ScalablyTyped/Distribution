package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returned from a successful file picker operation.
  */
@js.native
trait IFilePickerResult extends js.Object {
  
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
  implicit class IFilePickerResultOps[Self <: IFilePickerResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: Files): Self = this.set("data", value.asInstanceOf[js.Any])
  }
}
