package typings.mongorito.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "Query")
@js.native
class Query () extends MQuery {
  var Model: ModelClass = js.native
  var query: js.Array[js.Tuple2[String, js.Object]] = js.native
}

/* static members */
@JSImport("mongorito", "Query")
@js.native
object Query extends js.Object {
  def count(): js.Promise[Double] = js.native
  def count(query: js.Object): js.Promise[Double] = js.native
   // TODO best parameter type
  def exclude(field: String): Query = js.native
  def exclude(field: String, value: Double): Query = js.native
  def exclude(field: js.Array[String]): Query = js.native
  def exclude(field: js.Array[String], value: Double): Query = js.native
  def exclude(query: js.Object): Query = js.native
  def find[T /* <: Model */](): js.Promise[js.Array[T]] = js.native
  def find[T /* <: Model */](query: js.Object): js.Promise[js.Array[T]] = js.native
  def findById[T /* <: Model */](id: String): js.Promise[T | Null] = js.native
  def findById[T /* <: Model */](id: js.Object): js.Promise[T | Null] = js.native
  def findOne[T /* <: Model */](): js.Promise[T | Null] = js.native
  def findOne[T /* <: Model */](query: js.Object): js.Promise[T | Null] = js.native
   // TODO best parameter type
  def include(field: String): Query = js.native
  def include(field: String, value: Double): Query = js.native
  def include(field: js.Array[String]): Query = js.native
  def include(field: js.Array[String], value: Double): Query = js.native
  def include(query: js.Object): Query = js.native
   // TODO best parameter type
  def remove(): js.Promise[js.Object] = js.native
  def remove(query: js.Object): js.Promise[js.Object] = js.native
  def sort(field: String): Query = js.native
  def sort(field: String, value: String): Query = js.native
  def sort(field: js.Array[String]): Query = js.native
  def sort(field: js.Array[String], value: String): Query = js.native
  def sort(query: js.Object): Query = js.native
}

