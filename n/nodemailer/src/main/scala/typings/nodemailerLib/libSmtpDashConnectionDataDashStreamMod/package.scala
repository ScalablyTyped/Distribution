package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSmtpDashConnectionDataDashStreamMod {
  /**
    * Escapes dots in the beginning of lines. Ends the stream with <CR><LF>.<CR><LF>
    * Also makes sure that only <CR><LF> sequences are used for linebreaks
    */
  type DataStream = nodeLib.streamMod.Transform
}
