package typings
package officeDashUiDashFabricDashReactLib.libComponentsActivityItemActivityItemDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IActivityItemProps
  extends reactLib.reactMod.ReactNs.AllHTMLAttributes[reactLib.HTMLElement] {
  /**
       * An element describing the activity that took place. If no activityDescription, activityDescriptionText, or
       * onRenderActivityDescription are included, no description of the activity is shown.
       */
  var activityDescription: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.ReactNode] | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  /**
       * Text describing the activity that occurred and naming the people involved in it.
       * Deprecated, use `activityDescription` instead.
       * @deprecated Use `activityDescription` instead.
       */
  var activityDescriptionText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An element containing an icon shown next to the activity item.
       */
  var activityIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * If activityIcon is not set, then the persona props in this array will be used as the icon for the this activity item.
       */
  var activityPersonas: js.UndefOr[
    js.Array[
      officeDashUiDashFabricDashReactLib.libComponentsPersonaPersonaDotTypesMod.IPersonaSharedProps
    ]
  ] = js.undefined
  /**
       * Enables/Disables the beacon that radiates
       * from the center of the center of the activity icon. Signals an activity has started.
       * @defaultvalue false
       */
  var animateBeaconSignal: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Beacon color one
       */
  var beaconColorOne: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Beacon color two
       */
  var beaconColorTwo: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Text of comments or \@mention messages.
       * Deprecated, use `comments` instead.
       * @deprecated Use `comments` instead.
       */
  var commentText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * An element containing the text of comments or \@mention messages.
       * If no comments, commentText, or onRenderComments are included, no comments are shown.
       */
  var comments: js.UndefOr[
    js.Array[reactLib.reactMod.ReactNs.ReactNode] | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
  /**
       * Gets ref to component interface.
       */
  var componentRef: js.UndefOr[atUifabricUtilitiesLib.libCreateRefMod.IRefObject[js.Object]] = js.undefined
  /**
       * Indicated if the compact styling should be used.
       */
  var isCompact: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A renderer for the description of the current activity.
       */
  var onRenderActivityDescription: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IActivityItemProps]] = js.undefined
  /**
       * A renderer that adds the text of a comment below the activity description.
       */
  var onRenderComments: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IActivityItemProps]] = js.undefined
  /**
       * A renderer to create the icon next to the activity item.
       */
  var onRenderIcon: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IActivityItemProps]] = js.undefined
  /**
       * A renderer adds a time stamp. If not included, timeStamp is shown as plain text below the activity.
       */
  var onRenderTimeStamp: js.UndefOr[atUifabricUtilitiesLib.libIRenderFunctionMod.IRenderFunction[IActivityItemProps]] = js.undefined
  /**
       * Optional styling for the elements within the Activity Item.
       */
  var styles: js.UndefOr[IActivityItemStyles] = js.undefined
  /**
       * Element shown as a timestamp on this activity. If not included, no timestamp is shown.
       */
  var timeStamp: js.UndefOr[
    java.lang.String | js.Array[reactLib.reactMod.ReactNs.ReactNode] | reactLib.reactMod.ReactNs.ReactNode
  ] = js.undefined
}

