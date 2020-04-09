package typings.pdfmake.interfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TDocumentInformation extends js.Object {
  /** the name of the author */
  var author: js.UndefOr[String] = js.undefined
  var creationDate: js.UndefOr[Date] = js.undefined
  var creator: js.UndefOr[String] = js.undefined
  /** keywords associated with the document */
  var keywords: js.UndefOr[String] = js.undefined
  var modDate: js.UndefOr[Date] = js.undefined
  var producer: js.UndefOr[String] = js.undefined
  /** the subject of the document */
  var subject: js.UndefOr[String] = js.undefined
  /** the title of the document */
  var title: js.UndefOr[String] = js.undefined
  var trapped: js.UndefOr[String] = js.undefined
}

object TDocumentInformation {
  @scala.inline
  def apply(
    author: String = null,
    creationDate: Date = null,
    creator: String = null,
    keywords: String = null,
    modDate: Date = null,
    producer: String = null,
    subject: String = null,
    title: String = null,
    trapped: String = null
  ): TDocumentInformation = {
    val __obj = js.Dynamic.literal()
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (creator != null) __obj.updateDynamic("creator")(creator.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (modDate != null) __obj.updateDynamic("modDate")(modDate.asInstanceOf[js.Any])
    if (producer != null) __obj.updateDynamic("producer")(producer.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (trapped != null) __obj.updateDynamic("trapped")(trapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDocumentInformation]
  }
}

