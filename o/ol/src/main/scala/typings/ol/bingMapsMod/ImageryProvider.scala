package typings.ol.bingMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageryProvider extends js.Object {
  var attribution: js.UndefOr[String] = js.native
  var coverageAreas: js.Array[CoverageArea] = js.native
}

object ImageryProvider {
  @scala.inline
  def apply(coverageAreas: js.Array[CoverageArea]): ImageryProvider = {
    val __obj = js.Dynamic.literal(coverageAreas = coverageAreas.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageryProvider]
  }
  @scala.inline
  implicit class ImageryProviderOps[Self <: ImageryProvider] (val x: Self) extends AnyVal {
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
    def setCoverageAreasVarargs(value: CoverageArea*): Self = this.set("coverageAreas", js.Array(value :_*))
    @scala.inline
    def setCoverageAreas(value: js.Array[CoverageArea]): Self = this.set("coverageAreas", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttribution(value: String): Self = this.set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttribution: Self = this.set("attribution", js.undefined)
  }
  
}

