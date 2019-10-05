package typings.mendixmodelsdk.distGenJavaactionsMod.javaactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenJavaactionsMod.StructureVersionInfo
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
- typings.mendixmodelsdk.distGenJavaactionsMod.javaactions.IType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsBasicParameterType, containerAsJavaAction, containerAsJavaActionParameter, containerAsListType */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.Type")
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
  val containerAsBasicParameterType: BasicParameterType | IBasicParameterType = js.native
  val containerAsJavaAction: IJavaAction | JavaAction = js.native
  val containerAsJavaActionParameter: IJavaActionParameter | JavaActionParameter = js.native
  val containerAsListType: IListType | ListType = js.native
  @JSName("model")
  var model_Type: IModel = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.Type")
@js.native
object Type extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

