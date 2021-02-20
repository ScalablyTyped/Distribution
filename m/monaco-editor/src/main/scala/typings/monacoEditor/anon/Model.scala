package typings.monacoEditor.anon

import typings.monacoEditor.mod.editor.ITextModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends StObject {
  
  val model: ITextModel = js.native
  
  val oldLanguage: String = js.native
}
object Model {
  
  @scala.inline
  def apply(model: ITextModel, oldLanguage: String): Model = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], oldLanguage = oldLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: ITextModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldLanguage(value: String): Self = StObject.set(x, "oldLanguage", value.asInstanceOf[js.Any])
  }
}
