package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTarget extends StObject {
  
  var dropTarget: js.UndefOr[Boolean] = js.undefined
}
object DropTarget {
  
  inline def apply(): DropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTarget]
  }
  
  extension [Self <: DropTarget](x: Self) {
    
    inline def setDropTarget(value: Boolean): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
  }
}
