package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMUserModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelSchema[U /* <: TypeORMUserModel */] extends StObject {
  
  var model: U = js.native
  
  var schema: typings.nextAuth.adaptersMod.Schema[U] = js.native
}
object ModelSchema {
  
  @scala.inline
  def apply[U /* <: TypeORMUserModel */](model: U, schema: typings.nextAuth.adaptersMod.Schema[U]): ModelSchema[U] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelSchema[U]]
  }
  
  @scala.inline
  implicit class ModelSchemaMutableBuilder[Self <: ModelSchema[_], U /* <: TypeORMUserModel */] (val x: Self with ModelSchema[U]) extends AnyVal {
    
    @scala.inline
    def setModel(value: U): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[U]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
