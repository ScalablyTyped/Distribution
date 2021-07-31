package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeColor extends StObject {
  
  var id: String
}
object ThemeColor {
  
  @scala.inline
  def apply(id: String): ThemeColor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColor]
  }
  
  @scala.inline
  implicit class ThemeColorMutableBuilder[Self <: ThemeColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
