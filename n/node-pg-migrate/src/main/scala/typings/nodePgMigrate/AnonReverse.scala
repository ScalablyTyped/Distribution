package typings.nodePgMigrate

import typings.nodePgMigrate.domainsTypesMod.CreateDomainFn
import typings.nodePgMigrate.domainsTypesMod.DomainOptionsCreate
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverse extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateDomainFn = js.native
  def reverse(domainName: Name, `type`: Type): String | js.Array[String] = js.native
  def reverse(domainName: Name, `type`: Type, domainOptions: DomainOptionsCreate with DropOptions): String | js.Array[String] = js.native
}

