package typings
package mendixmodelsdkLib.distSdkInternalPropertiesLocalDashByDashNameDashReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/local-by-name-reference", "LocalByNameReferenceProperty")
@js.native
class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
  extends mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[
      T | scala.Null, 
      mobxLib.libTypesObservablevalueMod.IObservableValue[java.lang.String | scala.Null]
    ] {
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement, name: java.lang.String, initialValue: T, _targetType: java.lang.String) = this()
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement, name: java.lang.String, initialValue: scala.Null, _targetType: java.lang.String) = this()
  @JSName("parent")
  var parent_LocalByNameReferenceProperty: mendixmodelsdkLib.distSdkInternalElementsMod.AbstractElement = js.native
  val targetType: java.lang.String = js.native
  def deepCopyInto(clone: mendixmodelsdkLib.distSdkInternalStructuresMod.Structure): scala.Unit = js.native
  def deepCopyInto(
    clone: mendixmodelsdkLib.distSdkInternalStructuresMod.Structure,
    idMap: mendixmodelsdkLib.distSdkUtilsMod.utilsNs.IMap[mendixmodelsdkLib.distSdkInternalStructuresMod.Structure]
  ): scala.Unit = js.native
  def localName(): java.lang.String | scala.Null = js.native
  def set(): scala.Unit = js.native
  def set(newValue: T): scala.Unit = js.native
  def updateWithRawValue(value: java.lang.String): scala.Unit = js.native
}

