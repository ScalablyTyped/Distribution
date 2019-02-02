package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeBandwidth extends js.Object {
  /**
    * Node fingerprint consisting of 40 upper-case hexadecimal characters.
    */
  var fingerprint: java.lang.String
  /**
    * Object containing graph history objects with read bytes for different time periods. The specification
    * of graph history objects is similar to those in the `write_history` field.
    */
  var read_history: js.UndefOr[
    stdLib.Partial[
      stdLib.Record[
        onionooLib.onionooLibStrings.`3_days` | onionooLib.onionooLibStrings.`1_week` | onionooLib.onionooLibStrings.`1_month` | onionooLib.onionooLibStrings.`6_months` | onionooLib.onionooLibStrings.`1_year` | onionooLib.onionooLibStrings.`5_years`, 
        Histogram
      ]
    ]
  ] = js.undefined
  /**
    * Object containing graph history objects with written bytes for different time periods. Keys are string
    * representation of the time period covered by the graph history object. Keys are fixed strings `3_days`,
    * `1_week`, `1_month`, `6_months`, `1_year`, and `5_years`. Keys refer to the last known bandwidth history
    * of a node, not to the time when the bandwidth document was published. A graph history object is only
    * ontained if the time period it covers is not already contained in another graph history object with shorter
    * time period and higher data resolution. Similarly, a graph history object is excluded if the node did not
    * provide bandwidth histories on the required level of detail. The unit is bytes per second. Contained
    * graph history objects may contain null values if the node did not provide any bandwidth data or only data
    * for less than 20% of a given time period.
    */
  var write_history: js.UndefOr[
    stdLib.Partial[
      stdLib.Record[
        onionooLib.onionooLibStrings.`3_days` | onionooLib.onionooLibStrings.`1_week` | onionooLib.onionooLibStrings.`1_month` | onionooLib.onionooLibStrings.`6_months` | onionooLib.onionooLibStrings.`1_year` | onionooLib.onionooLibStrings.`5_years`, 
        Histogram
      ]
    ]
  ] = js.undefined
}

