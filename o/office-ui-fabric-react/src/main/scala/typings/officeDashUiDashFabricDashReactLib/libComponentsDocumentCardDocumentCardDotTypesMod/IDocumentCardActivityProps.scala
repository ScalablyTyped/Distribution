package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDocumentCardActivityProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardActivityMod.DocumentCardActivity
    ] {
  /**
       * Describes the activity that has taken place, such as "Created Feb 23, 2016".
       */
  var activity: java.lang.String
  /**
       * Gets the component ref.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.undefined
  /**
       * One or more people who are involved in this activity.
       */
  var people: js.Array[IDocumentCardActivityPerson]
}

