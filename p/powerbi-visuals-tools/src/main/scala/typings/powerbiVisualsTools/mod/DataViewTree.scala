package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewTree extends StObject {
  
  var root: DataViewTreeNode
}
object DataViewTree {
  
  inline def apply(root: DataViewTreeNode): DataViewTree = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewTree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataViewTree] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: DataViewTreeNode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
