package typings.papaparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // The possible values for the ParseConfig property delimitersToGuess
  /* Rewritten from type alias, can be one of: 
    - typings.papaparse.papaparseStrings.Comma
    - typings.papaparse.papaparseStrings.Charactertabulation
    - typings.papaparse.papaparseStrings.Verticalline
    - typings.papaparse.papaparseStrings.Semicolon
    - typings.papaparse.mod.RECORD_SEP_TYPE
    - typings.papaparse.mod.UNIT_SEP_TYPE
  */
  type GuessableDelimiters = typings.papaparse.mod._GuessableDelimiters | typings.papaparse.mod.RECORD_SEP_TYPE | typings.papaparse.mod.UNIT_SEP_TYPE
  // When passed to Papa Parse a Readable stream is returned.
  type NODE_STREAM_INPUT_TYPE = typings.papaparse.papaparseNumbers.`1`
  // The true delimiter. Invisible. ASCII code 30. Should be doing the job we strangely rely upon commas and tabs for.
  type RECORD_SEP_TYPE = typings.papaparse.papaparseStrings.Informationseparatortwo
  // Also sometimes used as a delimiting character. ASCII code 31.
  type UNIT_SEP_TYPE = typings.papaparse.papaparseStrings.Informationseparatorone
}
