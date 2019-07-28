package typings.mendixmodelsdk.distSdkInternalPropertiesByDashNameDashReferenceMod

import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/by-name-reference", "ByNameReferenceListProperty")
@js.native
class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
  extends AbstractProperty[js.Array[T], IList[String]] {
  def this(
    declaredOn: IStructureClass,
    parent: AbstractElement,
    name: String,
    value: js.Array[T],
    _targetType: String
  ) = this()
  @JSName("parent")
  var parent_ByNameReferenceListProperty: AbstractElement = js.native
  val targetType: String = js.native
  def qualifiedNames(): js.Array[String] = js.native
  def updateWithRawValue(value: js.Array[String]): Unit = js.native
}

