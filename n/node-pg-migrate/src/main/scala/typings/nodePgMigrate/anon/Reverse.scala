package typings.nodePgMigrate.anon

import typings.nodePgMigrate.domainsTypesMod.CreateDomainFn
import typings.nodePgMigrate.domainsTypesMod.DomainOptionsCreate
import typings.nodePgMigrate.generalTypesMod.DropOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reverse extends js.Object {
  
  def reverse(
    domainName: typings.nodePgMigrate.generalTypesMod.Name,
    `type`: typings.nodePgMigrate.generalTypesMod.Type
  ): String | js.Array[String] = js.native
  def reverse(
    domainName: typings.nodePgMigrate.generalTypesMod.Name,
    `type`: typings.nodePgMigrate.generalTypesMod.Type,
    domainOptions: DomainOptionsCreate with DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateDomainFn = js.native
}
