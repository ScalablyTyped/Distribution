package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "page.toJSON()". */

trait PageData extends js.Object {
  /**
               *
               * Gets the ClassNotebookPageSource to the page.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var classNotebookPageSource: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * The client url of the page. Read only
               *
               * [Api set: OneNoteApi 1.1]
               */
  var clientUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * The collection of PageContent objects on the page. Read only
              *
              * [Api set: OneNoteApi 1.1]
              */
  var contents: js.UndefOr[js.Array[PageContentData]] = js.undefined
  /**
               *
               * Gets the ID of the page. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
              *
              * Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisData] = js.undefined
  /**
               *
               * Gets or sets the indentation level of the page.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var pageLevel: js.UndefOr[scala.Double] = js.undefined
  /**
              *
              * Gets the section that contains the page. Read-only.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var parentSection: js.UndefOr[SectionData] = js.undefined
  /**
               *
               * Gets or sets the title of the page.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * The web url of the page. Read only
               *
               * [Api set: OneNoteApi 1.1]
               */
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

