package typings.mdast.mod

import typings.mdast.mdastStrings.inlineCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineCode
  extends Literal
     with StaticPhrasingContent {
  
  @JSName("type")
  var type_InlineCode: inlineCode = js.native
}
object InlineCode {
  
  @scala.inline
  def apply(`type`: inlineCode, value: js.Any): InlineCode = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineCode]
  }
  
  @scala.inline
  implicit class InlineCodeMutableBuilder[Self <: InlineCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: inlineCode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
