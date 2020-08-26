package typings.playcanvas.anon

import typings.playcanvas.pc.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoResolve extends js.Object {
  var autoResolve: js.UndefOr[Boolean] = js.native
  var colorBuffer: js.UndefOr[Texture] = js.native
  var depth: js.UndefOr[Boolean] = js.native
  var depthBuffer: js.UndefOr[Texture] = js.native
  var face: js.UndefOr[Double] = js.native
  var samples: js.UndefOr[Double] = js.native
  var stencil: js.UndefOr[Boolean] = js.native
}

object AutoResolve {
  @scala.inline
  def apply(): AutoResolve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoResolve]
  }
  @scala.inline
  implicit class AutoResolveOps[Self <: AutoResolve] (val x: Self) extends AnyVal {
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
    def setAutoResolve(value: Boolean): Self = this.set("autoResolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResolve: Self = this.set("autoResolve", js.undefined)
    @scala.inline
    def setColorBuffer(value: Texture): Self = this.set("colorBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorBuffer: Self = this.set("colorBuffer", js.undefined)
    @scala.inline
    def setDepth(value: Boolean): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setDepthBuffer(value: Texture): Self = this.set("depthBuffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepthBuffer: Self = this.set("depthBuffer", js.undefined)
    @scala.inline
    def setFace(value: Double): Self = this.set("face", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFace: Self = this.set("face", js.undefined)
    @scala.inline
    def setSamples(value: Double): Self = this.set("samples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamples: Self = this.set("samples", js.undefined)
    @scala.inline
    def setStencil(value: Boolean): Self = this.set("stencil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStencil: Self = this.set("stencil", js.undefined)
  }
  
}

