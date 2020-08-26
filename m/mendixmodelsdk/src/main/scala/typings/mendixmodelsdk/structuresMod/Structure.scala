package typings.mendixmodelsdk.structuresMod

import typings.mendixmodelsdk.abstractModelMod.AbstractModel
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/structures", "Structure")
@js.native
abstract class Structure protected () extends IStructure {
  def this(_model: AbstractModel, structureTypeName: String, id: String) = this()
  def this(_model: AbstractModel, structureTypeName: String, id: String, _isPartial: Boolean) = this()
  def this(
    _model: AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: js.UndefOr[scala.Nothing],
    container: IContainer
  ) = this()
  def this(
    _model: AbstractModel,
    structureTypeName: String,
    id: String,
    _isPartial: Boolean,
    container: IContainer
  ) = this()
  @JSName("container")
  def container_MStructure: IContainer | Null = js.native
  /**
    * Deletes a model from the model.
    * This will automatically remove the item from its model parent,
    * and update incoming references and send server changes.
    */
  def delete(): Unit = js.native
  /* protected */ def getContainerAs[T /* <: IContainer */](containerType: js.Any): T = js.native
  @JSName("isLoaded")
  def isLoaded_MStructure: Boolean = js.native
  @JSName("model")
  def model_MStructure: IAbstractModel = js.native
  @JSName("unit")
  def unit_MStructure: IAbstractUnit = js.native
}

