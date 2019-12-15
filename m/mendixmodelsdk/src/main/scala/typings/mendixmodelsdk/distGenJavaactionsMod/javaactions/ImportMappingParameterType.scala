package typings.mendixmodelsdk.distGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 7.2.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IParameterType because Already inherited
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IImportMappingParameterType because var conflicts: containerAsJavaActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ImportMappingParameterType")
@js.native
class ImportMappingParameterType protected () extends ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FImportMappingParameterType: IModel = js.native
  @JSName("containerAsJavaActionParameter")
  def containerAsJavaActionParameter_MImportMappingParameterType(): JavaActionParameter = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.ImportMappingParameterType")
@js.native
object ImportMappingParameterType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ImportMappingParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ImportMappingParameterType = js.native
  /**
    * Creates and returns a new ImportMappingParameterType instance in the SDK and on the server.
    * The new ImportMappingParameterType will be automatically stored in the 'parameterType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.2.0 to 7.20.0
    */
  def createIn(container: JavaActionParameter): ImportMappingParameterType = js.native
}

