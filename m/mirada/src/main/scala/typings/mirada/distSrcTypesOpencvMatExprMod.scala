package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.MatOp
import typings.mirada.distSrcTypesOpencvTypesMod.Scalar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvMatExprMod {
  
  @JSImport("mirada/dist/src/types/opencv/MatExpr", "MatExpr")
  @js.native
  open class MatExpr () extends Mat {
    def this(m: Mat) = this()
    def this(
      _op: MatOp,
      _flags: int,
      _a: js.UndefOr[Mat],
      _b: js.UndefOr[Mat],
      _c: js.UndefOr[Mat],
      _alpha: js.UndefOr[double],
      _beta: js.UndefOr[double],
      _s: js.UndefOr[Scalar]
    ) = this()
    
    var a: Mat = js.native
    
    var alpha: double = js.native
    
    var b: Mat = js.native
    
    var beta: double = js.native
    
    var c: Mat = js.native
    
    def cross(m: Mat): Mat = js.native
    
    def dot(m: Mat): Mat = js.native
    
    def mul(e: MatExpr): MatExpr = js.native
    def mul(e: MatExpr, scale: double): MatExpr = js.native
    def mul(m: Mat): MatExpr = js.native
    def mul(m: Mat, scale: double): MatExpr = js.native
    
    var op: MatOp = js.native
    
    var s: Scalar = js.native
  }
}
