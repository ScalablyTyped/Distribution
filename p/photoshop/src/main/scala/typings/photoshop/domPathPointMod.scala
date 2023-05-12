package typings.photoshop

import typings.photoshop.domConstantsMod.PointKind
import typings.photoshop.domSubPathItemMod.SubPathItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPathPointMod {
  
  @JSImport("photoshop/dom/PathPoint", "PathPoint")
  @js.native
  open class PathPoint protected () extends StObject {
    /**
      * @ignore
      */
    def this(index: Double, subPathIndex: Double, pathId: Double, docId: Double) = this()
    
    /**
      * The coordinates of the anchor point of the curve, in `[horizontal, vertical]` format.
      * @minVersion 23.3
      */
    def anchor: js.Array[Double] = js.native
    
    /**
      * The role (corner or smooth) this point plays in the containing path segment.
      * @minVersion 23.3
      */
    def kind: PointKind = js.native
    
    /**
      * The location of the left-direction endpoint ('in' position), in `[horizontal, vertical]` format.
      * @minVersion 23.3
      */
    def leftDirection: js.Array[Double] = js.native
    
    /**
      * The containing SubPath object.
      * @minVersion 23.3
      */
    def parent: SubPathItem = js.native
    
    /**
      * The location of the right-direction endpoint ('out' position), in `[horizontal, vertical]` format.
      * @minVersion 23.3
      */
    def rightDirection: js.Array[Double] = js.native
    
    /**
      * The class name of the referenced object: *"PathPoint"*.
      * @minVersion 23.3
      */
    def typename: typings.photoshop.photoshopStrings.PathPoint = js.native
  }
}
