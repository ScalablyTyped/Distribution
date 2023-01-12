package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FootpathElement
  extends StObject
     with BaseTileElement {
  
  var addition: Double | Null
  
  var additionStatus: Double | Null
  
  var corners: Double
  
  var edges: Double
  
  var isAdditionBroken: Boolean | Null
  
  var isAdditionGhost: Boolean | Null
  
  var isBlockedByVehicle: Boolean
  
  var isQueue: Boolean
  
  var isWide: Boolean
  
  var `object`: Double
  
  var queueBannerDirection: Double | Null
  
  var ride: Double | Null
  
  var slopeDirection: Double | Null
  
  var station: Double | Null
}
object FootpathElement {
  
  inline def apply(
    baseHeight: Double,
    baseZ: Double,
    clearanceHeight: Double,
    clearanceZ: Double,
    corners: Double,
    edges: Double,
    isBlockedByVehicle: Boolean,
    isGhost: Boolean,
    isHidden: Boolean,
    isQueue: Boolean,
    isWide: Boolean,
    `object`: Double,
    occupiedQuadrants: Double,
    `type`: TileElementType
  ): FootpathElement = {
    val __obj = js.Dynamic.literal(baseHeight = baseHeight.asInstanceOf[js.Any], baseZ = baseZ.asInstanceOf[js.Any], clearanceHeight = clearanceHeight.asInstanceOf[js.Any], clearanceZ = clearanceZ.asInstanceOf[js.Any], corners = corners.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], isBlockedByVehicle = isBlockedByVehicle.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isQueue = isQueue.asInstanceOf[js.Any], isWide = isWide.asInstanceOf[js.Any], occupiedQuadrants = occupiedQuadrants.asInstanceOf[js.Any], addition = null, additionStatus = null, isAdditionBroken = null, isAdditionGhost = null, queueBannerDirection = null, ride = null, slopeDirection = null, station = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootpathElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FootpathElement] (val x: Self) extends AnyVal {
    
    inline def setAddition(value: Double): Self = StObject.set(x, "addition", value.asInstanceOf[js.Any])
    
    inline def setAdditionNull: Self = StObject.set(x, "addition", null)
    
    inline def setAdditionStatus(value: Double): Self = StObject.set(x, "additionStatus", value.asInstanceOf[js.Any])
    
    inline def setAdditionStatusNull: Self = StObject.set(x, "additionStatus", null)
    
    inline def setCorners(value: Double): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
    
    inline def setEdges(value: Double): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setIsAdditionBroken(value: Boolean): Self = StObject.set(x, "isAdditionBroken", value.asInstanceOf[js.Any])
    
    inline def setIsAdditionBrokenNull: Self = StObject.set(x, "isAdditionBroken", null)
    
    inline def setIsAdditionGhost(value: Boolean): Self = StObject.set(x, "isAdditionGhost", value.asInstanceOf[js.Any])
    
    inline def setIsAdditionGhostNull: Self = StObject.set(x, "isAdditionGhost", null)
    
    inline def setIsBlockedByVehicle(value: Boolean): Self = StObject.set(x, "isBlockedByVehicle", value.asInstanceOf[js.Any])
    
    inline def setIsQueue(value: Boolean): Self = StObject.set(x, "isQueue", value.asInstanceOf[js.Any])
    
    inline def setIsWide(value: Boolean): Self = StObject.set(x, "isWide", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setQueueBannerDirection(value: Double): Self = StObject.set(x, "queueBannerDirection", value.asInstanceOf[js.Any])
    
    inline def setQueueBannerDirectionNull: Self = StObject.set(x, "queueBannerDirection", null)
    
    inline def setRide(value: Double): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
    
    inline def setRideNull: Self = StObject.set(x, "ride", null)
    
    inline def setSlopeDirection(value: Double): Self = StObject.set(x, "slopeDirection", value.asInstanceOf[js.Any])
    
    inline def setSlopeDirectionNull: Self = StObject.set(x, "slopeDirection", null)
    
    inline def setStation(value: Double): Self = StObject.set(x, "station", value.asInstanceOf[js.Any])
    
    inline def setStationNull: Self = StObject.set(x, "station", null)
  }
}
