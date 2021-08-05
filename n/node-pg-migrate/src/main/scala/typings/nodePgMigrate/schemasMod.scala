package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.schemasTypesMod.CreateSchema
import typings.nodePgMigrate.schemasTypesMod.DropSchema
import typings.nodePgMigrate.schemasTypesMod.RenameSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schemasMod {
  
  @JSImport("node-pg-migrate/dist/operations/schemas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSchema(mOptions: MigrationOptions): CreateSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("createSchema")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateSchema]
  
  inline def dropSchema(mOptions: MigrationOptions): DropSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("dropSchema")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropSchema]
  
  inline def renameSchema(mOptions: MigrationOptions): RenameSchema = ^.asInstanceOf[js.Dynamic].applyDynamic("renameSchema")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameSchema]
}
