package typings.mendixmodelsdk

import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import typings.mobx.libTypesObservablevalueMod.IObservableValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PrimitiveProperty", JSImport.Namespace)
@js.native
object distSdkInternalPropertiesPrimitivePropertyMod extends js.Object {
  @js.native
  class PrimitiveProperty[T] () extends AbstractProperty[T, IObservableValue[T]] {
    var beforeChange: js.Any = js.native
    var defaultValue: T = js.native
    var primitiveType: js.Any = js.native
    def deepCopyInto(clone: Structure): Unit = js.native
    /* protected */ def getRawValue(value: T): js.Any = js.native
    def markCurrentValueAsDefault(): Unit = js.native
    def set(newValue: T): Unit = js.native
    def updateWithRawValue(value: T): Unit = js.native
  }
  
}

