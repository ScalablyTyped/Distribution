package typings.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map
  extends Value
     with Enumerable {
  
  def getKey(index: Double): Value = js.native
  
  def setKey(index: Double, key: Value): Unit = js.native
}
@JSImport("node-sass", "types.Map")
@js.native
object Map extends TopLevel[MapConstructor]
