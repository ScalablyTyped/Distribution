package typings.mendixmodelsdk

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeAction
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeActionParameter
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeAction
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeActionParameter
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.IParameterType
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ParameterType
import typings.mendixmodelsdk.distGenJavascriptactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactions.JavaScriptAction
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactions.JavaScriptActionParameter
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactions.NanoflowJavaScriptActionParameterType
import typings.mendixmodelsdk.distGenProjectsMod.projects.FolderBase
import typings.mendixmodelsdk.distGenProjectsMod.projects.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.IStructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/javascriptactions", JSImport.Namespace)
@js.native
object distGenJavascriptactionsMod extends js.Object {
  @js.native
  class StructureVersionInfo protected ()
    extends typings.mendixmodelsdk.distSdkInternalMod.StructureVersionInfo {
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
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IModuleDocument because Already inherited
    - typings.mendixmodelsdk.distGenProjectsMod.projects.IDocument because Already inherited
    - typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeAction because Already inherited
    - typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactions.IJavaScriptAction because var conflicts: actionParameters, actionReturnType, actionTypeParameters, containerAsFolderBase, id, isLoaded, model, modelerActionInfo, structureTypeName, unit. Inlined  */ @js.native
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
      def containerAsFolderBase_MJavaScriptAction(): FolderBase = js.native
    }
    
    /**
      * In version 8.0.0: removed experimental
      * In version 7.21.0: introduced
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.ICodeActionParameter because Already inherited
    - typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactions.IJavaScriptActionParameter because var conflicts: actionParameterType, containerAsCodeAction, containerAsJavaAction, description, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined  */ @js.native
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
      def containerAsCodeAction_MJavaScriptActionParameter(): CodeAction = js.native
    }
    
    /**
      * In version 8.4.0: introduced
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
    - typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
    - typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.IParameterType because Already inherited
    - typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactions.INanoflowJavaScriptActionParameterType because var conflicts: containerAsCodeActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @js.native
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
      def containerAsCodeActionParameter_MNanoflowJavaScriptActionParameterType(): CodeActionParameter = js.native
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

