package typings
package officeDashJsLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a OneNote notebook. Notebooks contain section groups and sections.
         *
         * [Api set: OneNoteApi 1.1]
         */

trait NotebookLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * The url of the site that this notebook is located. Read only
               *
               * [Api set: OneNoteApi 1.1]
               */
  var baseUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * The client url of the notebook. Read only
               *
               * [Api set: OneNoteApi 1.1]
               */
  var clientUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the ID of the notebook. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * True if the Notebook is not created by the user (i.e. 'Misplaced Sections'). Read only
               *
               * [Api set: OneNoteApi 1.2]
               */
  var isVirtual: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the name of the notebook. Read-only.
               *
               * [Api set: OneNoteApi 1.1]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * The section groups in the notebook. Read only
              *
              * [Api set: OneNoteApi 1.1]
              */
  var sectionGroups: js.UndefOr[SectionGroupCollectionLoadOptions] = js.undefined
  /**
              *
              * The the sections of the notebook. Read only
              *
              * [Api set: OneNoteApi 1.1]
              */
  var sections: js.UndefOr[SectionCollectionLoadOptions] = js.undefined
}

