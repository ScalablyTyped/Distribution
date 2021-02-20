package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEditorLightbulbOptions extends StObject {
  
  /**
    * Enable the lightbulb code action.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object IEditorLightbulbOptions {
  
  @scala.inline
  def apply(): IEditorLightbulbOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorLightbulbOptions]
  }
  
  @scala.inline
  implicit class IEditorLightbulbOptionsMutableBuilder[Self <: IEditorLightbulbOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
