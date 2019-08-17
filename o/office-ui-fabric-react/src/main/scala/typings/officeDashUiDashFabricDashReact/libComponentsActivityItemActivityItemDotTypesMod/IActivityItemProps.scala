package typings.officeDashUiDashFabricDashReact.libComponentsActivityItemActivityItemDotTypesMod

import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaSharedProps
import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivityItemProps extends AllHTMLAttributes[HTMLElement] {
  /**
    * An element describing the activity that took place. If no activityDescription, activityDescriptionText, or
    * onRenderActivityDescription are included, no description of the activity is shown.
    */
  var activityDescription: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  /**
    * Text describing the activity that occurred and naming the people involved in it.
    * Deprecated, use `activityDescription` instead.
    * @deprecated Use `activityDescription` instead.
    */
  var activityDescriptionText: js.UndefOr[String] = js.undefined
  /**
    * An element containing an icon shown next to the activity item.
    */
  var activityIcon: js.UndefOr[ReactNode] = js.undefined
  /**
    * If activityIcon is not set, then the persona props in this array will be used as the icon for the this activity item.
    */
  var activityPersonas: js.UndefOr[js.Array[IPersonaSharedProps]] = js.undefined
  /**
    * Enables/Disables the beacon that radiates
    * from the center of the center of the activity icon. Signals an activity has started.
    * @defaultvalue false
    */
  var animateBeaconSignal: js.UndefOr[Boolean] = js.undefined
  /**
    * Beacon color one
    */
  var beaconColorOne: js.UndefOr[String] = js.undefined
  /**
    * Beacon color two
    */
  var beaconColorTwo: js.UndefOr[String] = js.undefined
  /**
    * Text of comments or \@mention messages.
    * Deprecated, use `comments` instead.
    * @deprecated Use `comments` instead.
    */
  var commentText: js.UndefOr[String] = js.undefined
  /**
    * An element containing the text of comments or \@mention messages.
    * If no comments, commentText, or onRenderComments are included, no comments are shown.
    */
  var comments: js.UndefOr[js.Array[ReactNode] | ReactNode] = js.undefined
  /**
    * Indicated if the compact styling should be used.
    */
  var isCompact: js.UndefOr[Boolean] = js.undefined
  /**
    * A renderer for the description of the current activity.
    */
  var onRenderActivityDescription: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
  /**
    * A renderer that adds the text of a comment below the activity description.
    */
  var onRenderComments: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
  /**
    * A renderer to create the icon next to the activity item.
    */
  var onRenderIcon: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
  /**
    * A renderer adds a time stamp. If not included, timeStamp is shown as plain text below the activity.
    */
  var onRenderTimeStamp: js.UndefOr[IRenderFunction[IActivityItemProps]] = js.undefined
  /**
    * Optional styling for the elements within the Activity Item.
    */
  var styles: js.UndefOr[IActivityItemStyles] = js.undefined
  /**
    * Element shown as a timestamp on this activity. If not included, no timestamp is shown.
    */
  var timeStamp: js.UndefOr[String | js.Array[ReactNode] | ReactNode] = js.undefined
}

object IActivityItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLElement] = null,
    activityDescription: js.Array[ReactNode] | ReactNode = null,
    activityDescriptionText: String = null,
    activityIcon: ReactNode = null,
    activityPersonas: js.Array[IPersonaSharedProps] = null,
    animateBeaconSignal: js.UndefOr[Boolean] = js.undefined,
    beaconColorOne: String = null,
    beaconColorTwo: String = null,
    commentText: String = null,
    comments: js.Array[ReactNode] | ReactNode = null,
    isCompact: js.UndefOr[Boolean] = js.undefined,
    onRenderActivityDescription: IRenderFunction[IActivityItemProps] = null,
    onRenderComments: IRenderFunction[IActivityItemProps] = null,
    onRenderIcon: IRenderFunction[IActivityItemProps] = null,
    onRenderTimeStamp: IRenderFunction[IActivityItemProps] = null,
    styles: IActivityItemStyles = null,
    timeStamp: String | js.Array[ReactNode] | ReactNode = null
  ): IActivityItemProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (activityDescription != null) __obj.updateDynamic("activityDescription")(activityDescription.asInstanceOf[js.Any])
    if (activityDescriptionText != null) __obj.updateDynamic("activityDescriptionText")(activityDescriptionText)
    if (activityIcon != null) __obj.updateDynamic("activityIcon")(activityIcon.asInstanceOf[js.Any])
    if (activityPersonas != null) __obj.updateDynamic("activityPersonas")(activityPersonas)
    if (!js.isUndefined(animateBeaconSignal)) __obj.updateDynamic("animateBeaconSignal")(animateBeaconSignal)
    if (beaconColorOne != null) __obj.updateDynamic("beaconColorOne")(beaconColorOne)
    if (beaconColorTwo != null) __obj.updateDynamic("beaconColorTwo")(beaconColorTwo)
    if (commentText != null) __obj.updateDynamic("commentText")(commentText)
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompact)) __obj.updateDynamic("isCompact")(isCompact)
    if (onRenderActivityDescription != null) __obj.updateDynamic("onRenderActivityDescription")(onRenderActivityDescription)
    if (onRenderComments != null) __obj.updateDynamic("onRenderComments")(onRenderComments)
    if (onRenderIcon != null) __obj.updateDynamic("onRenderIcon")(onRenderIcon)
    if (onRenderTimeStamp != null) __obj.updateDynamic("onRenderTimeStamp")(onRenderTimeStamp)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActivityItemProps]
  }
}

