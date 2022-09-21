package typings.monacoEditor.mod.editor

import typings.monacoEditor.anon.EnabledBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorExperimentalOptions extends StObject {
  
  var stickyScroll: EnabledBoolean
}
object EditorExperimentalOptions {
  
  inline def apply(stickyScroll: EnabledBoolean): EditorExperimentalOptions = {
    val __obj = js.Dynamic.literal(stickyScroll = stickyScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorExperimentalOptions]
  }
  
  extension [Self <: EditorExperimentalOptions](x: Self) {
    
    inline def setStickyScroll(value: EnabledBoolean): Self = StObject.set(x, "stickyScroll", value.asInstanceOf[js.Any])
  }
}
