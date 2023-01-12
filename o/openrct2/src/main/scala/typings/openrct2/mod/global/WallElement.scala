package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WallElement
  extends StObject
     with BaseTileElement {
  
  var bannerIndex: Double | Null
  
  var direction: Direction
  
  var `object`: Double
  
  var primaryColour: Double
  
  var secondaryColour: Double
  
  var slope: Direction
  
  var tertiaryColour: Double
}
object WallElement {
  
  inline def apply(
    baseHeight: Double,
    baseZ: Double,
    clearanceHeight: Double,
    clearanceZ: Double,
    direction: Direction,
    isGhost: Boolean,
    isHidden: Boolean,
    `object`: Double,
    occupiedQuadrants: Double,
    primaryColour: Double,
    secondaryColour: Double,
    slope: Direction,
    tertiaryColour: Double,
    `type`: TileElementType
  ): WallElement = {
    val __obj = js.Dynamic.literal(baseHeight = baseHeight.asInstanceOf[js.Any], baseZ = baseZ.asInstanceOf[js.Any], clearanceHeight = clearanceHeight.asInstanceOf[js.Any], clearanceZ = clearanceZ.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], occupiedQuadrants = occupiedQuadrants.asInstanceOf[js.Any], primaryColour = primaryColour.asInstanceOf[js.Any], secondaryColour = secondaryColour.asInstanceOf[js.Any], slope = slope.asInstanceOf[js.Any], tertiaryColour = tertiaryColour.asInstanceOf[js.Any], bannerIndex = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WallElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WallElement] (val x: Self) extends AnyVal {
    
    inline def setBannerIndex(value: Double): Self = StObject.set(x, "bannerIndex", value.asInstanceOf[js.Any])
    
    inline def setBannerIndexNull: Self = StObject.set(x, "bannerIndex", null)
    
    inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPrimaryColour(value: Double): Self = StObject.set(x, "primaryColour", value.asInstanceOf[js.Any])
    
    inline def setSecondaryColour(value: Double): Self = StObject.set(x, "secondaryColour", value.asInstanceOf[js.Any])
    
    inline def setSlope(value: Direction): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
    
    inline def setTertiaryColour(value: Double): Self = StObject.set(x, "tertiaryColour", value.asInstanceOf[js.Any])
  }
}
