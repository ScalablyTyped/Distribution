package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.functionsTypesMod.CreateFunction
import typings.nodePgMigrate.functionsTypesMod.DropFunction
import typings.nodePgMigrate.functionsTypesMod.RenameFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMod {
  
  @JSImport("node-pg-migrate/dist/operations/functions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createFunction(mOptions: MigrationOptions): CreateFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("createFunction")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateFunction]
  
  @scala.inline
  def dropFunction(mOptions: MigrationOptions): DropFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("dropFunction")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropFunction]
  
  @scala.inline
  def renameFunction(mOptions: MigrationOptions): RenameFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("renameFunction")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameFunction]
}
