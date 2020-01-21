package typings.parsimmon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Equivalent to Parsimmon.string("\r").
	 *
	 * This parser checks for the "carriage return" character, which is used as the
	 * line terminator for classic Mac OS 9 text files.
	 */
@JSImport("parsimmon", "cr")
@js.native
object cr extends TopLevel[Parser[String]]

