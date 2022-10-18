package typings.next

import typings.next.anon.FlushAll
import typings.next.anon.Ipv4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTraceReportToJsonMod {
  
  @JSImport("next/dist/trace/report/to-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("next/dist/trace/report/to-json", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def flushAll(): js.UndefOr[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("flushAll")().asInstanceOf[js.UndefOr[js.Promise[Unit]]]
    
    inline def report(name: String, duration: Double, timestamp: Double, id: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(name.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def report(name: String, duration: Double, timestamp: Double, id: Double, parentId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(name.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], id.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def report(name: String, duration: Double, timestamp: Double, id: Double, parentId: Double, attrs: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(name.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], id.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def report(
      name: String,
      duration: Double,
      timestamp: Double,
      id: Double,
      parentId: Double,
      attrs: js.Object,
      startTime: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(name.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], id.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def report(
      name: String,
      duration: Double,
      timestamp: Double,
      id: Double,
      parentId: Double,
      attrs: Unit,
      startTime: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(name.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], id.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def report(name: String, duration: Double, timestamp: Double, id: Double, parentId: Unit, attrs: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(name.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], id.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def report(
      name: String,
      duration: Double,
      timestamp: Double,
      id: Double,
      parentId: Unit,
      attrs: js.Object,
      startTime: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(name.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], id.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def report(
      name: String,
      duration: Double,
      timestamp: Double,
      id: Double,
      parentId: Unit,
      attrs: Unit,
      startTime: Double
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(name.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], id.asInstanceOf[js.Any], parentId.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], startTime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def batcher(reportEvents: js.Function1[/* evts */ js.Array[Event], js.Promise[Unit]]): FlushAll = ^.asInstanceOf[js.Dynamic].applyDynamic("batcher")(reportEvents.asInstanceOf[js.Any]).asInstanceOf[FlushAll]
  
  trait Event extends StObject {
    
    var duration: Double
    
    var id: Double
    
    var localEndpoint: js.UndefOr[Ipv4] = js.undefined
    
    var name: String
    
    var parentId: js.UndefOr[Double] = js.undefined
    
    var startTime: js.UndefOr[Double] = js.undefined
    
    var tags: js.UndefOr[js.Object] = js.undefined
    
    var timestamp: Double
    
    var traceId: String
  }
  object Event {
    
    inline def apply(duration: Double, id: Double, name: String, timestamp: Double, traceId: String): Event = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], traceId = traceId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocalEndpoint(value: Ipv4): Self = StObject.set(x, "localEndpoint", value.asInstanceOf[js.Any])
      
      inline def setLocalEndpointUndefined: Self = StObject.set(x, "localEndpoint", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      inline def setTags(value: js.Object): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
    }
  }
}
