package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  /** The vertices present in the polyline. */
  var vertexOffsets: js.UndefOr[Vertex2DList] = js.undefined
  
  /**
    * The z-order of the line. Lines with a lower z-order should be rendered beneath lines with a higher z-order. This z-ordering does not imply anything about the altitude of the area
    * relative to the ground, but it can be used to prevent z-fighting during rendering on the client. In general, larger and more important road features will have a higher z-order line
    * associated with them. This z-ordering can only be used to compare lines, and cannot be compared with the z_order field in the Area message. The z-order may be negative or zero.
    */
  var zOrder: js.UndefOr[Double] = js.undefined
}
object Line {
  
  @scala.inline
  def apply(): Line = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVertexOffsets(value: Vertex2DList): Self = StObject.set(x, "vertexOffsets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexOffsetsUndefined: Self = StObject.set(x, "vertexOffsets", js.undefined)
    
    @scala.inline
    def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
  }
}
