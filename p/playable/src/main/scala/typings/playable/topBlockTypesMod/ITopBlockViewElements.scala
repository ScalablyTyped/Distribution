package typings.playable.topBlockTypesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITopBlockViewElements extends js.Object {
  
  var liveIndicator: HTMLElement = js.native
  
  var title: HTMLElement = js.native
}
object ITopBlockViewElements {
  
  @scala.inline
  def apply(liveIndicator: HTMLElement, title: HTMLElement): ITopBlockViewElements = {
    val __obj = js.Dynamic.literal(liveIndicator = liveIndicator.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopBlockViewElements]
  }
  
  @scala.inline
  implicit class ITopBlockViewElementsOps[Self <: ITopBlockViewElements] (val x: Self) extends AnyVal {
    
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
    def setLiveIndicator(value: HTMLElement): Self = this.set("liveIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: HTMLElement): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
