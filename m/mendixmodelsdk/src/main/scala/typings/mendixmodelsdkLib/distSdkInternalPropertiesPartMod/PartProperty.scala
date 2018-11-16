package typings
package mendixmodelsdkLib.distSdkInternalPropertiesPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/part", "PartProperty")
@js.native
class PartProperty[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.Element */] ()
  extends mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[
      T | scala.Null, 
      mobxLib.libTypesObservablevalueMod.IObservableValue[T | scala.Null]
    ] {
  var hasDefaultValue: scala.Boolean = js.native
  @JSName("parent")
  var parent_PartProperty: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement = js.native
  def detachValue(): scala.Unit = js.native
  def set(): scala.Unit = js.native
  def set(newValue: T): scala.Unit = js.native
  def updateElementContainer(unit: mendixmodelsdkLib.distSdkInternalUnitsMod.ModelUnit): scala.Unit = js.native
  def updateWithRawValue(): scala.Unit = js.native
  def updateWithRawValue(value: mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson): scala.Unit = js.native
}

