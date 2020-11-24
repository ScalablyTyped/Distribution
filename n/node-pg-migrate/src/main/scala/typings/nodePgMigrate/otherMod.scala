package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.othersTypesMod.Sql
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/other", JSImport.Namespace)
@js.native
object otherMod extends js.Object {
  
  def sql(mOptions: MigrationOptions): Sql = js.native
}
