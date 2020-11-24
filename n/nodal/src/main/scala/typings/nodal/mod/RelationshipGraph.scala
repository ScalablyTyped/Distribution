package typings.nodal.mod

import typings.nodal.anon.TypeofModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "RelationshipGraph")
@js.native
class RelationshipGraph () extends js.Object {
  
  var edges: js.Array[RelationshipEdge] = js.native
  
  var nodes: js.Array[RelationshipNode] = js.native
  
  def of(mModel: TypeofModel): RelationshipNode = js.native
}
