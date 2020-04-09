package typings.mendixmodelsdk

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.commonMod.common.IPoint
import typings.mendixmodelsdk.commonMod.common.ISize
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.pages.PageSettings
import typings.mendixmodelsdk.projectsMod.projects.Document
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IDocument
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/workflows", JSImport.Namespace)
@js.native
object workflowsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object workflows extends js.Object {
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.8.0: introduced
      */
    @js.native
    class EndWorkflowActivity protected () extends WorkflowActivity {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FEndWorkflowActivity: IModel = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.8.0: introduced
      */
    @js.native
    class Flow protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FFlow: IModel = js.native
      def containerAsWorkflow(): Workflow = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def from(): WorkflowActivity = js.native
      def from(newValue: WorkflowActivity): js.Any = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def to(): WorkflowActivity = js.native
      def to(newValue: WorkflowActivity): js.Any = js.native
      def value(): js.Any = js.native
      def value(newValue: WorkflowActivityOutcome): js.Any = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      @JSName("value")
      def value_Union(): WorkflowActivityOutcome | Null = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.8.0: introduced
      */
    @js.native
    trait IWorkflow extends IDocument {
      /**
        * This property is required and cannot be set to null.
        */
      val context: IEntity = js.native
      val contextQualifiedName: String = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.8.0: introduced
      */
    @js.native
    class StartWorkflowActivity protected () extends WorkflowActivity {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FStartWorkflowActivity: IModel = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.8.0: introduced
      */
    @js.native
    class UserTask protected () extends WorkflowActivity {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FUserTask: IModel = js.native
      def page(): js.Any = js.native
      def page(newValue: PageSettings): js.Any = js.native
      @JSName("page")
      def page_Union(): PageSettings | Null = js.native
      def taskCaption(): String = js.native
      def taskCaption(newValue: String): js.Any = js.native
      def taskDescription(): String = js.native
      def taskDescription(newValue: String): js.Any = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.8.0: introduced
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.workflowsMod.workflows.IWorkflow because var conflicts: containerAsFolderBase, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined context, contextQualifiedName */ @js.native
    class Workflow protected () extends Document {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("contextQualifiedName")
      val contextQualifiedName_FWorkflow: String = js.native
      /**
        * This property is required and cannot be set to null.
        */
      @JSName("context")
      val context_FWorkflow: IEntity = js.native
      @JSName("model")
      var model_FWorkflow: IModel = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def activities(): IList[WorkflowActivity] = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MWorkflow(): FolderBase = js.native
      def context(): IEntity = js.native
      def context(newValue: IEntity): js.Any = js.native
      def contextQualifiedName(): String = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def flows(): IList[Flow] = js.native
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
    abstract class WorkflowActivity protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FWorkflowActivity: IModel = js.native
      def caption(): String = js.native
      def caption(newValue: String): js.Any = js.native
      def containerAsWorkflow(): Workflow = js.native
      def location(): IPoint = js.native
      def location(newValue: IPoint): js.Any = js.native
      /**
        * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
        */
      def possibleOutcomes(): IList[WorkflowActivityOutcome] = js.native
      def size(): ISize = js.native
      def size(newValue: ISize): js.Any = js.native
    }
    
    /**
      * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
      *
      * In version 8.8.0: introduced
      */
    @js.native
    class WorkflowActivityOutcome protected () extends Element {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FWorkflowActivityOutcome: IModel = js.native
      def containerAsWorkflowActivity(): WorkflowActivity = js.native
      def name(): String = js.native
      def name(newValue: String): js.Any = js.native
    }
    
    /* static members */
    @js.native
    object EndWorkflowActivity extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): EndWorkflowActivity = js.native
      /**
        * Creates and returns a new EndWorkflowActivity instance in the SDK and on the server.
        * The new EndWorkflowActivity will be automatically stored in the 'activities' property
        * of the parent Workflow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.8.0 and higher
        */
      def createIn(container: Workflow): EndWorkflowActivity = js.native
    }
    
    /* static members */
    @js.native
    object Flow extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new Flow instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): Flow = js.native
      /**
        * Creates and returns a new Flow instance in the SDK and on the server.
        * The new Flow will be automatically stored in the 'flows' property
        * of the parent Workflow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.8.0 and higher
        */
      def createIn(container: Workflow): Flow = js.native
    }
    
    /* static members */
    @js.native
    object StartWorkflowActivity extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new StartWorkflowActivity instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): StartWorkflowActivity = js.native
      /**
        * Creates and returns a new StartWorkflowActivity instance in the SDK and on the server.
        * The new StartWorkflowActivity will be automatically stored in the 'activities' property
        * of the parent Workflow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.8.0 and higher
        */
      def createIn(container: Workflow): StartWorkflowActivity = js.native
    }
    
    /* static members */
    @js.native
    object UserTask extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new UserTask instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): UserTask = js.native
      /**
        * Creates and returns a new UserTask instance in the SDK and on the server.
        * The new UserTask will be automatically stored in the 'activities' property
        * of the parent Workflow element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.8.0 and higher
        */
      def createIn(container: Workflow): UserTask = js.native
    }
    
    /* static members */
    @js.native
    object Workflow extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new Workflow unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): Workflow = js.native
    }
    
    /* static members */
    @js.native
    object WorkflowActivity extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
    }
    
    /* static members */
    @js.native
    object WorkflowActivityOutcome extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new WorkflowActivityOutcome instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): WorkflowActivityOutcome = js.native
      /**
        * Creates and returns a new WorkflowActivityOutcome instance in the SDK and on the server.
        * The new WorkflowActivityOutcome will be automatically stored in the 'possibleOutcomes' property
        * of the parent WorkflowActivity element passed as argument.
        *
        * Warning! Can only be used on models with the following Mendix meta model versions:
        *  8.8.0 and higher
        */
      def createIn(container: WorkflowActivity): WorkflowActivityOutcome = js.native
    }
    
  }
  
}

