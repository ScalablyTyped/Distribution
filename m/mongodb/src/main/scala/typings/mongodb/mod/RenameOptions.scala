package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenameOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Drop the target name collection if it previously exists. */
  var dropTarget: js.UndefOr[Boolean] = js.undefined
  
  /** Unclear */
  var new_collection: js.UndefOr[Boolean] = js.undefined
}
object RenameOptions {
  
  inline def apply(): RenameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenameOptions]
  }
  
  extension [Self <: RenameOptions](x: Self) {
    
    inline def setDropTarget(value: Boolean): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    inline def setNew_collection(value: Boolean): Self = StObject.set(x, "new_collection", value.asInstanceOf[js.Any])
    
    inline def setNew_collectionUndefined: Self = StObject.set(x, "new_collection", js.undefined)
  }
}
