package typings.postcss.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parses source CSS.
  * @param css The CSS to parse.
  * @param options
  * @returns {} A new Root node, which contains the source CSS nodes.
  */
@JSImport("postcss", "parse")
@js.native
object parse extends TopLevel[Parser]

