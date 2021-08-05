package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IAttribute
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DatabaseConstraint")
@js.native
class DatabaseConstraint protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def attribute: IAttribute | Null = js.native
  
  def attributeQualifiedName: String | Null = js.native
  
  def attribute_=(newValue: IAttribute | Null): Unit = js.native
  
  def containerAsDatabaseSourceBase: DatabaseSourceBase = js.native
  
  def containerAsSelectorDatabaseSource: SelectorDatabaseSource = js.native
  
  def operator: DatabaseConstraintOperator = js.native
  def operator_=(newValue: DatabaseConstraintOperator): Unit = js.native
  
  def value: String = js.native
  def value_=(newValue: String): Unit = js.native
}
object DatabaseConstraint {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DatabaseConstraint")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): DatabaseConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DatabaseConstraint]
  
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * The new DatabaseConstraint will be automatically stored in the 'databaseConstraints' property
    * of the parent DatabaseSourceBase element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.0.1
    */
  /* static member */
  inline def createIn(container: DatabaseSourceBase): DatabaseConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DatabaseConstraint]
  
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * The new DatabaseConstraint will be automatically stored in the 'databaseConstraints' property
    * of the parent DatabaseSourceBase element passed as argument.
    */
  /* static member */
  inline def createInDatabaseSourceBaseUnderDatabaseConstraints(container: DatabaseSourceBase): DatabaseConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDatabaseSourceBaseUnderDatabaseConstraints")(container.asInstanceOf[js.Any]).asInstanceOf[DatabaseConstraint]
  
  /**
    * Creates and returns a new DatabaseConstraint instance in the SDK and on the server.
    * The new DatabaseConstraint will be automatically stored in the 'databaseConstraints' property
    * of the parent SelectorDatabaseSource element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.1.0 and higher
    */
  /* static member */
  inline def createInSelectorDatabaseSourceUnderDatabaseConstraints(container: SelectorDatabaseSource): DatabaseConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createInSelectorDatabaseSourceUnderDatabaseConstraints")(container.asInstanceOf[js.Any]).asInstanceOf[DatabaseConstraint]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DatabaseConstraint.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DatabaseConstraint.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
