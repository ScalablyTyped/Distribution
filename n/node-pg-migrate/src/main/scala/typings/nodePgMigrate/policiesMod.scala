package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.policiesTypesMod.AlterPolicy
import typings.nodePgMigrate.policiesTypesMod.CreatePolicy
import typings.nodePgMigrate.policiesTypesMod.DropPolicy
import typings.nodePgMigrate.policiesTypesMod.RenamePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/operations/policies", JSImport.Namespace)
@js.native
object policiesMod extends js.Object {
  def alterPolicy(mOptions: MigrationOptions): AlterPolicy = js.native
  def createPolicy(mOptions: MigrationOptions): CreatePolicy = js.native
  def dropPolicy(mOptions: MigrationOptions): DropPolicy = js.native
  def renamePolicy(mOptions: MigrationOptions): RenamePolicy = js.native
}

