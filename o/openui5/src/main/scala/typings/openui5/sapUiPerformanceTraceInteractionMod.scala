package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.openui5Strings.X
import typings.openui5.openui5Strings._empty
import typings.std.PerformanceResourceTiming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiPerformanceTraceInteractionMod extends Shortcut {
  
  @JSImport("sap/ui/performance/trace/Interaction", JSImport.Default)
  @js.native
  val default: Interaction = js.native
  
  trait Entry extends StObject {
    
    /**
      * The application version as from app descriptor
      */
    var appVersion: String
    
    /**
      * The sum of the global busy indicator duration during the interaction
      */
    var busyDuration: float
    
    /**
      * The sum over all responses bytes
      */
    var bytesReceived: int
    
    /**
      * The sum over all requests bytes
      */
    var bytesSent: int
    
    /**
      * The identifier of the component or app that is associated with the interaction.
      */
    var component: String
    
    /**
      * The interaction duration
      */
    var duration: float
    
    /**
      * The end timestamp of the interaction
      */
    var end: float
    
    /**
      * The event which triggered the interaction. The default value is "startup".
      */
    var event: String
    
    /**
      * The ID of the interaction
      */
    var id: String
    
    /**
      * The Performance measurements
      */
    var measurements: js.Array[typings.openui5.sapUiPerformanceMeasurementMod.Entry]
    
    /**
      * The sum over all navigation times
      */
    var navigation: float
    
    /**
      * The request time minus server time from the header
      */
    var networkTime: float
    
    /**
      * The default PassportAction for startup
      */
    var passportAction: String
    
    /**
      * The client processing time
      */
    var processing: float
    
    /**
      * It's set with value "X" by default When compression does not match SAP rules, we report an empty string.
      */
    var requestCompression: X | _empty
    
    /**
      * The sum over all requests in the interaction
      */
    var requestTime: float
    
    /**
      * The Performance API requests during interaction
      */
    var requests: js.Array[PerformanceResourceTiming]
    
    /**
      * The time from first request sent to last received response end - without gaps and ignored overlap
      */
    var roundtrip: float
    
    /**
      * The SAP Statistics for OData
      */
    var sapStatistics: js.Array[SAPStatistics]
    
    /**
      * The start timestamp of the interaction which is initially set to the `fetchStart`
      */
    var start: float
    
    /**
      * The control which triggered the interaction.
      */
    var trigger: String
  }
  object Entry {
    
    inline def apply(
      appVersion: String,
      busyDuration: float,
      bytesReceived: int,
      bytesSent: int,
      component: String,
      duration: float,
      end: float,
      event: String,
      id: String,
      measurements: js.Array[typings.openui5.sapUiPerformanceMeasurementMod.Entry],
      navigation: float,
      networkTime: float,
      passportAction: String,
      processing: float,
      requestCompression: X | _empty,
      requestTime: float,
      requests: js.Array[PerformanceResourceTiming],
      roundtrip: float,
      sapStatistics: js.Array[SAPStatistics],
      start: float,
      trigger: String
    ): Entry = {
      val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], busyDuration = busyDuration.asInstanceOf[js.Any], bytesReceived = bytesReceived.asInstanceOf[js.Any], bytesSent = bytesSent.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], networkTime = networkTime.asInstanceOf[js.Any], passportAction = passportAction.asInstanceOf[js.Any], processing = processing.asInstanceOf[js.Any], requestCompression = requestCompression.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], roundtrip = roundtrip.asInstanceOf[js.Any], sapStatistics = sapStatistics.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
      
      inline def setBusyDuration(value: float): Self = StObject.set(x, "busyDuration", value.asInstanceOf[js.Any])
      
      inline def setBytesReceived(value: int): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
      
      inline def setBytesSent(value: int): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: float): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: float): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMeasurements(value: js.Array[typings.openui5.sapUiPerformanceMeasurementMod.Entry]): Self = StObject.set(x, "measurements", value.asInstanceOf[js.Any])
      
      inline def setMeasurementsVarargs(value: typings.openui5.sapUiPerformanceMeasurementMod.Entry*): Self = StObject.set(x, "measurements", js.Array(value*))
      
      inline def setNavigation(value: float): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNetworkTime(value: float): Self = StObject.set(x, "networkTime", value.asInstanceOf[js.Any])
      
      inline def setPassportAction(value: String): Self = StObject.set(x, "passportAction", value.asInstanceOf[js.Any])
      
      inline def setProcessing(value: float): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
      
      inline def setRequestCompression(value: X | _empty): Self = StObject.set(x, "requestCompression", value.asInstanceOf[js.Any])
      
      inline def setRequestTime(value: float): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
      
      inline def setRequests(value: js.Array[PerformanceResourceTiming]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setRequestsVarargs(value: PerformanceResourceTiming*): Self = StObject.set(x, "requests", js.Array(value*))
      
      inline def setRoundtrip(value: float): Self = StObject.set(x, "roundtrip", value.asInstanceOf[js.Any])
      
      inline def setSapStatistics(value: js.Array[SAPStatistics]): Self = StObject.set(x, "sapStatistics", value.asInstanceOf[js.Any])
      
      inline def setSapStatisticsVarargs(value: SAPStatistics*): Self = StObject.set(x, "sapStatistics", js.Array(value*))
      
      inline def setStart(value: float): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @since 1.76
    *
    * Provides base functionality for interaction detection heuristics & API. Interaction detection works through
    * the detection of relevant events and tracking of rendering activities.
    *  An example:
    *  The user clicks on a button
    *
    * 	 - "click" event gets detected via notification (`var notifyEventStart`)
    * 	 - a click handler is registered on the button, so this is an interaction start (`var notifyStepStart`)
    *
    * 	 - some requests are made and rendering has finished (`var notifyStepEnd`)  All measurement takes
    *     place in {@link module:sap/ui/performance/Measurement}.
    */
  trait Interaction extends StObject {
    
    /**
      * @since 1.76
      *
      * Gets all interaction measurements for which a provided filter function returns a truthy value.
      *
      * To filter for certain categories of measurements a fnFilter can be implemented like this ` function(InteractionMeasurement)
      * { return InteractionMeasurement.duration > 0 }`
      *
      * @returns all interaction measurements passing the filter function successfully
      */
    def filter(
      /**
      * a filter function that returns true if the passed measurement should be added to the result
      */
    fnFilter: js.Function
    ): js.Array[Entry]
    
    /**
      * @since 1.76
      *
      * Returns true if the interaction detection was enabled explicitly, or implicitly along with fesr.
      *
      * @returns bActive State of the interaction detection
      */
    def getActive(): Boolean
    
    /**
      * @since 1.76
      *
      * Gets all interaction measurements.
      *
      * @returns all interaction measurements
      */
    def getAll(
      /**
      * finalize the current pending interaction so that it is contained in the returned array
      */
    bFinalize: Boolean
    ): js.Array[Entry]
    
    /**
      * @since 1.76
      *
      * Enables the interaction tracking.
      */
    def setActive(/**
      * State of the interaction detection
      */
    bActive: Boolean): Unit
  }
  object Interaction {
    
    inline def apply(
      filter: js.Function => js.Array[Entry],
      getActive: () => Boolean,
      getAll: Boolean => js.Array[Entry],
      setActive: Boolean => Unit
    ): Interaction = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), getActive = js.Any.fromFunction0(getActive), getAll = js.Any.fromFunction1(getAll), setActive = js.Any.fromFunction1(setActive))
      __obj.asInstanceOf[Interaction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Interaction] (val x: Self) extends AnyVal {
      
      inline def setFilter(value: js.Function => js.Array[Entry]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setGetActive(value: () => Boolean): Self = StObject.set(x, "getActive", js.Any.fromFunction0(value))
      
      inline def setGetAll(value: Boolean => js.Array[Entry]): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
      
      inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    }
  }
  
  trait SAPStatistics extends StObject {
    
    /**
      * The response header under the key "sap-statistics"
      */
    var statistics: String
    
    /**
      * The last performance resource timing
      */
    var timing: PerformanceResourceTiming
    
    /**
      * The url of the response
      */
    var url: String
  }
  object SAPStatistics {
    
    inline def apply(statistics: String, timing: PerformanceResourceTiming, url: String): SAPStatistics = {
      val __obj = js.Dynamic.literal(statistics = statistics.asInstanceOf[js.Any], timing = timing.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SAPStatistics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SAPStatistics] (val x: Self) extends AnyVal {
      
      inline def setStatistics(value: String): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
      
      inline def setTiming(value: PerformanceResourceTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Interaction
  
  /* This means you don't have to write `default`, but can instead just say `sapUiPerformanceTraceInteractionMod.foo` */
  override def _to: Interaction = default
}
