package typings.officeUiFabricReact.activityItemTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivityItemStyles extends js.Object {
  /**
    * Styles applied to the main container of the activity's description.
    */
  var activityContent: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to the persona of the user that did this activity.
    */
  var activityPersona: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to the activity's description.
    */
  var activityText: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to the icon indicating the type of the activity. Only shown when personas are unavailable.
    */
  var activityTypeIcon: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to the text of comments.
    */
  var commentText: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to personas when two users are involved in a single activity.
    */
  var doublePersona: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to main text container in the compact variant.
    */
  var isCompactContent: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to personas and icons in the compact variant.
    */
  var isCompactIcon: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to personas in the compact variant.
    */
  var isCompactPersona: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to a wrapper around personas in the compact variant.
    */
  var isCompactPersonaContainer: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to root in the compact variant.
    */
  var isCompactRoot: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to the timestamp in compact mode.
    * This can occur if a host overrides the render behavior to force the timestamp to render.
    */
  var isCompactTimeStamp: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to the container of the persona image or activity type icon.
    */
  var personaContainer: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to the root activity item container.
    */
  var pulsingBeacon: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to the root activity item container.
    */
  var root: js.UndefOr[IStyle] = js.undefined
  /**
    * Styles applied to the timestamp at the end of each activity item.
    */
  var timeStamp: js.UndefOr[IStyle] = js.undefined
}

object IActivityItemStyles {
  @scala.inline
  def apply(
    activityContent: IStyle = null,
    activityPersona: IStyle = null,
    activityText: IStyle = null,
    activityTypeIcon: IStyle = null,
    commentText: IStyle = null,
    doublePersona: IStyle = null,
    isCompactContent: IStyle = null,
    isCompactIcon: IStyle = null,
    isCompactPersona: IStyle = null,
    isCompactPersonaContainer: IStyle = null,
    isCompactRoot: IStyle = null,
    isCompactTimeStamp: IStyle = null,
    personaContainer: IStyle = null,
    pulsingBeacon: IStyle = null,
    root: IStyle = null,
    timeStamp: IStyle = null
  ): IActivityItemStyles = {
    val __obj = js.Dynamic.literal()
    if (activityContent != null) __obj.updateDynamic("activityContent")(activityContent.asInstanceOf[js.Any])
    if (activityPersona != null) __obj.updateDynamic("activityPersona")(activityPersona.asInstanceOf[js.Any])
    if (activityText != null) __obj.updateDynamic("activityText")(activityText.asInstanceOf[js.Any])
    if (activityTypeIcon != null) __obj.updateDynamic("activityTypeIcon")(activityTypeIcon.asInstanceOf[js.Any])
    if (commentText != null) __obj.updateDynamic("commentText")(commentText.asInstanceOf[js.Any])
    if (doublePersona != null) __obj.updateDynamic("doublePersona")(doublePersona.asInstanceOf[js.Any])
    if (isCompactContent != null) __obj.updateDynamic("isCompactContent")(isCompactContent.asInstanceOf[js.Any])
    if (isCompactIcon != null) __obj.updateDynamic("isCompactIcon")(isCompactIcon.asInstanceOf[js.Any])
    if (isCompactPersona != null) __obj.updateDynamic("isCompactPersona")(isCompactPersona.asInstanceOf[js.Any])
    if (isCompactPersonaContainer != null) __obj.updateDynamic("isCompactPersonaContainer")(isCompactPersonaContainer.asInstanceOf[js.Any])
    if (isCompactRoot != null) __obj.updateDynamic("isCompactRoot")(isCompactRoot.asInstanceOf[js.Any])
    if (isCompactTimeStamp != null) __obj.updateDynamic("isCompactTimeStamp")(isCompactTimeStamp.asInstanceOf[js.Any])
    if (personaContainer != null) __obj.updateDynamic("personaContainer")(personaContainer.asInstanceOf[js.Any])
    if (pulsingBeacon != null) __obj.updateDynamic("pulsingBeacon")(pulsingBeacon.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActivityItemStyles]
  }
}

