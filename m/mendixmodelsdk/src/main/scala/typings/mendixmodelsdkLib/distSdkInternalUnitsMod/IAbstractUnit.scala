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
    allProperties: () => js.Array[
      mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[_, _]
    ],
    container: IStructuralUnit,
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
    traverse: js.Function1[IAbstractUnit, scala.Unit] => scala.Unit,
    traverseFind: js.Function1[IAbstractUnit, js.Any] => js.Any | scala.Null,
    traversePublicParts: js.Function1[IAbstractUnit, scala.Unit] => scala.Unit,
    unit: IAbstractUnit
  ): IAbstractUnit = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container, id = id, isLoaded = isLoaded, loadedProperties = js.Any.fromFunction0(loadedProperties), model = model, publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName, toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit)
  
    __obj.asInstanceOf[IAbstractUnit]
  }
}

