package typings.mdast.mod

import typings.mdast.mdastStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Link
  extends Parent
     with Resource
     with PhrasingContent {
  
  @JSName("children")
  var children_Link: js.Array[StaticPhrasingContent] = js.native
  
  @JSName("type")
  var type_Link: link = js.native
}
object Link {
  
  @scala.inline
  def apply(children: js.Array[StaticPhrasingContent], `type`: link, url: String): Link = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[StaticPhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: StaticPhrasingContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: link): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
