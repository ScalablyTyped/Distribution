package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeMod {
  
  @JSImport("ol/size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buffer(size: Size, num: Double): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(size.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Size]
  inline def buffer(size: Size, num: Double, dest: Size): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(size.asInstanceOf[js.Any], num.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Size]
  
  inline def hasArea(size: Size): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasArea")(size.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def scale(size: Size, ratio: Double): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(size.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Size]
  inline def scale(size: Size, ratio: Double, dest: Size): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(size.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Size]
  
  inline def toSize(size: Double): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("toSize")(size.asInstanceOf[js.Any]).asInstanceOf[Size]
  inline def toSize(size: Double, dest: Size): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("toSize")(size.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Size]
  inline def toSize(size: Size): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("toSize")(size.asInstanceOf[js.Any]).asInstanceOf[Size]
  inline def toSize(size: Size, dest: Size): Size = (^.asInstanceOf[js.Dynamic].applyDynamic("toSize")(size.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Size]
  
  type Size = js.Array[Double]
}
