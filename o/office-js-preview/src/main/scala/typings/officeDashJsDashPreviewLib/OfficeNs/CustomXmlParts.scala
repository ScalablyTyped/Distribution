package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a collection of CustomXmlPart objects.
  * 
  * @remarks
  * **Hosts**: Word
  */
@js.native
trait CustomXmlParts extends js.Object {
  /**
    * Asynchronously adds a new custom XML part to a file.
    * 
    * @remarks
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param xml The XML to add to the newly created custom XML part.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is the newly created CustomXmlPart object.
    */
  def addAsync(xml: java.lang.String): scala.Unit = js.native
  def addAsync(xml: java.lang.String, callback: js.Function1[/* result */ AsyncResult[CustomXmlPart], scala.Unit]): scala.Unit = js.native
  def addAsync(xml: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def addAsync(
    xml: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[CustomXmlPart], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronously gets the specified custom XML part by its id.
    * 
    * @remarks
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param id The GUID of the custom XML part, including opening and closing braces.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a CustomXmlPart object that represents the specified custom XML part.
    *                  If there is no custom XML part with the specified id, the method returns null.
    */
  def getByIdAsync(id: java.lang.String): scala.Unit = js.native
  def getByIdAsync(id: java.lang.String, callback: js.Function1[/* result */ AsyncResult[CustomXmlPart], scala.Unit]): scala.Unit = js.native
  def getByIdAsync(id: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def getByIdAsync(
    id: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[CustomXmlPart], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronously gets the specified custom XML part(s) by its namespace.
    * 
    * @remarks
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    *
    * @param ns  The namespace URI.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is an array of CustomXmlPart objects that match the specified namespace.
    */
  def getByNamespaceAsync(ns: java.lang.String): scala.Unit = js.native
  def getByNamespaceAsync(
    ns: java.lang.String,
    callback: js.Function1[/* result */ AsyncResult[js.Array[CustomXmlPart]], scala.Unit]
  ): scala.Unit = js.native
  def getByNamespaceAsync(ns: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def getByNamespaceAsync(
    ns: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[js.Array[CustomXmlPart]], scala.Unit]
  ): scala.Unit = js.native
}

