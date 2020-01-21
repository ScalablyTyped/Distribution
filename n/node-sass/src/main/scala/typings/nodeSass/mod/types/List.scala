package typings.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List
  extends Value
     with Enumerable {
  def getSeparator(): scala.Boolean
  def setSeparator(isComma: scala.Boolean): Unit
}

@JSImport("node-sass", "types.List")
@js.native
object List extends TopLevel[ListConstructor]

