package typings.parsimmon.parsimmonMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Equivalent to Parsimmon.alt(Parsimmon.newline, Parsimmon.eof).
	 *
	 * This is the most general purpose "end of line" parser. It allows the "end of file"
	 * in addition to all three text file line endings from Parsimmon.newline. This is
	 * important because text files frequently do not have line terminators at the
	 * end ("trailing newline").
	 */
@JSImport("parsimmon", "end")
@js.native
object end
  extends TopLevel[Parser[js.UndefOr[String]]]

