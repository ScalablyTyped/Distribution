package typings.mdast.mod

import typings.mdast.mdastStrings.emphasis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emphasis
  extends StObject
     with Parent
     with StaticPhrasingContent {
  
  @JSName("children")
  var children_Emphasis: js.Array[PhrasingContent]
  
  @JSName("type")
  var type_Emphasis: emphasis
}
object Emphasis {
  
  @scala.inline
  def apply(children: js.Array[PhrasingContent]): Emphasis = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("emphasis")
    __obj.asInstanceOf[Emphasis]
  }
  
  @scala.inline
  implicit class EmphasisMutableBuilder[Self <: Emphasis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setType(value: emphasis): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
