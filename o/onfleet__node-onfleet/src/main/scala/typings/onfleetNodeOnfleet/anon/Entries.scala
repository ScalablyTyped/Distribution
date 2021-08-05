package typings.onfleetNodeOnfleet.anon

import typings.onfleetNodeOnfleet.workersMod.WorkerSchedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entries extends StObject {
  
  var entries: js.Array[WorkerSchedule]
}
object Entries {
  
  inline def apply(entries: js.Array[WorkerSchedule]): Entries = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entries]
  }
  
  extension [Self <: Entries](x: Self) {
    
    inline def setEntries(value: js.Array[WorkerSchedule]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: WorkerSchedule*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
