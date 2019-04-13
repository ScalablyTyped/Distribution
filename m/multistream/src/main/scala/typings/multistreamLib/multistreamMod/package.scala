package typings
package multistreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multistreamMod {
  type FactoryStream = js.Function1[/* cb */ FactoryStreamCallback, scala.Unit]
  type LazyStream = js.Function0[nodeLib.streamMod.Stream]
  type Streams = (js.Array[LazyStream | nodeLib.NodeJSNs.ReadableStream]) | FactoryStream
}
