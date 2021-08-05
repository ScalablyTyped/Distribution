package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.datatypesMod.datatypes.DataType
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractEnum
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.securityMod.security.IModuleRole
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasetsMod {
  
  @JSImport("mendixmodelsdk/dist/gen/datasets", "StructureVersionInfo")
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  object datasets {
    
    /**
      * See: {@link https://docs.mendix.com/refguide/data-sets relevant section in reference guide}
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.datasetsMod.datasets.IDataSet because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined parameters */ @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSet")
    @js.native
    class DataSet protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MDataSet: FolderBase = js.native
      
      def dataSetAccess: DataSetAccess = js.native
      def dataSetAccess_=(newValue: DataSetAccess): Unit = js.native
      
      def parameters: IList[DataSetParameter] = js.native
      @JSName("parameters")
      val parameters_FDataSet: IList[IDataSetParameter] = js.native
      
      def source: DataSetSource = js.native
      def source_=(newValue: DataSetSource): Unit = js.native
    }
    object DataSet {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSet")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates a new DataSet unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      /* static member */
      inline def createIn(container: IFolderBase): DataSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSet]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSet.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSet.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetAccess")
    @js.native
    class DataSetAccess protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsDataSet: DataSet = js.native
      
      def moduleRoleAccessList: IList[DataSetModuleRoleAccess] = js.native
    }
    object DataSetAccess {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetAccess")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DataSetAccess instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DataSetAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataSetAccess]
      
      /**
        * Creates and returns a new DataSetAccess instance in the SDK and on the server.
        * The new DataSetAccess will be automatically stored in the 'dataSetAccess' property
        * of the parent DataSet element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSet): DataSetAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSetAccess]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetAccess.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetAccess.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetColumn")
    @js.native
    class DataSetColumn protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * In version 7.9.0: introduced
        */
      def columnType: DataType = js.native
      def columnType_=(newValue: DataType): Unit = js.native
      
      def containerAsJavaDataSetSource: JavaDataSetSource = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      
      /**
        * The value of this property is conceptually of type dataTypes.LegacyDataType.
        *
        * In version 7.9.0: deleted
        */
      def `type`: String = js.native
      def type_=(newValue: String): Unit = js.native
    }
    object DataSetColumn {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetColumn")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DataSetColumn instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DataSetColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataSetColumn]
      
      /**
        * Creates and returns a new DataSetColumn instance in the SDK and on the server.
        * The new DataSetColumn will be automatically stored in the 'columns' property
        * of the parent JavaDataSetSource element passed as argument.
        */
      /* static member */
      inline def createIn(container: JavaDataSetSource): DataSetColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSetColumn]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetColumn.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetColumn.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetConstraintAccess")
    @js.native
    class DataSetConstraintAccess protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def constraintText: String = js.native
      def constraintText_=(newValue: String): Unit = js.native
      
      def containerAsDataSetParameterAccess: DataSetParameterAccess = js.native
      
      def enabled: Boolean = js.native
      def enabled_=(newValue: Boolean): Unit = js.native
    }
    object DataSetConstraintAccess {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetConstraintAccess")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DataSetConstraintAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataSetConstraintAccess]
      
      /**
        * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
        * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
        * of the parent DataSetParameterAccess element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSetParameterAccess): DataSetConstraintAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSetConstraintAccess]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetConstraintAccess.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetConstraintAccess.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetDateTimeConstraint")
    @js.native
    class DataSetDateTimeConstraint protected () extends DataSetParameterConstraint {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def length: DateTimeIntervalLength = js.native
      def length_=(newValue: DateTimeIntervalLength): Unit = js.native
      
      def modifier: DateTimeIntervalModifier = js.native
      def modifier_=(newValue: DateTimeIntervalModifier): Unit = js.native
    }
    object DataSetDateTimeConstraint {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetDateTimeConstraint")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DataSetDateTimeConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataSetDateTimeConstraint]
      
      /**
        * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
        * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
        * of the parent DataSetParameter element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSetParameter): DataSetDateTimeConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSetDateTimeConstraint]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetDateTimeConstraint.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetDateTimeConstraint.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetModuleRoleAccess")
    @js.native
    class DataSetModuleRoleAccess protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsDataSetAccess: DataSetAccess = js.native
      
      def moduleRole: IModuleRole | Null = js.native
      
      def moduleRoleQualifiedName: String | Null = js.native
      
      def moduleRole_=(newValue: IModuleRole | Null): Unit = js.native
      
      def parameterAccessList: IList[DataSetParameterAccess] = js.native
    }
    object DataSetModuleRoleAccess {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetModuleRoleAccess")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DataSetModuleRoleAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataSetModuleRoleAccess]
      
      /**
        * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
        * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
        * of the parent DataSetAccess element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSetAccess): DataSetModuleRoleAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSetModuleRoleAccess]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetModuleRoleAccess.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetModuleRoleAccess.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetNumericConstraint")
    @js.native
    class DataSetNumericConstraint protected () extends DataSetParameterConstraint {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def applyBegin: Boolean = js.native
      def applyBegin_=(newValue: Boolean): Unit = js.native
      
      def applyEnd: Boolean = js.native
      def applyEnd_=(newValue: Boolean): Unit = js.native
      
      def begin: String = js.native
      def begin_=(newValue: String): Unit = js.native
      
      def end: String = js.native
      def end_=(newValue: String): Unit = js.native
    }
    object DataSetNumericConstraint {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetNumericConstraint")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DataSetNumericConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataSetNumericConstraint]
      
      /**
        * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
        * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
        * of the parent DataSetParameter element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSetParameter): DataSetNumericConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSetNumericConstraint]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetNumericConstraint.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetNumericConstraint.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetObjectConstraint")
    @js.native
    class DataSetObjectConstraint protected () extends DataSetParameterConstraint {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      /**
        * The value of this property is conceptually of type xPathConstraints.XPathConstraint.
        */
      def constraint: String = js.native
      def constraint_=(newValue: String): Unit = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
    }
    object DataSetObjectConstraint {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetObjectConstraint")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DataSetObjectConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataSetObjectConstraint]
      
      /**
        * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
        * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
        * of the parent DataSetParameter element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSetParameter): DataSetObjectConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSetObjectConstraint]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetObjectConstraint.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetObjectConstraint.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.datasetsMod.datasets.IDataSetParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsDataSet, name */ @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameter")
    @js.native
    class DataSetParameter protected ()
      extends Element[IModel]
         with IByNameReferrable {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def constraints: IList[DataSetParameterConstraint] = js.native
      
      def containerAsDataSet: DataSet = js.native
      @JSName("containerAsDataSet")
      val containerAsDataSet_FDataSetParameter: IDataSet = js.native
      
      def name: String = js.native
      def name_=(newValue: String): Unit = js.native
      @JSName("name")
      val name_FDataSetParameter: String = js.native
      
      /**
        * In version 7.9.0: introduced
        */
      def parameterType: DataType = js.native
      
      /**
        * In version 7.9.0: introduced
        */
      def parameterTypeIsRange: Boolean = js.native
      def parameterTypeIsRange_=(newValue: Boolean): Unit = js.native
      
      def parameterType_=(newValue: DataType): Unit = js.native
      
      /**
        * Returns the qualified name of this element, or
        * null if this element is not a part of the model,
        * or if it or one of its namespace containers does not have a
        * valid name.
        */
      /* CompleteClass */
      override val qualifiedName: String | Null = js.native
      @JSName("qualifiedName")
      def qualifiedName_MDataSetParameter: String | Null = js.native
      
      /**
        * The value of this property is conceptually of type dataTypes.LegacyDataType.
        *
        * In version 7.9.0: deleted
        */
      def `type`: String = js.native
      def type_=(newValue: String): Unit = js.native
    }
    object DataSetParameter {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameter")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DataSetParameter instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DataSetParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataSetParameter]
      
      /**
        * Creates and returns a new DataSetParameter instance in the SDK and on the server.
        * The new DataSetParameter will be automatically stored in the 'parameters' property
        * of the parent DataSet element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSet): DataSetParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSetParameter]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameter.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameter.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterAccess")
    @js.native
    class DataSetParameterAccess protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def constraintAccessList: IList[DataSetConstraintAccess] = js.native
      
      def containerAsDataSetModuleRoleAccess: DataSetModuleRoleAccess = js.native
      
      def parameterName: String = js.native
      def parameterName_=(newValue: String): Unit = js.native
    }
    object DataSetParameterAccess {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterAccess")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): DataSetParameterAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataSetParameterAccess]
      
      /**
        * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
        * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
        * of the parent DataSetModuleRoleAccess element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSetModuleRoleAccess): DataSetParameterAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[DataSetParameterAccess]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterAccess.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterAccess.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterConstraint")
    @js.native
    abstract class DataSetParameterConstraint protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsDataSetParameter: DataSetParameter = js.native
    }
    object DataSetParameterConstraint {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterConstraint")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterConstraint.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetParameterConstraint.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetSource")
    @js.native
    abstract class DataSetSource protected () extends Element[IModel] {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def containerAsDataSet: DataSet = js.native
    }
    object DataSetSource {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetSource")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetSource.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DataSetSource.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalLength")
    @js.native
    class DateTimeIntervalLength protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object DateTimeIntervalLength {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalLength")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalLength.Day")
      @js.native
      def Day: DateTimeIntervalLength = js.native
      inline def Day_=(x: DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Day")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalLength.Month")
      @js.native
      def Month: DateTimeIntervalLength = js.native
      inline def Month_=(x: DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalLength.Period")
      @js.native
      def Period: DateTimeIntervalLength = js.native
      inline def Period_=(x: DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalLength.Quarter")
      @js.native
      def Quarter: DateTimeIntervalLength = js.native
      inline def Quarter_=(x: DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalLength.Week")
      @js.native
      def Week: DateTimeIntervalLength = js.native
      inline def Week_=(x: DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalLength.Year")
      @js.native
      def Year: DateTimeIntervalLength = js.native
      inline def Year_=(x: DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalModifier")
    @js.native
    class DateTimeIntervalModifier protected () extends AbstractEnum {
      def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
    }
    object DateTimeIntervalModifier {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalModifier")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalModifier.Always")
      @js.native
      def Always: DateTimeIntervalModifier = js.native
      inline def Always_=(x: DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Always")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalModifier.Future")
      @js.native
      def Future: DateTimeIntervalModifier = js.native
      inline def Future_=(x: DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Future")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalModifier.Last")
      @js.native
      def Last: DateTimeIntervalModifier = js.native
      inline def Last_=(x: DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Last")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalModifier.Next")
      @js.native
      def Next: DateTimeIntervalModifier = js.native
      inline def Next_=(x: DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Next")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalModifier.Past")
      @js.native
      def Past: DateTimeIntervalModifier = js.native
      inline def Past_=(x: DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Past")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.DateTimeIntervalModifier.This")
      @js.native
      def This: DateTimeIntervalModifier = js.native
      inline def This_=(x: DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("This")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.JavaDataSetSource")
    @js.native
    class JavaDataSetSource protected () extends DataSetSource {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def columns: IList[DataSetColumn] = js.native
      
      /**
        * In version 8.0.0: introduced
        */
      def useLegacyCodeGeneration: Boolean = js.native
      def useLegacyCodeGeneration_=(newValue: Boolean): Unit = js.native
    }
    object JavaDataSetSource {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.JavaDataSetSource")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): JavaDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[JavaDataSetSource]
      
      /**
        * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
        * The new JavaDataSetSource will be automatically stored in the 'source' property
        * of the parent DataSet element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSet): JavaDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[JavaDataSetSource]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.JavaDataSetSource.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.JavaDataSetSource.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.OqlDataSetSource")
    @js.native
    class OqlDataSetSource protected () extends DataSetSource {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit[IAbstractModel],
        container: AbstractElement[IAbstractModel, Container]
      ) = this()
      
      def ignoreErrorsInQuery: Boolean = js.native
      def ignoreErrorsInQuery_=(newValue: Boolean): Unit = js.native
      
      /**
        * The value of this property is conceptually of type oql.OqlQuery.
        */
      def query: String = js.native
      def query_=(newValue: String): Unit = js.native
    }
    object OqlDataSetSource {
      
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.OqlDataSetSource")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      /* static member */
      inline def create(model: IModel): OqlDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[OqlDataSetSource]
      
      /**
        * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
        * The new OqlDataSetSource will be automatically stored in the 'source' property
        * of the parent DataSet element passed as argument.
        */
      /* static member */
      inline def createIn(container: DataSet): OqlDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[OqlDataSetSource]
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.OqlDataSetSource.structureTypeName")
      @js.native
      def structureTypeName: String = js.native
      inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSImport("mendixmodelsdk/dist/gen/datasets", "datasets.OqlDataSetSource.versionInfo")
      @js.native
      def versionInfo: StructureVersionInfo = js.native
      inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `DataSets`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide/data-sets relevant section in reference guide}
      */
    @js.native
    trait IDataSet
      extends StObject
         with IDocument {
      
      val parameters: IList[IDataSetParameter] = js.native
    }
    
    @js.native
    trait IDataSetParameter
      extends StObject
         with IElement
         with IByNameReferrable {
      
      val containerAsDataSet: IDataSet = js.native
      
      @JSName("model")
      val model_IDataSetParameter: IModel = js.native
      
      val name: String = js.native
    }
  }
}
