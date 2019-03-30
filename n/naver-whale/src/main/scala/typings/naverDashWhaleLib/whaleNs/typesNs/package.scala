package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesNs {
  type ChromeSettingChangedEvent = chromeLib.chromeNs.eventsNs.Event[chromeLib.chromeNs.typesNs.DetailsCallback]
  type DetailsCallback = js.Function1[/* details */ chromeLib.chromeNs.typesNs.ChromeSettingGetResultDetails, scala.Unit]
}
