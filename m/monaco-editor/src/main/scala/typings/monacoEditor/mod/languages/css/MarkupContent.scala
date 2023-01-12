package typings.monacoEditor.mod.languages.css

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkupContent extends StObject {
  
  var kind: MarkupKind
  
  var value: String
}
object MarkupContent {
  
  inline def apply(kind: MarkupKind, value: String): MarkupContent = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkupContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkupContent] (val x: Self) extends AnyVal {
    
    inline def setKind(value: MarkupKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
