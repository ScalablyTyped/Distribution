package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntranceElement
  extends StObject
     with BaseTileElement {
  
  var direction: Direction
  
  var footpathObject: Double
  
  var `object`: Double
  
  var ride: Double
  
  var sequence: Double
  
  var station: Double
}
object EntranceElement {
  
  inline def apply(
    baseHeight: Double,
    baseZ: Double,
    clearanceHeight: Double,
    clearanceZ: Double,
    direction: Direction,
    footpathObject: Double,
    isGhost: Boolean,
    isHidden: Boolean,
    `object`: Double,
    occupiedQuadrants: Double,
    ride: Double,
    sequence: Double,
    station: Double,
    `type`: TileElementType
  ): EntranceElement = {
    val __obj = js.Dynamic.literal(baseHeight = baseHeight.asInstanceOf[js.Any], baseZ = baseZ.asInstanceOf[js.Any], clearanceHeight = clearanceHeight.asInstanceOf[js.Any], clearanceZ = clearanceZ.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], footpathObject = footpathObject.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], occupiedQuadrants = occupiedQuadrants.asInstanceOf[js.Any], ride = ride.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], station = station.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntranceElement]
  }
  
  extension [Self <: EntranceElement](x: Self) {
    
    inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFootpathObject(value: Double): Self = StObject.set(x, "footpathObject", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setRide(value: Double): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setStation(value: Double): Self = StObject.set(x, "station", value.asInstanceOf[js.Any])
  }
}
