package typings.mirada.distSrcTypesOpencvTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_types", "GScalar")
@js.native
open class GScalar ()
  extends typings.mirada.distSrcTypesOpencvHacksMod.GScalar
/* static members */
object GScalar {
  
  @JSImport("mirada/dist/src/types/opencv/_types", "GScalar")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(v: Double*): typings.mirada.distSrcTypesOpencvHacksMod.Scalar = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(v.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.mirada.distSrcTypesOpencvHacksMod.Scalar]
}
