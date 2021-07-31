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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("node-pg-migrate/dist/operations/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addTypeAttribute(mOptions: MigrationOptions): AddTypeAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("addTypeAttribute")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AddTypeAttribute]
  
  @scala.inline
  def addTypeValue(mOptions: MigrationOptions): AddTypeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("addTypeValue")(mOptions.asInstanceOf[js.Any]).asInstanceOf[AddTypeValue]
  
  @scala.inline
  def createType(mOptions: MigrationOptions): CreateType = ^.asInstanceOf[js.Dynamic].applyDynamic("createType")(mOptions.asInstanceOf[js.Any]).asInstanceOf[CreateType]
  
  @scala.inline
  def dropType(mOptions: MigrationOptions): DropType = ^.asInstanceOf[js.Dynamic].applyDynamic("dropType")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropType]
  
  @scala.inline
  def dropTypeAttribute(mOptions: MigrationOptions): DropTypeAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("dropTypeAttribute")(mOptions.asInstanceOf[js.Any]).asInstanceOf[DropTypeAttribute]
  
  @scala.inline
  def renameType(mOptions: MigrationOptions): RenameType = ^.asInstanceOf[js.Dynamic].applyDynamic("renameType")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameType]
  
  @scala.inline
  def renameTypeAttribute(mOptions: MigrationOptions): RenameTypeAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTypeAttribute")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameTypeAttribute]
  
  @scala.inline
  def renameTypeValue(mOptions: MigrationOptions): RenameTypeValue = ^.asInstanceOf[js.Dynamic].applyDynamic("renameTypeValue")(mOptions.asInstanceOf[js.Any]).asInstanceOf[RenameTypeValue]
  
  @scala.inline
  def setTypeAttribute(mOptions: MigrationOptions): SetTypeAttribute = ^.asInstanceOf[js.Dynamic].applyDynamic("setTypeAttribute")(mOptions.asInstanceOf[js.Any]).asInstanceOf[SetTypeAttribute]
}
