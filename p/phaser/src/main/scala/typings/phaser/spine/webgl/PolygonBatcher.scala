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
  
  /* private */ var context: js.Any
  
  def draw(texture: GLTexture, vertices: ArrayLike[Double], indices: js.Array[Double]): Unit
  
  /* private */ var drawCalls: js.Any
  
  /* private */ var dstBlend: js.Any
  
  def end(): Unit
  
  /* private */ var flush: js.Any
  
  def getDrawCalls(): Double
  
  /* private */ var indicesLength: js.Any
  
  /* private */ var isDrawing: js.Any
  
  /* private */ var lastTexture: js.Any
  
  /* private */ var mesh: js.Any
  
  def setBlendMode(srcBlend: Double, dstBlend: Double): Unit
  
  /* private */ var shader: js.Any
  
  /* private */ var srcBlend: js.Any
  
  /* private */ var verticesLength: js.Any
}
object PolygonBatcher {
  
  inline def apply(
    begin: Shader => Unit,
    context: js.Any,
    dispose: () => Unit,
    draw: (GLTexture, ArrayLike[Double], js.Array[Double]) => Unit,
    drawCalls: js.Any,
    dstBlend: js.Any,
    end: () => Unit,
    flush: js.Any,
    getDrawCalls: () => Double,
    indicesLength: js.Any,
    isDrawing: js.Any,
    lastTexture: js.Any,
    mesh: js.Any,
    setBlendMode: (Double, Double) => Unit,
    shader: js.Any,
    srcBlend: js.Any,
    verticesLength: js.Any
  ): PolygonBatcher = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1(begin), context = context.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), draw = js.Any.fromFunction3(draw), drawCalls = drawCalls.asInstanceOf[js.Any], dstBlend = dstBlend.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), flush = flush.asInstanceOf[js.Any], getDrawCalls = js.Any.fromFunction0(getDrawCalls), indicesLength = indicesLength.asInstanceOf[js.Any], isDrawing = isDrawing.asInstanceOf[js.Any], lastTexture = lastTexture.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], setBlendMode = js.Any.fromFunction2(setBlendMode), shader = shader.asInstanceOf[js.Any], srcBlend = srcBlend.asInstanceOf[js.Any], verticesLength = verticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonBatcher]
  }
  
  extension [Self <: PolygonBatcher](x: Self) {
    
    inline def setBegin(value: Shader => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
    
    inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: (GLTexture, ArrayLike[Double], js.Array[Double]) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction3(value))
    
    inline def setDrawCalls(value: js.Any): Self = StObject.set(x, "drawCalls", value.asInstanceOf[js.Any])
    
    inline def setDstBlend(value: js.Any): Self = StObject.set(x, "dstBlend", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setFlush(value: js.Any): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setGetDrawCalls(value: () => Double): Self = StObject.set(x, "getDrawCalls", js.Any.fromFunction0(value))
    
    inline def setIndicesLength(value: js.Any): Self = StObject.set(x, "indicesLength", value.asInstanceOf[js.Any])
    
    inline def setIsDrawing(value: js.Any): Self = StObject.set(x, "isDrawing", value.asInstanceOf[js.Any])
    
    inline def setLastTexture(value: js.Any): Self = StObject.set(x, "lastTexture", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: js.Any): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setSetBlendMode(value: (Double, Double) => Unit): Self = StObject.set(x, "setBlendMode", js.Any.fromFunction2(value))
    
    inline def setShader(value: js.Any): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    inline def setSrcBlend(value: js.Any): Self = StObject.set(x, "srcBlend", value.asInstanceOf[js.Any])
    
    inline def setVerticesLength(value: js.Any): Self = StObject.set(x, "verticesLength", value.asInstanceOf[js.Any])
  }
}
