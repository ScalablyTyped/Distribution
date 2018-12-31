package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "documentProperties.toJSON()". */
trait DocumentPropertiesData extends js.Object {
  /**
    *
    * Gets the application name of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var applicationName: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the author of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var author: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the category of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the comments of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var comments: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the company of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var company: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the creation date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var creationDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *
    * Gets the collection of custom properties of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var customProperties: js.UndefOr[js.Array[CustomPropertyData]] = js.undefined
  /**
    *
    * Gets or sets the format of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the keywords of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var keywords: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the last author of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastAuthor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the last print date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastPrintDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *
    * Gets the last save time of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastSaveTime: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *
    * Gets or sets the manager of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var manager: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the revision number of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var revisionNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the security of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var security: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the subject of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var subject: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the template of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the title of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

