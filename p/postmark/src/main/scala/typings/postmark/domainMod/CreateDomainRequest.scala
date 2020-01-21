package typings.postmark.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/domains/Domain", "CreateDomainRequest")
@js.native
class CreateDomainRequest protected () extends js.Object {
  def this(Name: String) = this()
  def this(Name: String, ReturnPathDomain: String) = this()
  var Name: String = js.native
  var ReturnPathDomain: js.UndefOr[String] = js.native
}

