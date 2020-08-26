package typings.osmtogeojson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * If true, the resulting GeoJSON feature's properties will be a simple key-value list instead of a structured json object (with separate tags and metadata). default: false
    */
  var flatProperties: js.UndefOr[Boolean] = js.native
   //TODO: type function
  /**
    * Either a json object or callback function that is used to determine if a closed way should be treated as a Polygon or LineString.
    */
  var polygonFeatures: js.UndefOr[js.Any | js.Function] = js.native
  /**
    * Either a blacklist of tag keys or a callback function. Will be used to decide if a feature is interesting enough for its own GeoJSON feature.
    */
  var uninterestingTags: js.UndefOr[StringDictionary[Boolean] | js.Function] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFlatProperties(value: Boolean): Self = this.set("flatProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatProperties: Self = this.set("flatProperties", js.undefined)
    @scala.inline
    def setPolygonFeatures(value: js.Any | js.Function): Self = this.set("polygonFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygonFeatures: Self = this.set("polygonFeatures", js.undefined)
    @scala.inline
    def setUninterestingTags(value: StringDictionary[Boolean] | js.Function): Self = this.set("uninterestingTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUninterestingTags: Self = this.set("uninterestingTags", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
  
}

