package typings.polylabel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @scala.inline
    def apply(polygon: js.Array[js.Array[js.Array[Double]]]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].apply(polygon.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    @scala.inline
    def apply(polygon: js.Array[js.Array[js.Array[Double]]], precision: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(polygon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    @scala.inline
    def apply(polygon: js.Array[js.Array[js.Array[Double]]], precision: Double, debug: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(polygon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    @scala.inline
    def apply(polygon: js.Array[js.Array[js.Array[Double]]], precision: Unit, debug: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(polygon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    @JSImport("polylabel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
