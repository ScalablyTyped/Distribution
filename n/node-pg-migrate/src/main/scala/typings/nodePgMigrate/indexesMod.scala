package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.indexesTypesMod.CreateIndex
import typings.nodePgMigrate.indexesTypesMod.DropIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexesMod {
  
  @JSImport("node-pg-migrate/dist/operations/indexes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createIndex(mOptions: MigrationOptions): CreateIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndex")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateIndex]
  
  @scala.inline
  def dropIndex(mOptions: MigrationOptions): DropIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("dropIndex")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropIndex]
}
