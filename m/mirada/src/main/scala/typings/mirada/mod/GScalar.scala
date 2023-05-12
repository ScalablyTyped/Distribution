package typings.mirada.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada", "GScalar")
@js.native
open class GScalar ()
  extends typings.mirada.distSrcTypesOpencvMod.GScalar
/* static members */
object GScalar {
  
  @JSImport("mirada", "GScalar")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(v: Double*): typings.mirada.distSrcTypesOpencvHacksMod.Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(v.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.mirada.distSrcTypesOpencvHacksMod.Scalar]
}
