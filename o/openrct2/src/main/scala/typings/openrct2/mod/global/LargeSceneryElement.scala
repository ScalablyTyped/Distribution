package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargeSceneryElement
  extends StObject
     with BaseTileElement {
  
  var bannerIndex: Double | Null
  
  var direction: Direction
  
  var `object`: Double
  
  var primaryColour: Double
  
  var secondaryColour: Double
  
  var sequence: Double
}
object LargeSceneryElement {
  
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
    sequence: Double,
    `type`: TileElementType
  ): LargeSceneryElement = {
    val __obj = js.Dynamic.literal(baseHeight = baseHeight.asInstanceOf[js.Any], baseZ = baseZ.asInstanceOf[js.Any], clearanceHeight = clearanceHeight.asInstanceOf[js.Any], clearanceZ = clearanceZ.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], occupiedQuadrants = occupiedQuadrants.asInstanceOf[js.Any], primaryColour = primaryColour.asInstanceOf[js.Any], secondaryColour = secondaryColour.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], bannerIndex = null)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargeSceneryElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LargeSceneryElement] (val x: Self) extends AnyVal {
    
    inline def setBannerIndex(value: Double): Self = StObject.set(x, "bannerIndex", value.asInstanceOf[js.Any])
    
    inline def setBannerIndexNull: Self = StObject.set(x, "bannerIndex", null)
    
    inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPrimaryColour(value: Double): Self = StObject.set(x, "primaryColour", value.asInstanceOf[js.Any])
    
    inline def setSecondaryColour(value: Double): Self = StObject.set(x, "secondaryColour", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
  }
}
