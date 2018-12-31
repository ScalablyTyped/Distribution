package typings
package nockLib.nockMod.nockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NockBackContext extends js.Object {
  var isLoaded: scala.Boolean
  var scopes: js.Array[Scope]
  def assertScopesFinished(): scala.Unit
}

