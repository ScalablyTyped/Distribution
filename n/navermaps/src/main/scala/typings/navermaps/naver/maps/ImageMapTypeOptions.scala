package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageMapTypeOptions extends js.Object {
  var darktheme: js.UndefOr[Boolean] = js.native
  var getTileUrl: js.UndefOr[js.Function0[_]] = js.native
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var name: String = js.native
  var projection: Projection = js.native
  var provider: js.UndefOr[js.Array[MapDataProvider]] = js.native
  var repeatX: js.UndefOr[Boolean] = js.native
  var tileSet: js.UndefOr[String | js.Array[String]] = js.native
  var tileSize: js.UndefOr[Size | SizeLiteral] = js.native
  var uid: js.UndefOr[String] = js.native
  var vendor: js.UndefOr[String] = js.native
}

object ImageMapTypeOptions {
  @scala.inline
  def apply(maxZoom: Double, minZoom: Double, name: String, projection: Projection): ImageMapTypeOptions = {
    val __obj = js.Dynamic.literal(maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMapTypeOptions]
  }
  @scala.inline
  implicit class ImageMapTypeOptionsOps[Self <: ImageMapTypeOptions] (val x: Self) extends AnyVal {
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
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: Projection): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setDarktheme(value: Boolean): Self = this.set("darktheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDarktheme: Self = this.set("darktheme", js.undefined)
    @scala.inline
    def setGetTileUrl(value: () => _): Self = this.set("getTileUrl", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTileUrl: Self = this.set("getTileUrl", js.undefined)
    @scala.inline
    def setProviderVarargs(value: MapDataProvider*): Self = this.set("provider", js.Array(value :_*))
    @scala.inline
    def setProvider(value: js.Array[MapDataProvider]): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setRepeatX(value: Boolean): Self = this.set("repeatX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatX: Self = this.set("repeatX", js.undefined)
    @scala.inline
    def setTileSetVarargs(value: String*): Self = this.set("tileSet", js.Array(value :_*))
    @scala.inline
    def setTileSet(value: String | js.Array[String]): Self = this.set("tileSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSet: Self = this.set("tileSet", js.undefined)
    @scala.inline
    def setTileSize(value: Size | SizeLiteral): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendor: Self = this.set("vendor", js.undefined)
  }
  
}

