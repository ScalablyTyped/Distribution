package typings.mdast.mod

import typings.mdast.mdastNumbers.`1`
import typings.mdast.mdastNumbers.`2`
import typings.mdast.mdastNumbers.`3`
import typings.mdast.mdastNumbers.`4`
import typings.mdast.mdastNumbers.`5`
import typings.mdast.mdastNumbers.`6`
import typings.mdast.mdastStrings.heading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heading
  extends StObject
     with Parent
     with BlockContent {
  
  @JSName("children")
  var children_Heading: js.Array[PhrasingContent]
  
  var depth: `1` | `2` | `3` | `4` | `5` | `6`
  
  @JSName("type")
  var type_Heading: heading
}
object Heading {
  
  @scala.inline
  def apply(children: js.Array[PhrasingContent], depth: `1` | `2` | `3` | `4` | `5` | `6`): Heading = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading")
    __obj.asInstanceOf[Heading]
  }
  
  @scala.inline
  implicit class HeadingMutableBuilder[Self <: Heading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setDepth(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: heading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
