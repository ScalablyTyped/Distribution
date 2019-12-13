package typings.papaparse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object papaparseMod {
  import typings.papaparse.papaparseNumbers.`1`
  import typings.papaparse.papaparseStrings.BACKSLASHu001E
  import typings.papaparse.papaparseStrings.BACKSLASHu001F

  // The possible values for the ParseConfig property delimitersToGuess
  /* Rewritten from type alias, can be one of: 
    - typings.papaparse.papaparseStrings.`,`
    - typings.papaparse.papaparseStrings.BACKSLASHt
    - typings.papaparse.papaparseStrings.`|`
    - typings.papaparse.papaparseStrings.`;`
    - typings.papaparse.papaparseMod.RECORD_SEP_TYPE
    - typings.papaparse.papaparseMod.UNIT_SEP_TYPE
  */
  type GuessableDelimiters = _GuessableDelimiters | RECORD_SEP_TYPE | UNIT_SEP_TYPE
  // When passed to Papa Parse a Readable stream is returned.
  type NODE_STREAM_INPUT_TYPE = `1`
  // The true delimiter. Invisible. ASCII code 30. Should be doing the job we strangely rely upon commas and tabs for.
  type RECORD_SEP_TYPE = BACKSLASHu001E
  // Also sometimes used as a delimiting character. ASCII code 31.
  type UNIT_SEP_TYPE = BACKSLASHu001F
}
