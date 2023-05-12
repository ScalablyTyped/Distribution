package typings.mirada.distSrcTypesOpencvTypesMod

import typings.mirada.distSrcTypesOpencvHacksMod.MatxAddOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxDivOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxMatMulOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxMulOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxScaleOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxSubOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxTOp
import typings.mirada.distSrcTypesOpencvHacksMod.Tp
import typings.mirada.distSrcTypesOpencvHacksMod._T2
import typings.mirada.distSrcTypesOpencvHacksMod.diagType
import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_types", "Matx")
@js.native
open class Matx ()
  extends typings.mirada.distSrcTypesOpencvMatxMod.Matx {
  def this(v0: Any | Tp) = this()
  def this(a: typings.mirada.distSrcTypesOpencvMatxMod.Matx, arg342: MatxTOp) = this()
  def this(v0: Tp, v1: Tp) = this()
  def this(
    a: typings.mirada.distSrcTypesOpencvMatxMod.Matx,
    b: typings.mirada.distSrcTypesOpencvMatxMod.Matx,
    arg335: MatxAddOp | MatxDivOp | MatxMulOp | MatxSubOp
  ) = this()
  def this(v0: Tp, v1: Tp, v2: Tp) = this()
  def this(arg337: Any, a: typings.mirada.distSrcTypesOpencvMatxMod.Matx, alpha: _T2, arg338: MatxScaleOp) = this()
  def this(
    l: int,
    a: typings.mirada.distSrcTypesOpencvMatxMod.Matx,
    b: typings.mirada.distSrcTypesOpencvMatxMod.Matx,
    arg341: MatxMatMulOp
  ) = this()
  def this(v0: Tp, v1: Tp, v2: Tp, v3: Tp) = this()
  def this(v0: Tp, v1: Tp, v2: Tp, v3: Tp, v4: Tp) = this()
  def this(v0: Tp, v1: Tp, v2: Tp, v3: Tp, v4: Tp, v5: Tp) = this()
  def this(v0: Tp, v1: Tp, v2: Tp, v3: Tp, v4: Tp, v5: Tp, v6: Tp) = this()
  def this(v0: Tp, v1: Tp, v2: Tp, v3: Tp, v4: Tp, v5: Tp, v6: Tp, v7: Tp) = this()
  def this(v0: Tp, v1: Tp, v2: Tp, v3: Tp, v4: Tp, v5: Tp, v6: Tp, v7: Tp, v8: Tp) = this()
  def this(v0: Tp, v1: Tp, v2: Tp, v3: Tp, v4: Tp, v5: Tp, v6: Tp, v7: Tp, v8: Tp, v9: Tp) = this()
  def this(v0: Tp, v1: Tp, v2: Tp, v3: Tp, v4: Tp, v5: Tp, v6: Tp, v7: Tp, v8: Tp, v9: Tp, v10: Tp, v11: Tp) = this()
  def this(
    v0: Tp,
    v1: Tp,
    v2: Tp,
    v3: Tp,
    v4: Tp,
    v5: Tp,
    v6: Tp,
    v7: Tp,
    v8: Tp,
    v9: Tp,
    v10: Tp,
    v11: Tp,
    v12: Tp,
    v13: Tp
  ) = this()
  def this(
    v0: Tp,
    v1: Tp,
    v2: Tp,
    v3: Tp,
    v4: Tp,
    v5: Tp,
    v6: Tp,
    v7: Tp,
    v8: Tp,
    v9: Tp,
    v10: Tp,
    v11: Tp,
    v12: Tp,
    v13: Tp,
    v14: Tp,
    v15: Tp
  ) = this()
}
/* static members */
object Matx {
  
  @JSImport("mirada/dist/src/types/opencv/_types", "Matx")
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(alpha: Tp): typings.mirada.distSrcTypesOpencvMatxMod.Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(alpha.asInstanceOf[js.Any]).asInstanceOf[typings.mirada.distSrcTypesOpencvMatxMod.Matx]
  
  inline def diag(d: diagType): typings.mirada.distSrcTypesOpencvMatxMod.Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("diag")(d.asInstanceOf[js.Any]).asInstanceOf[typings.mirada.distSrcTypesOpencvMatxMod.Matx]
  
  inline def eye(): typings.mirada.distSrcTypesOpencvMatxMod.Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("eye")().asInstanceOf[typings.mirada.distSrcTypesOpencvMatxMod.Matx]
  
  inline def ones(): typings.mirada.distSrcTypesOpencvMatxMod.Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")().asInstanceOf[typings.mirada.distSrcTypesOpencvMatxMod.Matx]
  
  inline def randn(a: Tp, b: Tp): typings.mirada.distSrcTypesOpencvMatxMod.Matx = (^.asInstanceOf[js.Dynamic].applyDynamic("randn")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvMatxMod.Matx]
  
  inline def randu(a: Tp, b: Tp): typings.mirada.distSrcTypesOpencvMatxMod.Matx = (^.asInstanceOf[js.Dynamic].applyDynamic("randu")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvMatxMod.Matx]
  
  inline def zeros(): typings.mirada.distSrcTypesOpencvMatxMod.Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")().asInstanceOf[typings.mirada.distSrcTypesOpencvMatxMod.Matx]
}
