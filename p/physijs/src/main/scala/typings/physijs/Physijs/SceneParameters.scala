package typings.physijs.Physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneParameters extends js.Object {
  var ammo: js.UndefOr[String] = js.native
  var fixedTimeStep: js.UndefOr[Double] = js.native
  var rateLimit: js.UndefOr[Boolean] = js.native
}

object SceneParameters {
  @scala.inline
  def apply(): SceneParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneParameters]
  }
  @scala.inline
  implicit class SceneParametersOps[Self <: SceneParameters] (val x: Self) extends AnyVal {
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
    def setAmmo(value: String): Self = this.set("ammo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmmo: Self = this.set("ammo", js.undefined)
    @scala.inline
    def setFixedTimeStep(value: Double): Self = this.set("fixedTimeStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedTimeStep: Self = this.set("fixedTimeStep", js.undefined)
    @scala.inline
    def setRateLimit(value: Boolean): Self = this.set("rateLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateLimit: Self = this.set("rateLimit", js.undefined)
  }
  
}

