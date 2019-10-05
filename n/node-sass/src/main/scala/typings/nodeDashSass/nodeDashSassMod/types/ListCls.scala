package typings.nodeDashSass.nodeDashSassMod.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-sass", "types.List")
@js.native
class ListCls protected () extends List {
  def this(length: Double) = this()
  def this(length: Double, commaSeparator: scala.Boolean) = this()
  /* CompleteClass */
  override def getLength(): Double = js.native
  /* CompleteClass */
  override def getSeparator(): scala.Boolean = js.native
  /* CompleteClass */
  override def getValue(index: Double): Value = js.native
  /* CompleteClass */
  override def setSeparator(isComma: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def setValue(index: Double, value: Value): Unit = js.native
}

