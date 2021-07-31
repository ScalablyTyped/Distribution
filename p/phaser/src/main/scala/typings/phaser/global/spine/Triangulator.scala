package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Triangulator")
@js.native
class Triangulator ()
  extends StObject
     with typings.phaser.spine.Triangulator {
  
  /* CompleteClass */
  var convexPolygons: js.Any = js.native
  
  /* CompleteClass */
  var convexPolygonsIndices: js.Any = js.native
  
  /* CompleteClass */
  override def decompose(verticesArray: js.Array[Double], triangles: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  
  /* CompleteClass */
  var indicesArray: js.Any = js.native
  
  /* CompleteClass */
  var isConcaveArray: js.Any = js.native
  
  /* CompleteClass */
  var polygonIndicesPool: js.Any = js.native
  
  /* CompleteClass */
  var polygonPool: js.Any = js.native
  
  /* CompleteClass */
  var triangles: js.Any = js.native
  
  /* CompleteClass */
  override def triangulate(verticesArray: ArrayLike[Double]): js.Array[Double] = js.native
}
object Triangulator {
  
  @JSGlobal("spine.Triangulator")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("spine.Triangulator.isConcave")
  @js.native
  def isConcave: js.Any = js.native
  @scala.inline
  def isConcave_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isConcave")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.Triangulator.positiveArea")
  @js.native
  def positiveArea: js.Any = js.native
  @scala.inline
  def positiveArea_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positiveArea")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.Triangulator.winding")
  @js.native
  def winding: js.Any = js.native
  @scala.inline
  def winding_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("winding")(x.asInstanceOf[js.Any])
}
