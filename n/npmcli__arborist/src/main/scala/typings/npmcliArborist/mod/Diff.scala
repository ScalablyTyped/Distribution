package typings.npmcliArborist.mod

import typings.npmcliArborist.npmcliArboristStrings.ADD
import typings.npmcliArborist.npmcliArboristStrings.CHANGE
import typings.npmcliArborist.npmcliArboristStrings.REMOVE
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Diff extends StObject {
  
  var action: REMOVE | ADD | CHANGE | Null
  
  var actual: Node
  
  var children: js.Array[Diff]
  
  var filterSet: Set[Node]
  
  var ideal: Node
  
  var integrity: String | Null
  
  var leaves: js.Array[Node]
  
  var parent: Diff | Null
  
  var removed: js.Array[Node]
  
  var resolved: String | Null
  
  var shrinkwrapInflated: Set[Node]
  
  var unchanged: js.Array[Node]
}
object Diff {
  
  inline def apply(
    actual: Node,
    children: js.Array[Diff],
    filterSet: Set[Node],
    ideal: Node,
    leaves: js.Array[Node],
    removed: js.Array[Node],
    shrinkwrapInflated: Set[Node],
    unchanged: js.Array[Node]
  ): Diff = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], filterSet = filterSet.asInstanceOf[js.Any], ideal = ideal.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], shrinkwrapInflated = shrinkwrapInflated.asInstanceOf[js.Any], unchanged = unchanged.asInstanceOf[js.Any], action = null, integrity = null, parent = null, resolved = null)
    __obj.asInstanceOf[Diff]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Diff] (val x: Self) extends AnyVal {
    
    inline def setAction(value: REMOVE | ADD | CHANGE): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActual(value: Node): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: js.Array[Diff]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: Diff*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setFilterSet(value: Set[Node]): Self = StObject.set(x, "filterSet", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Node): Self = StObject.set(x, "ideal", value.asInstanceOf[js.Any])
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityNull: Self = StObject.set(x, "integrity", null)
    
    inline def setLeaves(value: js.Array[Node]): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
    
    inline def setLeavesVarargs(value: Node*): Self = StObject.set(x, "leaves", js.Array(value*))
    
    inline def setParent(value: Diff): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setRemoved(value: js.Array[Node]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: Node*): Self = StObject.set(x, "removed", js.Array(value*))
    
    inline def setResolved(value: String): Self = StObject.set(x, "resolved", value.asInstanceOf[js.Any])
    
    inline def setResolvedNull: Self = StObject.set(x, "resolved", null)
    
    inline def setShrinkwrapInflated(value: Set[Node]): Self = StObject.set(x, "shrinkwrapInflated", value.asInstanceOf[js.Any])
    
    inline def setUnchanged(value: js.Array[Node]): Self = StObject.set(x, "unchanged", value.asInstanceOf[js.Any])
    
    inline def setUnchangedVarargs(value: Node*): Self = StObject.set(x, "unchanged", js.Array(value*))
  }
}
