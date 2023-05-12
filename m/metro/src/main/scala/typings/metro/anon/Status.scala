package typings.metro.anon

import typings.metro.metroStrings.watcher_status
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status
  extends StObject
     with ReportableEvent {
  
  var status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatcherStatus */ Any
  
  var `type`: watcher_status
}
object Status {
  
  inline def apply(
    status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatcherStatus */ Any
  ): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("watcher_status")
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    inline def setStatus(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WatcherStatus */ Any
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: watcher_status): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
