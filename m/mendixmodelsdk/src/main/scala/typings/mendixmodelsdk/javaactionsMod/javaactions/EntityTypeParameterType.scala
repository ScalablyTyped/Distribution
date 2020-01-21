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
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IParameterType because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IEntityTypeParameterType because var conflicts: containerAsJavaActionParameter, id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.EntityTypeParameterType")
@js.native
class EntityTypeParameterType protected () extends ParameterType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FEntityTypeParameterType: IModel = js.native
  @JSName("typeParameter")
  val typeParameter_FEntityTypeParameterType: ITypeParameter | Null = js.native
  @JSName("containerAsJavaActionParameter")
  def containerAsJavaActionParameter_MEntityTypeParameterType(): JavaActionParameter = js.native
  def typeParameter(): js.Any = js.native
  def typeParameter(newValue: TypeParameter): js.Any = js.native
  @JSName("typeParameter")
  def typeParameter_Union(): TypeParameter | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.EntityTypeParameterType")
@js.native
object EntityTypeParameterType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityTypeParameterType = js.native
  /**
    * Creates and returns a new EntityTypeParameterType instance in the SDK and on the server.
    * The new EntityTypeParameterType will be automatically stored in the 'parameterType' property
    * of the parent JavaActionParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.7.0 to 7.20.0
    */
  def createIn(container: JavaActionParameter): EntityTypeParameterType = js.native
}

