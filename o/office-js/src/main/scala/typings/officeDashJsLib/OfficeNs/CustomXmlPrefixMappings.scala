package typings
package officeDashJsLib.OfficeNs

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
trait CustomXmlPrefixMappings extends js.Object {
  /**
    * Asynchronously adds a prefix to namespace mapping to use when querying an item.
    *
    * @remarks
    * 
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    * 
    * If no namespace is assigned to the requested prefix, the method returns an empty string ("").
    *
    * @param prefix Specifies the prefix to add to the prefix mapping list. Required.
    * @param ns Specifies the namespace URI to assign to the newly added prefix. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    */
  def addNamespaceAsync(prefix: java.lang.String, ns: java.lang.String): scala.Unit = js.native
  def addNamespaceAsync(
    prefix: java.lang.String,
    ns: java.lang.String,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def addNamespaceAsync(prefix: java.lang.String, ns: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def addNamespaceAsync(
    prefix: java.lang.String,
    ns: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronously gets the namespace mapped to the specified prefix.
    *
    * @remarks
    * 
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    * 
    * If the prefix already exists in the namespace manager, this method will overwrite the mapping of that prefix except when the prefix is one 
    * added or used by the data store internally, in which case it will return an error.
    *
    * @param prefix TSpecifies the prefix to get the namespace for. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the namespace mapped to the specified prefix.
    */
  def getNamespaceAsync(prefix: java.lang.String): scala.Unit = js.native
  def getNamespaceAsync(
    prefix: java.lang.String,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getNamespaceAsync(prefix: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def getNamespaceAsync(
    prefix: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Asynchronously gets the prefix for the specified namespace.
    *
    * @remarks
    * 
    * **Requirement set**: {@link https://docs.microsoft.com/office/dev/add-ins/reference/requirement-sets/office-add-in-requirement-sets#customxmlparts | CustomXmlParts}
    * 
    * If no prefix is assigned to the requested namespace, the method returns an empty string (""). If there are multiple prefixes specified in 
    * the namespace manager, the method returns the first prefix that matches the supplied namespace.
    *
    * @param ns Specifies the namespace to get the prefix for. Required.
    * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
    * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
    *                  The `value` property of the result is a string that contains the prefix of the specified namespace.
    */
  def getPrefixAsync(ns: java.lang.String): scala.Unit = js.native
  def getPrefixAsync(
    ns: java.lang.String,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def getPrefixAsync(ns: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  def getPrefixAsync(
    ns: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
}

