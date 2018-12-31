package typings
package openui5Lib.sapNs.uiNs.coreNs.routingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.routing.HashChanger")
@js.native
class HashChanger ()
  extends openui5Lib.sapNs.uiNs.baseNs.EventProvider {
  /**
    * Fires the hashchanged event, may be extended to modify the hash before fireing the event
    * @param newHash the new hash of the browser
    * @param oldHash the previous hash
    */
  def fireHashChanged(newHash: java.lang.String, oldHash: java.lang.String): scala.Unit = js.native
  /**
    * Gets the current hash
    * @returns the current hash
    */
  def getHash(): java.lang.String = js.native
  /**
    * Gets a global singleton of the HashChanger. The singleton will get created when this function is
    * invoked for the first time.
    */
  def getInstance(): scala.Unit = js.native
  /**
    * Will start listening to hashChanges with the parseHash function.This will also fire a hashchanged
    * event with the initial hash.
    */
  def init(): scala.Unit = js.native
  /**
    * Replaces the hash to a certain value. When using the replace function no browser history is
    * written.If you want to have an entry in the browser history, please use set setHash function.
    * @param sHash the hash
    */
  def replaceHash(sHash: java.lang.String): scala.Unit = js.native
  /**
    * Sets the hashChanger to a new instance, destroys the old one and copies all its event listeners to
    * the new one
    * @param oHashChanger the new instance for the global singleton
    */
  def replaceHashChanger(oHashChanger: HashChanger): scala.Unit = js.native
  /**
    * Sets the hash to a certain value. When using the set function a browser history  entry is written.If
    * you do not want to have an entry in the browser history, please use set replaceHash function.
    * @param sHash the hash
    */
  def setHash(sHash: java.lang.String): scala.Unit = js.native
}

