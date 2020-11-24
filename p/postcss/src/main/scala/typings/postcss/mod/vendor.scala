package typings.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postcss", "vendor")
@js.native
object vendor extends js.Object {
  
  /**
    * @returns The vendor prefix extracted from the input string.
    */
  def prefix(prop: String): String = js.native
  
  /**
    * @returns The input string stripped of its vendor prefix.
    */
  def unprefixed(prop: String): String = js.native
}
