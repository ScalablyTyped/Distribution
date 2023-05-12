package typings.onfidoOpencv.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@onfido/opencv", "Scalar")
@js.native
open class Scalar ()
  extends typings.mirada.mod.Scalar
/* static members */
object Scalar {
  
  @JSImport("@onfido/opencv", "Scalar")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(v: Double*): typings.mirada.distSrcTypesOpencvHacksMod.Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(v.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.mirada.distSrcTypesOpencvHacksMod.Scalar]
}
