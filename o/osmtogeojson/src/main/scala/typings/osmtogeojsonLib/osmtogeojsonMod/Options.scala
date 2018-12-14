package typings
package osmtogeojsonLib.osmtogeojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
       * If true, the resulting GeoJSON feature's properties will be a simple key-value list instead of a structured json object (with separate tags and metadata). default: false
       */
  var flatProperties: js.UndefOr[scala.Boolean] = js.undefined
   //TODO: type function
  /**
       * Either a json object or callback function that is used to determine if a closed way should be treated as a Polygon or LineString.
       */
  var polygonFeatures: js.UndefOr[js.Any | js.Function] = js.undefined
  /**
       * Either a blacklist of tag keys or a callback function. Will be used to decide if a feature is interesting enough for its own GeoJSON feature.
       */
  var uninterestingTags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean] | js.Function] = js.undefined
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

