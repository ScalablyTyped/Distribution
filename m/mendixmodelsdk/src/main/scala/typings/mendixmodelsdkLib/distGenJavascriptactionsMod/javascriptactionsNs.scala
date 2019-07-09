package typings
package mendixmodelsdkLib.distGenJavascriptactionsMod

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
  trait IJavaScriptAction
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ICodeAction
  
  /**
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  @js.native
  trait IJavaScriptActionParameter
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.ICodeActionParameter
  
  /**
    * See: {@link https://docs.mendix.com/refguide7/javascript-actions relevant section in reference guide}
    *
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptAction because var conflicts: actionReturnType, id, isLoaded, model, modelerActionInfo, structureTypeName, unit. Inlined  */ @js.native
  class JavaScriptAction protected ()
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /**
    * In version 8.0.0: removed experimental
    * In version 7.21.0: introduced
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.IJavaScriptActionParameter because var conflicts: actionParameterType, description, id, isLoaded, model, name, structureTypeName, unit. Inlined  */ @js.native
  class JavaScriptActionParameter protected ()
    extends mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeActionParameter {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    @JSName("containerAsCodeAction")
    val containerAsCodeAction_JavaScriptActionParameter: mendixmodelsdkLib.distGenCodeactionsMod.codeactionsNs.CodeAction = js.native
  }
  
  /* static members */
  @js.native
  object JavaScriptAction extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavascriptactionsMod.StructureVersionInfo = js.native
    /**
      * Creates a new JavaScriptAction unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    def createIn(container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase): mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.JavaScriptAction = js.native
  }
  
  /* static members */
  @js.native
  object JavaScriptActionParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenJavascriptactionsMod.StructureVersionInfo = js.native
    /**
      * Creates and returns a new JavaScriptActionParameter instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.JavaScriptActionParameter = js.native
  }
  
}

