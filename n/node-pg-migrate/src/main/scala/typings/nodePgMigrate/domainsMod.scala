package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.domainsTypesMod.AlterDomain
import typings.nodePgMigrate.domainsTypesMod.CreateDomain
import typings.nodePgMigrate.domainsTypesMod.DropDomain
import typings.nodePgMigrate.domainsTypesMod.RenameDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainsMod {
  
  @JSImport("node-pg-migrate/dist/operations/domains", "alterDomain")
  @js.native
  def alterDomain(mOptions: MigrationOptions): AlterDomain = js.native
  
  @JSImport("node-pg-migrate/dist/operations/domains", "createDomain")
  @js.native
  def createDomain(mOptions: MigrationOptions): CreateDomain = js.native
  
  @JSImport("node-pg-migrate/dist/operations/domains", "dropDomain")
  @js.native
  def dropDomain(mOptions: MigrationOptions): DropDomain = js.native
  
  @JSImport("node-pg-migrate/dist/operations/domains", "renameDomain")
  @js.native
  def renameDomain(mOptions: MigrationOptions): RenameDomain = js.native
}
