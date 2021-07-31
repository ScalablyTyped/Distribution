package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflows {
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome")
  @js.native
  class BooleanSplitOutcome protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BooleanSplitOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BooleanSplitOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome]
    
    /**
      * Creates and returns a new BooleanSplitOutcome instance in the SDK and on the server.
      * The new BooleanSplitOutcome will be automatically stored in the 'outcomes' property
      * of the parent ExclusiveSplitActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity): typings.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.BooleanSplitOutcome.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask")
  @js.native
  class CallMicroflowTask protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CallMicroflowTask {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask]
    
    /**
      * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
      * The new CallMicroflowTask will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallMicroflowTask.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity")
  @js.native
  class CallWorkflowActivity protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CallWorkflowActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CallWorkflowActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity]
    
    /**
      * Creates and returns a new CallWorkflowActivity instance in the SDK and on the server.
      * The new CallWorkflowActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.CallWorkflowActivity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity")
  @js.native
  class EndWorkflowActivity protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EndWorkflowActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity]
    
    /**
      * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
      * The new EndWorkflowActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EndWorkflowActivity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome")
  @js.native
  class EnumerationValueSplitOutcome protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EnumerationValueSplitOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EnumerationValueSplitOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome]
    
    /**
      * Creates and returns a new EnumerationValueSplitOutcome instance in the SDK and on the server.
      * The new EnumerationValueSplitOutcome will be automatically stored in the 'outcomes' property
      * of the parent ExclusiveSplitActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity): typings.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.EnumerationValueSplitOutcome.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity")
  @js.native
  class ExclusiveSplitActivity protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExclusiveSplitActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExclusiveSplitActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity]
    
    /**
      * Creates and returns a new ExclusiveSplitActivity instance in the SDK and on the server.
      * The new ExclusiveSplitActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitActivity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitOutcome")
  @js.native
  abstract class ExclusiveSplitOutcome protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExclusiveSplitOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ExclusiveSplitOutcome.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow")
  @js.native
  class Flow protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.Flow {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Flow {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.Flow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.Flow]
    
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * The new Flow will be automatically stored in the 'flow' property
      * of the parent Outcome element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createInOutcomeUnderFlow(container: typings.mendixmodelsdk.workflowsMod.workflows.Outcome): typings.mendixmodelsdk.workflowsMod.workflows.Flow = ^.asInstanceOf[js.Dynamic].applyDynamic("createInOutcomeUnderFlow")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.Flow]
    
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * The new Flow will be automatically stored in the 'flow' property
      * of the parent Workflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createInWorkflowUnderFlow(container: typings.mendixmodelsdk.workflowsMod.workflows.Workflow): typings.mendixmodelsdk.workflowsMod.workflows.Flow = ^.asInstanceOf[js.Dynamic].applyDynamic("createInWorkflowUnderFlow")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.Flow]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Flow.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Outcome")
  @js.native
  abstract class Outcome protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.Outcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Outcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Outcome")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Outcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Outcome.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.0.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity")
  @js.native
  class ParallelSplitActivity protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ParallelSplitActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ParallelSplitActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity]
    
    /**
      * Creates and returns a new ParallelSplitActivity instance in the SDK and on the server.
      * The new ParallelSplitActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.0.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitActivity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 9.0.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome")
  @js.native
  class ParallelSplitOutcome protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ParallelSplitOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome]
    
    /**
      * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
      * The new ParallelSplitOutcome will be automatically stored in the 'outcomes' property
      * of the parent ParallelSplitActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.0.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.ParallelSplitOutcome.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserSource")
  @js.native
  abstract class UserSource protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.UserSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UserSource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask")
  @js.native
  class UserTask protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.UserTask {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UserTask {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new UserTask instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.UserTask = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.UserTask]
    
    /**
      * Creates and returns a new UserTask instance in the SDK and on the server.
      * The new UserTask will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.UserTask = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.UserTask]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.UserTask.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Workflow")
  @js.native
  class Workflow protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.Workflow {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Workflow {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Workflow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Workflow unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @scala.inline
    def createIn(container: IFolderBase): typings.mendixmodelsdk.workflowsMod.workflows.Workflow = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.Workflow]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Workflow.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.Workflow.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowActivity")
  @js.native
  abstract class WorkflowActivity protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.WorkflowActivity {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WorkflowActivity {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowActivity.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTask")
  @js.native
  abstract class WorkflowTask protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTask {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WorkflowTask {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTask")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTask.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTask.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome")
  @js.native
  class WorkflowTaskOutcome protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WorkflowTaskOutcome {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome]
    
    /**
      * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
      * The new WorkflowTaskOutcome will be automatically stored in the 'outcomes' property
      * of the parent WorkflowTask element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTask): typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.WorkflowTaskOutcome.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource")
  @js.native
  class XPathBasedUserSource protected ()
    extends typings.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object XPathBasedUserSource {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @scala.inline
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource]
    
    /**
      * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
      * The new XPathBasedUserSource will be automatically stored in the 'userSource' property
      * of the parent UserTask element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @scala.inline
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.UserTask): typings.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createIn")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource]
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "workflows.XPathBasedUserSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
