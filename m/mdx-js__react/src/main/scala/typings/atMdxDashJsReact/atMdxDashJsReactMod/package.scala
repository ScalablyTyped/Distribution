package typings.atMdxDashJsReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMdxDashJsReactMod {
  import typings.std.Exclude
  import typings.std.Pick

  // Taken from https://github.com/sindresorhus/type-fest/blob/794de74c6e0d1650fe07b91d22d970b68c1d3e37/source/except.d.ts#L1-L22
  type Except[ObjectType, KeysType /* <: String */] = Pick[ObjectType, Exclude[String, KeysType]]
  type MDXProviderComponentsProp = MDXProviderComponents | (js.Function1[/* components */ MDXProviderComponents, MDXProviderComponents])
}
