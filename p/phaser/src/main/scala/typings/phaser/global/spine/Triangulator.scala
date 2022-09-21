package typings.phaser.global.spine

import typings.phaser.spine.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.Triangulator")
@js.native
open class Triangulator ()
  extends StObject
     with typings.phaser.spine.Triangulator {
  
  /* private */ /* CompleteClass */
  var convexPolygons: Any = js.native
  
  /* private */ /* CompleteClass */
  var convexPolygonsIndices: Any = js.native
  
  /* CompleteClass */
  override def decompose(verticesArray: js.Array[Double], triangles: js.Array[Double]): js.Array[js.Array[Double]] = js.native
  
  /* private */ /* CompleteClass */
  var indicesArray: Any = js.native
  
  /* private */ /* CompleteClass */
  var isConcaveArray: Any = js.native
  
  /* private */ /* CompleteClass */
  var polygonIndicesPool: Any = js.native
  
  /* private */ /* CompleteClass */
  var polygonPool: Any = js.native
  
  /* private */ /* CompleteClass */
  var triangles: Any = js.native
  
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
  def isConcave: Any = js.native
  inline def isConcave_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isConcave")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.Triangulator.positiveArea")
  @js.native
  def positiveArea: Any = js.native
  inline def positiveArea_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("positiveArea")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("spine.Triangulator.winding")
  @js.native
  def winding: Any = js.native
  inline def winding_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("winding")(x.asInstanceOf[js.Any])
}
