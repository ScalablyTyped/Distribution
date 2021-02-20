package typings.overwatchApi.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait owl extends StObject {
  
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
  implicit class owlMutableBuilder[Self <: owl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLiveMatch(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "getLiveMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSchedule(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "getSchedule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetStandings(value: js.Function2[/* err */ Error, /* data */ js.Any, Unit] => Unit): Self = StObject.set(x, "getStandings", js.Any.fromFunction1(value))
  }
}
