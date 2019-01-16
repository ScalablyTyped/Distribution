package typings
package officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardActivityDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDocumentCardActivityProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[
      officeDashUiDashFabricDashReactLib.libComponentsDocumentCardDocumentCardActivityDotBaseMod.DocumentCardActivityBase
    ] {
  /**
    * Describes the activity that has taken place, such as "Created Feb 23, 2016".
    */
  var activity: java.lang.String
  /**
    * Optional override class name
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[IDocumentCardActivity]] = js.undefined
  /**
    * One or more people who are involved in this activity.
    */
  var people: js.Array[IDocumentCardActivityPerson]
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]
  ] = js.undefined
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[atUifabricStylingLib.libInterfacesIThemeMod.ITheme] = js.undefined
}

