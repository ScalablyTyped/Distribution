package typings
package nodeDashGeocoderLib.nodeDashGeocoderMod.nodeUnderscoreGeocoderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geocoder extends js.Object {
  def batchGeocode(queries: js.Array[java.lang.String | Query]): stdLib.Promise[js.Array[BatchResult]] = js.native
  def batchGeocode(
    queries: js.Array[java.lang.String | Query],
    cb: js.Function2[/* err */ js.Any, /* data */ js.Array[BatchResult], scala.Unit]
  ): stdLib.Promise[js.Array[BatchResult]] = js.native
  def geocode(query: java.lang.String): stdLib.Promise[js.Array[Entry]] = js.native
  def geocode(
    query: java.lang.String,
    cb: js.Function2[/* err */ js.Any, /* data */ js.Array[Entry], scala.Unit]
  ): stdLib.Promise[js.Array[Entry]] = js.native
  def geocode(query: Query): stdLib.Promise[js.Array[Entry]] = js.native
  def geocode(query: Query, cb: js.Function2[/* err */ js.Any, /* data */ js.Array[Entry], scala.Unit]): stdLib.Promise[js.Array[Entry]] = js.native
  def reverse(loc: Location): stdLib.Promise[js.Array[Entry]] = js.native
  def reverse(loc: Location, cb: js.Function2[/* err */ js.Any, /* data */ js.Array[Entry], scala.Unit]): stdLib.Promise[js.Array[Entry]] = js.native
}

