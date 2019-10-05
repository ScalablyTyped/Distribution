package typings.pouchdbDashMapreduce.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter[Content /* <: js.Object */, Reduction] extends js.Object {
  // Assume that Content | Reduction is enough leverage in most cases to handle intermediate map emits
  @JSName("map")
  var map_Original: Map[Content, Reduction] = js.native
  var reduce: js.UndefOr[(Reducer[Content, Reduction]) | BuiltInReducers | String] = js.native
  // Assume that Content | Reduction is enough leverage in most cases to handle intermediate map emits
  def map(doc: Content): Unit = js.native
  def map(doc: Content, emit: js.Function2[/* key */ js.Any, /* value */ Content | Reduction, Unit]): Unit = js.native
}

