package typings
package nanoidLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NanoidAsync extends js.Object {
  def apply(): js.Promise[java.lang.String] = js.native
  def apply(size: scala.Double): js.Promise[java.lang.String] = js.native
  def apply(
    size: scala.Double,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* id */ java.lang.String, _]
  ): scala.Unit = js.native
  def apply(
    size: scala.Null,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* id */ java.lang.String, _]
  ): scala.Unit = js.native
}

