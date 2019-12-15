package typings.mendixmodelsdk.distGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.distSdkInternalElementsMod.IElement because Already inherited
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.ITypeParameter because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsJavaAction, name */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.TypeParameter")
@js.native
class TypeParameter protected ()
  extends Element
     with IByNameReferrable {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsJavaAction")
  val containerAsJavaAction_FTypeParameter: IJavaAction = js.native
  @JSName("model")
  var model_FTypeParameter: IModel = js.native
  @JSName("name")
  val name_FTypeParameter: String = js.native
  /**
    * Returns the qualified name of this element, or
    * null if this element is not a part of the model,
    * or if it or one of its namespace containers does not have a
    * valid name.
    */
  /* CompleteClass */
  override val qualifiedName: String | Null = js.native
  def containerAsJavaAction(): JavaAction = js.native
  def name(): String = js.native
  def name(newValue: String): js.Any = js.native
  @JSName("qualifiedName")
  def qualifiedName_MTypeParameter(): String | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.TypeParameter")
@js.native
object TypeParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TypeParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TypeParameter = js.native
  /**
    * Creates and returns a new TypeParameter instance in the SDK and on the server.
    * The new TypeParameter will be automatically stored in the 'typeParameters' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.6.0 to 7.20.0
    */
  def createIn(container: JavaAction): TypeParameter = js.native
}

