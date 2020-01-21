package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.elementsMod.IAbstractElement
import typings.mendixmodelsdk.structuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal", "ByNameReferenceListProperty")
@js.native
class ByNameReferenceListProperty[T /* <: IAbstractElement */] protected ()
  extends typings.mendixmodelsdk.propertiesMod.ByNameReferenceListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.elementsMod.AbstractElement,
    name: String,
    value: js.Array[T],
    _targetType: String
  ) = this()
}

