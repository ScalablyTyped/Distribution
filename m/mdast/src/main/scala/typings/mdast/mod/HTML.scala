package typings.mdast.mod

import typings.mdast.mdastStrings.html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTML
  extends Literal
     with BlockContent
     with StaticPhrasingContent {
  
  @JSName("type")
  var type_HTML: html = js.native
}
object HTML {
  
  @scala.inline
  def apply(`type`: html, value: js.Any): HTML = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTML]
  }
  
  @scala.inline
  implicit class HTMLMutableBuilder[Self <: HTML] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
