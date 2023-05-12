package typings.photoshop

import typings.photoshop.domConstantsMod.PointKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domObjectsPathPointInfoMod {
  
  @JSImport("photoshop/dom/objects/PathPointInfo", "PathPointInfo")
  @js.native
  /** @ignore */
  open class PathPointInfo () extends StObject {
    
    /* private */ var _anchor: Any = js.native
    
    /* private */ var _kind: Any = js.native
    
    /* private */ var _leftDirection: Any = js.native
    
    /* private */ var _rightDirection: Any = js.native
    
    /**
      * The X and Y coordinates of the anchor point of the curve.
      * @minVersion 23.3
      */
    def anchor: js.Array[Double] = js.native
    def anchor_=(coordinates: js.Array[Double]): Unit = js.native
    
    /**
      * The role (corner or smooth) this point plays in the containing path segment.
      * @minVersion 23.3
      */
    def kind: PointKind = js.native
    def kind_=(role: PointKind): Unit = js.native
    
    /**
      * The location of the left-direction endpoint('in' position).
      * @minVersion 23.3
      */
    def leftDirection: js.Array[Double] = js.native
    def leftDirection_=(location: js.Array[Double]): Unit = js.native
    
    /**
      * The location of the right-direction endpoint('out' position).
      * @minVersion 23.3
      */
    def rightDirection: js.Array[Double] = js.native
    def rightDirection_=(location: js.Array[Double]): Unit = js.native
    
    /**
      * The class name of the referenced object: *"PathPointInfo"*.
      * @minVersion 23.3
      */
    def typename: typings.photoshop.photoshopStrings.PathPointInfo = js.native
  }
}
