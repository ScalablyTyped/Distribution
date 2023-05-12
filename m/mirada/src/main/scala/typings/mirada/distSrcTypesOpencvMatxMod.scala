package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.MatxAddOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxDivOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxMatMulOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxMulOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxScaleOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxSubOp
import typings.mirada.distSrcTypesOpencvHacksMod.MatxTOp
import typings.mirada.distSrcTypesOpencvHacksMod.Tp
import typings.mirada.distSrcTypesOpencvHacksMod.Vec
import typings.mirada.distSrcTypesOpencvHacksMod._T2
import typings.mirada.distSrcTypesOpencvHacksMod.diagType
import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvMatxMod {
  
  @JSImport("mirada/dist/src/types/opencv/Matx", "Matx")
  @js.native
  open class Matx () extends StObject {
    def this(v0: Any | Tp) = this()
    def this(a: Matx, arg342: MatxTOp) = this()
    def this(v0: Tp, v1: Tp) = this()
    def this(a: Matx, b: Matx, arg335: MatxAddOp | MatxDivOp | MatxMulOp | MatxSubOp) = this()
    def this(v0: Tp, v1: Tp, v2: Tp) = this()
    def this(arg337: Any, a: Matx, alpha: _T2, arg338: MatxScaleOp) = this()
    def this(l: int, a: Matx, b: Matx, arg341: MatxMatMulOp) = this()
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
    
    def col(i: int): Matx = js.native
    
    def ddot(v: Matx): Matx = js.native
    
    def diag(): diagType = js.native
    
    def div(a: Matx): Matx = js.native
    
    def dot(v: Matx): Matx = js.native
    
    def get_minor(m1: int, n1: int, base_row: int, base_col: int): Matx = js.native
    
    def inv(): Matx = js.native
    def inv(method: Unit, p_is_ok: Any): Matx = js.native
    def inv(method: int): Matx = js.native
    def inv(method: int, p_is_ok: Any): Matx = js.native
    
    def mul(a: Matx): Matx = js.native
    
    def reshape(m1: int, n1: int): Matx = js.native
    
    def row(i: int): Matx = js.native
    
    def solve(l: int, rhs: Matx): Matx = js.native
    def solve(l: int, rhs: Matx, flags: int): Matx = js.native
    def solve(rhs: Vec, method: int): Vec = js.native
    
    def t(): Matx = js.native
    
    var `val`: Tp = js.native
  }
  /* static members */
  object Matx {
    
    @JSImport("mirada/dist/src/types/opencv/Matx", "Matx")
    @js.native
    val ^ : js.Any = js.native
    
    inline def all(alpha: Tp): Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(alpha.asInstanceOf[js.Any]).asInstanceOf[Matx]
    
    inline def diag(d: diagType): Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("diag")(d.asInstanceOf[js.Any]).asInstanceOf[Matx]
    
    inline def eye(): Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("eye")().asInstanceOf[Matx]
    
    inline def ones(): Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")().asInstanceOf[Matx]
    
    inline def randn(a: Tp, b: Tp): Matx = (^.asInstanceOf[js.Dynamic].applyDynamic("randn")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Matx]
    
    inline def randu(a: Tp, b: Tp): Matx = (^.asInstanceOf[js.Dynamic].applyDynamic("randu")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Matx]
    
    inline def zeros(): Matx = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")().asInstanceOf[Matx]
  }
  
  @JSImport("mirada/dist/src/types/opencv/Matx", "channels")
  @js.native
  val channels: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/Matx", "cols")
  @js.native
  val cols: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/Matx", "rows")
  @js.native
  val rows: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/Matx", "shortdim")
  @js.native
  val shortdim: Any = js.native
}
