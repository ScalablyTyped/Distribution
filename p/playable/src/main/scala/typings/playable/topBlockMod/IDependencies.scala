package typings.playable.topBlockMod

import typings.playable.liveIndicatorTypesMod.ILiveIndicator
import typings.playable.titleTypesMod.ITitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDependencies extends js.Object {
  
  var liveIndicator: ILiveIndicator = js.native
  
  var title: ITitle = js.native
}
object IDependencies {
  
  @scala.inline
  def apply(liveIndicator: ILiveIndicator, title: ITitle): IDependencies = {
    val __obj = js.Dynamic.literal(liveIndicator = liveIndicator.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDependencies]
  }
  
  @scala.inline
  implicit class IDependenciesOps[Self <: IDependencies] (val x: Self) extends AnyVal {
    
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
    def setLiveIndicator(value: ILiveIndicator): Self = this.set("liveIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ITitle): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
