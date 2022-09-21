package typings.phaser.spine.webgl

import typings.phaser.spine.Skeleton
import typings.phaser.spine.VertexEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkeletonRenderer extends StObject {
  
  /* private */ var clipper: Any = js.native
  
  def draw(batcher: PolygonBatcher, skeleton: Skeleton): Unit = js.native
  def draw(batcher: PolygonBatcher, skeleton: Skeleton, slotRangeStart: Double): Unit = js.native
  def draw(batcher: PolygonBatcher, skeleton: Skeleton, slotRangeStart: Double, slotRangeEnd: Double): Unit = js.native
  def draw(batcher: PolygonBatcher, skeleton: Skeleton, slotRangeStart: Unit, slotRangeEnd: Double): Unit = js.native
  
  var premultipliedAlpha: Boolean = js.native
  
  /* private */ var renderable: Any = js.native
  
  /* private */ var temp: Any = js.native
  
  /* private */ var temp2: Any = js.native
  
  /* private */ var temp3: Any = js.native
  
  /* private */ var temp4: Any = js.native
  
  /* private */ var tempColor: Any = js.native
  
  /* private */ var tempColor2: Any = js.native
  
  /* private */ var twoColorTint: Any = js.native
  
  var vertexEffect: VertexEffect = js.native
  
  /* private */ var vertexSize: Any = js.native
  
  /* private */ var vertices: Any = js.native
}
