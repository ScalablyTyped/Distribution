package typings.polylabel

import typings.polylabel.anon.Arraynumberdistancenumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(polygon: js.Array[js.Array[js.Array[Double]]]): Arraynumberdistancenumber = ^.asInstanceOf[js.Dynamic].apply(polygon.asInstanceOf[js.Any]).asInstanceOf[Arraynumberdistancenumber]
    inline def apply(polygon: js.Array[js.Array[js.Array[Double]]], precision: Double): Arraynumberdistancenumber = (^.asInstanceOf[js.Dynamic].apply(polygon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Arraynumberdistancenumber]
    inline def apply(polygon: js.Array[js.Array[js.Array[Double]]], precision: Double, debug: Boolean): Arraynumberdistancenumber = (^.asInstanceOf[js.Dynamic].apply(polygon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[Arraynumberdistancenumber]
    inline def apply(polygon: js.Array[js.Array[js.Array[Double]]], precision: Unit, debug: Boolean): Arraynumberdistancenumber = (^.asInstanceOf[js.Dynamic].apply(polygon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], debug.asInstanceOf[js.Any])).asInstanceOf[Arraynumberdistancenumber]
    
    @JSImport("polylabel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
