package typings.mvdanSh.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pos extends js.Object {
  def After(p: Pos): Boolean
  def Col(): Double
  def IsValid(): Boolean
  def Line(): Double
  def Offset(): Double
  def String(): java.lang.String
}

object Pos {
  @scala.inline
  def apply(
    After: Pos => Boolean,
    Col: () => Double,
    IsValid: () => Boolean,
    Line: () => Double,
    Offset: () => Double,
    String: () => String
  ): Pos = {
    val __obj = js.Dynamic.literal(After = js.Any.fromFunction1(After), Col = js.Any.fromFunction0(Col), IsValid = js.Any.fromFunction0(IsValid), Line = js.Any.fromFunction0(Line), Offset = js.Any.fromFunction0(Offset), String = js.Any.fromFunction0(String))
    __obj.asInstanceOf[Pos]
  }
}

