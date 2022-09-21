package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackElement
  extends StObject
     with BaseTileElement {
  
  var brakeBoosterSpeed: Double | Null
  
  var colourScheme: Double | Null
  
  var direction: Direction
  
  var hasCableLift: Boolean
  
  var hasChainLift: Boolean
  
  var isInverted: Boolean
  
  var mazeEntry: Double | Null
  
  var ride: Double
  
  var seatRotation: Double | Null
  
  var sequence: Double | Null
  
  var station: Double | Null
  
  var trackType: Double
}
object TrackElement {
  
  inline def apply(
    baseHeight: Double,
    baseZ: Double,
    clearanceHeight: Double,
    clearanceZ: Double,
    direction: Direction,
    hasCableLift: Boolean,
    hasChainLift: Boolean,
    isGhost: Boolean,
    isHidden: Boolean,
    isInverted: Boolean,
    occupiedQuadrants: Double,
    ride: Double,
    trackType: Double,
    `type`: TileElementType
  ): TrackElement = {
    val __obj = js.Dynamic.literal(baseHeight = baseHeight.asInstanceOf[js.Any], baseZ = baseZ.asInstanceOf[js.Any], clearanceHeight = clearanceHeight.asInstanceOf[js.Any], clearanceZ = clearanceZ.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], hasCableLift = hasCableLift.asInstanceOf[js.Any], hasChainLift = hasChainLift.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], occupiedQuadrants = occupiedQuadrants.asInstanceOf[js.Any], ride = ride.asInstanceOf[js.Any], trackType = trackType.asInstanceOf[js.Any], brakeBoosterSpeed = null, colourScheme = null, mazeEntry = null, seatRotation = null, sequence = null, station = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackElement]
  }
  
  extension [Self <: TrackElement](x: Self) {
    
    inline def setBrakeBoosterSpeed(value: Double): Self = StObject.set(x, "brakeBoosterSpeed", value.asInstanceOf[js.Any])
    
    inline def setBrakeBoosterSpeedNull: Self = StObject.set(x, "brakeBoosterSpeed", null)
    
    inline def setColourScheme(value: Double): Self = StObject.set(x, "colourScheme", value.asInstanceOf[js.Any])
    
    inline def setColourSchemeNull: Self = StObject.set(x, "colourScheme", null)
    
    inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setHasCableLift(value: Boolean): Self = StObject.set(x, "hasCableLift", value.asInstanceOf[js.Any])
    
    inline def setHasChainLift(value: Boolean): Self = StObject.set(x, "hasChainLift", value.asInstanceOf[js.Any])
    
    inline def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
    
    inline def setMazeEntry(value: Double): Self = StObject.set(x, "mazeEntry", value.asInstanceOf[js.Any])
    
    inline def setMazeEntryNull: Self = StObject.set(x, "mazeEntry", null)
    
    inline def setRide(value: Double): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
    
    inline def setSeatRotation(value: Double): Self = StObject.set(x, "seatRotation", value.asInstanceOf[js.Any])
    
    inline def setSeatRotationNull: Self = StObject.set(x, "seatRotation", null)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceNull: Self = StObject.set(x, "sequence", null)
    
    inline def setStation(value: Double): Self = StObject.set(x, "station", value.asInstanceOf[js.Any])
    
    inline def setStationNull: Self = StObject.set(x, "station", null)
    
    inline def setTrackType(value: Double): Self = StObject.set(x, "trackType", value.asInstanceOf[js.Any])
  }
}
