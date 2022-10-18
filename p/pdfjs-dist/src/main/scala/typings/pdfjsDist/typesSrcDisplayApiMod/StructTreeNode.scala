package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructTreeNode extends StObject {
  
  /**
    * - Array of
    * {@link StructTreeNode } and {@link StructTreeContent } objects.
    */
  var children: js.Array[StructTreeNode | StructTreeContent]
  
  /**
    * - element's role, already mapped if a role map exists
    * in the PDF.
    */
  var role: String
}
object StructTreeNode {
  
  inline def apply(children: js.Array[StructTreeNode | StructTreeContent], role: String): StructTreeNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructTreeNode]
  }
  
  extension [Self <: StructTreeNode](x: Self) {
    
    inline def setChildren(value: js.Array[StructTreeNode | StructTreeContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (StructTreeNode | StructTreeContent)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
