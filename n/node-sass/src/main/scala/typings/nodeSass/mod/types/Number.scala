package typings.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends Value {
  def getUnit(): java.lang.String
  def getValue(): Double
  def setUnit(u: java.lang.String): Unit
  def setValue(n: Double): Unit
}

@JSImport("node-sass", "types.Number")
@js.native
object Number extends TopLevel[NumberConstructor]

