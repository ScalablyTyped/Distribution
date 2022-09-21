package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "RelationshipEdge")
@js.native
open class RelationshipEdge protected () extends StObject {
  def this(parent: RelationshipNode, child: RelationshipNode, options: IOptions) = this()
  
  var child: RelationshipNode = js.native
  
  def hasChild(child: RelationshipNode): Boolean = js.native
  
  def hasParent(parent: RelationshipNode): Boolean = js.native
  
  var id: Double = js.native
  
  def opposite(node: RelationshipNode): RelationshipNode | Null = js.native
  
  var options: IOptions = js.native
  
  var parent: RelationshipNode = js.native
}
