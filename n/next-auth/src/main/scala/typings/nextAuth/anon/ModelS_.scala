package typings.nextAuth.anon

import typings.nextAuth.adaptersMod.TypeORMSessionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelS_[S /* <: TypeORMSessionModel */] extends StObject {
  
  var model: S
  
  var schema: typings.nextAuth.adaptersMod.Schema[S]
}
object ModelS_ {
  
  @scala.inline
  def apply[S /* <: TypeORMSessionModel */](model: S, schema: typings.nextAuth.adaptersMod.Schema[S]): ModelS_[S] = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelS_[S]]
  }
  
  @scala.inline
  implicit class ModelS_MutableBuilder[Self <: ModelS_[?], S /* <: TypeORMSessionModel */] (val x: Self & ModelS_[S]) extends AnyVal {
    
    @scala.inline
    def setModel(value: S): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: typings.nextAuth.adaptersMod.Schema[S]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
