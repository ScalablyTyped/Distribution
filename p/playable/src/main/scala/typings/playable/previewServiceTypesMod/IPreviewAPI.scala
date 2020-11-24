package typings.playable.previewServiceTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreviewAPI extends js.Object {
  
  var setFramesMap: js.UndefOr[js.Function1[/* map */ IFramesData, Unit]] = js.native
}
object IPreviewAPI {
  
  @scala.inline
  def apply(): IPreviewAPI = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPreviewAPI]
  }
  
  @scala.inline
  implicit class IPreviewAPIOps[Self <: IPreviewAPI] (val x: Self) extends AnyVal {
    
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
    def setSetFramesMap(value: /* map */ IFramesData => Unit): Self = this.set("setFramesMap", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetFramesMap: Self = this.set("setFramesMap", js.undefined)
  }
}
