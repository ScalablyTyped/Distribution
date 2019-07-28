package typings.mendixmodelsdk.distSdkInternalPropertiesMod

import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalPropertiesLocalDashByDashNameDashReferenceMod.INamedElement
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", "LocalByNameReferenceProperty")
@js.native
class LocalByNameReferenceProperty[T /* <: INamedElement */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesLocalDashByDashNameDashReferenceMod.LocalByNameReferenceProperty[T] {
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

