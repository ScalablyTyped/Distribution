package typings.nodePgMigrate

import typings.nodePgMigrate.domainsTypesMod.RenameDomainFn
import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameDomainFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameDomainFn = js.native
  def reverse(oldDomainName: Name, newDomainName: Name): String | js.Array[String] = js.native
}

