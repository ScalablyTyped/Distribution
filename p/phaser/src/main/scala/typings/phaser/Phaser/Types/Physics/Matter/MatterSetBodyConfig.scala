package typings.phaser.Phaser.Types.Physics.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatterSetBodyConfig extends StObject {
  
  /**
    * Should the new body be automatically added to the world?
    */
  var addToWorld: js.UndefOr[Boolean] = js.native
  
  /**
    * Used by the `fromVerts` shape. Flag internal edges (coincident part edges)
    */
  var flagInternal: js.UndefOr[Boolean] = js.native
  
  /**
    * The height of the body.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The max sizes of the body. Used by the `circle` shape.
    */
  var maxSides: js.UndefOr[Double] = js.native
  
  /**
    * Used by the `fromVerts` shape. During decomposition discard parts that have an area less than this.
    */
  var minimumArea: js.UndefOr[Double] = js.native
  
  /**
    * The radius of the body. Used by `circle` and `polygon` shapes.
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * Used by the `fromVerts` shape. Whether Matter.js will discard collinear edges (to improve performance).
    */
  var removeCollinear: js.UndefOr[Double] = js.native
  
  /**
    * Used by the `polygon` shape. The number of sides the polygon will have.
    */
  var sides: js.UndefOr[Double] = js.native
  
  /**
    * Used by the `trapezoid` shape. The slope of the trapezoid. 0 creates a rectangle, while 1 creates a triangle. Positive values make the top side shorter, while negative values make the bottom side shorter.
    */
  var slope: js.UndefOr[Double] = js.native
  
  /**
    * The shape type. Either `rectangle`, `circle`, `trapezoid`, `polygon`, `fromVertices`, `fromVerts` or `fromPhysicsEditor`.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Used by the `fromVerts` shape. The vertices data. Either a path string or an array of vertices.
    */
  var verts: js.UndefOr[String | js.Array[_]] = js.native
  
  /**
    * The width of the body.
    */
  var width: js.UndefOr[Double] = js.native
  
  /**
    * The horizontal world position to place the body at.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * The vertical world position to place the body at.
    */
  var y: js.UndefOr[Double] = js.native
}
object MatterSetBodyConfig {
  
  @scala.inline
  def apply(): MatterSetBodyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterSetBodyConfig]
  }
  
  @scala.inline
  implicit class MatterSetBodyConfigMutableBuilder[Self <: MatterSetBodyConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddToWorld(value: Boolean): Self = StObject.set(x, "addToWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToWorldUndefined: Self = StObject.set(x, "addToWorld", js.undefined)
    
    @scala.inline
    def setFlagInternal(value: Boolean): Self = StObject.set(x, "flagInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagInternalUndefined: Self = StObject.set(x, "flagInternal", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMaxSides(value: Double): Self = StObject.set(x, "maxSides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSidesUndefined: Self = StObject.set(x, "maxSides", js.undefined)
    
    @scala.inline
    def setMinimumArea(value: Double): Self = StObject.set(x, "minimumArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumAreaUndefined: Self = StObject.set(x, "minimumArea", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRemoveCollinear(value: Double): Self = StObject.set(x, "removeCollinear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveCollinearUndefined: Self = StObject.set(x, "removeCollinear", js.undefined)
    
    @scala.inline
    def setSides(value: Double): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
    
    @scala.inline
    def setSlope(value: Double): Self = StObject.set(x, "slope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlopeUndefined: Self = StObject.set(x, "slope", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVerts(value: String | js.Array[_]): Self = StObject.set(x, "verts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertsUndefined: Self = StObject.set(x, "verts", js.undefined)
    
    @scala.inline
    def setVertsVarargs(value: js.Any*): Self = StObject.set(x, "verts", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
