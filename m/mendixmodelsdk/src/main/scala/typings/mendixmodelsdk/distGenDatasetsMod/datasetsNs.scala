package typings.mendixmodelsdk.distGenDatasetsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSet
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetAccess
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetColumn
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetConstraintAccess
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetDateTimeConstraint
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetModuleRoleAccess
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetNumericConstraint
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetObjectConstraint
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetParameter
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetParameterAccess
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetParameterConstraint
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DataSetSource
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DateTimeIntervalLength
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.DateTimeIntervalModifier
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.IDataSet
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.IDataSetParameter
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.JavaDataSetSource
import typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.OqlDataSetSource
import typings.mendixmodelsdk.distGenDatatypesMod.datatypesNs.DataType
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.Document
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IDocument
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distGenSecurityMod.securityNs.IModuleRole
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractEnum
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/datasets", "datasets")
@js.native
object datasetsNs extends js.Object {
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-sets relevant section in reference guide}
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.IDataSet because var conflicts: id, isLoaded, model, name, structureTypeName, unit. Inlined parameters */ @js.native
  class DataSet protected () extends Document {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
    var dataSetAccess: DataSetAccess = js.native
    val parameters: IList[DataSetParameter | IDataSetParameter] = js.native
    var source: DataSetSource = js.native
  }
  
  @js.native
  class DataSetAccess protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDataSet: DataSet = js.native
    @JSName("model")
    var model_DataSetAccess: IModel = js.native
    val moduleRoleAccessList: IList[DataSetModuleRoleAccess] = js.native
  }
  
  @js.native
  class DataSetColumn protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * In version 7.9.0: introduced
      */
    var columnType: DataType = js.native
    val containerAsJavaDataSetSource: JavaDataSetSource = js.native
    @JSName("model")
    var model_DataSetColumn: IModel = js.native
    var name: String = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: String = js.native
  }
  
  @js.native
  class DataSetConstraintAccess protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var constraintText: String = js.native
    val containerAsDataSetParameterAccess: DataSetParameterAccess = js.native
    var enabled: Boolean = js.native
    @JSName("model")
    var model_DataSetConstraintAccess: IModel = js.native
  }
  
  @js.native
  class DataSetDateTimeConstraint protected () extends DataSetParameterConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var length: DateTimeIntervalLength = js.native
    var modifier: DateTimeIntervalModifier = js.native
  }
  
  @js.native
  class DataSetModuleRoleAccess protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDataSetAccess: DataSetAccess = js.native
    @JSName("model")
    var model_DataSetModuleRoleAccess: IModel = js.native
    var moduleRole: IModuleRole | Null = js.native
    val moduleRoleQualifiedName: String | Null = js.native
    val parameterAccessList: IList[DataSetParameterAccess] = js.native
  }
  
  @js.native
  class DataSetNumericConstraint protected () extends DataSetParameterConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var applyBegin: Boolean = js.native
    var applyEnd: Boolean = js.native
    var begin: String = js.native
    var end: String = js.native
  }
  
  @js.native
  class DataSetObjectConstraint protected () extends DataSetParameterConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    var constraint: String = js.native
    var name: String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenDatasetsMod.datasetsNs.IDataSetParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDataSet, name */ @js.native
  class DataSetParameter protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val constraints: IList[DataSetParameterConstraint] = js.native
    val containerAsDataSet: DataSet | IDataSet = js.native
    @JSName("model")
    var model_DataSetParameter: IModel = js.native
    var name: String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: DataType = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterTypeIsRange: Boolean = js.native
    val qualifiedName: String | Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: String = js.native
  }
  
  @js.native
  class DataSetParameterAccess protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val constraintAccessList: IList[DataSetConstraintAccess] = js.native
    val containerAsDataSetModuleRoleAccess: DataSetModuleRoleAccess = js.native
    @JSName("model")
    var model_DataSetParameterAccess: IModel = js.native
    var parameterName: String = js.native
  }
  
  @js.native
  abstract class DataSetParameterConstraint protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDataSetParameter: DataSetParameter = js.native
    @JSName("model")
    var model_DataSetParameterConstraint: IModel = js.native
  }
  
  @js.native
  abstract class DataSetSource protected () extends Element {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val containerAsDataSet: DataSet = js.native
    @JSName("model")
    var model_DataSetSource: IModel = js.native
  }
  
  @js.native
  class DateTimeIntervalLength () extends AbstractEnum
  
  @js.native
  class DateTimeIntervalModifier () extends AbstractEnum
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `DataSets`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-sets relevant section in reference guide}
    */
  @js.native
  trait IDataSet extends IDocument {
    val parameters: IList[IDataSetParameter] = js.native
  }
  
  @js.native
  trait IDataSetParameter
    extends IElement
       with IByNameReferrable {
    val containerAsDataSet: IDataSet = js.native
    @JSName("model")
    val model_IDataSetParameter: IModel = js.native
    val name: String = js.native
  }
  
  @js.native
  class JavaDataSetSource protected () extends DataSetSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    val columns: IList[DataSetColumn] = js.native
    /**
      * In version 8.0.0: introduced
      */
    var useLegacyCodeGeneration: Boolean = js.native
  }
  
  @js.native
  class OqlDataSetSource protected () extends DataSetSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    var ignoreErrorsInQuery: Boolean = js.native
    /**
      * The value of this property is conceptually of type oql.OqlQuery.
      */
    var query: String = js.native
  }
  
  /* static members */
  @js.native
  object DataSet extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates a new DataSet unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): DataSet = js.native
  }
  
  /* static members */
  @js.native
  object DataSetAccess extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataSetAccess = js.native
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * The new DataSetAccess will be automatically stored in the 'dataSetAccess' property
      * of the parent DataSet element passed as argument.
      */
    def createIn(container: DataSet): DataSetAccess = js.native
  }
  
  /* static members */
  @js.native
  object DataSetColumn extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataSetColumn = js.native
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * The new DataSetColumn will be automatically stored in the 'columns' property
      * of the parent JavaDataSetSource element passed as argument.
      */
    def createIn(container: JavaDataSetSource): DataSetColumn = js.native
  }
  
  /* static members */
  @js.native
  object DataSetConstraintAccess extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataSetConstraintAccess = js.native
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
      * of the parent DataSetParameterAccess element passed as argument.
      */
    def createIn(container: DataSetParameterAccess): DataSetConstraintAccess = js.native
  }
  
  /* static members */
  @js.native
  object DataSetDateTimeConstraint extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataSetDateTimeConstraint = js.native
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    def createIn(container: DataSetParameter): DataSetDateTimeConstraint = js.native
  }
  
  /* static members */
  @js.native
  object DataSetModuleRoleAccess extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataSetModuleRoleAccess = js.native
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
      * of the parent DataSetAccess element passed as argument.
      */
    def createIn(container: DataSetAccess): DataSetModuleRoleAccess = js.native
  }
  
  /* static members */
  @js.native
  object DataSetNumericConstraint extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataSetNumericConstraint = js.native
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    def createIn(container: DataSetParameter): DataSetNumericConstraint = js.native
  }
  
  /* static members */
  @js.native
  object DataSetObjectConstraint extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataSetObjectConstraint = js.native
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    def createIn(container: DataSetParameter): DataSetObjectConstraint = js.native
  }
  
  /* static members */
  @js.native
  object DataSetParameter extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataSetParameter = js.native
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * The new DataSetParameter will be automatically stored in the 'parameters' property
      * of the parent DataSet element passed as argument.
      */
    def createIn(container: DataSet): DataSetParameter = js.native
  }
  
  /* static members */
  @js.native
  object DataSetParameterAccess extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): DataSetParameterAccess = js.native
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
      * of the parent DataSetModuleRoleAccess element passed as argument.
      */
    def createIn(container: DataSetModuleRoleAccess): DataSetParameterAccess = js.native
  }
  
  /* static members */
  @js.native
  object DataSetParameterConstraint extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DataSetSource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object DateTimeIntervalLength extends js.Object {
    var Day: DateTimeIntervalLength = js.native
    var Month: DateTimeIntervalLength = js.native
    var Period: DateTimeIntervalLength = js.native
    var Quarter: DateTimeIntervalLength = js.native
    var Week: DateTimeIntervalLength = js.native
    var Year: DateTimeIntervalLength = js.native
  }
  
  /* static members */
  @js.native
  object DateTimeIntervalModifier extends js.Object {
    var Always: DateTimeIntervalModifier = js.native
    var Future: DateTimeIntervalModifier = js.native
    var Last: DateTimeIntervalModifier = js.native
    var Next: DateTimeIntervalModifier = js.native
    var Past: DateTimeIntervalModifier = js.native
    var This: DateTimeIntervalModifier = js.native
  }
  
  /* static members */
  @js.native
  object JavaDataSetSource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): JavaDataSetSource = js.native
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * The new JavaDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    def createIn(container: DataSet): JavaDataSetSource = js.native
  }
  
  /* static members */
  @js.native
  object OqlDataSetSource extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: StructureVersionInfo = js.native
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): OqlDataSetSource = js.native
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * The new OqlDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    def createIn(container: DataSet): OqlDataSetSource = js.native
  }
  
}

