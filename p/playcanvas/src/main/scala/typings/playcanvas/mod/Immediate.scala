package typings.playcanvas.mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Immediate extends StObject {
  
  var _materialDepth: BasicMaterial = js.native
  
  var _materialNoDepth: BasicMaterial = js.native
  
  var allBatches: Set[Any] = js.native
  
  var batchesMap: Map[Any, Any] = js.native
  
  def createMaterial(depthTest: Any): BasicMaterial = js.native
  
  var cubeLocalPos: Any = js.native
  
  var cubeWorldPos: Any = js.native
  
  var depthTextureShader: Any = js.native
  
  var device: Any = js.native
  
  def drawMesh(material: Any, matrix: Any, mesh: Any, meshInstance: Any, layer: Any): Unit = js.native
  
  def drawWireAlignedBox(min: Any, max: Any, color: Any, depthTest: Any, layer: Any): Unit = js.native
  
  def drawWireSphere(center: Any, radius: Any, color: Any, numSegments: Any, depthTest: Any, layer: Any): Unit = js.native
  
  def getBatch(layer: Any, depthTest: Any): Any = js.native
  
  def getDepthTextureShader(): Any = js.native
  
  def getGraphNode(matrix: Any): GraphNode = js.native
  
  def getQuadMesh(): Mesh = js.native
  
  def getShader(id: Any, fragment: Any): Any = js.native
  
  def getTextureShader(): Any = js.native
  
  def getUnfilterableTextureShader(): Any = js.native
  
  var layerMeshInstances: Map[Any, Any] = js.native
  
  def materialDepth: BasicMaterial = js.native
  
  def materialNoDepth: BasicMaterial = js.native
  
  def onPostRender(): Unit = js.native
  
  def onPreRenderLayer(layer: Any, visibleList: Any, transparent: Any): Unit = js.native
  
  var quadMesh: Mesh = js.native
  
  var textureShader: Any = js.native
  
  var updatedLayers: Set[Any] = js.native
}
