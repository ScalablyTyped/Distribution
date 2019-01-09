package typings
package mendixmodelsdkLib.distGenDatasetsMod

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
  - mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.IDataSet because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined parameters, asLoaded, load, load, load, load */ @js.native
  class DataSet protected ()
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.Document {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
    var dataSetAccess: DataSetAccess = js.native
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DataSetParameter | IDataSetParameter] = js.native
    var source: DataSetSource = js.native
  }
  
  @js.native
  class DataSetAccess protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDataSet: DataSet = js.native
    @JSName("model")
    var model_DataSetAccess: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val moduleRoleAccessList: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DataSetModuleRoleAccess] = js.native
  }
  
  @js.native
  class DataSetColumn protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * In version 7.9.0: introduced
      */
    var columnType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
    val containerAsJavaDataSetSource: JavaDataSetSource = js.native
    @JSName("model")
    var model_DataSetColumn: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: java.lang.String = js.native
  }
  
  @js.native
  class DataSetConstraintAccess protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var constraintText: java.lang.String = js.native
    val containerAsDataSetParameterAccess: DataSetParameterAccess = js.native
    var enabled: scala.Boolean = js.native
    @JSName("model")
    var model_DataSetConstraintAccess: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class DataSetDateTimeConstraint protected () extends DataSetParameterConstraint {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var length: DateTimeIntervalLength = js.native
    var modifier: DateTimeIntervalModifier = js.native
  }
  
  @js.native
  class DataSetModuleRoleAccess protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDataSetAccess: DataSetAccess = js.native
    @JSName("model")
    var model_DataSetModuleRoleAccess: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var moduleRole: mendixmodelsdkLib.distGenSecurityMod.securityNs.IModuleRole | scala.Null = js.native
    val moduleRoleQualifiedName: java.lang.String | scala.Null = js.native
    val parameterAccessList: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DataSetParameterAccess] = js.native
  }
  
  @js.native
  class DataSetNumericConstraint protected () extends DataSetParameterConstraint {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var applyBegin: scala.Boolean = js.native
    var applyEnd: scala.Boolean = js.native
    var begin: java.lang.String = js.native
    var end: java.lang.String = js.native
  }
  
  @js.native
  class DataSetObjectConstraint protected () extends DataSetParameterConstraint {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
      * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
      */
    var constraint: java.lang.String = js.native
    var name: java.lang.String = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.IDataSetParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDataSet, name, asLoaded, load, load, load, load */ @js.native
  class DataSetParameter protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val constraints: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DataSetParameterConstraint] = js.native
    val containerAsDataSet: DataSet | IDataSet = js.native
    @JSName("model")
    var model_DataSetParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var name: java.lang.String = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterType: mendixmodelsdkLib.distGenDatatypesMod.datatypesNs.DataType = js.native
    /**
      * In version 7.9.0: introduced
      */
    var parameterTypeIsRange: scala.Boolean = js.native
    val qualifiedName: java.lang.String | scala.Null = js.native
    /**
      * The value of this property is conceptually of type dataTypes.LegacyDataType.
      *
      * In version 7.9.0: deleted
      */
    var `type`: java.lang.String = js.native
  }
  
  @js.native
  class DataSetParameterAccess protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val constraintAccessList: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DataSetConstraintAccess] = js.native
    val containerAsDataSetModuleRoleAccess: DataSetModuleRoleAccess = js.native
    @JSName("model")
    var model_DataSetParameterAccess: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var parameterName: java.lang.String = js.native
  }
  
  @js.native
  abstract class DataSetParameterConstraint protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDataSetParameter: DataSetParameter = js.native
    @JSName("model")
    var model_DataSetParameterConstraint: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  abstract class DataSetSource protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsDataSet: DataSet = js.native
    @JSName("model")
    var model_DataSetSource: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class DateTimeIntervalLength ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class DateTimeIntervalModifier ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `DataSets`.
    */
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-sets relevant section in reference guide}
    */
  @js.native
  trait IDataSet
    extends mendixmodelsdkLib.distGenProjectsMod.projectsNs.IDocument {
    val parameters: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[IDataSetParameter] = js.native
  }
  
  @js.native
  trait IDataSetParameter
    extends mendixmodelsdkLib.distSdkInternalElementsMod.IElement
       with mendixmodelsdkLib.distSdkInternalElementsMod.IByNameReferrable {
    val containerAsDataSet: IDataSet = js.native
    @JSName("model")
    val model_IDataSetParameter: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    val name: java.lang.String = js.native
  }
  
  @js.native
  class JavaDataSetSource protected () extends DataSetSource {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val columns: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[DataSetColumn] = js.native
  }
  
  @js.native
  class OqlDataSetSource protected () extends DataSetSource {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var ignoreErrorsInQuery: scala.Boolean = js.native
    /**
      * The value of this property is conceptually of type oql.OqlQuery.
      */
    var query: java.lang.String = js.native
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/data-sets relevant section in reference guide}
    */
  @js.native
  object DataSet extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates a new DataSet unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSet = js.native
  }
  
  @js.native
  object DataSetAccess extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetAccess = js.native
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * The new DataSetAccess will be automatically stored in the 'dataSetAccess' property
      * of the parent DataSet element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSet): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetAccess = js.native
  }
  
  @js.native
  object DataSetColumn extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn = js.native
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * The new DataSetColumn will be automatically stored in the 'columns' property
      * of the parent JavaDataSetSource element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.JavaDataSetSource): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetColumn = js.native
  }
  
  @js.native
  object DataSetConstraintAccess extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetConstraintAccess = js.native
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
      * of the parent DataSetParameterAccess element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameterAccess): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetConstraintAccess = js.native
  }
  
  @js.native
  object DataSetDateTimeConstraint extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetDateTimeConstraint = js.native
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetDateTimeConstraint = js.native
  }
  
  @js.native
  object DataSetModuleRoleAccess extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetModuleRoleAccess = js.native
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
      * of the parent DataSetAccess element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetAccess): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetModuleRoleAccess = js.native
  }
  
  @js.native
  object DataSetNumericConstraint extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetNumericConstraint = js.native
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetNumericConstraint = js.native
  }
  
  @js.native
  object DataSetObjectConstraint extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetObjectConstraint = js.native
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetObjectConstraint = js.native
  }
  
  @js.native
  object DataSetParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * The new DataSetParameter will be automatically stored in the 'parameters' property
      * of the parent DataSet element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSet): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameter = js.native
  }
  
  @js.native
  object DataSetParameterAccess extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameterAccess = js.native
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
      * of the parent DataSetModuleRoleAccess element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetModuleRoleAccess): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSetParameterAccess = js.native
  }
  
  @js.native
  object DataSetParameterConstraint extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  object DataSetSource extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  object DateTimeIntervalLength extends js.Object {
    var Day: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalLength = js.native
    var Month: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalLength = js.native
    var Period: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalLength = js.native
    var Quarter: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalLength = js.native
    var Week: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalLength = js.native
    var Year: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalLength = js.native
  }
  
  @js.native
  object DateTimeIntervalModifier extends js.Object {
    var Always: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalModifier = js.native
    var Future: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalModifier = js.native
    var Last: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalModifier = js.native
    var Next: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalModifier = js.native
    var Past: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalModifier = js.native
    var This: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DateTimeIntervalModifier = js.native
  }
  
  @js.native
  object JavaDataSetSource extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.JavaDataSetSource = js.native
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * The new JavaDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSet): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.JavaDataSetSource = js.native
  }
  
  @js.native
  object OqlDataSetSource extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenDatasetsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.OqlDataSetSource = js.native
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * The new OqlDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    def createIn(container: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.DataSet): mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.OqlDataSetSource = js.native
  }
  
}

