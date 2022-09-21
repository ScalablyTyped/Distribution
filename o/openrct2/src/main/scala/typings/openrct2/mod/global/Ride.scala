package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a ride or stall within the park.
  */
trait Ride extends StObject {
  
  /**
    * How old the ride is in months.
    */
  val age: Double
  
  /**
    * The date in months when the ride was built.
    * Subtract this from `date.monthsElapsed` to get the age.
    */
  var buildDate: Double
  
  /**
    * Whether the ride is a ride, shop or facility.
    */
  val classification: RideClassification
  
  /**
    * The track colour schemes for the ride.
    */
  var colourSchemes: js.Array[TrackColour]
  
  /**
    * Flags related to how trains depart.
    */
  var departFlags: Double
  
  /**
    * The excitement metric of the ride represented as a 2 decimal point fixed integer.
    * For example, `652` equates to `6.52`.
    */
  var excitement: Double
  
  /**
    * The unique ID / index of the ride.
    */
  val id: Double
  
  /**
    * How often the ride should be inspected by a mechanic.
    */
  var inspectionInterval: Double
  
  /**
    * The intensity metric of the ride represented as a 2 decimal point fixed integer.
    * For example, `652` equates to `6.52`.
    */
  var intensity: Double
  
  /**
    * Various flags related to the operation of the ride.
    */
  var lifecycleFlags: Double
  
  /**
    * The maximum time a train will wait at the station before departing.
    */
  var maximumWaitingTime: Double
  
  /**
    * The minimum time a train will wait at the station before departing.
    */
  var minimumWaitingTime: Double
  
  /**
    * The operation mode.
    */
  var mode: Double
  
  /**
    * The music track to play at each station.
    */
  var music: Double
  
  /**
    * The generated or custom name of the ride.
    */
  var name: String
  
  /**
    * The nausea metric of the ride represented as a 2 decimal point fixed integer.
    * For example, `652` equates to `6.52`.
    */
  var nausea: Double
  
  /**
    * The object metadata for this ride.
    */
  val `object`: RideObject
  
  /**
    * The admission price for the ride and the price of the on-ride photo, or the cost of each item of the stall.
    */
  var price: js.Array[Double]
  
  /**
    * The running cost of the ride billed every fortnight. Multiply this by 16 to get the cost per hour (~ 1 year).
    */
  var runningCost: Double
  
  /**
    * The style used for the station, entrance, and exit building.
    */
  var stationStyle: Double
  
  /**
    * Information about each station.
    */
  val stations: js.Array[RideStation]
  
  /**
    * Whether the ride is open, closed or testing.
    */
  val status: RideStatus
  
  /**
    * The total number of customers the ride has served since it was built.
    */
  var totalCustomers: Double
  
  /**
    * The total profit of the ride over the course of its lifetime.
    */
  var totalProfit: Double
  
  /**
    * The type of the ride represented as the internal built-in ride type ID.
    */
  var `type`: Double
  
  /**
    * The value of the ride.
    */
  var value: Double
  
  /**
    * The colour for each vehicle when the ride opens. Modifying this directly will not
    * change the colour of any currently running trains nor will it reflect them if they
    * have been modified.
    */
  var vehicleColours: js.Array[VehicleColour]
  
  /**
    * The head vehicle IDs associated with the ride, one for each train.
    */
  val vehicles: js.Array[Double]
}
object Ride {
  
