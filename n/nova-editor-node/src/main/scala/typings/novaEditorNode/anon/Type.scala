package typings.novaEditorNode.anon

import typings.novaEditorNode.novaEditorNodeStrings.TaskName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var __type: TaskName = js.native
}
object Type {
  
  @scala.inline
  def apply(__type: TaskName): Type = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__type(value: TaskName): Self = StObject.set(x, "__type", value.asInstanceOf[js.Any])
  }
}
