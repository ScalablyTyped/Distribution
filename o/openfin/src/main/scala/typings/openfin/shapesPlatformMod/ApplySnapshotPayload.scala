package typings.openfin.shapesPlatformMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplySnapshotPayload extends StObject {
  
  var options: js.UndefOr[ApplySnapshotOptions] = js.undefined
  
  var snapshot: Snapshot
}
object ApplySnapshotPayload {
  
  inline def apply(snapshot: Snapshot): ApplySnapshotPayload = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplySnapshotPayload]
  }
  
  extension [Self <: ApplySnapshotPayload](x: Self) {
    
    inline def setOptions(value: ApplySnapshotOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
