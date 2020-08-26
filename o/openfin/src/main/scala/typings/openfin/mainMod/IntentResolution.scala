package typings.openfin.mainMod

import typings.openfin.directoryMod.AppName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntentResolution extends js.Object {
  /**
    * Any data returned by the target application's intent listener.
    *
    * If the target application registered multiple listeners, this will be the first non-`undefined` value returned
    * by a listener.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The machine-readable name of the app that resolved this intent.
    */
  var source: AppName = js.native
  /**
    * For future use. Right now always the string `'1.0.0'`.
    */
  var version: String = js.native
}

object IntentResolution {
  @scala.inline
  def apply(source: AppName, version: String): IntentResolution = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentResolution]
  }
  @scala.inline
  implicit class IntentResolutionOps[Self <: IntentResolution] (val x: Self) extends AnyVal {
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
    def setSource(value: AppName): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

