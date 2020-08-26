package typings.platform

import typings.platform.anon.Architecture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Platform extends js.Object {
  var description: js.UndefOr[String] = js.native
  var layout: js.UndefOr[String] = js.native
  var manufacturer: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var os: js.UndefOr[Architecture] = js.native
  var prerelease: js.UndefOr[String] = js.native
  var product: js.UndefOr[String] = js.native
  var ua: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
  def parse(ua: String): Platform = js.native
}

object Platform {
  @scala.inline
  def apply(parse: String => Platform): Platform = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Platform]
  }
  @scala.inline
  implicit class PlatformOps[Self <: Platform] (val x: Self) extends AnyVal {
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
    def setParse(value: String => Platform): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManufacturer: Self = this.set("manufacturer", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOs(value: Architecture): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOs: Self = this.set("os", js.undefined)
    @scala.inline
    def setPrerelease(value: String): Self = this.set("prerelease", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrerelease: Self = this.set("prerelease", js.undefined)
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    @scala.inline
    def setUa(value: String): Self = this.set("ua", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUa: Self = this.set("ua", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

