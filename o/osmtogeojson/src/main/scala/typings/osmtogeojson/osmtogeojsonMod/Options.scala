package typings.osmtogeojson.osmtogeojsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If true, the resulting GeoJSON feature's properties will be a simple key-value list instead of a structured json object (with separate tags and metadata). default: false
    */
  var flatProperties: js.UndefOr[Boolean] = js.undefined
   //TODO: type function
  /**
    * Either a json object or callback function that is used to determine if a closed way should be treated as a Polygon or LineString.
    */
  var polygonFeatures: js.UndefOr[js.Any | js.Function] = js.undefined
  /**
    * Either a blacklist of tag keys or a callback function. Will be used to decide if a feature is interesting enough for its own GeoJSON feature.
    */
  var uninterestingTags: js.UndefOr[StringDictionary[Boolean] | js.Function] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    flatProperties: js.UndefOr[Boolean] = js.undefined,
    polygonFeatures: js.Any | js.Function = null,
    uninterestingTags: StringDictionary[Boolean] | js.Function = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flatProperties)) __obj.updateDynamic("flatProperties")(flatProperties.asInstanceOf[js.Any])
    if (polygonFeatures != null) __obj.updateDynamic("polygonFeatures")(polygonFeatures.asInstanceOf[js.Any])
    if (uninterestingTags != null) __obj.updateDynamic("uninterestingTags")(uninterestingTags.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

