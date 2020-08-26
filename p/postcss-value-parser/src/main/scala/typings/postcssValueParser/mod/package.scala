package typings.postcssValueParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomStringifierCallback = js.Function1[/* nodes */ typings.postcssValueParser.mod.Node, js.UndefOr[java.lang.String]]
  type WalkCallback = js.Function3[
    /* node */ typings.postcssValueParser.mod.Node, 
    /* index */ scala.Double, 
    /* nodes */ js.Array[typings.postcssValueParser.mod.Node], 
    scala.Unit | scala.Boolean
  ]
}
