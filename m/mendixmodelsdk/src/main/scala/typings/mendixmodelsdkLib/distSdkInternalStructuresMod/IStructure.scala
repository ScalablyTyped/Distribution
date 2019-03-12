package typings
package mendixmodelsdkLib.distSdkInternalStructuresMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStructure extends js.Object {
  val container: mendixmodelsdkLib.distSdkInternalStructuresMod.aliasesNs.IContainer | scala.Null
  var id: java.lang.String
  var isLoaded: scala.Boolean
  var model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel
  var structureTypeName: java.lang.String
  /**
    * Unit that owns/contains this thing.
    */
  var unit: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit
  def allProperties(): js.Array[
    mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
  ]
  /**
    * Returns all properties when this structure is loaded, otherwise just the public properties.
    */
  def loadedProperties(): js.Array[
    mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
  ]
  def publicProperties(): js.Array[
    mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
  ]
  /**
    * Renders the structure as plain JSON (without observables magic).
    * This is intended for debugging and development convenience.
    * Note that the resulting object is not of the interface type corresponding to this structure.
    */
  def toJSON(): js.Object
  /**
    * Traverses this structure by calling the provided visitor function
    * on itself and all the structures contained (as part) by it,
    * in depth-first order, and it returns synchronously after that.
    */
  def traverse(visit: js.Function1[/* structure */ this.type, scala.Unit]): scala.Unit
  /**
    * Traverses this structure, returning immediately when `visit` returns something other than `null`.
    */
  def traverseFind[T](visit: js.Function1[/* structure */ this.type, T]): T | scala.Null
  /**
    * Traverses this structure, only visiting children contained in public properties.
    */
  def traversePublicParts(visit: js.Function1[/* structure */ this.type, scala.Unit]): scala.Unit
}

object IStructure {
  @scala.inline
  def apply(
    allProperties: () => js.Array[
      mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
    ],
    id: java.lang.String,
    isLoaded: scala.Boolean,
    loadedProperties: () => js.Array[
      mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
    ],
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel,
    publicProperties: () => js.Array[
      mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
    ],
    structureTypeName: java.lang.String,
    toJSON: () => js.Object,
    traverse: js.Function1[IStructure, scala.Unit] => scala.Unit,
    traverseFind: js.Function1[IStructure, js.Any] => js.Any | scala.Null,
    traversePublicParts: js.Function1[IStructure, scala.Unit] => scala.Unit,
    unit: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit,
    container: mendixmodelsdkLib.distSdkInternalStructuresMod.aliasesNs.IContainer = null
  ): IStructure = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), id = id, isLoaded = isLoaded, loadedProperties = js.Any.fromFunction0(loadedProperties), model = model, publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName, toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructure]
  }
}

