package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.domainsTypesMod.AlterDomain
import typings.nodePgMigrate.domainsTypesMod.CreateDomain
import typings.nodePgMigrate.domainsTypesMod.DropDomain
import typings.nodePgMigrate.domainsTypesMod.RenameDomain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domainsMod {
  
  @JSImport("node-pg-migrate/dist/operations/domains", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def alterDomain(mOptions: MigrationOptions): AlterDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("alterDomain")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AlterDomain]
  
  inline def createDomain(mOptions: MigrationOptions): CreateDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomain")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateDomain]
  
  inline def dropDomain(mOptions: MigrationOptions): DropDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("dropDomain")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropDomain]
  
  inline def renameDomain(mOptions: MigrationOptions): RenameDomain = ^.asInstanceOf[js.Dynamic].applyDynamic("renameDomain")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameDomain]
}
