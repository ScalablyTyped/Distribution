package typings.mendixmodelsdk.distSdkInternalStructuresMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.aliasesNs.IContainer
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IAbstractUnit
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
    _isPartial: Boolean,
    container: IContainer
  ) = this()
  /* CompleteClass */
  override val container: IContainer | Null = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var isLoaded: Boolean = js.native
  /* CompleteClass */
  override var model: IAbstractModel = js.native
  /* CompleteClass */
  override var structureTypeName: String = js.native
  /**
    * Unit that owns/contains this thing.
    */
  /* CompleteClass */
  override var unit: IAbstractUnit = js.native
  /* CompleteClass */
  override def allProperties(): js.Array[AbstractProperty[_, _]] = js.native
  /**
    * Deletes a model from the model.
    * This will automatically remove the item from its model parent,
    * and update incoming references and send server changes.
    */
  def delete(): Unit = js.native
  /* protected */ def getContainerAs[T /* <: IContainer */](containerType: js.Any): T = js.native
  /**
    * Returns all properties when this structure is loaded, otherwise just the public properties.
    */
  /* CompleteClass */
  override def loadedProperties(): js.Array[AbstractProperty[_, _]] = js.native
  /* CompleteClass */
  override def publicProperties(): js.Array[AbstractProperty[_, _]] = js.native
  /**
    * Renders the structure as plain JSON (without observables magic).
    * This is intended for debugging and development convenience.
    * Note that the resulting object is not of the interface type corresponding to this structure.
    */
  /* CompleteClass */
  override def toJSON(): js.Object = js.native
  /**
    * Traverses this structure by calling the provided visitor function
    * on itself and all the structures contained (as part) by it,
    * in depth-first order, and it returns synchronously after that.
    */
  /* CompleteClass */
  override def traverse(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
  /**
    * Traverses this structure, returning immediately when `visit` returns something other than `null`.
    */
  /* CompleteClass */
  override def traverseFind[T](visit: js.Function1[/* structure */ this.type, T]): T | Null = js.native
  /**
    * Traverses this structure, only visiting children contained in public properties.
    */
  /* CompleteClass */
  override def traversePublicParts(visit: js.Function1[/* structure */ this.type, Unit]): Unit = js.native
}

