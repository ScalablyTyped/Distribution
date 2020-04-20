package typings.mendixmodelsdk.codeactionsMod.codeactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typings.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typings.mendixmodelsdk.elementsMod.IElement because Already inherited
- typings.mendixmodelsdk.codeactionsMod.codeactions.IType because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined containerAsBasicParameterType, containerAsCodeAction, containerAsListType */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.Type")
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
  @JSName("containerAsCodeAction")
  val containerAsCodeAction_FType: ICodeAction = js.native
  @JSName("containerAsListType")
  val containerAsListType_FType: IListType = js.native
  @JSName("model")
  var model_FType: IModel = js.native
  def containerAsBasicParameterType: BasicParameterType = js.native
  def containerAsCodeAction: CodeAction = js.native
  def containerAsListType: ListType = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.Type")
@js.native
object Type extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

