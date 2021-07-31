package typings.monacoEditor.anon

import typings.monacoEditor.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dark extends StObject {
  
  var dark: Uri
  
  var light: Uri
}
object Dark {
  
  @scala.inline
  def apply(dark: Uri, light: Uri): Dark = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dark]
  }
  
  @scala.inline
  implicit class DarkMutableBuilder[Self <: Dark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDark(value: Uri): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: Uri): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
  }
}
