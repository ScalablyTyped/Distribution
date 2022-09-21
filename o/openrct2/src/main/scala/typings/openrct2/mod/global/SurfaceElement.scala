package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurfaceElement
  extends StObject
     with BaseTileElement {
  
  var edgeStyle: Double
  
  var grassLength: Double
  
  val hasConstructionRights: Boolean
  
  val hasOwnership: Boolean
  
  var ownership: Double
  
  var parkFences: Double
  
  var slope: Double
  
  var surfaceStyle: Double
  
  var waterHeight: Double
}
object SurfaceElement {
  
  inline def apply(
    baseHeight: Double,
    baseZ: Double,
    clearanceHeight: Double,
    clearanceZ: Double,
    edgeStyle: Double,
    grassLength: Double,
    hasConstructionRights: Boolean,
    hasOwnership: Boolean,
    isGhost: Boolean,
    isHidden: Boolean,
    occupiedQuadrants: Double,
    ownership: Double,
    parkFences: Double,
    slope: Double,
    surfaceStyle: Double,
    `type`: TileElementType,
    waterHeight: Double
  ): SurfaceElement = {
    val __obj = js.Dynamic.literal(baseHeight = baseHeight.asInstanceOf[js.Any], baseZ = baseZ.asInstanceOf[js.Any], clearanceHeight = clearanceHeight.asInstanceOf[js.Any], clearanceZ = clearanceZ.asInstanceOf[js.Any], edgeStyle = edgeStyle.asInstanceOf[js.Any], grassLength = grassLength.asInstanceOf[js.Any], hasConstructionRights = hasConstructionRights.asInstanceOf[js.Any], hasOwnership = hasOwnership.asInstanceOf[js.Any], isGhost = isGhost.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], occupiedQuadrants = occupiedQuadrants.asInstanceOf[js.Any], ownership = ownership.asInstanceOf[js.Any], parkFences = parkFences.asInstanceOf[js.Any], slope = slope.asInstanceOf[js.Any], surfaceStyle = surfaceStyle.asInstanceOf[js.Any], waterHeight = waterHeight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurfaceElement]
  }
  
  extension [Self <: SurfaceElement](x: Self) {
    
    inline def setEdgeStyle(value: Double): Self = StObject.set(x, "edgeStyle", value.asInstanceOf[js.Any])
    
    inline def setGrassLength(value: Double): Self = StObject.set(x, "grassLength", value.asInstanceOf[js.Any])
    
    inline def setHasConstructionRights(value: Boolean): Self = StObject.set(x, "hasConstructionRights", value.asInstanceOf[js.Any])
    
    inline def setHasOwnership(value: Boolean): Self = StObject.set(x, "hasOwnership", value.asInstanceOf[js.Any])
    
    inline def setOwnership(value: Double): Self = StObject.set(x, "ownership", value.asInstanceOf[js.Any])
    
    inline def setParkFences(value: Double): Self = StObject.set(x, "parkFences", value.asInstanceOf[js.Any])
    
    inline def setSlope(value: Double): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
    
    inline def setSurfaceStyle(value: Double): Self = StObject.set(x, "surfaceStyle", value.asInstanceOf[js.Any])
    
    inline def setWaterHeight(value: Double): Self = StObject.set(x, "waterHeight", value.asInstanceOf[js.Any])
  }
}
