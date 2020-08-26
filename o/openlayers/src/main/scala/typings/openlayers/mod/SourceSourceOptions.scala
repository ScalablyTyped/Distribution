package typings.openlayers.mod

import typings.openlayers.mod.olx.LogoOptions
import typings.openlayers.mod.source.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSourceOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.native
  var logo: js.UndefOr[String | LogoOptions] = js.native
  var projection: ProjectionLike = js.native
  var state: js.UndefOr[State] = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object SourceSourceOptions {
  @scala.inline
  def apply(): SourceSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSourceOptions]
  }
  @scala.inline
  implicit class SourceSourceOptionsOps[Self <: SourceSourceOptions] (val x: Self) extends AnyVal {
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
    def setAttributionsVarargs(value: (Attribution | String)*): Self = this.set("attributions", js.Array(value :_*))
    @scala.inline
    def setAttributions(value: AttributionLike): Self = this.set("attributions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributions: Self = this.set("attributions", js.undefined)
    @scala.inline
    def setLogo(value: String | LogoOptions): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setProjection(value: ProjectionLike): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
  
}

