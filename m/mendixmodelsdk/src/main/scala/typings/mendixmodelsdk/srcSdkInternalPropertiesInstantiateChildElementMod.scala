package typings.mendixmodelsdk

import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalElementsMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalElementsMod.Element
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import typings.mendixmodelsdk.srcSdkInternalTransportInterfacesMod.IAbstractElementJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesInstantiateChildElementMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/instantiateChildElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container]): Element[IAbstractModel] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any]).asInstanceOf[Element[IAbstractModel] | Null]
  inline def instantiateChildElement(parent: AbstractElement[IAbstractModel, Container], value: IAbstractElementJson): Element[IAbstractModel] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateChildElement")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Element[IAbstractModel] | Null]
}
