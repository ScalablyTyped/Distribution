package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.elementsMod.Element
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PartListProperty", JSImport.Namespace)
@js.native
object partListPropertyMod extends js.Object {
  
  @js.native
  class PartListProperty[T /* <: Element[IAbstractModel] */] ()
    extends AbstractProperty[js.Array[T], IList[T]] {
    
    var _detaching: js.Any = js.native
    
    def detachChild(child: T): Unit = js.native
    
    @JSName("parent")
    var parent_PartListProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def removeChild(child: T): Boolean = js.native
    
    def updateElementContainer(unit: ModelUnit[IAbstractModel]): Unit = js.native
    
    def updateWithRawValue(value: js.Array[IAbstractElementJson]): Unit = js.native
  }
}
