package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextConfig extends js.Object {
  
  /** The transformations to apply to the detected data. */
  var transformations: js.UndefOr[js.Array[InfoTypeTransformation]] = js.native
}
object TextConfig {
  
  @scala.inline
  def apply(): TextConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextConfig]
  }
  
  @scala.inline
  implicit class TextConfigOps[Self <: TextConfig] (val x: Self) extends AnyVal {
    
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
    def setTransformationsVarargs(value: InfoTypeTransformation*): Self = this.set("transformations", js.Array(value :_*))
    
    @scala.inline
    def setTransformations(value: js.Array[InfoTypeTransformation]): Self = this.set("transformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformations: Self = this.set("transformations", js.undefined)
  }
}
