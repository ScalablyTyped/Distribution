package typings.openui5.sap.ui.core.routing

import typings.openui5.sap.ui.base.EventProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashChanger extends EventProvider {
  /**
    * Fires the hashchanged event, may be extended to modify the hash before fireing the event
    * @param newHash the new hash of the browser
    * @param oldHash the previous hash
    */
  def fireHashChanged(newHash: String, oldHash: String): Unit = js.native
  /**
    * Gets the current hash
    * @returns the current hash
    */
  def getHash(): String = js.native
  /**
    * Gets a global singleton of the HashChanger. The singleton will get created when this function is
    * invoked for the first time.
    */
  def getInstance(): Unit = js.native
  /**
    * Will start listening to hashChanges with the parseHash function.This will also fire a hashchanged
    * event with the initial hash.
    */
  def init(): Unit = js.native
  /**
    * Replaces the hash to a certain value. When using the replace function no browser history is
    * written.If you want to have an entry in the browser history, please use set setHash function.
    * @param sHash the hash
    */
  def replaceHash(sHash: String): Unit = js.native
  /**
    * Sets the hashChanger to a new instance, destroys the old one and copies all its event listeners to
    * the new one
    * @param oHashChanger the new instance for the global singleton
    */
  def replaceHashChanger(oHashChanger: HashChanger): Unit = js.native
  /**
    * Sets the hash to a certain value. When using the set function a browser history  entry is written.If
    * you do not want to have an entry in the browser history, please use set replaceHash function.
    * @param sHash the hash
    */
  def setHash(sHash: String): Unit = js.native
}

