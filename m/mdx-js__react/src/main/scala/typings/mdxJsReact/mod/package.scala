package typings.mdxJsReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // Taken from https://github.com/sindresorhus/type-fest/blob/794de74c6e0d1650fe07b91d22d970b68c1d3e37/source/except.d.ts#L1-L22
  type Except[ObjectType, KeysType /* <: /* keyof ObjectType */ java.lang.String */] = typings.std.Pick[ObjectType, typings.std.Exclude[/* keyof ObjectType */ java.lang.String, KeysType]]
  type MDXProviderComponentsProp = typings.mdxJsReact.mod.MDXProviderComponents | (js.Function1[
    /* components */ typings.mdxJsReact.mod.MDXProviderComponents, 
    typings.mdxJsReact.mod.MDXProviderComponents
  ])
}
