package typings.mendixmodelsdk.mendixmodelsdkMod.javaactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenCodeactionsMod.codeactions.CodeAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "javaactions.JavaActionParameter")
@js.native
class JavaActionParameter protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.javaactions.JavaActionParameter {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "javaactions.JavaActionParameter")
@js.native
object JavaActionParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaActionParameter = js.native
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'actionParameters' property
    * of the parent codeactions.CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInCodeActionUnderActionParameters(container: CodeAction): typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaActionParameter = js.native
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'parameters' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.20.0
    */
  def createInJavaActionUnderParameters(container: typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaAction): typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.JavaActionParameter = js.native
}

