package typings.ol.styleExpressionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operator extends js.Object {
  def getReturnType(p0: js.Array[ExpressionValue]): ValueTypes | Double = js.native
  def toGlsl(p0: ParsingContext, p1: js.Array[ExpressionValue]): String = js.native
  def toGlsl(p0: ParsingContext, p1: js.Array[ExpressionValue], p2: ValueTypes): String = js.native
}

