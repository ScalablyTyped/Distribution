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
    allProperties: js.Function0[
      js.Array[
        mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
      ]
    ],
    id: java.lang.String,
    isLoaded: scala.Boolean,
    loadedProperties: js.Function0[
      js.Array[
        mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
      ]
    ],
    model: mendixmodelsdkLib.distSdkInternalAbstractDashModelMod.IAbstractModel,
    publicProperties: js.Function0[
      js.Array[
        mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
      ]
    ],
    structureTypeName: java.lang.String,
    toJSON: js.Function0[js.Object],
    traverse: js.Function1[js.Function1[IStructure, scala.Unit], scala.Unit],
    traverseFind: js.Function1[js.Function1[IStructure, js.Any], js.Any | scala.Null],
    traversePublicParts: js.Function1[js.Function1[IStructure, scala.Unit], scala.Unit],
    unit: mendixmodelsdkLib.distSdkInternalUnitsMod.IAbstractUnit,
    container: mendixmodelsdkLib.distSdkInternalStructuresMod.aliasesNs.IContainer = null
  ): IStructure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allProperties")(allProperties)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isLoaded")(isLoaded)
    __obj.updateDynamic("loadedProperties")(loadedProperties)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("publicProperties")(publicProperties)
    __obj.updateDynamic("structureTypeName")(structureTypeName)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("traverse")(traverse)
    __obj.updateDynamic("traverseFind")(traverseFind)
    __obj.updateDynamic("traversePublicParts")(traversePublicParts)
    __obj.updateDynamic("unit")(unit)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStructure]
  }
}

