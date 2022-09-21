package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a guest.
  */
trait Guest
  extends StObject
     with Peep {
  
  /**
    * Colour of the guest's balloon.
    */
  var balloonColour: Double
  
  /**
    * Amount of cash in the guest's pocket.
    */
  var cash: Double
  
  /**
    * How happy the guest is between 0 and 255.
    */
  var happiness: Double
  
  /**
    * The target happiness value. Happiness will increase / decrease slowly towards this value.
    */
  var happinessTarget: Double
  
  /**
    * Colour of the guest's hat.
    */
  var hatColour: Double
  
  /**
    * How hungry the guest is between 0 and 255. Lower is more hungry.
    */
  var hunger: Double
  
  /**
    * The mass of the guest. Affects vehicle mass.
    */
  var mass: Double
  
  /**
    * The guest's maximum preferred intensity between 0 and 15.
    */
  var maxIntensity: Double
  
  /**
    * The guest's minimum preferred intensity between 0 and 15.
    */
  var minIntensity: Double
  
  /**
    * How nauseated the guest is between 0 and 255.
    */
  var nausea: Double
  
  /**
    * The target nausea value. Nausea will increase / decrease slowly towards this value.
    */
  var nauseaTarget: Double
  
  /**
    * The guest's tolerance to nauseating rides between 0 and 3.
    */
  var nauseaTolerance: Double
  
  /**
    * How thirsty the guest is between 0 and 255. Lower is more thirsty.
    */
  var thirst: Double
  
  /**
    * How much the guest requires the need to go to the toilet between 0 and 255.
    */
  var toilet: Double
  
  /**
    * Colour of the guest's trousers.
    */
  var trousersColour: Double
  
  /**
    * Colour of the guest's t-shirt.
    */
  var tshirtColour: Double
  
  /**
    * Colour of the guest's umbrella.
    */
  var umbrellaColour: Double
}
object Guest {
  
  inline def apply(
    balloonColour: Double,
    cash: Double,
    destination: CoordsXY,
    energy: Double,
    energyTarget: Double,
    getFlag: PeepFlags => Boolean,
    happiness: Double,
    happinessTarget: Double,
    hatColour: Double,
    hunger: Double,
    id: Double,
    mass: Double,
    maxIntensity: Double,
    minIntensity: Double,
    name: String,
    nausea: Double,
    nauseaTarget: Double,
    nauseaTolerance: Double,
    peepType: PeepType,
    remove: () => Unit,
    setFlag: (PeepFlags, Boolean) => Unit,
    thirst: Double,
    toilet: Double,
    trousersColour: Double,
    tshirtColour: Double,
    `type`: EntityType,
    umbrellaColour: Double,
    x: Double,
    y: Double,
    z: Double
  ): Guest = {
    val __obj = js.Dynamic.literal(balloonColour = balloonColour.asInstanceOf[js.Any], cash = cash.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyTarget = energyTarget.asInstanceOf[js.Any], getFlag = js.Any.fromFunction1(getFlag), happiness = happiness.asInstanceOf[js.Any], happinessTarget = happinessTarget.asInstanceOf[js.Any], hatColour = hatColour.asInstanceOf[js.Any], hunger = hunger.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mass = mass.asInstanceOf[js.Any], maxIntensity = maxIntensity.asInstanceOf[js.Any], minIntensity = minIntensity.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nausea = nausea.asInstanceOf[js.Any], nauseaTarget = nauseaTarget.asInstanceOf[js.Any], nauseaTolerance = nauseaTolerance.asInstanceOf[js.Any], peepType = peepType.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), setFlag = js.Any.fromFunction2(setFlag), thirst = thirst.asInstanceOf[js.Any], toilet = toilet.asInstanceOf[js.Any], trousersColour = trousersColour.asInstanceOf[js.Any], tshirtColour = tshirtColour.asInstanceOf[js.Any], umbrellaColour = umbrellaColour.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guest]
  }
  
  extension [Self <: Guest](x: Self) {
    
    inline def setBalloonColour(value: Double): Self = StObject.set(x, "balloonColour", value.asInstanceOf[js.Any])
    
    inline def setCash(value: Double): Self = StObject.set(x, "cash", value.asInstanceOf[js.Any])
    
    inline def setHappiness(value: Double): Self = StObject.set(x, "happiness", value.asInstanceOf[js.Any])
    
    inline def setHappinessTarget(value: Double): Self = StObject.set(x, "happinessTarget", value.asInstanceOf[js.Any])
    
    inline def setHatColour(value: Double): Self = StObject.set(x, "hatColour", value.asInstanceOf[js.Any])
    
    inline def setHunger(value: Double): Self = StObject.set(x, "hunger", value.asInstanceOf[js.Any])
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMaxIntensity(value: Double): Self = StObject.set(x, "maxIntensity", value.asInstanceOf[js.Any])
    
    inline def setMinIntensity(value: Double): Self = StObject.set(x, "minIntensity", value.asInstanceOf[js.Any])
    
    inline def setNausea(value: Double): Self = StObject.set(x, "nausea", value.asInstanceOf[js.Any])
    
    inline def setNauseaTarget(value: Double): Self = StObject.set(x, "nauseaTarget", value.asInstanceOf[js.Any])
    
    inline def setNauseaTolerance(value: Double): Self = StObject.set(x, "nauseaTolerance", value.asInstanceOf[js.Any])
    
    inline def setThirst(value: Double): Self = StObject.set(x, "thirst", value.asInstanceOf[js.Any])
    
    inline def setToilet(value: Double): Self = StObject.set(x, "toilet", value.asInstanceOf[js.Any])
    
    inline def setTrousersColour(value: Double): Self = StObject.set(x, "trousersColour", value.asInstanceOf[js.Any])
    
    inline def setTshirtColour(value: Double): Self = StObject.set(x, "tshirtColour", value.asInstanceOf[js.Any])
    
    inline def setUmbrellaColour(value: Double): Self = StObject.set(x, "umbrellaColour", value.asInstanceOf[js.Any])
  }
}
