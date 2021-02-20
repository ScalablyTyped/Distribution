package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.policiesTypesMod.AlterPolicy
import typings.nodePgMigrate.policiesTypesMod.CreatePolicy
import typings.nodePgMigrate.policiesTypesMod.DropPolicy
import typings.nodePgMigrate.policiesTypesMod.RenamePolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policiesMod {
  
  @JSImport("node-pg-migrate/dist/operations/policies", "alterPolicy")
  @js.native
  def alterPolicy(mOptions: MigrationOptions): AlterPolicy = js.native
  
  @JSImport("node-pg-migrate/dist/operations/policies", "createPolicy")
  @js.native
  def createPolicy(mOptions: MigrationOptions): CreatePolicy = js.native
  
  @JSImport("node-pg-migrate/dist/operations/policies", "dropPolicy")
  @js.native
  def dropPolicy(mOptions: MigrationOptions): DropPolicy = js.native
  
  @JSImport("node-pg-migrate/dist/operations/policies", "renamePolicy")
  @js.native
  def renamePolicy(mOptions: MigrationOptions): RenamePolicy = js.native
}
