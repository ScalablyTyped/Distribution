package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.extensionsTypesMod.CreateExtension
import typings.nodePgMigrate.extensionsTypesMod.DropExtension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensionsMod {
  
  @JSImport("node-pg-migrate/dist/operations/extensions", "createExtension")
  @js.native
  def createExtension(mOptions: MigrationOptions): CreateExtension = js.native
  
  @JSImport("node-pg-migrate/dist/operations/extensions", "dropExtension")
  @js.native
  def dropExtension(mOptions: MigrationOptions): DropExtension = js.native
}
