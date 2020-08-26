package typings.openui5.sap.ui.core.routing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait History extends js.Object {
  /**
    * Determines what the navigation direction for a newly given hash would beIt will say Unknown if there
    * is a history foo - bar (current history) - fooIf you now ask for the direction of the hash "foo" you
    * get Unknown because it might be backwards or forwards.For hash replacements, the history stack will
    * be replaced at this position for the history.
    * @param sNewHash optional, if this parameter is not passed the last hashChange is taken.
    * @returns or undefined, if no navigation has taken place yet.
    */
  def getDirection(sNewHash: String): js.Any = js.native
  /**
    * @returns a global singleton that gets created as soon as the sap.ui.core.routing.History is required
    */
  def getInstance(): History = js.native
  /**
    * gets the previous hash in the history - if the last direction was Unknown or there was no navigation
    * yet, undefined will be returned
    * @returns or undefined
    */
  def getPreviousHash(): String = js.native
}

object History {
  @scala.inline
  def apply(getDirection: String => js.Any, getInstance: () => History, getPreviousHash: () => String): History = {
    val __obj = js.Dynamic.literal(getDirection = js.Any.fromFunction1(getDirection), getInstance = js.Any.fromFunction0(getInstance), getPreviousHash = js.Any.fromFunction0(getPreviousHash))
    __obj.asInstanceOf[History]
  }
  @scala.inline
  implicit class HistoryOps[Self <: History] (val x: Self) extends AnyVal {
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
    def setGetDirection(value: String => js.Any): Self = this.set("getDirection", js.Any.fromFunction1(value))
    @scala.inline
    def setGetInstance(value: () => History): Self = this.set("getInstance", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPreviousHash(value: () => String): Self = this.set("getPreviousHash", js.Any.fromFunction0(value))
  }
  
}

