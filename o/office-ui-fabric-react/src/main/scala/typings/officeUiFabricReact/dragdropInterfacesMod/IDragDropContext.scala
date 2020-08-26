package typings.officeUiFabricReact.dragdropInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragDropContext extends js.Object {
  /**
    * Data associated with drag & drop action.
    */
  var data: js.Any = js.native
  /**
    * Index of drag & drop action.
    */
  var index: Double = js.native
  /**
    * Whether or not drag & drop region is indivual or group of content.
    */
  var isGroup: js.UndefOr[Boolean] = js.native
}

object IDragDropContext {
  @scala.inline
  def apply(data: js.Any, index: Double): IDragDropContext = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragDropContext]
  }
  @scala.inline
  implicit class IDragDropContextOps[Self <: IDragDropContext] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGroup(value: Boolean): Self = this.set("isGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsGroup: Self = this.set("isGroup", js.undefined)
  }
  
}

