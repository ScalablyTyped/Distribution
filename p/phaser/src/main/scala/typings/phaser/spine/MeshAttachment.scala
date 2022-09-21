package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshAttachment
  extends StObject
     with VertexAttachment {
  
  var color: Color
  
  var edges: js.Array[Double]
  
  def getParentMesh(): MeshAttachment
  
  var height: Double
  
  var hullLength: Double
  
  def newLinkedMesh(): MeshAttachment
  
  /* private */ var parentMesh: Any
  
  var path: String
  
  var region: TextureRegion
  
  var regionUVs: ArrayLike[Double]
  
  def setParentMesh(parentMesh: MeshAttachment): Unit
  
  var tempColor: Color
  
  var triangles: js.Array[Double]
  
  def updateUVs(): Unit
  
  var uvs: ArrayLike[Double]
  
  var width: Double
}
object MeshAttachment {
  
  inline def apply(
    bones: js.Array[Double],
    color: Color,
    computeWorldVertices: (Slot, Double, Double, ArrayLike[Double], Double, Double) => Unit,
    copy: () => Attachment,
    copyTo: VertexAttachment => Unit,
    deformAttachment: VertexAttachment,
    edges: js.Array[Double],
    getParentMesh: () => MeshAttachment,
    height: Double,
    hullLength: Double,
    id: Double,
    name: String,
    newLinkedMesh: () => MeshAttachment,
    parentMesh: Any,
    path: String,
    region: TextureRegion,
    regionUVs: ArrayLike[Double],
    setParentMesh: MeshAttachment => Unit,
    tempColor: Color,
    triangles: js.Array[Double],
    updateUVs: () => Unit,
    uvs: ArrayLike[Double],
    vertices: ArrayLike[Double],
    width: Double,
    worldVerticesLength: Double
  ): MeshAttachment = {
    val __obj = js.Dynamic.literal(bones = bones.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], computeWorldVertices = js.Any.fromFunction6(computeWorldVertices), copy = js.Any.fromFunction0(copy), copyTo = js.Any.fromFunction1(copyTo), deformAttachment = deformAttachment.asInstanceOf[js.Any], edges = edges.asInstanceOf[js.Any], getParentMesh = js.Any.fromFunction0(getParentMesh), height = height.asInstanceOf[js.Any], hullLength = hullLength.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newLinkedMesh = js.Any.fromFunction0(newLinkedMesh), parentMesh = parentMesh.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], regionUVs = regionUVs.asInstanceOf[js.Any], setParentMesh = js.Any.fromFunction1(setParentMesh), tempColor = tempColor.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], updateUVs = js.Any.fromFunction0(updateUVs), uvs = uvs.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], worldVerticesLength = worldVerticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshAttachment]
  }
  
  extension [Self <: MeshAttachment](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEdges(value: js.Array[Double]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesVarargs(value: Double*): Self = StObject.set(x, "edges", js.Array(value*))
    
    inline def setGetParentMesh(value: () => MeshAttachment): Self = StObject.set(x, "getParentMesh", js.Any.fromFunction0(value))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHullLength(value: Double): Self = StObject.set(x, "hullLength", value.asInstanceOf[js.Any])
    
    inline def setNewLinkedMesh(value: () => MeshAttachment): Self = StObject.set(x, "newLinkedMesh", js.Any.fromFunction0(value))
    
    inline def setParentMesh(value: Any): Self = StObject.set(x, "parentMesh", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: TextureRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUVs(value: ArrayLike[Double]): Self = StObject.set(x, "regionUVs", value.asInstanceOf[js.Any])
    
    inline def setSetParentMesh(value: MeshAttachment => Unit): Self = StObject.set(x, "setParentMesh", js.Any.fromFunction1(value))
    
    inline def setTempColor(value: Color): Self = StObject.set(x, "tempColor", value.asInstanceOf[js.Any])
    
    inline def setTriangles(value: js.Array[Double]): Self = StObject.set(x, "triangles", value.asInstanceOf[js.Any])
    
    inline def setTrianglesVarargs(value: Double*): Self = StObject.set(x, "triangles", js.Array(value*))
    
    inline def setUpdateUVs(value: () => Unit): Self = StObject.set(x, "updateUVs", js.Any.fromFunction0(value))
    
    inline def setUvs(value: ArrayLike[Double]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
