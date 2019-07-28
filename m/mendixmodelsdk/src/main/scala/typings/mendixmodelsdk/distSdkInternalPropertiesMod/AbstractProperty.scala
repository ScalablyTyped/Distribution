package typings.mendixmodelsdk.distSdkInternalPropertiesMod

import typings.mendixmodelsdk.distSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.distSdkInternalStructuresMod.Structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties", "AbstractProperty")
@js.native
abstract class AbstractProperty[T, P] protected ()
  extends typings.mendixmodelsdk.distSdkInternalPropertiesAbstractDashPropertyMod.AbstractProperty[T, P] {
  /**
    * parent is the structure that the value of this property attaches to,
    * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
    *    item.container === this.parent.
    *
    * initialValue is default value except parts and GUID-typed primitives.
    * (by-id/name references do not have default values.)
    */
  def this(declaredOn: IStructureClass, parent: Structure, name: String, initialValue: T, moreArgs: js.Any*) = this()
}

