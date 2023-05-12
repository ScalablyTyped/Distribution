package typings.mirada.distSrcTypesOpencvHacksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_hacks", "GScalar")
@js.native
open class GScalar () extends Scalar
/* static members */
object GScalar {
  
  @JSImport("mirada/dist/src/types/opencv/_hacks", "GScalar")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(v: Double*): Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(v.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Scalar]
}
