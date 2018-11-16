package typings
package multistreamLib.multistreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object multistreamNs {
  type FactoryStream = js.Function1[/* cb */ multistreamLib.multistreamMod.FactoryStreamCallback, scala.Unit]
  type LazyStream = js.Function0[nodeLib.streamMod.Stream]
  type Streams = (js.Array[LazyStream | nodeLib.NodeJSNs.ReadableStream]) | FactoryStream
}
