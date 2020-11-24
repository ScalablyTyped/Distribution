package typings.playable.mainUiBlockTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMainUIBlockAPI extends js.Object {
  
  var setMainUIShouldAlwaysShow: js.UndefOr[js.Function1[/* flag */ Boolean, Unit]] = js.native
}
object IMainUIBlockAPI {
  
  @scala.inline
  def apply(): IMainUIBlockAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMainUIBlockAPI]
  }
  
  @scala.inline
  implicit class IMainUIBlockAPIOps[Self <: IMainUIBlockAPI] (val x: Self) extends AnyVal {
    
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
    def setSetMainUIShouldAlwaysShow(value: /* flag */ Boolean => Unit): Self = this.set("setMainUIShouldAlwaysShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetMainUIShouldAlwaysShow: Self = this.set("setMainUIShouldAlwaysShow", js.undefined)
  }
}
