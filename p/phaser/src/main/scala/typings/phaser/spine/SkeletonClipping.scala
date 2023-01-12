package typings.phaser.spine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonClipping extends StObject {
  
  def clip(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    clippingArea: js.Array[Double],
    output: js.Array[Double]
  ): Boolean
  
  /* private */ var clipAttachment: Any
  
  def clipEnd(): Unit
  
  def clipEndWithSlot(slot: Slot): Unit
  
  /* private */ var clipOutput: Any
  
  def clipStart(slot: Slot, clip: ClippingAttachment): Double
  
  def clipTriangles(
    vertices: ArrayLike[Double],
    verticesLength: Double,
    triangles: ArrayLike[Double],
    trianglesLength: Double,
    uvs: ArrayLike[Double],
    light: Color,
    dark: Color,
    twoColor: Boolean
  ): Unit
  
  var clippedTriangles: js.Array[Double]
  
  var clippedVertices: js.Array[Double]
  
  /* private */ var clippingPolygon: Any
  
  /* private */ var clippingPolygons: Any
  
  def isClipping(): Boolean
  
  /* private */ var scratch: Any
  
  /* private */ var triangulator: Any
}
object SkeletonClipping {
  
  inline def apply(
    clip: (Double, Double, Double, Double, Double, Double, js.Array[Double], js.Array[Double]) => Boolean,
    clipAttachment: Any,
    clipEnd: () => Unit,
    clipEndWithSlot: Slot => Unit,
    clipOutput: Any,
    clipStart: (Slot, ClippingAttachment) => Double,
    clipTriangles: (ArrayLike[Double], Double, ArrayLike[Double], Double, ArrayLike[Double], Color, Color, Boolean) => Unit,
    clippedTriangles: js.Array[Double],
    clippedVertices: js.Array[Double],
    clippingPolygon: Any,
    clippingPolygons: Any,
    isClipping: () => Boolean,
    scratch: Any,
    triangulator: Any
  ): SkeletonClipping = {
    val __obj = js.Dynamic.literal(clip = js.Any.fromFunction8(clip), clipAttachment = clipAttachment.asInstanceOf[js.Any], clipEnd = js.Any.fromFunction0(clipEnd), clipEndWithSlot = js.Any.fromFunction1(clipEndWithSlot), clipOutput = clipOutput.asInstanceOf[js.Any], clipStart = js.Any.fromFunction2(clipStart), clipTriangles = js.Any.fromFunction8(clipTriangles), clippedTriangles = clippedTriangles.asInstanceOf[js.Any], clippedVertices = clippedVertices.asInstanceOf[js.Any], clippingPolygon = clippingPolygon.asInstanceOf[js.Any], clippingPolygons = clippingPolygons.asInstanceOf[js.Any], isClipping = js.Any.fromFunction0(isClipping), scratch = scratch.asInstanceOf[js.Any], triangulator = triangulator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonClipping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SkeletonClipping] (val x: Self) extends AnyVal {
    
    inline def setClip(
      value: (Double, Double, Double, Double, Double, Double, js.Array[Double], js.Array[Double]) => Boolean
    ): Self = StObject.set(x, "clip", js.Any.fromFunction8(value))
    
    inline def setClipAttachment(value: Any): Self = StObject.set(x, "clipAttachment", value.asInstanceOf[js.Any])
    
    inline def setClipEnd(value: () => Unit): Self = StObject.set(x, "clipEnd", js.Any.fromFunction0(value))
    
    inline def setClipEndWithSlot(value: Slot => Unit): Self = StObject.set(x, "clipEndWithSlot", js.Any.fromFunction1(value))
    
    inline def setClipOutput(value: Any): Self = StObject.set(x, "clipOutput", value.asInstanceOf[js.Any])
    
    inline def setClipStart(value: (Slot, ClippingAttachment) => Double): Self = StObject.set(x, "clipStart", js.Any.fromFunction2(value))
    
    inline def setClipTriangles(
      value: (ArrayLike[Double], Double, ArrayLike[Double], Double, ArrayLike[Double], Color, Color, Boolean) => Unit
    ): Self = StObject.set(x, "clipTriangles", js.Any.fromFunction8(value))
    
    inline def setClippedTriangles(value: js.Array[Double]): Self = StObject.set(x, "clippedTriangles", value.asInstanceOf[js.Any])
    
    inline def setClippedTrianglesVarargs(value: Double*): Self = StObject.set(x, "clippedTriangles", js.Array(value*))
    
    inline def setClippedVertices(value: js.Array[Double]): Self = StObject.set(x, "clippedVertices", value.asInstanceOf[js.Any])
    
    inline def setClippedVerticesVarargs(value: Double*): Self = StObject.set(x, "clippedVertices", js.Array(value*))
    
    inline def setClippingPolygon(value: Any): Self = StObject.set(x, "clippingPolygon", value.asInstanceOf[js.Any])
    
    inline def setClippingPolygons(value: Any): Self = StObject.set(x, "clippingPolygons", value.asInstanceOf[js.Any])
    
    inline def setIsClipping(value: () => Boolean): Self = StObject.set(x, "isClipping", js.Any.fromFunction0(value))
    
    inline def setScratch(value: Any): Self = StObject.set(x, "scratch", value.asInstanceOf[js.Any])
    
    inline def setTriangulator(value: Any): Self = StObject.set(x, "triangulator", value.asInstanceOf[js.Any])
  }
}
