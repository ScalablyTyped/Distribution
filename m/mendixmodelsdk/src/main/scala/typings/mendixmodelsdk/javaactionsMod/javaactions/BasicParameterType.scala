package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.7.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IParameterType because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IBasicParameterType because var conflicts: containerAsJavaActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined `type` */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.BasicParameterType")
@js.native
class BasicParameterType protected () extends ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FBasicParameterType: IModel = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("type")
  val type_FBasicParameterType: IType = js.native
  @JSName("containerAsJavaActionParameter")
  def containerAsJavaActionParameter_MBasicParameterType: JavaActionParameter = js.native
  def `type`: Type = js.native
  def `type`(newValue: Type): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.BasicParameterType")
@js.native
object BasicParameterType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BasicParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): BasicParameterType = js.native
  /**
    * Creates and returns a new BasicParameterType instance in the SDK and on the server.
    * The new BasicParameterType will be automatically stored in the 'parameterType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  def createIn(container: JavaActionParameter): BasicParameterType = js.native
}

