package typings.mendixmodelsdk

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.elementsMod.Element
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instantiateChildElementMod {
  
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/instantiateChildElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container]): Element[IAbstractModel] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[Element[IAbstractModel] | Null]
  @scala.inline
  def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container], value: IAbstractElementJson): Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel] | Null]
}
