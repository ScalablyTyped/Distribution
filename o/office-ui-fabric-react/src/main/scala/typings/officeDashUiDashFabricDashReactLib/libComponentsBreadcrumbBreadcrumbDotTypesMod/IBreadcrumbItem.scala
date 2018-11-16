package typings
package officeDashUiDashFabricDashReactLib.libComponentsBreadcrumbBreadcrumbDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBreadcrumbItem extends js.Object {
  /**
       * Url to navigate to when this breadcrumb is clicked.
       */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
       * If this breadcrumb item is the item the user is currently on, if set to true, aria-current="page" will be applied to this
       * breadcrumb link
       */
  var isCurrentItem: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Arbitrary unique string associated with the breadcrumb
       */
  var key: java.lang.String
  /**
       * Callback issued when the breadcrumb is selected.
       */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement]], 
      /* item */ js.UndefOr[IBreadcrumbItem], 
      scala.Unit
    ]
  ] = js.undefined
  /**
       * Text to display to the user for the breadcrumb
       */
  var text: java.lang.String
}

