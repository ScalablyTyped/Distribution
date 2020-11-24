package typings.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait List
  extends Value
     with Enumerable {
  
  def getSeparator(): scala.Boolean = js.native
  
  def setSeparator(isComma: scala.Boolean): Unit = js.native
}
@JSImport("node-sass", "types.List")
@js.native
object List extends TopLevel[ListConstructor]
