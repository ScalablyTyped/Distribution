package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonBatcher
  extends StObject
     with Disposable {
  
  def begin(shader: Shader): Unit
  
  /* private */ var context: Any
  
  def draw(texture: GLTexture, vertices: ArrayLike[Double], indices: js.Array[Double]): Unit
  
  /* private */ var drawCalls: Any
  
  /* private */ var dstBlend: Any
  
  def end(): Unit
  
  /* private */ var flush: Any
  
  def getDrawCalls(): Double
  
  /* private */ var indicesLength: Any
  
  /* private */ var isDrawing: Any
  
  /* private */ var lastTexture: Any
  
  /* private */ var mesh: Any
  
  def setBlendMode(srcBlend: Double, dstBlend: Double): Unit
  
  /* private */ var shader: Any
  
  /* private */ var srcBlend: Any
  
  /* private */ var verticesLength: Any
}
object PolygonBatcher {
  
  inline def apply(
    begin: Shader => Unit,
    context: Any,
    dispose: () => Unit,
    draw: (GLTexture, ArrayLike[Double], js.Array[Double]) => Unit,
    drawCalls: Any,
    dstBlend: Any,
    end: () => Unit,
    flush: Any,
    getDrawCalls: () => Double,
    indicesLength: Any,
    isDrawing: Any,
    lastTexture: Any,
    mesh: Any,
    setBlendMode: (Double, Double) => Unit,
    shader: Any,
    srcBlend: Any,
    verticesLength: Any
  ): PolygonBatcher = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), context = context.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction3(draw), drawCalls = drawCalls.asInstanceOf[js.Any], dstBlend = dstBlend.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), flush = flush.asInstanceOf[js.Any], getDrawCalls = js.Any.fromFunction0(getDrawCalls), indicesLength = indicesLength.asInstanceOf[js.Any], isDrawing = isDrawing.asInstanceOf[js.Any], lastTexture = lastTexture.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], setBlendMode = js.Any.fromFunction2(setBlendMode), shader = shader.asInstanceOf[js.Any], srcBlend = srcBlend.asInstanceOf[js.Any], verticesLength = verticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonBatcher]
  }
  
  extension [Self <: PolygonBatcher](x: Self) {
    
    inline def setBegin(value: Shader => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: (GLTexture, ArrayLike[Double], js.Array[Double]) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction3(value))
    
    inline def setDrawCalls(value: Any): Self = StObject.set(x, "drawCalls", value.asInstanceOf[js.Any])
    
    inline def setDstBlend(value: Any): Self = StObject.set(x, "dstBlend", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setFlush(value: Any): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setGetDrawCalls(value: () => Double): Self = StObject.set(x, "getDrawCalls", js.Any.fromFunction0(value))
    
    inline def setIndicesLength(value: Any): Self = StObject.set(x, "indicesLength", value.asInstanceOf[js.Any])
    
    inline def setIsDrawing(value: Any): Self = StObject.set(x, "isDrawing", value.asInstanceOf[js.Any])
    
    inline def setLastTexture(value: Any): Self = StObject.set(x, "lastTexture", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: Any): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setSetBlendMode(value: (Double, Double) => Unit): Self = StObject.set(x, "setBlendMode", js.Any.fromFunction2(value))
    
    inline def setShader(value: Any): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    inline def setSrcBlend(value: Any): Self = StObject.set(x, "srcBlend", value.asInstanceOf[js.Any])
    
    inline def setVerticesLength(value: Any): Self = StObject.set(x, "verticesLength", value.asInstanceOf[js.Any])
  }
}
