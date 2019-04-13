package typings
package neatDashCsvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object neatDashCsvMod {
  /** The CSV data to parse. */
  type Input = java.lang.String | nodeLib.Buffer | nodeLib.streamMod.Readable
  /** A representation of one row of the input CSV. */
  type Row = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
