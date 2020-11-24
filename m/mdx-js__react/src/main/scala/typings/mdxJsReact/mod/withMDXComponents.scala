package typings.mdxJsReact.mod

import typings.mdxJsReact.mdxJsReactStrings.components
import typings.react.mod.ComponentType
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@mdx-js/react", "withMDXComponents")
@js.native
object withMDXComponents extends js.Object {
  
  def apply[GProps /* <: InjectedMDXProviderProps */](Component: ComponentType[GProps]): FC[Except[GProps, components]] = js.native
}
