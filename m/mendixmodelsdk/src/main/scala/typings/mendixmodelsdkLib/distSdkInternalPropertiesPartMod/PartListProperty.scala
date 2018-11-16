package typings
package mendixmodelsdkLib.distSdkInternalPropertiesPartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/part", "PartListProperty")
@js.native
class PartListProperty[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.Element */] ()
  extends mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[T]] {
  var _detaching: js.Any = js.native
  @JSName("parent")
  var parent_PartListProperty: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement = js.native
  def detachChild(child: T): scala.Unit = js.native
  def removeChild(child: T): scala.Boolean = js.native
  def updateElementContainer(unit: mendixmodelsdkLib.distSdkInternalUnitsMod.ModelUnit): scala.Unit = js.native
  def updateWithRawValue(value: js.Array[mendixmodelsdkLib.distSdkInternalTransportDashInterfacesMod.IAbstractElementJson]): scala.Unit = js.native
}

