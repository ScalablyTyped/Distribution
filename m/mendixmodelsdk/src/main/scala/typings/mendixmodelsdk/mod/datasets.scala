package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.versionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasets {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/data-sets relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk", "datasets.DataSet")
  @js.native
  class DataSet protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSet {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object DataSet {
    
    @JSImport("mendixmodelsdk", "datasets.DataSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new DataSet unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @scala.inline
    def createIn(container: IFolderBase): typings.mendixmodelsdk.datasetsMod.datasets.DataSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSet]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSet.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSet.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetAccess")
  @js.native
  class DataSetAccess protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetAccess {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetAccess {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetAccess]
    
    /**
      * Creates and returns a new DataSetAccess instance in the SDK and on the server.
      * The new DataSetAccess will be automatically stored in the 'dataSetAccess' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSet): typings.mendixmodelsdk.datasetsMod.datasets.DataSetAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetAccess]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetAccess.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetColumn")
  @js.native
  class DataSetColumn protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetColumn {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetColumn {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetColumn")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetColumn]
    
    /**
      * Creates and returns a new DataSetColumn instance in the SDK and on the server.
      * The new DataSetColumn will be automatically stored in the 'columns' property
      * of the parent JavaDataSetSource element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource): typings.mendixmodelsdk.datasetsMod.datasets.DataSetColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetColumn]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetColumn.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetColumn.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess")
  @js.native
  class DataSetConstraintAccess protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetConstraintAccess {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetConstraintAccess {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess]
    
    /**
      * Creates and returns a new DataSetConstraintAccess instance in the SDK and on the server.
      * The new DataSetConstraintAccess will be automatically stored in the 'constraintAccessList' property
      * of the parent DataSetParameterAccess element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess): typings.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetConstraintAccess]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetConstraintAccess.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint")
  @js.native
  class DataSetDateTimeConstraint protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetDateTimeConstraint {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetDateTimeConstraint {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetDateTimeConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetDateTimeConstraint]
    
    /**
      * Creates and returns a new DataSetDateTimeConstraint instance in the SDK and on the server.
      * The new DataSetDateTimeConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.datasetsMod.datasets.DataSetDateTimeConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetDateTimeConstraint]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetDateTimeConstraint.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess")
  @js.native
  class DataSetModuleRoleAccess protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetModuleRoleAccess {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetModuleRoleAccess {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess]
    
    /**
      * Creates and returns a new DataSetModuleRoleAccess instance in the SDK and on the server.
      * The new DataSetModuleRoleAccess will be automatically stored in the 'moduleRoleAccessList' property
      * of the parent DataSetAccess element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSetAccess): typings.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetModuleRoleAccess.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint")
  @js.native
  class DataSetNumericConstraint protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetNumericConstraint {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetNumericConstraint {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint]
    
    /**
      * Creates and returns a new DataSetNumericConstraint instance in the SDK and on the server.
      * The new DataSetNumericConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetNumericConstraint]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetNumericConstraint.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint")
  @js.native
  class DataSetObjectConstraint protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetObjectConstraint {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetObjectConstraint {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint]
    
    /**
      * Creates and returns a new DataSetObjectConstraint instance in the SDK and on the server.
      * The new DataSetObjectConstraint will be automatically stored in the 'constraints' property
      * of the parent DataSetParameter element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter): typings.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetObjectConstraint]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetObjectConstraint.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetParameter")
  @js.native
  class DataSetParameter protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetParameter {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameter {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetParameter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter]
    
    /**
      * Creates and returns a new DataSetParameter instance in the SDK and on the server.
      * The new DataSetParameter will be automatically stored in the 'parameters' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSet): typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameter]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameter.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameter.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess")
  @js.native
  class DataSetParameterAccess protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetParameterAccess {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameterAccess {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess]
    
    /**
      * Creates and returns a new DataSetParameterAccess instance in the SDK and on the server.
      * The new DataSetParameterAccess will be automatically stored in the 'parameterAccessList' property
      * of the parent DataSetModuleRoleAccess element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSetModuleRoleAccess): typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.DataSetParameterAccess]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterAccess.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint")
  @js.native
  abstract class DataSetParameterConstraint protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetParameterConstraint {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetParameterConstraint {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetParameterConstraint.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DataSetSource")
  @js.native
  abstract class DataSetSource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DataSetSource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object DataSetSource {
    
    @JSImport("mendixmodelsdk", "datasets.DataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DataSetSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength")
  @js.native
  class DateTimeIntervalLength protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DateTimeIntervalLength {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateTimeIntervalLength {
    
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Day")
    @js.native
    def Day: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Day_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Day")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Month")
    @js.native
    def Month: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Month_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Month")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Period")
    @js.native
    def Period: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Period_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Period")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Quarter")
    @js.native
    def Quarter: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Quarter_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Quarter")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Week")
    @js.native
    def Week: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Week_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Week")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalLength.Year")
    @js.native
    def Year: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength = js.native
    @scala.inline
    def Year_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalLength): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Year")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier")
  @js.native
  class DateTimeIntervalModifier protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.DateTimeIntervalModifier {
    def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
  }
  object DateTimeIntervalModifier {
    
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Always")
    @js.native
    def Always: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Always_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Always")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Future")
    @js.native
    def Future: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Future_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Future")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Last")
    @js.native
    def Last: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Last_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Last")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Next")
    @js.native
    def Next: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Next_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Next")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.Past")
    @js.native
    def Past: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def Past_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Past")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.DateTimeIntervalModifier.This")
    @js.native
    def This: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier = js.native
    @scala.inline
    def This_=(x: typings.mendixmodelsdk.datasetsMod.datasets.DateTimeIntervalModifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("This")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource")
  @js.native
  class JavaDataSetSource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.JavaDataSetSource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object JavaDataSetSource {
    
    @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource]
    
    /**
      * Creates and returns a new JavaDataSetSource instance in the SDK and on the server.
      * The new JavaDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSet): typings.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.JavaDataSetSource]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.JavaDataSetSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource")
  @js.native
  class OqlDataSetSource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.datasets.OqlDataSetSource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object OqlDataSetSource {
    
    @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource]
    
    /**
      * Creates and returns a new OqlDataSetSource instance in the SDK and on the server.
      * The new OqlDataSetSource will be automatically stored in the 'source' property
      * of the parent DataSet element passed as argument.
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.datasetsMod.datasets.DataSet): typings.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.datasetsMod.datasets.OqlDataSetSource]
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "datasets.OqlDataSetSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.datasetsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
