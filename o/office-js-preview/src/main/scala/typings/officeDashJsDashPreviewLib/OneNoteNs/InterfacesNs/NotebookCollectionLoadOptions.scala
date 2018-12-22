package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a collection of notebooks.
         *
         * [Api set: OneNoteApi 1.1]
         */

trait NotebookCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: The url of the site that this notebook is located. Read only
               *
               * [Api set: OneNoteApi 1.1]
               */
  var baseUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: The client url of the notebook. Read only
               *
               * [Api set: OneNoteApi 1.1]
               */
  var clientUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the ID of the notebook. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: True if the Notebook is not created by the user (i.e. 'Misplaced Sections'). Read only
               *
               * [Api set: OneNoteApi 1.2]
               */
  var isVirtual: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets the name of the notebook. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: The section groups in the notebook. Read only
              *
              * [Api set: OneNoteApi 1.1]
              */
  var sectionGroups: js.UndefOr[SectionGroupCollectionLoadOptions] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: The the sections of the notebook. Read only
              *
              * [Api set: OneNoteApi 1.1]
              */
  var sections: js.UndefOr[SectionCollectionLoadOptions] = js.undefined
}

