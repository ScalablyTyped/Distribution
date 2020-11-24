package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnfidoConfig extends js.Object {
  
  var containerId: js.UndefOr[String] = js.native
  
  var isModalOpen: js.UndefOr[Boolean] = js.native
  
  var onComplete: js.UndefOr[js.Function1[/* data */ OnfidoResponse, Null]] = js.native
  
  var onModalRequestClose: js.UndefOr[js.Function0[Null]] = js.native
  
  var steps: js.UndefOr[js.Array[String | Options]] = js.native
  
  var token: js.UndefOr[String] = js.native
  
  var useModal: js.UndefOr[Boolean] = js.native
}
object OnfidoConfig {
  
  @scala.inline
  def apply(): OnfidoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnfidoConfig]
  }
  
  @scala.inline
  implicit class OnfidoConfigOps[Self <: OnfidoConfig] (val x: Self) extends AnyVal {
    
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
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setIsModalOpen(value: Boolean): Self = this.set("isModalOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsModalOpen: Self = this.set("isModalOpen", js.undefined)
    
    @scala.inline
    def setOnComplete(value: /* data */ OnfidoResponse => Null): Self = this.set("onComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnModalRequestClose(value: () => Null): Self = this.set("onModalRequestClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnModalRequestClose: Self = this.set("onModalRequestClose", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: (String | Options)*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: js.Array[String | Options]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setUseModal(value: Boolean): Self = this.set("useModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseModal: Self = this.set("useModal", js.undefined)
  }
}
