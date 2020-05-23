package typings.nodePgMigrate.anon

import typings.nodePgMigrate.domainsTypesMod.RenameDomainFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameDomainFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameDomainFn = js.native
  def reverse(
    oldDomainName: typings.nodePgMigrate.generalTypesMod.Name,
    newDomainName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

