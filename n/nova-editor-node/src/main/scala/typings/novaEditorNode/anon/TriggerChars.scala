package typings.novaEditorNode.anon

import typings.novaEditorNode.Charset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerChars extends StObject {
  
  var triggerChars: js.UndefOr[Charset] = js.undefined
}
object TriggerChars {
  
  inline def apply(): TriggerChars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerChars]
  }
  
  extension [Self <: TriggerChars](x: Self) {
    
    inline def setTriggerChars(value: Charset): Self = StObject.set(x, "triggerChars", value.asInstanceOf[js.Any])
    
    inline def setTriggerCharsUndefined: Self = StObject.set(x, "triggerChars", js.undefined)
  }
}
