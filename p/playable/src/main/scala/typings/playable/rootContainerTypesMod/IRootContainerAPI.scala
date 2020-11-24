package typings.playable.rootContainerTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRootContainerAPI extends js.Object {
  
  var attachToElement: js.UndefOr[js.Function1[/* element */ HTMLElement, Unit]] = js.native
  
  var getElement: js.UndefOr[js.Function0[HTMLElement]] = js.native
  
  var getHeight: js.UndefOr[js.Function0[Double]] = js.native
  
  var getWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  
  var setFillAllSpace: js.UndefOr[js.Function1[/* flag */ Boolean, Unit]] = js.native
  
  var setHeight: js.UndefOr[js.Function1[/* height */ Double, Unit]] = js.native
  
  var setRtl: js.UndefOr[js.Function1[/* rtl */ Boolean, Unit]] = js.native
  
  var setWidth: js.UndefOr[js.Function1[/* width */ Double, Unit]] = js.native
  
  var show: js.UndefOr[js.Function0[Unit]] = js.native
}
object IRootContainerAPI {
  
  @scala.inline
  def apply(): IRootContainerAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRootContainerAPI]
  }
  
  @scala.inline
  implicit class IRootContainerAPIOps[Self <: IRootContainerAPI] (val x: Self) extends AnyVal {
    
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
    def setAttachToElement(value: /* element */ HTMLElement => Unit): Self = this.set("attachToElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAttachToElement: Self = this.set("attachToElement", js.undefined)
    
    @scala.inline
    def setGetElement(value: () => HTMLElement): Self = this.set("getElement", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetElement: Self = this.set("getElement", js.undefined)
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetHeight: Self = this.set("getHeight", js.undefined)
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setSetFillAllSpace(value: /* flag */ Boolean => Unit): Self = this.set("setFillAllSpace", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFillAllSpace: Self = this.set("setFillAllSpace", js.undefined)
    
    @scala.inline
    def setSetHeight(value: /* height */ Double => Unit): Self = this.set("setHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHeight: Self = this.set("setHeight", js.undefined)
    
    @scala.inline
    def setSetRtl(value: /* rtl */ Boolean => Unit): Self = this.set("setRtl", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRtl: Self = this.set("setRtl", js.undefined)
    
    @scala.inline
    def setSetWidth(value: /* width */ Double => Unit): Self = this.set("setWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetWidth: Self = this.set("setWidth", js.undefined)
    
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
}
