package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflows {
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    *
    * In version 8.15.0: introduced
    */
  @JSImport("mendixmodelsdk", "workflows.BooleanSplitOutcome")
  @js.native
  class BooleanSplitOutcome protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.BooleanSplitOutcome {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object BooleanSplitOutcome {
    
    @JSImport("mendixmodelsdk", "workflows.BooleanSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new BooleanSplitOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.BooleanSplitOutcome.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome = js.native
    
    /**
      * Creates and returns a new BooleanSplitOutcome instance in the SDK and on the server.
      * The new BooleanSplitOutcome will be automatically stored in the 'outcomes' property
      * of the parent ExclusiveSplitActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.BooleanSplitOutcome.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity): typings.mendixmodelsdk.workflowsMod.workflows.BooleanSplitOutcome = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.BooleanSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.BooleanSplitOutcome.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.CallMicroflowTask")
  @js.native
  class CallMicroflowTask protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.CallMicroflowTask {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CallMicroflowTask {
    
    @JSImport("mendixmodelsdk", "workflows.CallMicroflowTask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.CallMicroflowTask.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask = js.native
    
    /**
      * Creates and returns a new CallMicroflowTask instance in the SDK and on the server.
      * The new CallMicroflowTask will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.CallMicroflowTask.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.CallMicroflowTask = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.CallMicroflowTask.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.CallMicroflowTask.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.CallWorkflowActivity")
  @js.native
  class CallWorkflowActivity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.CallWorkflowActivity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object CallWorkflowActivity {
    
    @JSImport("mendixmodelsdk", "workflows.CallWorkflowActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new CallWorkflowActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.CallWorkflowActivity.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity = js.native
    
    /**
      * Creates and returns a new CallWorkflowActivity instance in the SDK and on the server.
      * The new CallWorkflowActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.CallWorkflowActivity.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.CallWorkflowActivity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.CallWorkflowActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.CallWorkflowActivity.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.EndWorkflowActivity")
  @js.native
  class EndWorkflowActivity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.EndWorkflowActivity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EndWorkflowActivity {
    
    @JSImport("mendixmodelsdk", "workflows.EndWorkflowActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.EndWorkflowActivity.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity = js.native
    
    /**
      * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
      * The new EndWorkflowActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.EndWorkflowActivity.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.EndWorkflowActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.EndWorkflowActivity.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.EnumerationValueSplitOutcome")
  @js.native
  class EnumerationValueSplitOutcome protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.EnumerationValueSplitOutcome {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object EnumerationValueSplitOutcome {
    
    @JSImport("mendixmodelsdk", "workflows.EnumerationValueSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new EnumerationValueSplitOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.EnumerationValueSplitOutcome.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome = js.native
    
    /**
      * Creates and returns a new EnumerationValueSplitOutcome instance in the SDK and on the server.
      * The new EnumerationValueSplitOutcome will be automatically stored in the 'outcomes' property
      * of the parent ExclusiveSplitActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.EnumerationValueSplitOutcome.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity): typings.mendixmodelsdk.workflowsMod.workflows.EnumerationValueSplitOutcome = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.EnumerationValueSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.EnumerationValueSplitOutcome.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitActivity")
  @js.native
  class ExclusiveSplitActivity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.ExclusiveSplitActivity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExclusiveSplitActivity {
    
    @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ExclusiveSplitActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitActivity.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity = js.native
    
    /**
      * Creates and returns a new ExclusiveSplitActivity instance in the SDK and on the server.
      * The new ExclusiveSplitActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitActivity.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.ExclusiveSplitActivity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitActivity.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitOutcome")
  @js.native
  abstract class ExclusiveSplitOutcome protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.ExclusiveSplitOutcome {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ExclusiveSplitOutcome {
    
    @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ExclusiveSplitOutcome.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.Flow")
  @js.native
  class Flow protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.Flow {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Flow {
    
    @JSImport("mendixmodelsdk", "workflows.Flow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Flow.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
    
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * The new Flow will be automatically stored in the 'flow' property
      * of the parent Outcome element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Flow.createInOutcomeUnderFlow")
    @js.native
    def createInOutcomeUnderFlow(container: typings.mendixmodelsdk.workflowsMod.workflows.Outcome): typings.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
    
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * The new Flow will be automatically stored in the 'flow' property
      * of the parent Workflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Flow.createInWorkflowUnderFlow")
    @js.native
    def createInWorkflowUnderFlow(container: typings.mendixmodelsdk.workflowsMod.workflows.Workflow): typings.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Flow.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Flow.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.Outcome")
  @js.native
  abstract class Outcome protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.Outcome {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object Outcome {
    
    @JSImport("mendixmodelsdk", "workflows.Outcome")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Outcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Outcome.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.ParallelSplitActivity")
  @js.native
  class ParallelSplitActivity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.ParallelSplitActivity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ParallelSplitActivity {
    
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ParallelSplitActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitActivity.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity = js.native
    
    /**
      * Creates and returns a new ParallelSplitActivity instance in the SDK and on the server.
      * The new ParallelSplitActivity will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitActivity.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitActivity.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome")
  @js.native
  class ParallelSplitOutcome protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.ParallelSplitOutcome {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object ParallelSplitOutcome {
    
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome = js.native
    
    /**
      * Creates and returns a new ParallelSplitOutcome instance in the SDK and on the server.
      * The new ParallelSplitOutcome will be automatically stored in the 'outcomes' property
      * of the parent ParallelSplitActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  9.0.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitActivity): typings.mendixmodelsdk.workflowsMod.workflows.ParallelSplitOutcome = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.ParallelSplitOutcome.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.UserSource")
  @js.native
  abstract class UserSource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.UserSource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UserSource {
    
    @JSImport("mendixmodelsdk", "workflows.UserSource")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.UserSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.UserSource.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.UserTask")
  @js.native
  class UserTask protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.UserTask {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object UserTask {
    
    @JSImport("mendixmodelsdk", "workflows.UserTask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new UserTask instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.UserTask.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.UserTask = js.native
    
    /**
      * Creates and returns a new UserTask instance in the SDK and on the server.
      * The new UserTask will be automatically stored in the 'activities' property
      * of the parent Flow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.UserTask.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Flow): typings.mendixmodelsdk.workflowsMod.workflows.UserTask = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.UserTask.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.UserTask.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.Workflow")
  @js.native
  class Workflow protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.Workflow {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object Workflow {
    
    @JSImport("mendixmodelsdk", "workflows.Workflow")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Workflow unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Workflow.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.workflowsMod.workflows.Workflow = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Workflow.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.Workflow.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.WorkflowActivity")
  @js.native
  abstract class WorkflowActivity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.WorkflowActivity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WorkflowActivity {
    
    @JSImport("mendixmodelsdk", "workflows.WorkflowActivity")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.WorkflowActivity.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.WorkflowActivity.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.WorkflowTask")
  @js.native
  abstract class WorkflowTask protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.WorkflowTask {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WorkflowTask {
    
    @JSImport("mendixmodelsdk", "workflows.WorkflowTask")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.WorkflowTask.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.WorkflowTask.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.WorkflowTaskOutcome")
  @js.native
  class WorkflowTaskOutcome protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.WorkflowTaskOutcome {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object WorkflowTaskOutcome {
    
    @JSImport("mendixmodelsdk", "workflows.WorkflowTaskOutcome")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.WorkflowTaskOutcome.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome = js.native
    
    /**
      * Creates and returns a new WorkflowTaskOutcome instance in the SDK and on the server.
      * The new WorkflowTaskOutcome will be automatically stored in the 'outcomes' property
      * of the parent WorkflowTask element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.WorkflowTaskOutcome.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTask): typings.mendixmodelsdk.workflowsMod.workflows.WorkflowTaskOutcome = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.WorkflowTaskOutcome.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.WorkflowTaskOutcome.versionInfo")
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
  @JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource")
  @js.native
  class XPathBasedUserSource protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.XPathBasedUserSource {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit[IAbstractModel],
      container: typings.mendixmodelsdk.internalMod.AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object XPathBasedUserSource {
    
    @JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = js.native
    
    /**
      * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
      * The new XPathBasedUserSource will be automatically stored in the 'userSource' property
      * of the parent UserTask element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.15.0 and higher
      */
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.UserTask): typings.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
