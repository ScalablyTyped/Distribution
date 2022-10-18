package typings.mendixmodelsdk

import org.scalablytyped.runtime.Instantiable2
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalInstancesMod.AbstractEnum
import typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveListPropertyMod.PrimitiveListProperty
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.IStructureClass
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.Structure
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.IContainer
import typings.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesEnumListPropertyMod {
  
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/EnumListProperty", "EnumListProperty")
  @js.native
  open class EnumListProperty[T /* <: AbstractEnum */] protected () extends PrimitiveListProperty[T] {
    def this(
      declaredOn: IStructureClass,
      parent: Structure[IAbstractModel, IContainer | Null],
      name: String,
      initialValue: js.Array[T],
      enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum]
    ) = this()
    
    /* protected */ var enumType: Instantiable2[/* key */ String, /* lifeCycle */ ILifeCycle, AbstractEnum] = js.native
    
    /* private */ var initialValue: Any = js.native
  }
}
