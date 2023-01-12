package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiPerformanceMeasurementMod extends Shortcut {
  
  @JSImport("sap/ui/performance/Measurement", JSImport.Default)
  @js.native
  val default: Measurement = js.native
  
  trait Entry extends StObject {
    
    /**
      * An optional list of categories for the measure
      */
    var aCategories: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * End time
      */
    var iEnd: int
    
    /**
      * Start time
      */
    var iStart: int
    
    /**
      * ID of the measurement
      */
    var sId: String
    
    /**
      * Info for the measurement
      */
    var sInfo: String
  }
  object Entry {
    
    inline def apply(iEnd: int, iStart: int, sId: String, sInfo: String): Entry = {
      val __obj = js.Dynamic.literal(iEnd = iEnd.asInstanceOf[js.Any], iStart = iStart.asInstanceOf[js.Any], sId = sId.asInstanceOf[js.Any], sInfo = sInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry] (val x: Self) extends AnyVal {
      
      inline def setACategories(value: String | js.Array[String]): Self = StObject.set(x, "aCategories", value.asInstanceOf[js.Any])
      
      inline def setACategoriesUndefined: Self = StObject.set(x, "aCategories", js.undefined)
      
      inline def setACategoriesVarargs(value: String*): Self = StObject.set(x, "aCategories", js.Array(value*))
      
      inline def setIEnd(value: int): Self = StObject.set(x, "iEnd", value.asInstanceOf[js.Any])
      
      inline def setIStart(value: int): Self = StObject.set(x, "iStart", value.asInstanceOf[js.Any])
      
      inline def setSId(value: String): Self = StObject.set(x, "sId", value.asInstanceOf[js.Any])
      
      inline def setSInfo(value: String): Self = StObject.set(x, "sInfo", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @SINCE 1.58
    *
    * Performance Measurement API.
    */
  @js.native
  trait Measurement extends StObject {
    
    /**
      * Adds a performance measurement with all data.
      *
      * This is useful to add external measurements (e.g. from a backend) to the common measurement UI
      *
      * @returns [] current measurement containing id, info and start-timestamp, end-timestamp, time, duration,
      * categories (false if error)
      */
    def add(
      /**
      * ID of the measurement
      */
    sId: String,
      /**
      * Info for the measurement
      */
    sInfo: String,
      /**
      * start timestamp
      */
    iStart: int,
      /**
      * end timestamp
      */
    iEnd: int,
      /**
      * time in milliseconds
      */
    iTime: int,
      /**
      * effective time in milliseconds
      */
    iDuration: int
    ): js.Object = js.native
    def add(
      /**
      * ID of the measurement
      */
    sId: String,
      /**
      * Info for the measurement
      */
    sInfo: String,
      /**
      * start timestamp
      */
    iStart: int,
      /**
      * end timestamp
      */
    iEnd: int,
      /**
      * time in milliseconds
      */
    iTime: int,
      /**
      * effective time in milliseconds
      */
    iDuration: int,
      /**
      * An optional list of categories for the measure
      */
    aCategories: String
    ): js.Object = js.native
    def add(
      /**
      * ID of the measurement
      */
    sId: String,
      /**
      * Info for the measurement
      */
    sInfo: String,
      /**
      * start timestamp
      */
    iStart: int,
      /**
      * end timestamp
      */
    iEnd: int,
      /**
      * time in milliseconds
      */
    iTime: int,
      /**
      * effective time in milliseconds
      */
    iDuration: int,
      /**
      * An optional list of categories for the measure
      */
    aCategories: js.Array[String]
    ): js.Object = js.native
    
    /**
      * Starts an average performance measure.
      *
      * The duration of this measure is an avarage of durations measured for each call. Optionally a category
      * or list of categories can be passed to allow filtering of measurements.
      *
      * @returns current measurement containing id, info and start-timestamp (false if error)
      */
    def average(
      /**
      * ID of the measurement
      */
    sId: String,
      /**
      * Info for the measurement
      */
    sInfo: String
    ): js.Object = js.native
    def average(
      /**
      * ID of the measurement
      */
    sId: String,
      /**
      * Info for the measurement
      */
    sInfo: String,
      /**
      * An optional list of categories for the measure
      */
    aCategories: String
    ): js.Object = js.native
    def average(
      /**
      * ID of the measurement
      */
    sId: String,
      /**
      * Info for the measurement
      */
    sInfo: String,
      /**
      * An optional list of categories for the measure
      */
    aCategories: js.Array[String]
    ): js.Object = js.native
    
    /**
      * Clears all performance measurements.
      */
    def clear(): Unit = js.native
    
    /**
      * Ends a performance measure.
      *
      * @returns current measurement containing id, info and start-timestamp, end-timestamp, time, duration (false
      * if error)
      */
    def end(/**
      * ID of the measurement
      */
    sId: String): js.Object = js.native
    
    /**
      * Gets all performance measurements where a provided filter function returns a truthy value.
      *
      * If neither a filter function nor a category is provided an empty array is returned. To filter for certain
      * properties of measurements a fnFilter can be implemented like this ` function(oMeasurement) { return
      * oMeasurement.duration > 50; }`
      *
      * @returns filtered array with measurements containing id, info and start-timestamp, end-timestamp, time,
      * duration, categories (false if error)
      */
    def filterMeasurements(): js.Array[Entry] = js.native
    def filterMeasurements(
      /**
      * a filter function that returns true if the passed measurement should be added to the result
      */
    fnFilter: js.Function
    ): js.Array[Entry] = js.native
    def filterMeasurements(
      /**
      * a filter function that returns true if the passed measurement should be added to the result
      */
    fnFilter: js.Function,
      /**
      * Optional parameter to determine if either completed or incomplete measurements should be returned (both
      * if not set or undefined)
      */
    bCompleted: Boolean
    ): js.Array[Entry] = js.native
    def filterMeasurements(
      /**
      * a filter function that returns true if the passed measurement should be added to the result
      */
    fnFilter: js.Function,
      /**
      * Optional parameter to determine if either completed or incomplete measurements should be returned (both
      * if not set or undefined)
      */
    bCompleted: Boolean,
      /**
      * The function returns only measurements which match these specified categories
      */
    aCategories: js.Array[String]
    ): js.Array[Entry] = js.native
    def filterMeasurements(
      /**
      * a filter function that returns true if the passed measurement should be added to the result
      */
    fnFilter: js.Function,
      /**
      * Optional parameter to determine if either completed or incomplete measurements should be returned (both
      * if not set or undefined)
      */
    bCompleted: Unit,
      /**
      * The function returns only measurements which match these specified categories
      */
    aCategories: js.Array[String]
    ): js.Array[Entry] = js.native
    def filterMeasurements(
      /**
      * a filter function that returns true if the passed measurement should be added to the result
      */
    fnFilter: Unit,
      /**
      * Optional parameter to determine if either completed or incomplete measurements should be returned (both
      * if not set or undefined)
      */
    bCompleted: Boolean
    ): js.Array[Entry] = js.native
    def filterMeasurements(
      /**
      * a filter function that returns true if the passed measurement should be added to the result
      */
    fnFilter: Unit,
      /**
      * Optional parameter to determine if either completed or incomplete measurements should be returned (both
      * if not set or undefined)
      */
    bCompleted: Boolean,
      /**
      * The function returns only measurements which match these specified categories
      */
    aCategories: js.Array[String]
    ): js.Array[Entry] = js.native
    def filterMeasurements(
      /**
      * a filter function that returns true if the passed measurement should be added to the result
      */
    fnFilter: Unit,
      /**
      * Optional parameter to determine if either completed or incomplete measurements should be returned (both
      * if not set or undefined)
      */
    bCompleted: Unit,
      /**
      * The function returns only measurements which match these specified categories
      */
    aCategories: js.Array[String]
    ): js.Array[Entry] = js.native
    
    /**
      * Gets the current state of the performance measurement functionality.
      *
      * @returns current state of the performance measurement functionality
      */
    def getActive(): Boolean = js.native
    
    /**
      * Gets all performance measurements.
      *
      * @returns current array with measurements containing id, info and start-timestamp, end-timestamp, time,
      * duration, categories
      */
    def getAllMeasurements(): Entry = js.native
    def getAllMeasurements(
      /**
      * Whether only completed measurements should be returned, if explicitly set to false only incomplete measurements
      * are returned
      */
    bCompleted: Boolean
    ): Entry = js.native
    
    /**
      * Gets a performance measure.
      *
      * @returns current measurement containing id, info and start-timestamp, end-timestamp, time, duration (false
      * if error)
      */
    def getMeasurement(/**
      * ID of the measurement
      */
    sId: String): Entry = js.native
    
    /**
      * Pauses a performance measure.
      *
      * @returns current measurement containing id, info and start-timestamp, pause-timestamp (false if error)
      */
    def pause(/**
      * ID of the measurement
      */
    sId: String): js.Object = js.native
    
    /**
      * Registers an average measurement for a given objects method.
      *
      * @returns true if the registration was successful
      */
    def registerMethod(
      /**
      * the id of the measurement
      */
    sId: String,
      /**
      * the object of the method
      */
    oObject: js.Object,
      /**
      * the name of the method
      */
    sMethod: String
    ): Boolean = js.native
    def registerMethod(
      /**
      * the id of the measurement
      */
    sId: String,
      /**
      * the object of the method
      */
    oObject: js.Object,
      /**
      * the name of the method
      */
    sMethod: String,
      /**
      * An optional categories list for the measurement
      */
    aCategories: js.Array[String]
    ): Boolean = js.native
    
    /**
      * Removes a performance measure.
      */
    def remove(/**
      * ID of the measurement
      */
    sId: String): Unit = js.native
    
    /**
      * Resumes a performance measure.
      *
      * @returns current measurement containing id, info and start-timestamp, resume-timestamp (false if error)
      */
    def resume(/**
      * ID of the measurement
      */
    sId: String): js.Object = js.native
    
    /**
      * Activates or deactivates the performance measure functionality.
      *
      * Optionally a category or list of categories can be passed to restrict measurements to certain categories
      * like "javascript", "require", "xmlhttprequest", "render"
      *
      * @returns current state of the performance measurement functionality
      */
    def setActive(
      /**
      * state of the performance measurement functionality to set
      */
    bOn: Boolean,
      /**
      * An optional list of categories that should be measured
      */
    aCategories: String
    ): Boolean = js.native
    def setActive(
      /**
      * state of the performance measurement functionality to set
      */
    bOn: Boolean,
      /**
      * An optional list of categories that should be measured
      */
    aCategories: js.Array[String]
    ): Boolean = js.native
    
    /**
      * Starts a performance measure.
      *
      * Optionally a category or list of categories can be passed to allow filtering of measurements.
      *
      * @returns current measurement containing id, info and start-timestamp (false if error)
      */
    def start(
      /**
      * ID of the measurement
      */
    sId: String,
      /**
      * Info for the measurement
      */
    sInfo: String
    ): js.Object = js.native
    def start(
      /**
      * ID of the measurement
      */
    sId: String,
      /**
      * Info for the measurement
      */
    sInfo: String,
      /**
      * An optional list of categories for the measure
      */
    aCategories: String
    ): js.Object = js.native
    def start(
      /**
      * ID of the measurement
      */
    sId: String,
      /**
      * Info for the measurement
      */
    sInfo: String,
      /**
      * An optional list of categories for the measure
      */
    aCategories: js.Array[String]
    ): js.Object = js.native
    
    /**
      * Unregisters all average measurements.
      */
    def unregisterAllMethods(): Unit = js.native
    
    /**
      * Unregisters an average measurement for a given objects method.
      *
      * @returns true if the unregistration was successful
      */
    def unregisterMethod(
      /**
      * the id of the measurement
      */
    sId: String,
      /**
      * the object of the method
      */
    oObject: js.Object,
      /**
      * the name of the method
      */
    sMethod: String
    ): Boolean = js.native
  }
  
  type _To = Measurement
  
  /* This means you don't have to write `default`, but can instead just say `sapUiPerformanceMeasurementMod.foo` */
  override def _to: Measurement = default
}
