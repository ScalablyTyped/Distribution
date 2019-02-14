package typings
package nodeLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalNs {
  type PassThrough = Transform
  type Stream = nodeLib.streamMod.internal
  type TransformCallback = js.Function2[
    /* error */ js.UndefOr[nodeLib.Error | scala.Null], 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
