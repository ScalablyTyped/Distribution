package typings.neatDashCsv

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neatDashCsvMod {
  /** The CSV data to parse. */
  type Input = String | Buffer | Readable
  /** A representation of one row of the input CSV. */
  type Row = StringDictionary[String]
}
