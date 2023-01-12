package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the object definition of a ride or stall.
  */
trait RideObject
  extends StObject
     with Object {
  
  /**
    * A text description describing the capacity of the ride in the player's current language.
    */
  val capacity: String
  
  val carsPerFlatRide: Double
  
  val defaultVehicle: Double
  
  /**
    * The description of the ride / stall in the player's current language.
    */
  val description: String
  
  val excitementMultiplier: Double
  
  val flags: Double
  
  val frontVehicle: Double
  
  val intensityMultiplier: Double
  
  val maxCarsInTrain: Double
  
  val maxHeight: Double
  
  val minCarsInTrain: Double
  
  val nauseaMultiplier: Double
  
  val rearVehicle: Double
  
  val rideType: js.Array[Double]
  
  val secondVehicle: Double
  
  val shopItem: Double
  
  val shopItemSecondary: Double
  
  val tabVehicle: Double
  
  val thirdVehicle: Double
  
  val vehicles: js.Array[RideObjectVehicle]
  
  val zeroCars: Double
}
object RideObject {
  
  inline def apply(
    capacity: String,
    carsPerFlatRide: Double,
    defaultVehicle: Double,
    description: String,
    excitementMultiplier: Double,
    flags: Double,
    frontVehicle: Double,
    identifier: String,
    index: Double,
    intensityMultiplier: Double,
    legacyIdentifier: String,
    maxCarsInTrain: Double,
    maxHeight: Double,
    minCarsInTrain: Double,
    name: String,
    nauseaMultiplier: Double,
    rearVehicle: Double,
    rideType: js.Array[Double],
    secondVehicle: Double,
    shopItem: Double,
    shopItemSecondary: Double,
    tabVehicle: Double,
    thirdVehicle: Double,
    `type`: ObjectType,
    vehicles: js.Array[RideObjectVehicle],
    zeroCars: Double
  ): RideObject = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], carsPerFlatRide = carsPerFlatRide.asInstanceOf[js.Any], defaultVehicle = defaultVehicle.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], excitementMultiplier = excitementMultiplier.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], frontVehicle = frontVehicle.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], intensityMultiplier = intensityMultiplier.asInstanceOf[js.Any], legacyIdentifier = legacyIdentifier.asInstanceOf[js.Any], maxCarsInTrain = maxCarsInTrain.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minCarsInTrain = minCarsInTrain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nauseaMultiplier = nauseaMultiplier.asInstanceOf[js.Any], rearVehicle = rearVehicle.asInstanceOf[js.Any], rideType = rideType.asInstanceOf[js.Any], secondVehicle = secondVehicle.asInstanceOf[js.Any], shopItem = shopItem.asInstanceOf[js.Any], shopItemSecondary = shopItemSecondary.asInstanceOf[js.Any], tabVehicle = tabVehicle.asInstanceOf[js.Any], thirdVehicle = thirdVehicle.asInstanceOf[js.Any], vehicles = vehicles.asInstanceOf[js.Any], zeroCars = zeroCars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RideObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RideObject] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: String): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCarsPerFlatRide(value: Double): Self = StObject.set(x, "carsPerFlatRide", value.asInstanceOf[js.Any])
    
    inline def setDefaultVehicle(value: Double): Self = StObject.set(x, "defaultVehicle", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExcitementMultiplier(value: Double): Self = StObject.set(x, "excitementMultiplier", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFrontVehicle(value: Double): Self = StObject.set(x, "frontVehicle", value.asInstanceOf[js.Any])
    
    inline def setIntensityMultiplier(value: Double): Self = StObject.set(x, "intensityMultiplier", value.asInstanceOf[js.Any])
    
    inline def setMaxCarsInTrain(value: Double): Self = StObject.set(x, "maxCarsInTrain", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMinCarsInTrain(value: Double): Self = StObject.set(x, "minCarsInTrain", value.asInstanceOf[js.Any])
    
    inline def setNauseaMultiplier(value: Double): Self = StObject.set(x, "nauseaMultiplier", value.asInstanceOf[js.Any])
    
    inline def setRearVehicle(value: Double): Self = StObject.set(x, "rearVehicle", value.asInstanceOf[js.Any])
    
    inline def setRideType(value: js.Array[Double]): Self = StObject.set(x, "rideType", value.asInstanceOf[js.Any])
    
    inline def setRideTypeVarargs(value: Double*): Self = StObject.set(x, "rideType", js.Array(value*))
    
    inline def setSecondVehicle(value: Double): Self = StObject.set(x, "secondVehicle", value.asInstanceOf[js.Any])
    
    inline def setShopItem(value: Double): Self = StObject.set(x, "shopItem", value.asInstanceOf[js.Any])
    
    inline def setShopItemSecondary(value: Double): Self = StObject.set(x, "shopItemSecondary", value.asInstanceOf[js.Any])
    
    inline def setTabVehicle(value: Double): Self = StObject.set(x, "tabVehicle", value.asInstanceOf[js.Any])
    
    inline def setThirdVehicle(value: Double): Self = StObject.set(x, "thirdVehicle", value.asInstanceOf[js.Any])
    
    inline def setVehicles(value: js.Array[RideObjectVehicle]): Self = StObject.set(x, "vehicles", value.asInstanceOf[js.Any])
    
    inline def setVehiclesVarargs(value: RideObjectVehicle*): Self = StObject.set(x, "vehicles", js.Array(value*))
    
    inline def setZeroCars(value: Double): Self = StObject.set(x, "zeroCars", value.asInstanceOf[js.Any])
  }
}
