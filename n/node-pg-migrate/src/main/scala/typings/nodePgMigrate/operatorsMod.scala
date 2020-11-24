package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.operatorsTypesMod.AddToOperatorFamily
import typings.nodePgMigrate.operatorsTypesMod.CreateOperator
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorClass
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorFamily
import typings.nodePgMigrate.operatorsTypesMod.DropOperator
import typings.nodePgMigrate.operatorsTypesMod.DropOperatorClass
import typings.nodePgMigrate.operatorsTypesMod.DropOperatorFamily
import typings.nodePgMigrate.operatorsTypesMod.RemoveFromOperatorFamily
import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorClass
import typings.nodePgMigrate.operatorsTypesMod.RenameOperatorFamily
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/operators", JSImport.Namespace)
@js.native
object operatorsMod extends js.Object {
  
  def addToOperatorFamily(mOptions: MigrationOptions): AddToOperatorFamily = js.native
  
  def createOperator(mOptions: MigrationOptions): CreateOperator = js.native
  
  def createOperatorClass(mOptions: MigrationOptions): CreateOperatorClass = js.native
  
  def createOperatorFamily(mOptions: MigrationOptions): CreateOperatorFamily = js.native
  
  def dropOperator(mOptions: MigrationOptions): DropOperator = js.native
  
  def dropOperatorClass(mOptions: MigrationOptions): DropOperatorClass = js.native
  
  def dropOperatorFamily(mOptions: MigrationOptions): DropOperatorFamily = js.native
  
  def removeFromOperatorFamily(mOptions: MigrationOptions): RemoveFromOperatorFamily = js.native
  
  def renameOperatorClass(mOptions: MigrationOptions): RenameOperatorClass = js.native
  
  def renameOperatorFamily(mOptions: MigrationOptions): RenameOperatorFamily = js.native
}
