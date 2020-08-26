package typings.overwatchApi.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait owl extends js.Object {
  def getLiveMatch(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def getSchedule(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
  def getStandings(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit = js.native
}

object owl {
  @scala.inline
  def apply(
    getLiveMatch: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit,
    getSchedule: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit,
    getStandings: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit
  ): owl = {
    val __obj = js.Dynamic.literal(getLiveMatch = js.Any.fromFunction1(getLiveMatch), getSchedule = js.Any.fromFunction1(getSchedule), getStandings = js.Any.fromFunction1(getStandings))
    __obj.asInstanceOf[owl]
  }
  @scala.inline
  implicit class owlOps[Self <: owl] (val x: Self) extends AnyVal {
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
    def setGetLiveMatch(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = this.set("getLiveMatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSchedule(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = this.set("getSchedule", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStandings(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = this.set("getStandings", js.Any.fromFunction1(value))
  }
  
}

