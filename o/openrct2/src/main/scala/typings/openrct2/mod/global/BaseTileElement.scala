package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseTileElement extends StObject {
  
  var baseHeight: Double
  
  var baseZ: Double
  
  var clearanceHeight: Double
  
  var clearanceZ: Double
  
  var isGhost: Boolean
  
  var isHidden: Boolean
  
  var occupiedQuadrants: Double
  
  var `type`: TileElementType
}
object BaseTileElement {
  
  inline def apply(
    baseHeight: Double,
    baseZ: Double,
    clearanceHeight: Double,
    clearanceZ: Double,
    isGhost: Boolean,
    isHidden: Boolean,
    occupiedQuadrants: Double,
    `type`: TileElementType
  ): BaseTileElement = {
    val __obj = js.Dynamic.literal(baseHeight = baseHeight.asInstanceOf[js.Any], baseZ = baseZ.asInstanceOf[js.Any], clearanceHeight = clearanceHeight.asInstanceOf[js.Any], clearanceZ = clearanceZ.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], occupiedQuadrants = occupiedQuadrants.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseTileElement]
  }
  
  extension [Self <: BaseTileElement](x: Self) {
    
    inline def setBaseHeight(value: Double): Self = StObject.set(x, "baseHeight", value.asInstanceOf[js.Any])
    
    inline def setBaseZ(value: Double): Self = StObject.set(x, "baseZ", value.asInstanceOf[js.Any])
    
    inline def setClearanceHeight(value: Double): Self = StObject.set(x, "clearanceHeight", value.asInstanceOf[js.Any])
    
    inline def setClearanceZ(value: Double): Self = StObject.set(x, "clearanceZ", value.asInstanceOf[js.Any])
    
    inline def setIsGhost(value: Boolean): Self = StObject.set(x, "isGhost", value.asInstanceOf[js.Any])
    
    inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    inline def setOccupiedQuadrants(value: Double): Self = StObject.set(x, "occupiedQuadrants", value.asInstanceOf[js.Any])
    
    inline def setType(value: TileElementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
