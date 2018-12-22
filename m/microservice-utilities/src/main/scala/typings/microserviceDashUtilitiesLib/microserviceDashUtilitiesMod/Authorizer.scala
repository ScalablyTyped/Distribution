package typings
package microserviceDashUtilitiesLib.microserviceDashUtilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("microservice-utilities", "Authorizer")
@js.native
class Authorizer protected () extends js.Object {
  def this(logFunction: js.Function1[/* msg */ js.Any, scala.Unit], configuration: AuthorizerConfiguration) = this()
  def getPolicy(request: js.Object): js.Promise[AuthorizerPolicy] = js.native
}

