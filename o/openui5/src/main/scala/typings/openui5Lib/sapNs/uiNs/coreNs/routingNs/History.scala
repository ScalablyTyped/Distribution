package typings
package openui5Lib.sapNs.uiNs.coreNs.routingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.routing.History")
@js.native
class History protected () extends js.Object {
  /**
    * Used to determine the {@link sap.ui.core.HistoryDirection} of the current or a future
    * navigation,done with a {@link sap.ui.core.routing.Router} or {@link
    * sap.ui.core.routing.HashChanger}.<strong>ATTENTION:</strong> this class will not be accurate if
    * someone does hash-replacement without the named classes aboveIf you are manipulating the hash
    * directly this class is not supported anymore.
    * @param oHashChanger required, without a HashChanger this class cannot work. The class needs to be
    * aware of the hash-changes.
    */
  def this(oHashChanger: HashChanger) = this()
  /**
    * Determines what the navigation direction for a newly given hash would beIt will say Unknown if there
    * is a history foo - bar (current history) - fooIf you now ask for the direction of the hash "foo" you
    * get Unknown because it might be backwards or forwards.For hash replacements, the history stack will
    * be replaced at this position for the history.
    * @param sNewHash optional, if this parameter is not passed the last hashChange is taken.
    * @returns or undefined, if no navigation has taken place yet.
    */
  def getDirection(sNewHash: java.lang.String): js.Any = js.native
  /**
    * @returns a global singleton that gets created as soon as the sap.ui.core.routing.History is required
    */
  def getInstance(): History = js.native
  /**
    * gets the previous hash in the history - if the last direction was Unknown or there was no navigation
    * yet, undefined will be returned
    * @returns or undefined
    */
  def getPreviousHash(): java.lang.String = js.native
}

