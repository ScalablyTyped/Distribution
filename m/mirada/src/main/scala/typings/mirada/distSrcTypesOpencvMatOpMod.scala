package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvTypesMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.MatExpr
import typings.mirada.distSrcTypesOpencvTypesMod.Scalar
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvMatOpMod {
  
  @JSImport("mirada/dist/src/types/opencv/MatOp", "MatOp")
  @js.native
  open class MatOp () extends StObject {
    
    def abs(expr: MatExpr, res: MatExpr): MatExpr = js.native
    
    def add(expr1: MatExpr, expr2: MatExpr, res: MatExpr): MatExpr = js.native
    def add(expr1: MatExpr, s: Scalar, res: MatExpr): MatExpr = js.native
    
    def assign(expr: MatExpr, m: Mat): MatExpr = js.native
    def assign(expr: MatExpr, m: Mat, `type`: int): MatExpr = js.native
    
    def augAssignAdd(expr: MatExpr, m: Mat): MatExpr = js.native
    
    def augAssignAnd(expr: MatExpr, m: Mat): MatExpr = js.native
    
    def augAssignDivide(expr: MatExpr, m: Mat): MatExpr = js.native
    
    def augAssignMultiply(expr: MatExpr, m: Mat): MatExpr = js.native
    
    def augAssignOr(expr: MatExpr, m: Mat): MatExpr = js.native
    
    def augAssignSubtract(expr: MatExpr, m: Mat): MatExpr = js.native
    
    def augAssignXor(expr: MatExpr, m: Mat): MatExpr = js.native
    
    def diag(expr: MatExpr, d: int, res: MatExpr): MatExpr = js.native
    
    def divide(expr1: MatExpr, expr2: MatExpr, res: MatExpr): MatExpr = js.native
    def divide(expr1: MatExpr, expr2: MatExpr, res: MatExpr, scale: double): MatExpr = js.native
    def divide(s: double, expr: MatExpr, res: MatExpr): MatExpr = js.native
    
    def elementWise(expr: MatExpr): MatExpr = js.native
    
    def invert(expr: MatExpr, method: int, res: MatExpr): MatExpr = js.native
    
    def matmul(expr1: MatExpr, expr2: MatExpr, res: MatExpr): MatExpr = js.native
    
    def multiply(expr1: MatExpr, expr2: MatExpr, res: MatExpr): MatExpr = js.native
    def multiply(expr1: MatExpr, expr2: MatExpr, res: MatExpr, scale: double): MatExpr = js.native
    def multiply(expr1: MatExpr, s: double, res: MatExpr): MatExpr = js.native
    
    def roi(expr: MatExpr, rowRange: Range, colRange: Range, res: MatExpr): MatExpr = js.native
    
    def size(expr: MatExpr): Size = js.native
    
    def subtract(expr1: MatExpr, expr2: MatExpr, res: MatExpr): MatExpr = js.native
    def subtract(s: Scalar, expr: MatExpr, res: MatExpr): Scalar = js.native
    
    def transpose(expr: MatExpr, res: MatExpr): MatExpr = js.native
    
    def `type`(expr: MatExpr): MatExpr = js.native
  }
}
