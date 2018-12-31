package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongorito", "Query")
@js.native
class Query () extends MQuery {
  var Model: ModelClass = js.native
  var query: js.Array[js.Tuple2[java.lang.String, js.Object]] = js.native
}

@JSImport("mongorito", "Query")
@js.native
object Query extends js.Object {
  def count(): js.Promise[scala.Double] = js.native
  def count(query: js.Object): js.Promise[scala.Double] = js.native
   // TODO best parameter type
  def exclude(field: java.lang.String): mongoritoLib.mongoritoMod.Query = js.native
  def exclude(field: java.lang.String, value: scala.Double): mongoritoLib.mongoritoMod.Query = js.native
  def exclude(field: js.Array[java.lang.String]): mongoritoLib.mongoritoMod.Query = js.native
  def exclude(field: js.Array[java.lang.String], value: scala.Double): mongoritoLib.mongoritoMod.Query = js.native
  def exclude(query: js.Object): mongoritoLib.mongoritoMod.Query = js.native
  def find[T /* <: mongoritoLib.mongoritoMod.Model */](`this`: mongoritoLib.mongoritoMod.Class[T]): js.Promise[js.Array[T]] = js.native
  def find[T /* <: mongoritoLib.mongoritoMod.Model */](`this`: mongoritoLib.mongoritoMod.Class[T], query: js.Object): js.Promise[js.Array[T]] = js.native
  def findById[T /* <: mongoritoLib.mongoritoMod.Model */](`this`: mongoritoLib.mongoritoMod.Class[T], id: java.lang.String): js.Promise[T | scala.Null] = js.native
  def findById[T /* <: mongoritoLib.mongoritoMod.Model */](`this`: mongoritoLib.mongoritoMod.Class[T], id: js.Object): js.Promise[T | scala.Null] = js.native
  def findOne[T /* <: mongoritoLib.mongoritoMod.Model */](`this`: mongoritoLib.mongoritoMod.Class[T]): js.Promise[T | scala.Null] = js.native
  def findOne[T /* <: mongoritoLib.mongoritoMod.Model */](`this`: mongoritoLib.mongoritoMod.Class[T], query: js.Object): js.Promise[T | scala.Null] = js.native
   // TODO best parameter type
  def include(field: java.lang.String): mongoritoLib.mongoritoMod.Query = js.native
  def include(field: java.lang.String, value: scala.Double): mongoritoLib.mongoritoMod.Query = js.native
  def include(field: js.Array[java.lang.String]): mongoritoLib.mongoritoMod.Query = js.native
  def include(field: js.Array[java.lang.String], value: scala.Double): mongoritoLib.mongoritoMod.Query = js.native
  def include(query: js.Object): mongoritoLib.mongoritoMod.Query = js.native
   // TODO best parameter type
  def remove(): js.Promise[js.Object] = js.native
  def remove(query: js.Object): js.Promise[js.Object] = js.native
  def sort(field: java.lang.String): mongoritoLib.mongoritoMod.Query = js.native
  def sort(field: java.lang.String, value: java.lang.String): mongoritoLib.mongoritoMod.Query = js.native
  def sort(field: js.Array[java.lang.String]): mongoritoLib.mongoritoMod.Query = js.native
  def sort(field: js.Array[java.lang.String], value: java.lang.String): mongoritoLib.mongoritoMod.Query = js.native
  def sort(query: js.Object): mongoritoLib.mongoritoMod.Query = js.native
}

