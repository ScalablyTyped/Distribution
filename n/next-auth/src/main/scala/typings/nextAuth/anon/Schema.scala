package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMAccountModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schema[A /* <: TypeORMAccountModel */] extends StObject {
  
  var model: A = js.native
  
  var schema: typings.nextAuth.adaptersMod.Schema[A] = js.native
}
object Schema {
  
  @scala.inline
  def apply[A /* <: TypeORMAccountModel */](model: A, schema: typings.nextAuth.adaptersMod.Schema[A]): Schema[A] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema[A]]
  }
  
  @scala.inline
  implicit class SchemaMutableBuilder[Self <: Schema[_], A /* <: TypeORMAccountModel */] (val x: Self with Schema[A]) extends AnyVal {
    
    @scala.inline
    def setModel(value: A): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[A]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
