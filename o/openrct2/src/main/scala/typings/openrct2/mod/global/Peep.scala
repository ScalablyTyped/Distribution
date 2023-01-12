package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a guest or staff member.
  */
trait Peep
  extends StObject
     with Entity {
  
  /**
    * The peep's direct destination.
    */
  var destination: CoordsXY
  
  /**
    * How tired the guest is between 32 and 128 where lower is more tired.
    */
  var energy: Double
  
  /**
    * The target energy value. Energy will increase / decrease slowly towards this value.
    */
  var energyTarget: Double
  
  /**
    * Gets whether a given flag is set or not.
    * @param key The flag to test.
    */
  def getFlag(key: PeepFlags): Boolean
  
  /**
    * Name of the peep.
    */
  var name: String
  
  /**
    * Whether the peep is a guest or staff member.
    */
  var peepType: PeepType
  
  /**
    * Sets the given flag to the given value.
    * @param key The flag to set.
    * @param value Whether to set or clear the flag.
    */
  def setFlag(key: PeepFlags, value: Boolean): Unit
}
object Peep {
  
  inline def apply(
    destination: CoordsXY,
    energy: Double,
    energyTarget: Double,
    getFlag: PeepFlags => Boolean,
    id: Double,
    name: String,
    peepType: PeepType,
    remove: () => Unit,
    setFlag: (PeepFlags, Boolean) => Unit,
    `type`: EntityType,
    x: Double,
    y: Double,
    z: Double
  ): Peep = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyTarget = energyTarget.asInstanceOf[js.Any], getFlag = js.Any.fromFunction1(getFlag), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], peepType = peepType.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), setFlag = js.Any.fromFunction2(setFlag), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Peep] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: CoordsXY): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setEnergyTarget(value: Double): Self = StObject.set(x, "energyTarget", value.asInstanceOf[js.Any])
    
    inline def setGetFlag(value: PeepFlags => Boolean): Self = StObject.set(x, "getFlag", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeepType(value: PeepType): Self = StObject.set(x, "peepType", value.asInstanceOf[js.Any])
    
    inline def setSetFlag(value: (PeepFlags, Boolean) => Unit): Self = StObject.set(x, "setFlag", js.Any.fromFunction2(value))
  }
}
