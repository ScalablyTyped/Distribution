package typings.newrelic.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("newrelic", "addNamingRule")
@js.native
object addNamingRule extends js.Object {
  
  def apply(pattern: String, name: String): Unit = js.native
  def apply(pattern: RegExp, name: String): Unit = js.native
}
