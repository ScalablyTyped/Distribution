package typings.overwatchDashApi.overwatchDashApiMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait owl extends js.Object {
  def getLiveMatch(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
  def getSchedule(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
  def getStandings(callback: js.Function2[/* err */ Error, /* data */ js.Any, Unit]): Unit
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
}

