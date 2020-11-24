package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.typesTypesMod.AddTypeAttribute
import typings.nodePgMigrate.typesTypesMod.AddTypeValue
import typings.nodePgMigrate.typesTypesMod.CreateType
import typings.nodePgMigrate.typesTypesMod.DropType
import typings.nodePgMigrate.typesTypesMod.DropTypeAttribute
import typings.nodePgMigrate.typesTypesMod.RenameType
import typings.nodePgMigrate.typesTypesMod.RenameTypeAttribute
import typings.nodePgMigrate.typesTypesMod.RenameTypeValue
import typings.nodePgMigrate.typesTypesMod.SetTypeAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  
  def addTypeAttribute(mOptions: MigrationOptions): AddTypeAttribute = js.native
  
  def addTypeValue(mOptions: MigrationOptions): AddTypeValue = js.native
  
  def createType(mOptions: MigrationOptions): CreateType = js.native
  
  def dropType(mOptions: MigrationOptions): DropType = js.native
  
  def dropTypeAttribute(mOptions: MigrationOptions): DropTypeAttribute = js.native
  
  def renameType(mOptions: MigrationOptions): RenameType = js.native
  
  def renameTypeAttribute(mOptions: MigrationOptions): RenameTypeAttribute = js.native
  
  def renameTypeValue(mOptions: MigrationOptions): RenameTypeValue = js.native
  
  def setTypeAttribute(mOptions: MigrationOptions): SetTypeAttribute = js.native
}
