package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.functionsTypesMod.CreateFunction
import typings.nodePgMigrate.functionsTypesMod.DropFunction
import typings.nodePgMigrate.functionsTypesMod.RenameFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/functions", JSImport.Namespace)
@js.native
object functionsMod extends js.Object {
  
  def createFunction(mOptions: MigrationOptions): CreateFunction = js.native
  
  def dropFunction(mOptions: MigrationOptions): DropFunction = js.native
  
  def renameFunction(mOptions: MigrationOptions): RenameFunction = js.native
}
