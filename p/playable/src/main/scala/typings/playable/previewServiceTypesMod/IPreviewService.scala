package typings.playable.previewServiceTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPreviewService extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getAt(second: Double): js.Array[INormalizedFramesQuality] = js.native
  
  def setFramesMap(map: IFramesData): Unit = js.native
}
object IPreviewService {
  
  @scala.inline
  def apply(
    destroy: () => Unit,
    getAt: Double => js.Array[INormalizedFramesQuality],
    setFramesMap: IFramesData => Unit
  ): IPreviewService = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getAt = js.Any.fromFunction1(getAt), setFramesMap = js.Any.fromFunction1(setFramesMap))
    __obj.asInstanceOf[IPreviewService]
  }
  
  @scala.inline
  implicit class IPreviewServiceOps[Self <: IPreviewService] (val x: Self) extends AnyVal {
    
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
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAt(value: Double => js.Array[INormalizedFramesQuality]): Self = this.set("getAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFramesMap(value: IFramesData => Unit): Self = this.set("setFramesMap", js.Any.fromFunction1(value))
  }
}
