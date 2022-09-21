package typings.openfin.shapesPlatformMod

import typings.openfin.anon.MonitorInfo
import typings.openfin.windowOptionsMod.WindowOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snapshot extends StObject {
  
  var snapshotDetails: js.UndefOr[MonitorInfo] = js.undefined
  
  var windows: js.Array[WindowOptions]
}
object Snapshot {
  
  inline def apply(windows: js.Array[WindowOptions]): Snapshot = {
    val __obj = js.Dynamic.literal(windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Snapshot]
  }
  
  extension [Self <: Snapshot](x: Self) {
    
    inline def setSnapshotDetails(value: MonitorInfo): Self = StObject.set(x, "snapshotDetails", value.asInstanceOf[js.Any])
    
    inline def setSnapshotDetailsUndefined: Self = StObject.set(x, "snapshotDetails", js.undefined)
    
    inline def setWindows(value: js.Array[WindowOptions]): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    
    inline def setWindowsVarargs(value: WindowOptions*): Self = StObject.set(x, "windows", js.Array(value*))
  }
}
