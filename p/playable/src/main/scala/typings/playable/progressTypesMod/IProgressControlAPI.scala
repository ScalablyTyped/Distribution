package typings.playable.progressTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProgressControlAPI extends js.Object {
  
  var addTimeIndicator: js.UndefOr[js.Function1[/* time */ Double, Unit]] = js.native
  
  var addTimeIndicators: js.UndefOr[js.Function1[/* times */ js.Array[Double], Unit]] = js.native
  
  var clearTimeIndicators: js.UndefOr[js.Function0[Unit]] = js.native
  
  var seekOnProgressDrag: js.UndefOr[js.Function0[Unit]] = js.native
  
  var showPreviewOnProgressDrag: js.UndefOr[js.Function0[Unit]] = js.native
}
object IProgressControlAPI {
  
  @scala.inline
  def apply(): IProgressControlAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressControlAPI]
  }
  
  @scala.inline
  implicit class IProgressControlAPIOps[Self <: IProgressControlAPI] (val x: Self) extends AnyVal {
    
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
    def setAddTimeIndicator(value: /* time */ Double => Unit): Self = this.set("addTimeIndicator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddTimeIndicator: Self = this.set("addTimeIndicator", js.undefined)
    
    @scala.inline
    def setAddTimeIndicators(value: /* times */ js.Array[Double] => Unit): Self = this.set("addTimeIndicators", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAddTimeIndicators: Self = this.set("addTimeIndicators", js.undefined)
    
    @scala.inline
    def setClearTimeIndicators(value: () => Unit): Self = this.set("clearTimeIndicators", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteClearTimeIndicators: Self = this.set("clearTimeIndicators", js.undefined)
    
    @scala.inline
    def setSeekOnProgressDrag(value: () => Unit): Self = this.set("seekOnProgressDrag", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSeekOnProgressDrag: Self = this.set("seekOnProgressDrag", js.undefined)
    
    @scala.inline
    def setShowPreviewOnProgressDrag(value: () => Unit): Self = this.set("showPreviewOnProgressDrag", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteShowPreviewOnProgressDrag: Self = this.set("showPreviewOnProgressDrag", js.undefined)
  }
}
