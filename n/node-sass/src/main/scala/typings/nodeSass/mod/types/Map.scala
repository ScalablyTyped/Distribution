package typings.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map
  extends Value
     with Enumerable {
  def getKey(index: Double): Value
  def setKey(index: Double, key: Value): Unit
}

@JSImport("node-sass", "types.Map")
@js.native
object Map extends TopLevel[MapConstructor]

