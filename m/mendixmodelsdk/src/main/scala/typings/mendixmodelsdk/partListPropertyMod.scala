package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.elementsMod.Element
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.unitsMod.ModelUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partListPropertyMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/PartListProperty", "PartListProperty")
  @js.native
  class PartListProperty[T /* <: Element[IAbstractModel] */] protected ()
    extends AbstractProperty[js.Array[T], IList[T]] {
    /**
      * parent is the structure that the value of this property attaches to,
      * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
      *    item.container === this.parent.
      *
      * initialValue is default value except parts and GUID-typed primitives.
      * (by-id/name references do not have default values.)
      */
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      moreArgs: js.Any*
    ) = this()
    
    var _detaching: js.Any = js.native
    
    def detachChild(child: T): Unit = js.native
    
    @JSName("parent")
    var parent_PartListProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def removeChild(child: T): Boolean = js.native
    
    def updateElementContainer(unit: ModelUnit[IAbstractModel]): Unit = js.native
    
    def updateWithRawValue(value: js.Array[IAbstractElementJson]): Unit = js.native
  }
}
