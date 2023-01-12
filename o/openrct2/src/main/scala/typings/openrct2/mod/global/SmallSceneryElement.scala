package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmallSceneryElement
  extends StObject
     with BaseTileElement {
  
  var age: Double
  
  var direction: Direction
  
  var `object`: Double
  
  var primaryColour: Double
  
  var quadrant: Double
  
  var secondaryColour: Double
}
object SmallSceneryElement {
  
  inline def apply(
    age: Double,
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
    quadrant: Double,
    secondaryColour: Double,
    `type`: TileElementType
  ): SmallSceneryElement = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], baseHeight = baseHeight.asInstanceOf[js.Any], baseZ = baseZ.asInstanceOf[js.Any], clearanceHeight = clearanceHeight.asInstanceOf[js.Any], clearanceZ = clearanceZ.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], occupiedQuadrants = occupiedQuadrants.asInstanceOf[js.Any], primaryColour = primaryColour.asInstanceOf[js.Any], quadrant = quadrant.asInstanceOf[js.Any], secondaryColour = secondaryColour.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmallSceneryElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SmallSceneryElement] (val x: Self) extends AnyVal {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Double): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPrimaryColour(value: Double): Self = StObject.set(x, "primaryColour", value.asInstanceOf[js.Any])
    
    inline def setQuadrant(value: Double): Self = StObject.set(x, "quadrant", value.asInstanceOf[js.Any])
    
    inline def setSecondaryColour(value: Double): Self = StObject.set(x, "secondaryColour", value.asInstanceOf[js.Any])
  }
}
