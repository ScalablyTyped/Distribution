package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single car on a ride. A train is made up of multiple cars, but
  * something like boat hire will be one car per boat.
  */
trait Car
  extends StObject
     with Entity {
  
  /**
    * How much the car's velocity changes per tick.
    */
  var acceleration: Double
  
  /**
    * The current tilt of the car in the X/Y axis.
    */
  var bankRotation: Double
  
  /**
    * The colour of the car.
    */
  var colours: VehicleColour
  
  /**
    * The current station the train is in or departing.
    */
  var currentStation: Double
  
  /**
    * How heavy the car is. This is the sum of the mass of the empty car and the
    * mass of each guest that is riding it.
    */
  var mass: Double
  
  /**
    * The next car on the ride. This may be the on the same train or the next
    * train. This will point to the first car if this is the last car on the ride.
    */
  var nextCarOnRide: Double
  
  /**
    * The next car on the same train. If this is the last or only car on the train,
    * this will return null.
    */
  var nextCarOnTrain: Double | Null
  
  /**
    * How many seats the car has, i.e. the capacity.
    */
  var numSeats: Double
  
  /**
    * List of peep IDs ordered by seat.
    */
  var peeps: js.Array[Double | Null]
  
  /**
    * The acceleration for vehicles with constant power, e.g.
    * transport rides and boats.
    */
  var poweredAcceleration: Double
  
  /**
    * The maximum speed for vehicles with constant power, e.g.
    * transport rides and boats.
    */
  var poweredMaxSpeed: Double
  
  /**
    * The previous car on the ride. This may be the on the same train or the previous
    * train. This will point to the last car if this is the first car on the ride.
    */
  var previousCarOnRide: Double
  
  /**
    * The currently projected remaining distance the car will travel.
    */
  val remainingDistance: Double
  
  /**
    * The ride this car belongs to.
    */
  var ride: Double
  
  /**
    * The ride object for this car, e.g. the ladybird trains object.
    */
  var rideObject: Double
  
  var spriteType: Double
  
  /**
    * Current status of the car or train.
    */
  var status: VehicleStatus
  
  /**
    * The location and direction of where the car is on the track.
    */
  var trackLocation: CoordsXYZD
  
  /**
    * The progress on the current track piece, in steps.
    */
  val trackProgress: Double
  
  /**
    * Moves the vehicle forward or backwards along the track, relative to its current
    * position. A single visible step is about 8.000 to 14.000 in distance depending
    * on the direction its moving in.
    */
  def travelBy(distance: Double): Unit
  
  /**
    * The vehicle type for the ride object used. This is a local index
    * into the ride object list of vehicle types.
    */
  var vehicleObject: Double
  
  /**
    * How fast the car is moving.
    */
  var velocity: Double
}
object Car {
  
  inline def apply(
    acceleration: Double,
    bankRotation: Double,
    colours: VehicleColour,
    currentStation: Double,
    id: Double,
    mass: Double,
    nextCarOnRide: Double,
    numSeats: Double,
    peeps: js.Array[Double | Null],
    poweredAcceleration: Double,
    poweredMaxSpeed: Double,
    previousCarOnRide: Double,
    remainingDistance: Double,
    remove: () => Unit,
    ride: Double,
    rideObject: Double,
    spriteType: Double,
    status: VehicleStatus,
    trackLocation: CoordsXYZD,
    trackProgress: Double,
    travelBy: Double => Unit,
    `type`: EntityType,
    vehicleObject: Double,
    velocity: Double,
    x: Double,
    y: Double,
    z: Double
  ): Car = {
    val __obj = js.Dynamic.literal(acceleration = acceleration.asInstanceOf[js.Any], bankRotation = bankRotation.asInstanceOf[js.Any], colours = colours.asInstanceOf[js.Any], currentStation = currentStation.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any], nextCarOnRide = nextCarOnRide.asInstanceOf[js.Any], numSeats = numSeats.asInstanceOf[js.Any], peeps = peeps.asInstanceOf[js.Any], poweredAcceleration = poweredAcceleration.asInstanceOf[js.Any], poweredMaxSpeed = poweredMaxSpeed.asInstanceOf[js.Any], previousCarOnRide = previousCarOnRide.asInstanceOf[js.Any], remainingDistance = remainingDistance.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), ride = ride.asInstanceOf[js.Any], rideObject = rideObject.asInstanceOf[js.Any], spriteType = spriteType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trackLocation = trackLocation.asInstanceOf[js.Any], trackProgress = trackProgress.asInstanceOf[js.Any], travelBy = js.Any.fromFunction1(travelBy), vehicleObject = vehicleObject.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], nextCarOnTrain = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Car]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Car] (val x: Self) extends AnyVal {
    
    inline def setAcceleration(value: Double): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
    
    inline def setBankRotation(value: Double): Self = StObject.set(x, "bankRotation", value.asInstanceOf[js.Any])
    
    inline def setColours(value: VehicleColour): Self = StObject.set(x, "colours", value.asInstanceOf[js.Any])
    
    inline def setCurrentStation(value: Double): Self = StObject.set(x, "currentStation", value.asInstanceOf[js.Any])
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setNextCarOnRide(value: Double): Self = StObject.set(x, "nextCarOnRide", value.asInstanceOf[js.Any])
    
    inline def setNextCarOnTrain(value: Double): Self = StObject.set(x, "nextCarOnTrain", value.asInstanceOf[js.Any])
    
    inline def setNextCarOnTrainNull: Self = StObject.set(x, "nextCarOnTrain", null)
    
    inline def setNumSeats(value: Double): Self = StObject.set(x, "numSeats", value.asInstanceOf[js.Any])
    
    inline def setPeeps(value: js.Array[Double | Null]): Self = StObject.set(x, "peeps", value.asInstanceOf[js.Any])
    
    inline def setPeepsVarargs(value: (Double | Null)*): Self = StObject.set(x, "peeps", js.Array(value*))
    
    inline def setPoweredAcceleration(value: Double): Self = StObject.set(x, "poweredAcceleration", value.asInstanceOf[js.Any])
    
    inline def setPoweredMaxSpeed(value: Double): Self = StObject.set(x, "poweredMaxSpeed", value.asInstanceOf[js.Any])
    
    inline def setPreviousCarOnRide(value: Double): Self = StObject.set(x, "previousCarOnRide", value.asInstanceOf[js.Any])
    
    inline def setRemainingDistance(value: Double): Self = StObject.set(x, "remainingDistance", value.asInstanceOf[js.Any])
    
    inline def setRide(value: Double): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
    
    inline def setRideObject(value: Double): Self = StObject.set(x, "rideObject", value.asInstanceOf[js.Any])
    
    inline def setSpriteType(value: Double): Self = StObject.set(x, "spriteType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: VehicleStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTrackLocation(value: CoordsXYZD): Self = StObject.set(x, "trackLocation", value.asInstanceOf[js.Any])
    
    inline def setTrackProgress(value: Double): Self = StObject.set(x, "trackProgress", value.asInstanceOf[js.Any])
    
    inline def setTravelBy(value: Double => Unit): Self = StObject.set(x, "travelBy", js.Any.fromFunction1(value))
    
    inline def setVehicleObject(value: Double): Self = StObject.set(x, "vehicleObject", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Double): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
