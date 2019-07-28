package typings.mendixmodelsdk.distGenJavascriptactionsMod

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.CodeAction
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.CodeActionParameter
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ICodeAction
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactionsNs.ICodeActionParameter
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactionsNs.JavaScriptAction
import typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactionsNs.JavaScriptActionParameter
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IFolderBase
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/javascriptactions", "javascriptactions")
@js.native
object javascriptactionsNs extends js.Object {
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
    * See: {@link https://docs.mendix.com/refguide7/javascript-actions relevant section in reference guide}
    *
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptAction because var conflicts: actionReturnType, id, isLoaded, model, modelerActionInfo, structureTypeName, unit. Inlined  */ @js.native
  class JavaScriptAction protected () extends CodeAction {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  
  /**
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.mendixmodelsdk.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptActionParameter because var conflicts: actionParameterType, description, id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class JavaScriptActionParameter protected () extends CodeActionParameter {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit,
      container: AbstractElement
    ) = this()
    @JSName("containerAsCodeAction")
    val containerAsCodeAction_JavaScriptActionParameter: CodeAction = js.native
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
  
}

