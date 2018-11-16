package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodal", "RelationshipGraph")
@js.native
class RelationshipGraph () extends js.Object {
  var edges: js.Array[RelationshipEdge] = js.native
  var nodes: js.Array[RelationshipNode] = js.native
  def of(
    mModel: ScalablyTyped.runtime.Instantiable3[
      /* modelData */ js.Object, 
      /* fromStorage */ js.UndefOr[/* fromStorage */ scala.Boolean], 
      /* fromSeed */ js.UndefOr[/* fromSeed */ scala.Boolean], 
      Model
    ]
  ): RelationshipNode = js.native
}

