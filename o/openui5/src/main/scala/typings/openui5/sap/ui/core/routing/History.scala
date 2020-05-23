package typings.openui5.sap.ui.core.routing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait History extends js.Object {
  /**
    * Determines what the navigation direction for a newly given hash would beIt will say Unknown if there
    * is a history foo - bar (current history) - fooIf you now ask for the direction of the hash "foo" you
    * get Unknown because it might be backwards or forwards.For hash replacements, the history stack will
    * be replaced at this position for the history.
    * @param sNewHash optional, if this parameter is not passed the last hashChange is taken.
    * @returns or undefined, if no navigation has taken place yet.
    */
  def getDirection(sNewHash: String): js.Any
  /**
    * @returns a global singleton that gets created as soon as the sap.ui.core.routing.History is required
    */
  def getInstance(): History
  /**
    * gets the previous hash in the history - if the last direction was Unknown or there was no navigation
    * yet, undefined will be returned
    * @returns or undefined
    */
  def getPreviousHash(): String
}

object History {
  @scala.inline
  def apply(getDirection: String => js.Any, getInstance: () => History, getPreviousHash: () => String): History = {
    val __obj = js.Dynamic.literal(getDirection = js.Any.fromFunction1(getDirection), getInstance = js.Any.fromFunction0(getInstance), getPreviousHash = js.Any.fromFunction0(getPreviousHash))
    __obj.asInstanceOf[History]
  }
}

