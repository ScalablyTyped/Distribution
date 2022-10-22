package typings.mongorito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongorito", "Query")
@js.native
open class Query () extends MQuery {
  
  var Model: ModelClass = js.native
  
  var query: js.Array[js.Tuple2[String, js.Object]] = js.native
}
/* static members */
object Query {
  
  @JSImport("mongorito", "Query")
  @js.native
  val ^ : js.Any = js.native
  
  inline def count(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[js.Promise[Double]]
  inline def count(query: js.Object): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  // TODO best parameter type
  inline def exclude(field: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(field.asInstanceOf[js.Any]).asInstanceOf[Query]
  inline def exclude(field: String, value: Double): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def exclude(field: js.Array[String]): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(field.asInstanceOf[js.Any]).asInstanceOf[Query]
  inline def exclude(field: js.Array[String], value: Double): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def exclude(query: js.Object): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(query.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def find[T /* <: Model */](): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")().asInstanceOf[js.Promise[js.Array[T]]]
  inline def find[T /* <: Model */](query: js.Object): js.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[T]]]
  
  inline def findById[T /* <: Model */](id: String): js.Promise[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Null]]
  inline def findById[T /* <: Model */](id: js.Object): js.Promise[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findById")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Null]]
  
  inline def findOne[T /* <: Model */](): js.Promise[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")().asInstanceOf[js.Promise[T | Null]]
  inline def findOne[T /* <: Model */](query: js.Object): js.Promise[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findOne")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T | Null]]
  
  // TODO best parameter type
  inline def include(field: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("include")(field.asInstanceOf[js.Any]).asInstanceOf[Query]
  inline def include(field: String, value: Double): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def include(field: js.Array[String]): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("include")(field.asInstanceOf[js.Any]).asInstanceOf[Query]
  inline def include(field: js.Array[String], value: Double): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("include")(field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def include(query: js.Object): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("include")(query.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  // TODO best parameter type
  inline def remove(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[js.Promise[js.Object]]
  inline def remove(query: js.Object): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Object]]
  
  inline def sort(field: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(field.asInstanceOf[js.Any]).asInstanceOf[Query]
  inline def sort(field: String, value: String): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def sort(field: js.Array[String]): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(field.asInstanceOf[js.Any]).asInstanceOf[Query]
  inline def sort(field: js.Array[String], value: String): Query = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Query]
  inline def sort(query: js.Object): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(query.asInstanceOf[js.Any]).asInstanceOf[Query]
}
