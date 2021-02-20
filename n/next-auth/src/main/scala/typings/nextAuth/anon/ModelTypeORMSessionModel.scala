package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMSessionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelTypeORMSessionModel extends StObject {
  
  var model: TypeORMSessionModel = js.native
  
  var schema: typings.nextAuth.adaptersMod.Schema[TypeORMSessionModel] = js.native
}
object ModelTypeORMSessionModel {
  
  @scala.inline
  def apply(model: TypeORMSessionModel, schema: typings.nextAuth.adaptersMod.Schema[TypeORMSessionModel]): ModelTypeORMSessionModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTypeORMSessionModel]
  }
  
  @scala.inline
  implicit class ModelTypeORMSessionModelMutableBuilder[Self <: ModelTypeORMSessionModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: TypeORMSessionModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[TypeORMSessionModel]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
