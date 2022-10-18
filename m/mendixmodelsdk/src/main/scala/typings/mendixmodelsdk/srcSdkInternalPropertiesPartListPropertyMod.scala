package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalElementsMod.Element
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.srcSdkInternalPropertiesAbstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.srcSdkInternalUnitsMod.ModelUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesPartListPropertyMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/PartListProperty", "PartListProperty")
  @js.native
  open class PartListProperty[T /* <: Element[IAbstractModel] */] protected ()
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
      moreArgs: Any*
    ) = this()
    
    /* private */ var _detaching: Any = js.native
    
    def detachChild(child: T): Unit = js.native
    
    @JSName("parent")
    var parent_PartListProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def removeChild(child: T): Boolean = js.native
    
    def updateElementContainer(unit: ModelUnit[IAbstractModel]): Unit = js.native
    
    def updateWithRawValue(value: js.Array[IAbstractElementJson]): Unit = js.native
  }
}
