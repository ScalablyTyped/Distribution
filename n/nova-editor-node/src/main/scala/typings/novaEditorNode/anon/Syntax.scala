package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Syntax extends StObject {
  
  var syntax: String
}
object Syntax {
  
  inline def apply(syntax: String): Syntax = {
    val __obj = js.Dynamic.literal(syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Syntax]
  }
  
  extension [Self <: Syntax](x: Self) {
    
    inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
  }
}
