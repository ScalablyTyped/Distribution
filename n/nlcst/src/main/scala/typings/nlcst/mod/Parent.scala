package typings.nlcst.mod

import typings.unist.mod.Data
import typings.unist.mod.Node
import typings.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent
  extends StObject
     with typings.unist.mod.Parent[Node[Data], NodeData[Node[Data]]]
object Parent {
  
  inline def apply(children: js.Array[Node[Data]], `type`: String): Parent = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
}
