package typings.neatCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** The CSV data to parse. */
  type Input = java.lang.String | typings.node.Buffer | typings.node.streamMod.Readable
  /** A representation of one row of the input CSV. */
  type Row = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
