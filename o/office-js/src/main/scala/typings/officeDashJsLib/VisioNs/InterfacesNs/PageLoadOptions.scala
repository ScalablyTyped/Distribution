package typings
package officeDashJsLib.VisioNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents the Page class.
         *
         * [Api set:  1.1]
         */

trait PageLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Returns the height of the page. Read-only.
               *
               * [Api set:  1.1]
               */
  var height: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Index of the Page. Read-only.
               *
               * [Api set:  1.1]
               */
  var index: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Whether the page is a background page or not. Read-only.
               *
               * [Api set:  1.1]
               */
  var isBackground: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Page name. Read-only.
               *
               * [Api set:  1.1]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Returns the view of the page.
              *
              * [Api set:  1.1]
              */
  var view: js.UndefOr[PageViewLoadOptions] = js.undefined
  /**
               *
               * Returns the width of the page. Read-only.
               *
               * [Api set:  1.1]
               */
  var width: js.UndefOr[scala.Boolean] = js.undefined
}

