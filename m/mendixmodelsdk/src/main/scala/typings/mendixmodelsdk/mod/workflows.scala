package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "workflows")
@js.native
object workflows extends js.Object {
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.8.0: introduced
    */
  @js.native
  class EndWorkflowActivity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.EndWorkflowActivity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.8.0: introduced
    */
  @js.native
  class Flow protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.Flow {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.8.0: introduced
    */
  @js.native
  class StartWorkflowActivity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.StartWorkflowActivity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.8.0: introduced
    */
  @js.native
  class UserTask protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.UserTask {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.8.0: introduced
    */
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
  
  /**
    * Interfaces and instance classes for types from the Mendix sub meta model `Workflows`.
    */
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.8.0: introduced
    */
  @js.native
  abstract class WorkflowActivity protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.WorkflowActivity {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 8.8.0: introduced
    */
  @js.native
  class WorkflowActivityOutcome protected ()
    extends typings.mendixmodelsdk.allModelClassesMod.workflows.WorkflowActivityOutcome {
    def this(
      model: typings.mendixmodelsdk.internalMod.AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: typings.mendixmodelsdk.internalMod.ModelUnit,
      container: typings.mendixmodelsdk.internalMod.AbstractElement
    ) = this()
  }
  
  /* static members */
  @js.native
  object EndWorkflowActivity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity = js.native
    /**
      * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
      * The new EndWorkflowActivity will be automatically stored in the 'activities' property
      * of the parent Workflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.8.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Workflow): typings.mendixmodelsdk.workflowsMod.workflows.EndWorkflowActivity = js.native
  }
  
  /* static members */
  @js.native
  object Flow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
    /**
      * Creates and returns a new Flow instance in the SDK and on the server.
      * The new Flow will be automatically stored in the 'flows' property
      * of the parent Workflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.8.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Workflow): typings.mendixmodelsdk.workflowsMod.workflows.Flow = js.native
  }
  
  /* static members */
  @js.native
  object StartWorkflowActivity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new StartWorkflowActivity instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.StartWorkflowActivity = js.native
    /**
      * Creates and returns a new StartWorkflowActivity instance in the SDK and on the server.
      * The new StartWorkflowActivity will be automatically stored in the 'activities' property
      * of the parent Workflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.8.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Workflow): typings.mendixmodelsdk.workflowsMod.workflows.StartWorkflowActivity = js.native
  }
  
  /* static members */
  @js.native
  object UserTask extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new UserTask instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.UserTask = js.native
    /**
      * Creates and returns a new UserTask instance in the SDK and on the server.
      * The new UserTask will be automatically stored in the 'activities' property
      * of the parent Workflow element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.8.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.Workflow): typings.mendixmodelsdk.workflowsMod.workflows.UserTask = js.native
  }
  
  /* static members */
  @js.native
  object Workflow extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    /**
      * Creates a new Workflow unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: IFolderBase): typings.mendixmodelsdk.workflowsMod.workflows.Workflow = js.native
  }
  
  /* static members */
  @js.native
  object WorkflowActivity extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
  }
  
  /* static members */
  @js.native
  object WorkflowActivityOutcome extends js.Object {
    var structureTypeName: String = js.native
    var versionInfo: typings.mendixmodelsdk.workflowsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new WorkflowActivityOutcome instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.WorkflowActivityOutcome = js.native
    /**
      * Creates and returns a new WorkflowActivityOutcome instance in the SDK and on the server.
      * The new WorkflowActivityOutcome will be automatically stored in the 'possibleOutcomes' property
      * of the parent WorkflowActivity element passed as argument.
      *
      * Warning! Can only be used on models with the following Mendix meta model versions:
      *  8.8.0 and higher
      */
    def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.WorkflowActivity): typings.mendixmodelsdk.workflowsMod.workflows.WorkflowActivityOutcome = js.native
  }
  
}

