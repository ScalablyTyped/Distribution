package typings
package mendixmodelsdkLib.distSdkInternalUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractUnit
  extends mendixmodelsdkLib.distSdkInternalStructuresMod.IStructure {
  /**
    * The parent unit of this unit.
    */
  @JSName("container")
  val container_IAbstractUnit: IStructuralUnit
}

object IAbstractUnit {
  @scala.inline
  def apply(
    allProperties: js.Function0[
      js.Array[
        mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
      ]
    ],
    container: IStructuralUnit,
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
    traverse: js.Function1[js.Function1[IAbstractUnit, scala.Unit], scala.Unit],
    traverseFind: js.Function1[js.Function1[IAbstractUnit, js.Any], js.Any | scala.Null],
    traversePublicParts: js.Function1[js.Function1[IAbstractUnit, scala.Unit], scala.Unit],
    unit: IAbstractUnit
  ): IAbstractUnit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allProperties")(allProperties)
    __obj.updateDynamic("container")(container)
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
    __obj.asInstanceOf[IAbstractUnit]
  }
}

