package typings.openapiTypes.mod.OpenAPIV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.openapiTypes.mod.OpenAPIV3.ArraySchemaObject
  - typings.openapiTypes.mod.OpenAPIV3.NonArraySchemaObject
*/
trait SchemaObject extends js.Object

object SchemaObject {
  @scala.inline
  def ArraySchemaObject(items: ReferenceObject | SchemaObject, `type`: ArraySchemaObjectType): SchemaObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaObject]
  }
  @scala.inline
  def NonArraySchemaObject(): SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObject]
  }
}

