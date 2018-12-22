package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a collection of sections.
         *
         * [Api set: OneNoteApi 1.1]
         */

trait SectionCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: The client url of the section. Read only
               *
               * [Api set: OneNoteApi 1.1]
               */
  var clientUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the ID of the section. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: True if this section is encrypted with a password. Read only
               *
               * [Api set: OneNoteApi 1.2]
               */
  var isEncrypted: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: True if this section is locked. Read only
               *
               * [Api set: OneNoteApi 1.2]
               */
  var isLocked: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the name of the section. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the notebook that contains the section.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var notebook: js.UndefOr[NotebookLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: The collection of pages in the section. Read only
              *
              * [Api set: OneNoteApi 1.1]
              */
  var pages: js.UndefOr[PageCollectionLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the section group that contains the section. Throws ItemNotFound if the section is a direct child of the notebook.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var parentSectionGroup: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Gets the section group that contains the section. Returns null if the section is a direct child of the notebook.
              *
              * [Api set: OneNoteApi 1.1]
              */
  var parentSectionGroupOrNull: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: The web url of the page. Read only
               *
               * [Api set: OneNoteApi 1.1]
               */
  var webUrl: js.UndefOr[scala.Boolean] = js.undefined
}

