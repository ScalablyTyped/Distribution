package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.abstractPropertyMod.AbstractProperty
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.structuresMod.IStructure
import typings.mendixmodelsdk.structuresMod.IStructureClass
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.utilsMod.utils.IMap
import typings.mobx.observablevalueMod.IObservableValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localByNameReferencePropertyMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty", "LocalByNameReferenceProperty")
  @js.native
  class LocalByNameReferenceProperty[T /* <: INamedElement */] protected () extends AbstractProperty[T | Null, IObservableValue[String | Null]] {
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: T,
      _targetType: String
    ) = this()
    def this(
      declaredOn: IStructureClass,
      parent: AbstractElement[IAbstractModel, Container],
      name: String,
      initialValue: Null,
      _targetType: String
    ) = this()
    
    def deepCopyInto(clone: Structure[IAbstractModel, IContainer | Null]): Unit = js.native
    def deepCopyInto(
      clone: Structure[IAbstractModel, IContainer | Null],
      idMap: js.UndefOr[scala.Nothing],
      unresolvedIdentifierFixers: js.Array[
          js.Function1[/* idMap */ IMap[Structure[IAbstractModel, IContainer | Null]], Unit]
        ]
    ): Unit = js.native
    def deepCopyInto(
      clone: Structure[IAbstractModel, IContainer | Null],
      idMap: IMap[Structure[IAbstractModel, IContainer | Null]]
    ): Unit = js.native
    
    def localName(): String | Null = js.native
    
    @JSName("parent")
    var parent_LocalByNameReferenceProperty: AbstractElement[IAbstractModel, Container] = js.native
    
    def set(): Unit = js.native
    def set(newValue: T): Unit = js.native
    
    def targetType: String = js.native
    
    def updateWithRawValue(value: String): Unit = js.native
  }
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty", "isNamedElement")
  @js.native
  def isNamedElement(element: IStructure): /* is mendixmodelsdk.mendixmodelsdk/dist/sdk/internal/properties/LocalByNameReferenceProperty.INamedElement */ Boolean = js.native
  
  @js.native
  trait INamedElement extends IElement {
    
    var name: String = js.native
  }
}
