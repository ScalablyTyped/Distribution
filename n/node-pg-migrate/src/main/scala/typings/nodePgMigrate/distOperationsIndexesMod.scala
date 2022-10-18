package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsIndexesTypesMod.CreateIndex
import typings.nodePgMigrate.distOperationsIndexesTypesMod.DropIndex
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsIndexesMod {
  
  @JSImport("node-pg-migrate/dist/operations/indexes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIndex(mOptions: MigrationOptions): CreateIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndex")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateIndex]
  
  inline def dropIndex(mOptions: MigrationOptions): DropIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("dropIndex")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropIndex]
}
