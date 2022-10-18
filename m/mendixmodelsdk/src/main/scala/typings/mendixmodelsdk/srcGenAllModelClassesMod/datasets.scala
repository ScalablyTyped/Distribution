package typings.mendixmodelsdk.srcGenAllModelClassesMod

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasets {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/data-sets relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSet")
  @js.native
  open class DataSet protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSet {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object DataSet {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DataSet unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    inline def createIn(container: IFolderBase): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSet]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSet.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSet.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetAccess")
  @js.native
  open class DataSetAccess protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetAccess {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetAccess {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetAccess]
    
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * The new DataSetAccess will be automatically stored in the 'dataSetAccess' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSet): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetAccess]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetAccess.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetColumn")
  @js.native
  open class DataSetColumn protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetColumn {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetColumn")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn]
    
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * The new DataSetColumn will be automatically stored in the 'columns' property
      * of the parent JavaDataSetSource element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.JavaDataSetSource): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetColumn]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetColumn.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetColumn.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetConstraintAccess")
  @js.native
  open class DataSetConstraintAccess protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetConstraintAccess {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetConstraintAccess {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetConstraintAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetConstraintAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetConstraintAccess]
    
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
      * of the parent DataSetParameterAccess element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameterAccess): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetConstraintAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetConstraintAccess]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetConstraintAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetConstraintAccess.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetDateTimeConstraint")
  @js.native
  open class DataSetDateTimeConstraint protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetDateTimeConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetDateTimeConstraint {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetDateTimeConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetDateTimeConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetDateTimeConstraint]
    
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetDateTimeConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetDateTimeConstraint]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetDateTimeConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetDateTimeConstraint.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetModuleRoleAccess")
  @js.native
  open class DataSetModuleRoleAccess protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetModuleRoleAccess {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetModuleRoleAccess {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetModuleRoleAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetModuleRoleAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetModuleRoleAccess]
    
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
      * of the parent DataSetAccess element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetAccess): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetModuleRoleAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetModuleRoleAccess]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetModuleRoleAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetModuleRoleAccess.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetNumericConstraint")
  @js.native
  open class DataSetNumericConstraint protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetNumericConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetNumericConstraint {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetNumericConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetNumericConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetNumericConstraint]
    
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetNumericConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetNumericConstraint]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetNumericConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetNumericConstraint.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetObjectConstraint")
  @js.native
  open class DataSetObjectConstraint protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetObjectConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetObjectConstraint {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetObjectConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetObjectConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetObjectConstraint]
    
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetObjectConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetObjectConstraint]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetObjectConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetObjectConstraint.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameter")
  @js.native
  open class DataSetParameter protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameter {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter]
    
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * The new DataSetParameter will be automatically stored in the 'parameters' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSet): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameterAccess")
  @js.native
  open class DataSetParameterAccess protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameterAccess {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameterAccess {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameterAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameterAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameterAccess]
    
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
      * of the parent DataSetModuleRoleAccess element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetModuleRoleAccess): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameterAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameterAccess]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameterAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameterAccess.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameterConstraint")
  @js.native
  open class DataSetParameterConstraint protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetParameterConstraint {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameterConstraint {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameterConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetParameterConstraint.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetSource")
  @js.native
  open class DataSetSource protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSetSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetSource {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DataSetSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalLength")
  @js.native
  open class DateTimeIntervalLength protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateTimeIntervalLength {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalLength")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalLength.Day")
    @js.native
    def Day: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength = js.native
    inline def Day_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Day")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalLength.Month")
    @js.native
    def Month: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength = js.native
    inline def Month_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalLength.Period")
    @js.native
    def Period: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength = js.native
    inline def Period_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalLength.Quarter")
    @js.native
    def Quarter: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength = js.native
    inline def Quarter_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalLength.Week")
    @js.native
    def Week: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength = js.native
    inline def Week_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalLength.Year")
    @js.native
    def Year: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength = js.native
    inline def Year_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalModifier")
  @js.native
  open class DateTimeIntervalModifier protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateTimeIntervalModifier {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalModifier")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Always")
    @js.native
    def Always: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier = js.native
    inline def Always_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Always")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Future")
    @js.native
    def Future: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier = js.native
    inline def Future_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Future")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Last")
    @js.native
    def Last: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier = js.native
    inline def Last_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Last")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Next")
    @js.native
    def Next: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier = js.native
    inline def Next_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Next")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalModifier.Past")
    @js.native
    def Past: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier = js.native
    inline def Past_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Past")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.DateTimeIntervalModifier.This")
    @js.native
    def This: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier = js.native
    inline def This_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("This")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.JavaDataSetSource")
  @js.native
  open class JavaDataSetSource protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.JavaDataSetSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object JavaDataSetSource {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.JavaDataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.JavaDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.JavaDataSetSource]
    
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * The new JavaDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSet): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.JavaDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.JavaDataSetSource]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.JavaDataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.JavaDataSetSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.OqlDataSetSource")
  @js.native
  open class OqlDataSetSource protected ()
    extends typings.mendixmodelsdk.srcGenDatasetsMod.datasets.OqlDataSetSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object OqlDataSetSource {
    
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.OqlDataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    inline def create(model: IModel): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.OqlDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.OqlDataSetSource]
    
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * The new OqlDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    inline def createIn(container: typings.mendixmodelsdk.srcGenDatasetsMod.datasets.DataSet): typings.mendixmodelsdk.srcGenDatasetsMod.datasets.OqlDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDatasetsMod.datasets.OqlDataSetSource]
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.OqlDataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/src/gen/all-model-classes", "datasets.OqlDataSetSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo = js.native
    inline def versionInfo_=(x: typings.mendixmodelsdk.srcGenDatasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
