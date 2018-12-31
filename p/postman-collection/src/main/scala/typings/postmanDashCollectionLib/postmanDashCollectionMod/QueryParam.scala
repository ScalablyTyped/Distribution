package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.QueryParamDefinition because Would inherit conflicting mutable fields List(description, disabled, id, name))*/
@JSImport("postman-collection", "QueryParam")
@js.native
class QueryParam protected () extends Property[QueryParamDefinition] {
  def this(options: java.lang.String) = this()
  def this(options: QueryParamDefinition) = this()
  var key: java.lang.String | scala.Null = js.native
  var system: js.UndefOr[scala.Boolean] = js.native
  var value: java.lang.String | scala.Null = js.native
  def update(param: java.lang.String): scala.Unit = js.native
  def update(param: postmanDashCollectionLib.Anon_KeyValue): scala.Unit = js.native
}

@JSImport("postman-collection", "QueryParam")
@js.native
object QueryParam extends js.Object {
  var _postman_propertyAllowsMultipleValues: scala.Boolean = js.native
  var _postman_propertyIndexKey: java.lang.String = js.native
  def parse(query: java.lang.String): js.Array[postmanDashCollectionLib.postmanDashCollectionMod.QueryParamDefinition] = js.native
  def parseSingle(param: java.lang.String, idx: scala.Double, all: js.Array[java.lang.String]): postmanDashCollectionLib.postmanDashCollectionMod.QueryParamDefinition = js.native
  def unparse(params: js.Array[postmanDashCollectionLib.postmanDashCollectionMod.QueryParamDefinition]): java.lang.String = js.native
  def unparse(
    params: js.Array[postmanDashCollectionLib.postmanDashCollectionMod.QueryParamDefinition],
    options: postmanDashCollectionLib.Anon_IgnoreDisabled
  ): java.lang.String = js.native
  def unparseSingle(obj: postmanDashCollectionLib.postmanDashCollectionMod.QueryParamDefinition, encode: scala.Boolean): java.lang.String = js.native
}

