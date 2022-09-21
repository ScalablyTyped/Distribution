package typings.phaser.spine.webgl

import typings.phaser.spine.Disposable
import typings.phaser.spine.Restorable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mesh
  extends StObject
     with Disposable
     with Restorable {
  
  /* private */ var attributes: Any
  
  def bind(shader: Shader): Unit
  
  /* private */ var context: Any
  
  /* private */ var dirtyIndices: Any
  
  /* private */ var dirtyVertices: Any
  
  def draw(shader: Shader, primitiveType: Double): Unit
  
  def drawWithOffset(shader: Shader, primitiveType: Double, offset: Double, count: Double): Unit
  
  /* private */ var elementsPerVertex: Any
  
  def getAttributes(): js.Array[VertexAttribute]
  
  def getIndices(): js.typedarray.Uint16Array
  
  def getVertexSizeInFloats(): Double
  
  def getVertices(): js.typedarray.Float32Array
  
  /* private */ var indices: Any
  
  /* private */ var indicesBuffer: Any
  
  /* private */ var indicesLength: Any
  
  def maxIndices(): Double
  
  def maxVertices(): Double
  
  def numIndices(): Double
  
  def numVertices(): Double
  
  def setIndices(indices: js.Array[Double]): Unit
  
  def setIndicesLength(length: Double): Unit
  
  def setVertices(vertices: js.Array[Double]): Unit
  
  def setVerticesLength(length: Double): Unit
  
  def unbind(shader: Shader): Unit
  
  /* private */ var update: Any
  
  /* private */ var vertices: Any
  
  /* private */ var verticesBuffer: Any
  
  /* private */ var verticesLength: Any
}
object Mesh {
  
  inline def apply(
    attributes: Any,
    bind: Shader => Unit,
    context: Any,
    dirtyIndices: Any,
    dirtyVertices: Any,
    dispose: () => Unit,
    draw: (Shader, Double) => Unit,
    drawWithOffset: (Shader, Double, Double, Double) => Unit,
    elementsPerVertex: Any,
    getAttributes: () => js.Array[VertexAttribute],
    getIndices: () => js.typedarray.Uint16Array,
    getVertexSizeInFloats: () => Double,
    getVertices: () => js.typedarray.Float32Array,
    indices: Any,
    indicesBuffer: Any,
    indicesLength: Any,
    maxIndices: () => Double,
    maxVertices: () => Double,
    numIndices: () => Double,
    numVertices: () => Double,
    restore: () => Unit,
    setIndices: js.Array[Double] => Unit,
    setIndicesLength: Double => Unit,
    setVertices: js.Array[Double] => Unit,
    setVerticesLength: Double => Unit,
    unbind: Shader => Unit,
    update: Any,
    vertices: Any,
    verticesBuffer: Any,
    verticesLength: Any
  ): Mesh = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), context = context.asInstanceOf[js.Any], dirtyIndices = dirtyIndices.asInstanceOf[js.Any], dirtyVertices = dirtyVertices.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction2(draw), drawWithOffset = js.Any.fromFunction4(drawWithOffset), elementsPerVertex = elementsPerVertex.asInstanceOf[js.Any], getAttributes = js.Any.fromFunction0(getAttributes), getIndices = js.Any.fromFunction0(getIndices), getVertexSizeInFloats = js.Any.fromFunction0(getVertexSizeInFloats), getVertices = js.Any.fromFunction0(getVertices), indices = indices.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], indicesLength = indicesLength.asInstanceOf[js.Any], maxIndices = js.Any.fromFunction0(maxIndices), maxVertices = js.Any.fromFunction0(maxVertices), numIndices = js.Any.fromFunction0(numIndices), numVertices = js.Any.fromFunction0(numVertices), restore = js.Any.fromFunction0(restore), setIndices = js.Any.fromFunction1(setIndices), setIndicesLength = js.Any.fromFunction1(setIndicesLength), setVertices = js.Any.fromFunction1(setVertices), setVerticesLength = js.Any.fromFunction1(setVerticesLength), unbind = js.Any.fromFunction1(unbind), update = update.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesLength = verticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
  
  extension [Self <: Mesh](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setBind(value: Shader => Unit): Self = StObject.set(x, "bind", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDirtyIndices(value: Any): Self = StObject.set(x, "dirtyIndices", value.asInstanceOf[js.Any])
    
    inline def setDirtyVertices(value: Any): Self = StObject.set(x, "dirtyVertices", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: (Shader, Double) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction2(value))
    
    inline def setDrawWithOffset(value: (Shader, Double, Double, Double) => Unit): Self = StObject.set(x, "drawWithOffset", js.Any.fromFunction4(value))
    
    inline def setElementsPerVertex(value: Any): Self = StObject.set(x, "elementsPerVertex", value.asInstanceOf[js.Any])
    
    inline def setGetAttributes(value: () => js.Array[VertexAttribute]): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
    
    inline def setGetIndices(value: () => js.typedarray.Uint16Array): Self = StObject.set(x, "getIndices", js.Any.fromFunction0(value))
    
    inline def setGetVertexSizeInFloats(value: () => Double): Self = StObject.set(x, "getVertexSizeInFloats", js.Any.fromFunction0(value))
    
    inline def setGetVertices(value: () => js.typedarray.Float32Array): Self = StObject.set(x, "getVertices", js.Any.fromFunction0(value))
    
    inline def setIndices(value: Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesBuffer(value: Any): Self = StObject.set(x, "indicesBuffer", value.asInstanceOf[js.Any])
    
    inline def setIndicesLength(value: Any): Self = StObject.set(x, "indicesLength", value.asInstanceOf[js.Any])
    
    inline def setMaxIndices(value: () => Double): Self = StObject.set(x, "maxIndices", js.Any.fromFunction0(value))
    
    inline def setMaxVertices(value: () => Double): Self = StObject.set(x, "maxVertices", js.Any.fromFunction0(value))
    
    inline def setNumIndices(value: () => Double): Self = StObject.set(x, "numIndices", js.Any.fromFunction0(value))
    
    inline def setNumVertices(value: () => Double): Self = StObject.set(x, "numVertices", js.Any.fromFunction0(value))
    
    inline def setSetIndices(value: js.Array[Double] => Unit): Self = StObject.set(x, "setIndices", js.Any.fromFunction1(value))
    
    inline def setSetIndicesLength(value: Double => Unit): Self = StObject.set(x, "setIndicesLength", js.Any.fromFunction1(value))
    
    inline def setSetVertices(value: js.Array[Double] => Unit): Self = StObject.set(x, "setVertices", js.Any.fromFunction1(value))
    
    inline def setSetVerticesLength(value: Double => Unit): Self = StObject.set(x, "setVerticesLength", js.Any.fromFunction1(value))
    
    inline def setUnbind(value: Shader => Unit): Self = StObject.set(x, "unbind", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: Any): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: Any): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesBuffer(value: Any): Self = StObject.set(x, "verticesBuffer", value.asInstanceOf[js.Any])
    
    inline def setVerticesLength(value: Any): Self = StObject.set(x, "verticesLength", value.asInstanceOf[js.Any])
  }
}
