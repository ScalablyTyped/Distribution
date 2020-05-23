package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.javaactionsMod.javaactions.IType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsBasicParameterType, containerAsJavaAction, containerAsJavaActionParameter, containerAsListType */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.Type")
@js.native
abstract class Type protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("containerAsBasicParameterType")
  val containerAsBasicParameterType_FType: IBasicParameterType = js.native
  @JSName("containerAsJavaActionParameter")
  val containerAsJavaActionParameter_FType: IJavaActionParameter = js.native
  @JSName("containerAsJavaAction")
  val containerAsJavaAction_FType: IJavaAction = js.native
  @JSName("containerAsListType")
  val containerAsListType_FType: IListType = js.native
  @JSName("model")
  var model_FType: IModel = js.native
  def containerAsBasicParameterType: BasicParameterType = js.native
  def containerAsJavaAction: JavaAction = js.native
  def containerAsJavaActionParameter: JavaActionParameter = js.native
  def containerAsListType: ListType = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.Type")
@js.native
object Type extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

