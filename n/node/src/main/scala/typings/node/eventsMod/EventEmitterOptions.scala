package typings.node.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitterOptions extends js.Object {
  /**
    * Enables automatic capturing of promise rejection.
    */
  var captureRejections: js.UndefOr[Boolean] = js.native
}

object EventEmitterOptions {
  @scala.inline
  def apply(): EventEmitterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventEmitterOptions]
  }
  @scala.inline
  implicit class EventEmitterOptionsOps[Self <: EventEmitterOptions] (val x: Self) extends AnyVal {
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
    def setCaptureRejections(value: Boolean): Self = this.set("captureRejections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaptureRejections: Self = this.set("captureRejections", js.undefined)
  }
  
}

