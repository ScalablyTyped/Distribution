package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressU extends js.Object {
  var addressU: js.UndefOr[Double] = js.native
  var addressV: js.UndefOr[Double] = js.native
  var addressW: js.UndefOr[Double] = js.native
  var anisotropy: js.UndefOr[Double] = js.native
  var compareFunc: js.UndefOr[Double] = js.native
  var compareOnRead: js.UndefOr[Boolean] = js.native
  var cubemap: js.UndefOr[Boolean] = js.native
  var depth: js.UndefOr[Double] = js.native
  var fixCubemapSeams: js.UndefOr[Boolean] = js.native
  var flipY: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var magFilter: js.UndefOr[Double] = js.native
  var minFilter: js.UndefOr[Double] = js.native
  var mipmaps: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var premultiplyAlpha: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[String] = js.native
  var volume: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object AddressU {
  @scala.inline
  def apply(): AddressU = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressU]
  }
  @scala.inline
  implicit class AddressUOps[Self <: AddressU] (val x: Self) extends AnyVal {
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
    def setAddressU(value: Double): Self = this.set("addressU", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressU: Self = this.set("addressU", js.undefined)
    @scala.inline
    def setAddressV(value: Double): Self = this.set("addressV", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressV: Self = this.set("addressV", js.undefined)
    @scala.inline
    def setAddressW(value: Double): Self = this.set("addressW", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressW: Self = this.set("addressW", js.undefined)
    @scala.inline
    def setAnisotropy(value: Double): Self = this.set("anisotropy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnisotropy: Self = this.set("anisotropy", js.undefined)
    @scala.inline
    def setCompareFunc(value: Double): Self = this.set("compareFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareFunc: Self = this.set("compareFunc", js.undefined)
    @scala.inline
    def setCompareOnRead(value: Boolean): Self = this.set("compareOnRead", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompareOnRead: Self = this.set("compareOnRead", js.undefined)
    @scala.inline
    def setCubemap(value: Boolean): Self = this.set("cubemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCubemap: Self = this.set("cubemap", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setFixCubemapSeams(value: Boolean): Self = this.set("fixCubemapSeams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixCubemapSeams: Self = this.set("fixCubemapSeams", js.undefined)
    @scala.inline
    def setFlipY(value: Boolean): Self = this.set("flipY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlipY: Self = this.set("flipY", js.undefined)
    @scala.inline
    def setFormat(value: Double): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMagFilter(value: Double): Self = this.set("magFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMagFilter: Self = this.set("magFilter", js.undefined)
    @scala.inline
    def setMinFilter(value: Double): Self = this.set("minFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinFilter: Self = this.set("minFilter", js.undefined)
    @scala.inline
    def setMipmaps(value: Boolean): Self = this.set("mipmaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMipmaps: Self = this.set("mipmaps", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPremultiplyAlpha(value: Boolean): Self = this.set("premultiplyAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremultiplyAlpha: Self = this.set("premultiplyAlpha", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVolume(value: Boolean): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

