package typings.mendixmodelsdk.distSdkInternalPropertiesPrimitivesMod

import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/primitives", "PrimitiveListProperty")
@js.native
class PrimitiveListProperty[T] ()
  extends AbstractProperty[js.Array[T], IList[T]] {
  var primitiveType: js.Any = js.native
  def deepCopyInto(clone: Structure): Unit = js.native
  def updateWithRawValue(value: js.Array[T]): Unit = js.native
}

