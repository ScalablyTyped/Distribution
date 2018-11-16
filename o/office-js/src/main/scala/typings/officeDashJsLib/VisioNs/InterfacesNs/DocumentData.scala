package typings
package officeDashJsLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "document.toJSON()". */

trait DocumentData extends js.Object {
  /**
              *
              * Represents a Visio application instance that contains this document. Read-only.
              *
              * [Api set:  1.1]
              */
  var application: js.UndefOr[ApplicationData] = js.undefined
  /**
              *
              * Represents a collection of pages associated with the document. Read-only.
              *
              * [Api set:  1.1]
              */
  var pages: js.UndefOr[js.Array[PageData]] = js.undefined
  /**
              *
              * Returns the DocumentView object. Read-only.
              *
              * [Api set:  1.1]
              */
  var view: js.UndefOr[DocumentViewData] = js.undefined
}

