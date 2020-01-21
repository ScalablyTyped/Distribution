package typings.nodeGeocoder.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-geocoder", "Geocoder")
@js.native
class Geocoder () extends js.Object {
  def batchGeocode(queries: js.Array[Query | String]): js.Promise[js.Array[BatchResult]] = js.native
  def batchGeocode(
    queries: js.Array[Query | String],
    cb: js.Function2[/* err */ js.Any, /* data */ js.Array[BatchResult], Unit]
  ): js.Promise[js.Array[BatchResult]] = js.native
  def geocode(query: String): js.Promise[js.Array[Entry]] = js.native
  def geocode(query: String, cb: js.Function2[/* err */ js.Any, /* data */ js.Array[Entry], Unit]): js.Promise[js.Array[Entry]] = js.native
  def geocode(query: Query): js.Promise[js.Array[Entry]] = js.native
  def geocode(query: Query, cb: js.Function2[/* err */ js.Any, /* data */ js.Array[Entry], Unit]): js.Promise[js.Array[Entry]] = js.native
  def reverse(loc: Location): js.Promise[js.Array[Entry]] = js.native
  def reverse(loc: Location, cb: js.Function2[/* err */ js.Any, /* data */ js.Array[Entry], Unit]): js.Promise[js.Array[Entry]] = js.native
}

