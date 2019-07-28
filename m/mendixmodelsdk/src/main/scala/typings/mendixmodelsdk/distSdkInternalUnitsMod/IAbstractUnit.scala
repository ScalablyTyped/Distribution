package typings.mendixmodelsdk.distSdkInternalUnitsMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractUnit extends IStructure {
  /**
    * The parent unit of this unit.
    */
  @JSName("container")
  val container_IAbstractUnit: IStructuralUnit
}

object IAbstractUnit {
  @scala.inline
  def apply(
    allProperties: () => js.Array[AbstractProperty[_, _]],
    container: IStructuralUnit,
    id: String,
    isLoaded: Boolean,
    loadedProperties: () => js.Array[AbstractProperty[_, _]],
    model: IAbstractModel,
    publicProperties: () => js.Array[AbstractProperty[_, _]],
    structureTypeName: String,
    toJSON: () => js.Object,
    traverse: js.Function1[IAbstractUnit, Unit] => Unit,
    traverseFind: js.Function1[IAbstractUnit, js.Any] => js.Any | Null,
    traversePublicParts: js.Function1[IAbstractUnit, Unit] => Unit,
    unit: IAbstractUnit
  ): IAbstractUnit = {
    val __obj = js.Dynamic.literal(allProperties = js.Any.fromFunction0(allProperties), container = container, id = id, isLoaded = isLoaded, loadedProperties = js.Any.fromFunction0(loadedProperties), model = model, publicProperties = js.Any.fromFunction0(publicProperties), structureTypeName = structureTypeName, toJSON = js.Any.fromFunction0(toJSON), traverse = js.Any.fromFunction1(traverse), traverseFind = js.Any.fromFunction1(traverseFind), traversePublicParts = js.Any.fromFunction1(traversePublicParts), unit = unit)
  
    __obj.asInstanceOf[IAbstractUnit]
  }
}

