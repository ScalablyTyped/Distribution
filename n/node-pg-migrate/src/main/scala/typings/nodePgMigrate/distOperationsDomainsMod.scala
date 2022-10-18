package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsDomainsTypesMod.AlterDomain
import typings.nodePgMigrate.distOperationsDomainsTypesMod.CreateDomain
import typings.nodePgMigrate.distOperationsDomainsTypesMod.DropDomain
import typings.nodePgMigrate.distOperationsDomainsTypesMod.RenameDomain
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsDomainsMod {
  
  @JSImport("node-pg-migrate/dist/operations/domains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterDomain(mOptions: MigrationOptions): AlterDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("alterDomain")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterDomain]
  
  inline def createDomain(mOptions: MigrationOptions): CreateDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomain")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateDomain]
  
  inline def dropDomain(mOptions: MigrationOptions): DropDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("dropDomain")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropDomain]
  
  inline def renameDomain(mOptions: MigrationOptions): RenameDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("renameDomain")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameDomain]
}
