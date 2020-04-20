package typings.mendixmodelsdk

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.codeactions.CodeAction
import typings.mendixmodelsdk.codeactionsMod.codeactions.CodeActionParameter
import typings.mendixmodelsdk.codeactionsMod.codeactions.ICodeAction
import typings.mendixmodelsdk.codeactionsMod.codeactions.ICodeActionParameter
import typings.mendixmodelsdk.codeactionsMod.codeactions.IParameterType
import typings.mendixmodelsdk.codeactionsMod.codeactions.ParameterType
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.projectsMod.projects.FolderBase
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.versionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.versionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/javascriptactions", JSImport.Namespace)
@js.native
object javascriptactionsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.internalMod.StructureVersionInfo {
    def this(info: IStructureVersionInfo, structureType: StructureType) = this()
  }
  
  @js.native
  object javascriptactions extends js.Object {
    /**
      * Interfaces and instance classes for types from the Mendix sub meta model `JavaScriptActions`.
      */
    /**
      * See: {@link https://docs.mendix.com/refguide7/javascript-actions relevant section in reference guide}
      *
      * In version 8.0.0: removed experimental
      * In version 7.21.0: introduced
      */
    @js.native
    trait IJavaScriptAction extends ICodeAction
    
    /**
      * In version 8.0.0: removed experimental
      * In version 7.21.0: introduced
      */
    @js.native
    trait IJavaScriptActionParameter extends ICodeActionParameter
    
    /**
      * In version 8.4.0: introduced
      */
    @js.native
    trait INanoflowJavaScriptActionParameterType extends IParameterType
    
    /**
      * See: {@link https://docs.mendix.com/refguide7/javascript-actions relevant section in reference guide}
      *
      * In version 8.0.0: removed experimental
      * In version 7.21.0: introduced
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.unitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.projectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.codeactionsMod.codeactions.ICodeAction because Already inherited
    - typings.mendixmodelsdk.javascriptactionsMod.javascriptactions.IJavaScriptAction because var conflicts: actionParameters, actionReturnType, actionTypeParameters, containerAsFolderBase, id, isLoaded, model, modelerActionInfo, structureTypeName, unit. Inlined  */ @js.native
    class JavaScriptAction protected () extends CodeAction {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        container: IFolderBase
      ) = this()
      @JSName("model")
      var model_FJavaScriptAction: IModel = js.native
      @JSName("containerAsFolderBase")
      def containerAsFolderBase_MJavaScriptAction: FolderBase = js.native
    }
    
    /**
      * In version 8.0.0: removed experimental
      * In version 7.21.0: introduced
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.codeactionsMod.codeactions.ICodeActionParameter because Already inherited
    - typings.mendixmodelsdk.javascriptactionsMod.javascriptactions.IJavaScriptActionParameter because var conflicts: actionParameterType, containerAsCodeAction, containerAsJavaAction, description, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
    class JavaScriptActionParameter protected () extends CodeActionParameter {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FJavaScriptActionParameter: IModel = js.native
      @JSName("containerAsCodeAction")
      def containerAsCodeAction_MJavaScriptActionParameter: CodeAction = js.native
    }
    
    /**
      * In version 8.4.0: introduced
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.elementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.codeactionsMod.codeactions.IParameterType because Already inherited
    - typings.mendixmodelsdk.javascriptactionsMod.javascriptactions.INanoflowJavaScriptActionParameterType because var conflicts: containerAsCodeActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
    class NanoflowJavaScriptActionParameterType protected () extends ParameterType {
      def this(
        model: AbstractModel,
        structureTypeName: String,
        id: String,
        isPartial: Boolean,
        unit: ModelUnit,
        container: AbstractElement
      ) = this()
      @JSName("model")
      var model_FNanoflowJavaScriptActionParameterType: IModel = js.native
      @JSName("containerAsCodeActionParameter")
      def containerAsCodeActionParameter_MNanoflowJavaScriptActionParameterType: CodeActionParameter = js.native
    }
    
    /* static members */
    @js.native
    object JavaScriptAction extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates a new JavaScriptAction unit in the SDK and on the server.
        * Expects one argument, the projects.IFolderBase in which this unit is contained.
        */
      def createIn(container: IFolderBase): JavaScriptAction = js.native
    }
    
    /* static members */
    @js.native
    object JavaScriptActionParameter extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new JavaScriptActionParameter instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): JavaScriptActionParameter = js.native
    }
    
    /* static members */
    @js.native
    object NanoflowJavaScriptActionParameterType extends js.Object {
      var structureTypeName: String = js.native
      var versionInfo: StructureVersionInfo = js.native
      /**
        * Creates and returns a new NanoflowJavaScriptActionParameterType instance in the SDK and on the server.
        * Expects one argument: the IModel object the instance will "live on".
        * After creation, assign or add this instance to a property that accepts this kind of objects.
        */
      def create(model: IModel): NanoflowJavaScriptActionParameterType = js.native
    }
    
  }
  
}

