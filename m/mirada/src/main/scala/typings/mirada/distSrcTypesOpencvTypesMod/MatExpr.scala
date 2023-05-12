package typings.mirada.distSrcTypesOpencvTypesMod

import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_types", "MatExpr")
@js.native
open class MatExpr ()
  extends typings.mirada.distSrcTypesOpencvMatExprMod.MatExpr {
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
}
