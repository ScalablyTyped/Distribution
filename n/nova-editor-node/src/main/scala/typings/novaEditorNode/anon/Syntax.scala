package typings.novaEditorNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Syntax extends StObject {
  
  var syntax: String
}
object Syntax {
  
  @scala.inline
  def apply(syntax: String): Syntax = {
    val __obj = js.Dynamic.literal(syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Syntax]
  }
  
  @scala.inline
  implicit class SyntaxMutableBuilder[Self <: Syntax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
  }
}
