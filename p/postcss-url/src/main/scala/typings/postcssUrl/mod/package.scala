package typings.postcssUrl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomFilterFunction = js.Function1[/* file */ java.lang.String, scala.Boolean]
  type CustomHashFunction = js.Function1[/* file */ typings.node.Buffer, java.lang.String]
  type CustomTransformFunction = js.Function2[
    /* asset */ typings.postcssUrl.anon.AbsolutePath, 
    /* dir */ typings.postcssUrl.anon.File, 
    java.lang.String
  ]
  type Url = typings.postcss.mod.Plugin_[typings.postcssUrl.mod.Options | js.Array[typings.postcssUrl.mod.Options]]
}
