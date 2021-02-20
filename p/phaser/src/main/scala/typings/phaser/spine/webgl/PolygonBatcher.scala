package typings.phaser.spine.webgl

import typings.phaser.spine.ArrayLike
import typings.phaser.spine.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonBatcher extends Disposable {
  
  def begin(shader: Shader): Unit = js.native
  
  var context: js.Any = js.native
  
  def draw(texture: GLTexture, vertices: ArrayLike[Double], indices: js.Array[Double]): Unit = js.native
  
  var drawCalls: js.Any = js.native
  
  var dstBlend: js.Any = js.native
  
  def end(): Unit = js.native
  
  var flush: js.Any = js.native
  
  def getDrawCalls(): Double = js.native
  
  var indicesLength: js.Any = js.native
  
  var isDrawing: js.Any = js.native
  
  var lastTexture: js.Any = js.native
  
  var mesh: js.Any = js.native
  
  def setBlendMode(srcBlend: Double, dstBlend: Double): Unit = js.native
  
  var shader: js.Any = js.native
  
  var srcBlend: js.Any = js.native
  
  var verticesLength: js.Any = js.native
}
object PolygonBatcher {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PolygonBatcherMutableBuilder[Self <: PolygonBatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: Shader => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraw(value: (GLTexture, ArrayLike[Double], js.Array[Double]) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDrawCalls(value: js.Any): Self = StObject.set(x, "drawCalls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstBlend(value: js.Any): Self = StObject.set(x, "dstBlend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlush(value: js.Any): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDrawCalls(value: () => Double): Self = StObject.set(x, "getDrawCalls", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndicesLength(value: js.Any): Self = StObject.set(x, "indicesLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDrawing(value: js.Any): Self = StObject.set(x, "isDrawing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTexture(value: js.Any): Self = StObject.set(x, "lastTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMesh(value: js.Any): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetBlendMode(value: (Double, Double) => Unit): Self = StObject.set(x, "setBlendMode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShader(value: js.Any): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcBlend(value: js.Any): Self = StObject.set(x, "srcBlend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesLength(value: js.Any): Self = StObject.set(x, "verticesLength", value.asInstanceOf[js.Any])
  }
}
