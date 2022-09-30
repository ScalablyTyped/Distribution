package typings.mdast.mod

import typings.mdast.mdastInts.`1`
import typings.mdast.mdastInts.`2`
import typings.mdast.mdastInts.`3`
import typings.mdast.mdastInts.`4`
import typings.mdast.mdastInts.`5`
import typings.mdast.mdastInts.`6`
import typings.mdast.mdastStrings.heading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Heading
  extends StObject
     with Parent {
  
  @JSName("children")
  var children_Heading: js.Array[PhrasingContent]
  
  var depth: `1` | `2` | `3` | `4` | `5` | `6`
  
  @JSName("type")
  var type_Heading: heading
}
object Heading {
  
  inline def apply(children: js.Array[PhrasingContent], depth: `1` | `2` | `3` | `4` | `5` | `6`): Heading = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("heading")
    __obj.asInstanceOf[Heading]
  }
  
  extension [Self <: Heading](x: Self) {
    
    inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDepth(value: `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setType(value: heading): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
