package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents document properties.
  *
  * [Api set: WordApi 1.3]
  */
trait DocumentPropertiesLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the application name of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var applicationName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the author of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var author: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the category of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var category: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the comments of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var comments: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the company of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var company: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the creation date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var creationDate: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the format of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var format: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the keywords of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var keywords: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the last author of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastAuthor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the last print date of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastPrintDate: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the last save time of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var lastSaveTime: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the manager of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var manager: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the revision number of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var revisionNumber: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets security settings of the document. Read only. Some are access restrictions on the file on disk. Others are Document Protection settings. Some possible values are 0 = File on disk is read/write; 1 = Protect Document: File is encrypted and requires a password to open; 2 = Protect Document: Always Open as Read-Only; 3 = Protect Document: Both #1 and #2; 4 = File on disk is read only; 5 = Both #1 and #4; 6 = Both #2 and #4; 7 = All of #1, #2, and #4; 8 = Protect Document: Restrict Edit to read-only; 9 = Both #1 and #8; 10 = Both #2 and #8; 11 = All of #1, #2, and #8; 12 = Both #4 and #8; 13 = All of #1, #4, and #8; 14 = All of #2, #4, and #8; 15 = All of #1, #2, #4, and #8.
    *
    * [Api set: WordApi 1.3]
    */
  var security: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the subject of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var subject: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the template of the document. Read only.
    *
    * [Api set: WordApi 1.3]
    */
  var template: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the title of the document.
    *
    * [Api set: WordApi 1.3]
    */
  var title: js.UndefOr[Boolean] = js.undefined
}

object DocumentPropertiesLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    applicationName: js.UndefOr[Boolean] = js.undefined,
    author: js.UndefOr[Boolean] = js.undefined,
    category: js.UndefOr[Boolean] = js.undefined,
    comments: js.UndefOr[Boolean] = js.undefined,
    company: js.UndefOr[Boolean] = js.undefined,
    creationDate: js.UndefOr[Boolean] = js.undefined,
    format: js.UndefOr[Boolean] = js.undefined,
    keywords: js.UndefOr[Boolean] = js.undefined,
    lastAuthor: js.UndefOr[Boolean] = js.undefined,
    lastPrintDate: js.UndefOr[Boolean] = js.undefined,
    lastSaveTime: js.UndefOr[Boolean] = js.undefined,
    manager: js.UndefOr[Boolean] = js.undefined,
    revisionNumber: js.UndefOr[Boolean] = js.undefined,
    security: js.UndefOr[Boolean] = js.undefined,
    subject: js.UndefOr[Boolean] = js.undefined,
    template: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined
  ): DocumentPropertiesLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(applicationName)) __obj.updateDynamic("applicationName")(applicationName.get.asInstanceOf[js.Any])
    if (!js.isUndefined(author)) __obj.updateDynamic("author")(author.get.asInstanceOf[js.Any])
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(company)) __obj.updateDynamic("company")(company.get.asInstanceOf[js.Any])
    if (!js.isUndefined(creationDate)) __obj.updateDynamic("creationDate")(creationDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keywords)) __obj.updateDynamic("keywords")(keywords.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastAuthor)) __obj.updateDynamic("lastAuthor")(lastAuthor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastPrintDate)) __obj.updateDynamic("lastPrintDate")(lastPrintDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastSaveTime)) __obj.updateDynamic("lastSaveTime")(lastSaveTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manager)) __obj.updateDynamic("manager")(manager.get.asInstanceOf[js.Any])
    if (!js.isUndefined(revisionNumber)) __obj.updateDynamic("revisionNumber")(revisionNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(security)) __obj.updateDynamic("security")(security.get.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.get.asInstanceOf[js.Any])
    if (!js.isUndefined(template)) __obj.updateDynamic("template")(template.get.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentPropertiesLoadOptions]
  }
}

