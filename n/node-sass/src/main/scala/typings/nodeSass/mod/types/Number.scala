package typings.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Number extends Value {
  def getUnit(): java.lang.String = js.native
  def getValue(): Double = js.native
  def setUnit(u: java.lang.String): Unit = js.native
  def setValue(n: Double): Unit = js.native
}

@JSImport("node-sass", "types.Number")
@js.native
object Number extends TopLevel[NumberConstructor]

