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
    activityContent: js.UndefOr[Null | IStyle] = js.undefined,
    activityPersona: js.UndefOr[Null | IStyle] = js.undefined,
    activityText: js.UndefOr[Null | IStyle] = js.undefined,
    activityTypeIcon: js.UndefOr[Null | IStyle] = js.undefined,
    commentText: js.UndefOr[Null | IStyle] = js.undefined,
    doublePersona: js.UndefOr[Null | IStyle] = js.undefined,
    isCompactContent: js.UndefOr[Null | IStyle] = js.undefined,
    isCompactIcon: js.UndefOr[Null | IStyle] = js.undefined,
    isCompactPersona: js.UndefOr[Null | IStyle] = js.undefined,
    isCompactPersonaContainer: js.UndefOr[Null | IStyle] = js.undefined,
    isCompactRoot: js.UndefOr[Null | IStyle] = js.undefined,
    isCompactTimeStamp: js.UndefOr[Null | IStyle] = js.undefined,
    personaContainer: js.UndefOr[Null | IStyle] = js.undefined,
    pulsingBeacon: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    timeStamp: js.UndefOr[Null | IStyle] = js.undefined
  ): IActivityItemStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activityContent)) __obj.updateDynamic("activityContent")(activityContent.asInstanceOf[js.Any])
    if (!js.isUndefined(activityPersona)) __obj.updateDynamic("activityPersona")(activityPersona.asInstanceOf[js.Any])
    if (!js.isUndefined(activityText)) __obj.updateDynamic("activityText")(activityText.asInstanceOf[js.Any])
    if (!js.isUndefined(activityTypeIcon)) __obj.updateDynamic("activityTypeIcon")(activityTypeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(commentText)) __obj.updateDynamic("commentText")(commentText.asInstanceOf[js.Any])
    if (!js.isUndefined(doublePersona)) __obj.updateDynamic("doublePersona")(doublePersona.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompactContent)) __obj.updateDynamic("isCompactContent")(isCompactContent.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompactIcon)) __obj.updateDynamic("isCompactIcon")(isCompactIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompactPersona)) __obj.updateDynamic("isCompactPersona")(isCompactPersona.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompactPersonaContainer)) __obj.updateDynamic("isCompactPersonaContainer")(isCompactPersonaContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompactRoot)) __obj.updateDynamic("isCompactRoot")(isCompactRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(isCompactTimeStamp)) __obj.updateDynamic("isCompactTimeStamp")(isCompactTimeStamp.asInstanceOf[js.Any])
    if (!js.isUndefined(personaContainer)) __obj.updateDynamic("personaContainer")(personaContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(pulsingBeacon)) __obj.updateDynamic("pulsingBeacon")(pulsingBeacon.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(timeStamp)) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActivityItemStyles]
  }
}

