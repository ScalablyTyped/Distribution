package typings.postmanCollection.mod

import typings.postmanCollection.anon.Encode
import typings.postmanCollection.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.QueryParamDefinition because var conflicts: description, disabled, id, name. Inlined key, value, system */ @JSImport("postman-collection", "QueryParam")
@js.native
class QueryParam protected () extends Property[QueryParamDefinition] {
  def this(options: String) = this()
  def this(options: QueryParamDefinition) = this()
  
  var key: Null | String = js.native
  
  var system: js.UndefOr[Boolean] = js.native
  
  def update(param: String): Unit = js.native
  def update(param: Value): Unit = js.native
  
  var value: Null | String = js.native
}
/* static members */
@JSImport("postman-collection", "QueryParam")
@js.native
object QueryParam extends js.Object {
  
  var _postman_propertyAllowsMultipleValues: Boolean = js.native
  
  var _postman_propertyIndexKey: String = js.native
  
  def parse(query: String): js.Array[QueryParamDefinition] = js.native
  
  def parseSingle(param: String, idx: Double, all: js.Array[String]): QueryParamDefinition = js.native
  
  def unparse(params: js.Array[QueryParamDefinition]): String = js.native
  def unparse(params: js.Array[QueryParamDefinition], options: Encode): String = js.native
  
  def unparseSingle(obj: QueryParamDefinition, encode: Boolean): String = js.native
}
