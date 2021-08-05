package typings.mobservableReact

import typings.react.mod.ClassicComponentClass
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mobservable-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def observer[P](clazz: ClassicComponentClass[P]): ClassicComponentClass[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(clazz.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P]]
  inline def observer[P](clazz: ComponentClass[P, ComponentState]): ComponentClass[P, ComponentState] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(clazz.asInstanceOf[js.Any]).asInstanceOf[ComponentClass[P, ComponentState]]
  inline def observer[P](clazz: StatelessComponent[P]): ClassicComponentClass[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(clazz.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P]]
  inline def observer[P](renderFunction: js.Function1[/* props */ P, ReactElement]): ClassicComponentClass[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(renderFunction.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P]]
  inline def observer[TFunction /* <: ComponentClass[js.Any, ComponentState] */](target: TFunction): TFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("observer")(target.asInstanceOf[js.Any]).asInstanceOf[TFunction]
}
