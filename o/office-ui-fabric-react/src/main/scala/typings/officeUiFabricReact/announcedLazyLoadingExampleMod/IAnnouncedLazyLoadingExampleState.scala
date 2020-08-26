package typings.officeUiFabricReact.announcedLazyLoadingExampleMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnnouncedLazyLoadingExampleState extends js.Object {
  var announced: js.UndefOr[Element] = js.native
  var loading: Boolean = js.native
  var timeSinceLastAnnounce: Double = js.native
  /** Number of photos loaded so far */
  var total: Double = js.native
}

object IAnnouncedLazyLoadingExampleState {
  @scala.inline
  def apply(loading: Boolean, timeSinceLastAnnounce: Double, total: Double): IAnnouncedLazyLoadingExampleState = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], timeSinceLastAnnounce = timeSinceLastAnnounce.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnouncedLazyLoadingExampleState]
  }
  @scala.inline
  implicit class IAnnouncedLazyLoadingExampleStateOps[Self <: IAnnouncedLazyLoadingExampleState] (val x: Self) extends AnyVal {
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
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeSinceLastAnnounce(value: Double): Self = this.set("timeSinceLastAnnounce", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnnounced(value: Element): Self = this.set("announced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnounced: Self = this.set("announced", js.undefined)
  }
  
}

