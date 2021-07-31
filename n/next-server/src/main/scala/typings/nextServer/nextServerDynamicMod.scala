package typings.nextServer

import typings.nextServer.dynamicMod.DynamicOptions
import typings.nextServer.dynamicMod.LoadableFn
import typings.nextServer.dynamicMod.LoadableOptions
import typings.nextServer.dynamicMod.Loader
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextServerDynamicMod {
  
  @JSImport("next-server/dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  @scala.inline
  def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  @scala.inline
  def default[P](dynamicOptions: Loader[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  @scala.inline
  def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  @scala.inline
  def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClass[P, js.Any]) | FunctionComponent[P] | js.Function0[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("noSSR")(LoadableInitializer.asInstanceOf[js.Any], loadableOptions.asInstanceOf[js.Any])).asInstanceOf[(ComponentClass[P, js.Any]) | FunctionComponent[P] | js.Function0[Element]]
}
