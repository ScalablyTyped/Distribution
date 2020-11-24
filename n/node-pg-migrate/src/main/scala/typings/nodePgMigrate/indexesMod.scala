package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.indexesTypesMod.CreateIndex
import typings.nodePgMigrate.indexesTypesMod.DropIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/indexes", JSImport.Namespace)
@js.native
object indexesMod extends js.Object {
  
  def createIndex(mOptions: MigrationOptions): CreateIndex = js.native
  
  def dropIndex(mOptions: MigrationOptions): DropIndex = js.native
}
