package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deferred
  extends /* key */ StringDictionary[js.Any] {
  var deferred: js.UndefOr[Boolean] = js.native
  var fetchSize: js.UndefOr[Double] = js.native
}

object Deferred {
  @scala.inline
  def apply(): Deferred = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deferred]
  }
  @scala.inline
  implicit class DeferredOps[Self <: Deferred] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeferred(value: Boolean): Self = this.set("deferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    @scala.inline
    def setFetchSize(value: Double): Self = this.set("fetchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchSize: Self = this.set("fetchSize", js.undefined)
  }
  
}

