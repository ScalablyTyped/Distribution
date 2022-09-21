package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPathConstraint extends StObject {
  
  var curves: js.Array[Double]
  
  var data: IPathConstraintData
  
  var lengths: js.Array[Double]
  
  var position: Double
  
  var positions: js.Array[Double]
  
  var segments: js.Array[Double]
  
  var spaces: js.Array[Double]
  
  var spacing: Double
  
  var world: js.Array[Double]
}
object IPathConstraint {
  
  inline def apply(
    curves: js.Array[Double],
    data: IPathConstraintData,
    lengths: js.Array[Double],
    position: Double,
    positions: js.Array[Double],
    segments: js.Array[Double],
    spaces: js.Array[Double],
    spacing: Double,
    world: js.Array[Double]
  ): IPathConstraint = {
    val __obj = js.Dynamic.literal(curves = curves.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathConstraint]
  }
  
  extension [Self <: IPathConstraint](x: Self) {
    
    inline def setCurves(value: js.Array[Double]): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
    
    inline def setCurvesVarargs(value: Double*): Self = StObject.set(x, "curves", js.Array(value*))
    
    inline def setData(value: IPathConstraintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
    
    inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value*))
    
    inline def setSegments(value: js.Array[Double]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: Double*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setSpaces(value: js.Array[Double]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesVarargs(value: Double*): Self = StObject.set(x, "spaces", js.Array(value*))
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setWorld(value: js.Array[Double]): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    inline def setWorldVarargs(value: Double*): Self = StObject.set(x, "world", js.Array(value*))
  }
}
