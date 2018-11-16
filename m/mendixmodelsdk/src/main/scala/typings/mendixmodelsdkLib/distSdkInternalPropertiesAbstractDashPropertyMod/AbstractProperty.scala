package typings
package mendixmodelsdkLib.distSdkInternalPropertiesAbstractDashPropertyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/abstract-property", "AbstractProperty")
@js.native
abstract class AbstractProperty[T, P] protected () extends js.Object {
  /**
       * parent is the structure that the value of this property attaches to,
       * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
       *    item.container === this.parent.
       *
       * initialValue is default value except parts and GUID-typed primitives.
       * (by-id/name references do not have default values.)
       */
  def this(declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass, parent: mendixmodelsdkLib.distSdkInternalStructuresMod.Structure, name: java.lang.String, initialValue: T, moreArgs: js.Any*) = this()
  var declaredOn: mendixmodelsdkLib.distSdkInternalStructuresMod.IStructureClass = js.native
  val isAvailable: scala.Boolean = js.native
  val isPublic: scala.Boolean = js.native
  val isRequired: scala.Boolean = js.native
  var name: java.lang.String = js.native
  var observableValue: P = js.native
  var parent: mendixmodelsdkLib.distSdkInternalStructuresMod.Structure = js.native
  val versionInfo: mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.PropertyVersionInfo = js.native
  def deepCopyInto(
    clone: mendixmodelsdkLib.distSdkInternalStructuresMod.Structure,
    idMap: mendixmodelsdkLib.distSdkUtilsMod.utilsNs.IMap[mendixmodelsdkLib.distSdkInternalStructuresMod.Structure],
    unresolvedIdentifierFixers: js.Array[
      js.Function1[
        /* idMap */ mendixmodelsdkLib.distSdkUtilsMod.utilsNs.IMap[mendixmodelsdkLib.distSdkInternalStructuresMod.Structure], 
        scala.Unit
      ]
    ]
  ): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  def disposer(): js.UndefOr[scala.Unit] = js.native
  def get(): T = js.native
  def reportAvailabilityIssues(): scala.Unit = js.native
  def updateWithRawValue(value: js.Any): scala.Unit = js.native
}

