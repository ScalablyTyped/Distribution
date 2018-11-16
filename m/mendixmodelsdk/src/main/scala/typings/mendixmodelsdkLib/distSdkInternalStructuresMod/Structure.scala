package typings
package mendixmodelsdkLib.distSdkInternalStructuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/structures", "Structure")
@js.native
abstract class Structure protected () extends IStructure {
  def this(_model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String) = this()
  def this(_model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, _isPartial: scala.Boolean) = this()
  def this(_model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, _isPartial: scala.Boolean, container: mendixmodelsdkLib.distSdkInternalStructuresMod.aliasesNs.IContainer) = this()
  /* CompleteClass */
  override val container: mendixmodelsdkLib.distSdkInternalStructuresMod.aliasesNs.IContainer | scala.Null = js.native
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var isLoaded: scala.Boolean = js.native
  /* CompleteClass */
  override var model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel = js.native
  /* CompleteClass */
  override var structureTypeName: java.lang.String = js.native
  /**
       * Unit that owns/contains this thing.
       */
  /* CompleteClass */
  override var unit: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit = js.native
  /* CompleteClass */
  override def allProperties(): js.Array[
    mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
  ] = js.native
  /**
       * Deletes a model from the model.
       * This will automatically remove the item from its model parent,
       * and update incoming references and send server changes.
       */
  def delete(): scala.Unit = js.native
  /* protected */ def getContainerAs[T /* <: mendixmodelsdkLib.distSdkInternalStructuresMod.aliasesNs.IContainer */](containerType: js.Any): T = js.native
  /**
       * Returns all properties when this structure is loaded, otherwise just the public properties.
       */
  /* CompleteClass */
  override def loadedProperties(): js.Array[
    mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
  ] = js.native
  /* CompleteClass */
  override def publicProperties(): js.Array[
    mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
  ] = js.native
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
  override def traverse(visit: js.Function1[/* structure */ this.type, scala.Unit]): scala.Unit = js.native
  /**
       * Traverses this structure, returning immediately when `visit` returns something other than `null`.
       */
  /* CompleteClass */
  override def traverseFind[T](visit: js.Function1[/* structure */ this.type, T]): T | scala.Null = js.native
  /**
       * Traverses this structure, only visiting children contained in public properties.
       */
  /* CompleteClass */
  override def traversePublicParts(visit: js.Function1[/* structure */ this.type, scala.Unit]): scala.Unit = js.native
}

