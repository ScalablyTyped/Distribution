package typings.mobx

import typings.mobx.distApiObservableMod.CreateObservableOptions
import typings.mobx.distTypesObservableobjectMod.IIsObservableObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDynamicobjectMod {
  
  @JSImport("mobx/dist/types/dynamicobject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asDynamicObservableObject(target: Any): IIsObservableObject = ^.asInstanceOf[js.Dynamic].applyDynamic("asDynamicObservableObject")(target.asInstanceOf[js.Any]).asInstanceOf[IIsObservableObject]
  inline def asDynamicObservableObject(target: Any, options: CreateObservableOptions): IIsObservableObject = (^.asInstanceOf[js.Dynamic].applyDynamic("asDynamicObservableObject")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IIsObservableObject]
}
