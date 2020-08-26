package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Map matching matches given GPS points to the road network in the most plausible way.
  * Please note the request might result multiple sub-traces.
  * Large jumps in the timestamps (>60s) or improbable transitions lead to trace splits if a complete matching could not be found.
  * The algorithm might not be able to match all points. Outliers are removed if they can not be matched successfully.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#tile
  */
@js.native
trait MatchOptions extends Options {
  /**
    * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
    * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
    */
  var annotations: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[String] = js.native
  /**
    * Add overview geometry either full, simplified according to highest zoom level it could be display on, or not at all (false). (optional, default simplified)
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * Standard deviation of GPS precision used for map matching. If applicable use GPS accuracy (double >= 0, default 5m).
    */
  @JSName("radiuses")
  var radiuses_MatchOptions: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.native
  /**
    * Timestamp of the input location (integers, UNIX-like timestamp).
    */
  var timestamps: js.UndefOr[js.Array[Double]] = js.native
}

object MatchOptions {
  @scala.inline
  def apply(): MatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchOptions]
  }
  @scala.inline
  implicit class MatchOptionsOps[Self <: MatchOptions] (val x: Self) extends AnyVal {
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
    def setAnnotationsVarargs(value: String*): Self = this.set("annotations", js.Array(value :_*))
    @scala.inline
    def setAnnotations(value: Boolean | js.Array[String]): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    @scala.inline
    def setGeometries(value: String): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometries: Self = this.set("geometries", js.undefined)
    @scala.inline
    def setOverview(value: String): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    @scala.inline
    def setRadiusesVarargs(value: Double*): Self = this.set("radiuses", js.Array(value :_*))
    @scala.inline
    def setRadiuses(value: js.Array[Double]): Self = this.set("radiuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadiuses: Self = this.set("radiuses", js.undefined)
    @scala.inline
    def setSteps(value: Boolean): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    @scala.inline
    def setTimestampsVarargs(value: Double*): Self = this.set("timestamps", js.Array(value :_*))
    @scala.inline
    def setTimestamps(value: js.Array[Double]): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
  }
  
}

