package typings.mirada.distSrcTypesOpencvHacksMod

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_hacks", "Scalar")
@js.native
open class Scalar ()
  extends StObject
     with Array[Double]
/* static members */
object Scalar {
  
  @JSImport("mirada/dist/src/types/opencv/_hacks", "Scalar")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(v: Double*): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(v.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Scalar]
}
