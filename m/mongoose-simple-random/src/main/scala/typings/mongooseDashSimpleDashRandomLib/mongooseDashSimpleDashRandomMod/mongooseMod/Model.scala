package typings
package mongooseDashSimpleDashRandomLib.mongooseDashSimpleDashRandomMod.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model[T /* <: mongooseLib.mongooseMod.Document */]
  extends nodeLib.NodeJSNs.EventEmitter
     with mongooseLib.mongooseMod.ModelProperties {
  def findRandom(conditions: js.Object): scala.Unit = js.native
  def findRandom(conditions: js.Object, projection: js.Object): scala.Unit = js.native
  def findRandom(conditions: js.Object, projection: js.Object, options: js.Object): scala.Unit = js.native
  def findRandom(
    conditions: js.Object,
    projection: js.Object,
    options: js.Object,
    callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], scala.Unit]
  ): scala.Unit = js.native
  def findRandom(
    conditions: js.Object,
    projection: js.Object,
    options: scala.Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], scala.Unit]
  ): scala.Unit = js.native
  def findRandom(conditions: js.Object, projection: scala.Null, options: js.Object): scala.Unit = js.native
  def findRandom(
    conditions: js.Object,
    projection: scala.Null,
    options: js.Object,
    callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], scala.Unit]
  ): scala.Unit = js.native
  def findRandom(
    conditions: js.Object,
    projection: scala.Null,
    options: scala.Null,
    callback: js.Function2[/* err */ js.Any, /* res */ js.UndefOr[js.Array[T]], scala.Unit]
  ): scala.Unit = js.native
}

