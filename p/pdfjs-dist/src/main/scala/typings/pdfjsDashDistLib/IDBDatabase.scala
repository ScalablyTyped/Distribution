package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBDatabase extends EventTarget {
  /**
    * Returns the name of the database.
    */
  val name: java.lang.String = js.native
  /**
    * Returns a list of the names of object stores in the database.
    */
  val objectStoreNames: DOMStringList = js.native
  var onabort: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onversionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _]) | scala.Null = js.native
  /**
    * Returns the version of the database.
    */
  val version: scala.Double = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_versionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Closes the connection once all running transactions have finished.
    */
  def close(): scala.Unit = js.native
  /**
    * Creates a new object store with the given name and options and returns a new IDBObjectStore.
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def createObjectStore(name: java.lang.String): IDBObjectStore = js.native
  def createObjectStore(name: java.lang.String, optionalParameters: IDBObjectStoreParameters): IDBObjectStore = js.native
  /**
    * Deletes the object store with the given name.
    * Throws a "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  def deleteObjectStore(name: java.lang.String): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_abort(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.abort,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_versionchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.versionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ IDBVersionChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  /**
    * Returns a new transaction with the given mode ("readonly" or "readwrite")
    * and scope which can be a single object store name or an array of names.
    */
  def transaction(storeNames: java.lang.String): IDBTransaction = js.native
  def transaction(storeNames: java.lang.String, mode: IDBTransactionMode): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String]): IDBTransaction = js.native
  def transaction(storeNames: js.Array[java.lang.String], mode: IDBTransactionMode): IDBTransaction = js.native
}

@JSGlobal("IDBDatabase")
@js.native
object IDBDatabase
  extends org.scalablytyped.runtime.Instantiable0[IDBDatabase]

