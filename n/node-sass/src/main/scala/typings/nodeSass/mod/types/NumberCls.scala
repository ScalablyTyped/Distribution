package typings.nodeSass.mod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-sass", "types.Number")
@js.native
class NumberCls protected () extends Number {
  /**
    * Constructs a new Sass number. Does not require use of the `new` keyword.
    */
  def this(value: Double) = this()
  def this(value: Double, unit: java.lang.String) = this()
  /* CompleteClass */
  override def getUnit(): java.lang.String = js.native
  /* CompleteClass */
  override def getValue(): Double = js.native
  /* CompleteClass */
  override def setUnit(u: java.lang.String): Unit = js.native
  /* CompleteClass */
  override def setValue(n: Double): Unit = js.native
}

