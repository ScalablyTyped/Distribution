package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "ByNameReferenceListProperty")
@js.native
class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesMod.ByNameReferenceListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    name: String,
    value: js.Array[T],
    _targetType: String
  ) = this()
}

