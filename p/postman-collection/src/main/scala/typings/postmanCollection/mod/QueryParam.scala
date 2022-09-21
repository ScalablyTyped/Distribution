package typings.postmanCollection.mod

import typings.postmanCollection.anon.Encode
import typings.postmanCollection.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.QueryParamDefinition because var conflicts: description, disabled, id, name. Inlined key, value, system */ @JSImport("postman-collection", "QueryParam")
@js.native
open class QueryParam protected () extends Property[QueryParamDefinition] {
  def this(options: String) = this()
  def this(options: QueryParamDefinition) = this()
  
  var key: Null | String = js.native
  
  var system: js.UndefOr[Boolean] = js.native
  
  def update(param: String): Unit = js.native
  def update(param: Value): Unit = js.native
  
  var value: Null | String = js.native
}
/* static members */
object QueryParam {
  
  @JSImport("postman-collection", "QueryParam")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("postman-collection", "QueryParam._postman_propertyAllowsMultipleValues")
  @js.native
  def _postman_propertyAllowsMultipleValues: Boolean = js.native
  inline def _postman_propertyAllowsMultipleValues_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_postman_propertyAllowsMultipleValues")(x.asInstanceOf[js.Any])
  
  @JSImport("postman-collection", "QueryParam._postman_propertyIndexKey")
  @js.native
  def _postman_propertyIndexKey: String = js.native
  inline def _postman_propertyIndexKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_postman_propertyIndexKey")(x.asInstanceOf[js.Any])
  
  inline def parse(query: String): js.Array[QueryParamDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any]).asInstanceOf[js.Array[QueryParamDefinition]]
  
  inline def parseSingle(param: String, idx: Double, all: js.Array[String]): QueryParamDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSingle")(param.asInstanceOf[js.Any], idx.asInstanceOf[js.Any], all.asInstanceOf[js.Any])).asInstanceOf[QueryParamDefinition]
  
  inline def unparse(params: js.Array[QueryParamDefinition]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unparse(params: js.Array[QueryParamDefinition], options: Encode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unparseSingle(obj: QueryParamDefinition, encode: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparseSingle")(obj.asInstanceOf[js.Any], encode.asInstanceOf[js.Any])).asInstanceOf[String]
}
