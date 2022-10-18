package typings.nodePgMigrate

import typings.nodePgMigrate.distOperationsExtensionsTypesMod.CreateExtension
import typings.nodePgMigrate.distOperationsExtensionsTypesMod.DropExtension
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOperationsExtensionsMod {
  
  @JSImport("node-pg-migrate/dist/operations/extensions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createExtension(mOptions: MigrationOptions): CreateExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("createExtension")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateExtension]
  
  inline def dropExtension(mOptions: MigrationOptions): DropExtension = ^.asInstanceOf[js.Dynamic].applyDynamic("dropExtension")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropExtension]
}
