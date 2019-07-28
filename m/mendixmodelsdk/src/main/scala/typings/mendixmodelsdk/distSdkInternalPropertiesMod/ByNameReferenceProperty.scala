package typings.mendixmodelsdk.distSdkInternalPropertiesMod

import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", "ByNameReferenceProperty")
@js.native
class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesByDashNameDashReferenceMod.ByNameReferenceProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: AbstractElement,
    name: String,
    initialValue: T,
    _targetType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: AbstractElement,
    name: String,
    initialValue: Null,
    _targetType: String
  ) = this()
}

