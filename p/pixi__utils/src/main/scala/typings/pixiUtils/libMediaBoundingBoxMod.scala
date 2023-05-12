package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaBoundingBoxMod {
  
  @JSImport("@pixi/utils/lib/media/BoundingBox", "BoundingBox")
  @js.native
  open class BoundingBox protected () extends StObject {
    /**
      * @param left - The left coordinate value of the bounding box.
      * @param top - The top coordinate value of the bounding box.
      * @param right - The right coordinate value of the bounding box.
      * @param bottom - The bottom coordinate value of the bounding box.
      */
    def this(left: Double, top: Double, right: Double, bottom: Double) = this()
    
    /** The bottom coordinate value of the bounding box. */
    var bottom: Double = js.native
    
    /** The height of the bounding box. */
    def height: Double = js.native
    
    /** Determines whether the BoundingBox is empty. */
    def isEmpty(): Boolean = js.native
    
    /** The left coordinate value of the bounding box. */
    var left: Double = js.native
    
    /** The right coordinate value of the bounding box. */
    var right: Double = js.native
    
    /** The top coordinate value of the bounding box. */
    var top: Double = js.native
    
    /** The width of the bounding box. */
    def width: Double = js.native
  }
  /* static members */
  object BoundingBox {
    
    /**
      * An empty BoundingBox.
      * @type {PIXI.utils.BoundingBox}
      */
    @JSImport("@pixi/utils/lib/media/BoundingBox", "BoundingBox.EMPTY")
    @js.native
    val EMPTY: BoundingBox = js.native
  }
}
