package typings.popperJs.mod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopperOptions extends js.Object {
  var eventsEnabled: js.UndefOr[Boolean] = js.native
  var modifiers: js.UndefOr[Modifiers] = js.native
  var onCreate: js.UndefOr[js.Function1[/* data */ Data, Unit]] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* data */ Data, Unit]] = js.native
  var placement: js.UndefOr[Placement] = js.native
  var positionFixed: js.UndefOr[Boolean] = js.native
  var removeOnDestroy: js.UndefOr[Boolean] = js.native
}

object PopperOptions {
  @scala.inline
  def apply(): PopperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopperOptions]
  }
  @scala.inline
  implicit class PopperOptionsOps[Self <: PopperOptions] (val x: Self) extends AnyVal {
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
    def setEventsEnabled(value: Boolean): Self = this.set("eventsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventsEnabled: Self = this.set("eventsEnabled", js.undefined)
    @scala.inline
    def setModifiers(value: Modifiers): Self = this.set("modifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifiers: Self = this.set("modifiers", js.undefined)
    @scala.inline
    def setOnCreate(value: /* data */ Data => Unit): Self = this.set("onCreate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCreate: Self = this.set("onCreate", js.undefined)
    @scala.inline
    def setOnUpdate(value: /* data */ Data => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPositionFixed(value: Boolean): Self = this.set("positionFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionFixed: Self = this.set("positionFixed", js.undefined)
    @scala.inline
    def setRemoveOnDestroy(value: Boolean): Self = this.set("removeOnDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveOnDestroy: Self = this.set("removeOnDestroy", js.undefined)
  }
  
}