  inline def apply(
    age: Double,
    buildDate: Double,
    classification: RideClassification,
    colourSchemes: js.Array[TrackColour],
    departFlags: Double,
    excitement: Double,
    id: Double,
    inspectionInterval: Double,
    intensity: Double,
    lifecycleFlags: Double,
    maximumWaitingTime: Double,
    minimumWaitingTime: Double,
    mode: Double,
    music: Double,
    name: String,
    nausea: Double,
    `object`: RideObject,
    price: js.Array[Double],
    runningCost: Double,
    stationStyle: Double,
    stations: js.Array[RideStation],
    status: RideStatus,
    totalCustomers: Double,
    totalProfit: Double,
    `type`: Double,
    value: Double,
    vehicleColours: js.Array[VehicleColour],
    vehicles: js.Array[Double]
  ): Ride = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], buildDate = buildDate.asInstanceOf[js.Any], classification = classification.asInstanceOf[js.Any], colourSchemes = colourSchemes.asInstanceOf[js.Any], departFlags = departFlags.asInstanceOf[js.Any], excitement = excitement.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inspectionInterval = inspectionInterval.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any], lifecycleFlags = lifecycleFlags.asInstanceOf[js.Any], maximumWaitingTime = maximumWaitingTime.asInstanceOf[js.Any], minimumWaitingTime = minimumWaitingTime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], music = music.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nausea = nausea.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], runningCost = runningCost.asInstanceOf[js.Any], stationStyle = stationStyle.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], totalCustomers = totalCustomers.asInstanceOf[js.Any], totalProfit = totalProfit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], vehicleColours = vehicleColours.asInstanceOf[js.Any], vehicles = vehicles.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ride]
  }
  
  extension [Self <: Ride](x: Self) {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setBuildDate(value: Double): Self = StObject.set(x, "buildDate", value.asInstanceOf[js.Any])
    
    inline def setClassification(value: RideClassification): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setColourSchemes(value: js.Array[TrackColour]): Self = StObject.set(x, "colourSchemes", value.asInstanceOf[js.Any])
    
    inline def setColourSchemesVarargs(value: TrackColour*): Self = StObject.set(x, "colourSchemes", js.Array(value*))
    
    inline def setDepartFlags(value: Double): Self = StObject.set(x, "departFlags", value.asInstanceOf[js.Any])
    
    inline def setExcitement(value: Double): Self = StObject.set(x, "excitement", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInspectionInterval(value: Double): Self = StObject.set(x, "inspectionInterval", value.asInstanceOf[js.Any])
    
    inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    inline def setLifecycleFlags(value: Double): Self = StObject.set(x, "lifecycleFlags", value.asInstanceOf[js.Any])
    
    inline def setMaximumWaitingTime(value: Double): Self = StObject.set(x, "maximumWaitingTime", value.asInstanceOf[js.Any])
    
    inline def setMinimumWaitingTime(value: Double): Self = StObject.set(x, "minimumWaitingTime", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMusic(value: Double): Self = StObject.set(x, "music", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNausea(value: Double): Self = StObject.set(x, "nausea", value.asInstanceOf[js.Any])
    
    inline def setObject(value: RideObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: js.Array[Double]): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceVarargs(value: Double*): Self = StObject.set(x, "price", js.Array(value*))
    
    inline def setRunningCost(value: Double): Self = StObject.set(x, "runningCost", value.asInstanceOf[js.Any])
    
    inline def setStationStyle(value: Double): Self = StObject.set(x, "stationStyle", value.asInstanceOf[js.Any])
    
    inline def setStations(value: js.Array[RideStation]): Self = StObject.set(x, "stations", value.asInstanceOf[js.Any])
    
    inline def setStationsVarargs(value: RideStation*): Self = StObject.set(x, "stations", js.Array(value*))
    
    inline def setStatus(value: RideStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTotalCustomers(value: Double): Self = StObject.set(x, "totalCustomers", value.asInstanceOf[js.Any])
    
    inline def setTotalProfit(value: Double): Self = StObject.set(x, "totalProfit", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setVehicleColours(value: js.Array[VehicleColour]): Self = StObject.set(x, "vehicleColours", value.asInstanceOf[js.Any])
    
    inline def setVehicleColoursVarargs(value: VehicleColour*): Self = StObject.set(x, "vehicleColours", js.Array(value*))
    
    inline def setVehicles(value: js.Array[Double]): Self = StObject.set(x, "vehicles", value.asInstanceOf[js.Any])
    
    inline def setVehiclesVarargs(value: Double*): Self = StObject.set(x, "vehicles", js.Array(value*))
  }
}
