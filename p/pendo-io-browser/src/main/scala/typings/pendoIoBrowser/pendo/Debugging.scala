package typings.pendoIoBrowser.pendo

import typings.pendoIoBrowser.anon.Auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debugging extends js.Object {
  
   // TODO
  def getAllGuides(): js.Array[Guide] = js.native
  
  def getAutoGuides(): Auto = js.native
  
  def getBadgeGuides(): js.Array[Guide] = js.native
  
  def getEventCache(): js.Array[_] = js.native
  
  def getLauncherGuides(): js.Array[Guide] = js.native
}
object Debugging {
  
  @scala.inline
  def apply(
    getAllGuides: () => js.Array[Guide],
    getAutoGuides: () => Auto,
    getBadgeGuides: () => js.Array[Guide],
    getEventCache: () => js.Array[_],
    getLauncherGuides: () => js.Array[Guide]
  ): Debugging = {
    val __obj = js.Dynamic.literal(getAllGuides = js.Any.fromFunction0(getAllGuides), getAutoGuides = js.Any.fromFunction0(getAutoGuides), getBadgeGuides = js.Any.fromFunction0(getBadgeGuides), getEventCache = js.Any.fromFunction0(getEventCache), getLauncherGuides = js.Any.fromFunction0(getLauncherGuides))
    __obj.asInstanceOf[Debugging]
  }
  
  @scala.inline
  implicit class DebuggingOps[Self <: Debugging] (val x: Self) extends AnyVal {
    
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
    def setGetAllGuides(value: () => js.Array[Guide]): Self = this.set("getAllGuides", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAutoGuides(value: () => Auto): Self = this.set("getAutoGuides", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetBadgeGuides(value: () => js.Array[Guide]): Self = this.set("getBadgeGuides", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEventCache(value: () => js.Array[_]): Self = this.set("getEventCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLauncherGuides(value: () => js.Array[Guide]): Self = this.set("getLauncherGuides", js.Any.fromFunction0(value))
  }
}
