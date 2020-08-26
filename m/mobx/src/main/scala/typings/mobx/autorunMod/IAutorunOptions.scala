package typings.mobx.autorunMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutorunOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, Unit]] = js.native
  /**
    * Experimental.
    * Warns if the view doesn't track observables
    */
  var requiresObservable: js.UndefOr[Boolean] = js.native
  var scheduler: js.UndefOr[js.Function1[/* callback */ js.Function0[Unit], _]] = js.native
}

object IAutorunOptions {
  @scala.inline
  def apply(): IAutorunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAutorunOptions]
  }
  @scala.inline
  implicit class IAutorunOptionsOps[Self <: IAutorunOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ js.Any => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setRequiresObservable(value: Boolean): Self = this.set("requiresObservable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresObservable: Self = this.set("requiresObservable", js.undefined)
    @scala.inline
    def setScheduler(value: /* callback */ js.Function0[Unit] => _): Self = this.set("scheduler", js.Any.fromFunction1(value))
    @scala.inline
    def deleteScheduler: Self = this.set("scheduler", js.undefined)
  }
  
}

