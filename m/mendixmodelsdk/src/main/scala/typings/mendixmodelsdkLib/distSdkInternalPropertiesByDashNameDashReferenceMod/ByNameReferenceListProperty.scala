package typings
package mendixmodelsdkLib.distSdkInternalPropertiesByDashNameDashReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/by-name-reference", "ByNameReferenceListProperty")
@js.native
class ByNameReferenceListProperty[T /* <: mendixmodelsdkLib.distSdkInternalElementsMod.IAbstractElement */] protected ()
  extends mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[js.Array[T], mendixmodelsdkLib.distSdkInternalInstancesMod.IList[java.lang.String]] {
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement, name: java.lang.String, value: js.Array[T], _targetType: java.lang.String) = this()
  @JSName("parent")
  var parent_ByNameReferenceListProperty: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement = js.native
  val targetType: java.lang.String = js.native
  def qualifiedNames(): js.Array[java.lang.String] = js.native
  def updateWithRawValue(value: js.Array[java.lang.String]): scala.Unit = js.native
}

