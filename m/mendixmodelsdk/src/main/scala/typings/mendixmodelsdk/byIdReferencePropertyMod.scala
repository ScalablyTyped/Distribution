package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.byIdReferenceMod.ByIdReference
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/ByIdReferenceProperty", JSImport.Namespace)
@js.native
object byIdReferencePropertyMod extends js.Object {
  
  @js.native
  class ByIdReferenceProperty[T /* <: AbstractElement[IAbstractModel, Container] */] () extends AbstractProperty[T | Null, ByIdReference[T]] {
    
    @JSName("parent")
    var parent_ByIdReferenceProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def resolveReference(): Unit = js.native
    
    def set(): Unit = js.native
    def set(value: T): Unit = js.native
    
    def updateElementContainer(): Unit = js.native
    
    def updateWithRawValue(value: String): Unit = js.native
  }
}
