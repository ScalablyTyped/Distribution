package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.byIdReferenceMod.ByIdReference
import typings.mendixmodelsdk.elementsMod.AbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/ByIdReferenceProperty", JSImport.Namespace)
@js.native
object byIdReferencePropertyMod extends js.Object {
  @js.native
  class ByIdReferenceProperty[T /* <: AbstractElement */] () extends AbstractProperty[T | Null, ByIdReference[T]] {
    @JSName("parent")
    var parent_ByIdReferenceProperty: AbstractElement = js.native
    def resolveReference(): Unit = js.native
    def set(): Unit = js.native
    def set(value: T): Unit = js.native
    def updateElementContainer(): Unit = js.native
    def updateWithRawValue(value: String): Unit = js.native
  }
  
}

