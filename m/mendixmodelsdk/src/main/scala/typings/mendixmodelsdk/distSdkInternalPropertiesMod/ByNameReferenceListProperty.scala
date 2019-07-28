package typings.mendixmodelsdk.distSdkInternalPropertiesMod

import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", "ByNameReferenceListProperty")
@js.native
class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesByDashNameDashReferenceMod.ByNameReferenceListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: AbstractElement,
    name: String,
    value: js.Array[T],
    _targetType: String
  ) = this()
}

