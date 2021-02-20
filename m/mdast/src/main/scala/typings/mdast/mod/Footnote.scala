package typings.mdast.mod

import typings.mdast.mdastStrings.footnote
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Footnote
  extends Parent
     with StaticPhrasingContent {
  
  @JSName("children")
  var children_Footnote: js.Array[PhrasingContent] = js.native
  
  @JSName("type")
  var type_Footnote: footnote = js.native
}
object Footnote {
  
  @scala.inline
  def apply(children: js.Array[PhrasingContent], `type`: footnote): Footnote = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footnote]
  }
  
  @scala.inline
  implicit class FootnoteMutableBuilder[Self <: Footnote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: footnote): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
