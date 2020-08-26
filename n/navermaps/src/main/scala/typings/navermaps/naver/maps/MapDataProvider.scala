package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapDataProvider extends js.Object {
  var bounds: js.UndefOr[Bounds | BoundsLiteral | ArrayOfBounds | ArrayOfBoundsLiteral] = js.native
  var link: js.UndefOr[String] = js.native
  var title: String = js.native
}

object MapDataProvider {
  @scala.inline
  def apply(title: String): MapDataProvider = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataProvider]
  }
  @scala.inline
  implicit class MapDataProviderOps[Self <: MapDataProvider] (val x: Self) extends AnyVal {
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundsVarargs(value: (LatLngBounds | LatLngBoundsLiteral | PointBounds | PointBoundsLiteral)*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: Bounds | BoundsLiteral | ArrayOfBounds | ArrayOfBoundsLiteral): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
  }
  
}

