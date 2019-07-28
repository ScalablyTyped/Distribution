package typings.mendixmodelsdk.distSdkInternalMod

import typings.mendixmodelsdk.distSdkInternalElementsMod.IAbstractElement
import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "ByNameReferenceProperty")
@js.native
class ByNameReferenceProperty[T /* <: IAbstractElement */] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesMod.ByNameReferenceProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    name: String,
    initialValue: T,
    _targetType: String
  ) = this()
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement,
    name: String,
    initialValue: Null,
    _targetType: String
  ) = this()
}

