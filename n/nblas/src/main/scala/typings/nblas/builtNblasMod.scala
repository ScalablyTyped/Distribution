package typings.nblas

import typings.nblas.builtTypesMod.MatrixLeftRight
import typings.nblas.builtTypesMod.MatrixTrans
import typings.nblas.builtTypesMod.MatrixUnit
import typings.nblas.builtTypesMod.MatrixUpperLower
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nblas/built/nblas", JSImport.Namespace)
@js.native
object builtNblasMod extends js.Object {
  val ConjTrans: MatrixTrans = js.native
  val Left: MatrixLeftRight = js.native
  val Lower: MatrixUpperLower = js.native
  val NoTrans: MatrixTrans = js.native
  val NonUnit: MatrixUnit = js.native
  val Right: MatrixLeftRight = js.native
  val Trans: MatrixTrans = js.native
  val Unit: MatrixUnit = js.native
  val Upper: MatrixUpperLower = js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NBlasInterface */ js.Any = js.native
}

