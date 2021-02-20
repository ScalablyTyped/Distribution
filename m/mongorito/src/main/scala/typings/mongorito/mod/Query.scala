package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongorito", "Query")
@js.native
class Query () extends MQuery {
  
  var Model: ModelClass = js.native
  
  var query: js.Array[js.Tuple2[String, js.Object]] = js.native
}
/* static members */
object Query {
  
  @JSImport("mongorito", "Query.count")
  @js.native
  def count(): js.Promise[Double] = js.native
  @JSImport("mongorito", "Query.count")
  @js.native
  def count(query: js.Object): js.Promise[Double] = js.native
  
  // TODO best parameter type
  @JSImport("mongorito", "Query.exclude")
  @js.native
  def exclude(field: String): Query = js.native
  @JSImport("mongorito", "Query.exclude")
  @js.native
  def exclude(field: String, value: Double): Query = js.native
  @JSImport("mongorito", "Query.exclude")
  @js.native
  def exclude(field: js.Array[String]): Query = js.native
  @JSImport("mongorito", "Query.exclude")
  @js.native
  def exclude(field: js.Array[String], value: Double): Query = js.native
  @JSImport("mongorito", "Query.exclude")
  @js.native
  def exclude(query: js.Object): Query = js.native
  
  @JSImport("mongorito", "Query.find")
  @js.native
  def find[T /* <: Model */](): js.Promise[js.Array[T]] = js.native
  @JSImport("mongorito", "Query.find")
  @js.native
  def find[T /* <: Model */](query: js.Object): js.Promise[js.Array[T]] = js.native
  
  @JSImport("mongorito", "Query.findById")
  @js.native
  def findById[T /* <: Model */](id: String): js.Promise[T | Null] = js.native
  @JSImport("mongorito", "Query.findById")
  @js.native
  def findById[T /* <: Model */](id: js.Object): js.Promise[T | Null] = js.native
  
  @JSImport("mongorito", "Query.findOne")
  @js.native
  def findOne[T /* <: Model */](): js.Promise[T | Null] = js.native
  @JSImport("mongorito", "Query.findOne")
  @js.native
  def findOne[T /* <: Model */](query: js.Object): js.Promise[T | Null] = js.native
  
  // TODO best parameter type
  @JSImport("mongorito", "Query.include")
  @js.native
  def include(field: String): Query = js.native
  @JSImport("mongorito", "Query.include")
  @js.native
  def include(field: String, value: Double): Query = js.native
  @JSImport("mongorito", "Query.include")
  @js.native
  def include(field: js.Array[String]): Query = js.native
  @JSImport("mongorito", "Query.include")
  @js.native
  def include(field: js.Array[String], value: Double): Query = js.native
  @JSImport("mongorito", "Query.include")
  @js.native
  def include(query: js.Object): Query = js.native
  
  // TODO best parameter type
  @JSImport("mongorito", "Query.remove")
  @js.native
  def remove(): js.Promise[js.Object] = js.native
  @JSImport("mongorito", "Query.remove")
  @js.native
  def remove(query: js.Object): js.Promise[js.Object] = js.native
  
  @JSImport("mongorito", "Query.sort")
  @js.native
  def sort(field: String): Query = js.native
  @JSImport("mongorito", "Query.sort")
  @js.native
  def sort(field: String, value: String): Query = js.native
  @JSImport("mongorito", "Query.sort")
  @js.native
  def sort(field: js.Array[String]): Query = js.native
  @JSImport("mongorito", "Query.sort")
  @js.native
  def sort(field: js.Array[String], value: String): Query = js.native
  @JSImport("mongorito", "Query.sort")
  @js.native
  def sort(query: js.Object): Query = js.native
}
