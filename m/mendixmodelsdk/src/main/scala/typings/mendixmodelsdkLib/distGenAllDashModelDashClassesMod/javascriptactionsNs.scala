package typings
package mendixmodelsdkLib.distGenAllDashModelDashClassesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "javascriptactions")
@js.native
object javascriptactionsNs extends js.Object {
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.21.0: introduced
    */
  @js.native
  class JavaScriptAction protected ()
    extends mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.JavaScriptAction {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, container: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IFolderBase) = this()
  }
  
  /**
    * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.21.0: introduced
    */
  @js.native
  class JavaScriptActionParameter protected ()
    extends mendixmodelsdkLib.distGenJavascriptactionsMod.javascriptactionsNs.JavaScriptActionParameter {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
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

