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
    val __obj = js.Dynamic.literal(allProperties = allProperties, container = container, id = id, isLoaded = isLoaded, loadedProperties = loadedProperties, model = model, publicProperties = publicProperties, structureTypeName = structureTypeName, toJSON = toJSON, traverse = traverse, traverseFind = traverseFind, traversePublicParts = traversePublicParts, unit = unit)
  
    __obj.asInstanceOf[IAbstractUnit]
  }
}

