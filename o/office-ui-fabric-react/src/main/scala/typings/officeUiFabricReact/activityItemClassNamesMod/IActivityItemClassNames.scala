package typings.officeUiFabricReact.activityItemClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivityItemClassNames extends js.Object {
  var activityContent: js.UndefOr[String] = js.undefined
  var activityPersona: js.UndefOr[String] = js.undefined
  var activityText: js.UndefOr[String] = js.undefined
  var activityTypeIcon: js.UndefOr[String] = js.undefined
  var commentText: js.UndefOr[String] = js.undefined
  var personaContainer: js.UndefOr[String] = js.undefined
  var pulsingBeacon: js.UndefOr[String] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var timeStamp: js.UndefOr[String] = js.undefined
}

object IActivityItemClassNames {
  @scala.inline
  def apply(
    activityContent: String = null,
    activityPersona: String = null,
    activityText: String = null,
    activityTypeIcon: String = null,
    commentText: String = null,
    personaContainer: String = null,
    pulsingBeacon: String = null,
    root: String = null,
    timeStamp: String = null
  ): IActivityItemClassNames = {
    val __obj = js.Dynamic.literal()
    if (activityContent != null) __obj.updateDynamic("activityContent")(activityContent.asInstanceOf[js.Any])
    if (activityPersona != null) __obj.updateDynamic("activityPersona")(activityPersona.asInstanceOf[js.Any])
    if (activityText != null) __obj.updateDynamic("activityText")(activityText.asInstanceOf[js.Any])
    if (activityTypeIcon != null) __obj.updateDynamic("activityTypeIcon")(activityTypeIcon.asInstanceOf[js.Any])
    if (commentText != null) __obj.updateDynamic("commentText")(commentText.asInstanceOf[js.Any])
    if (personaContainer != null) __obj.updateDynamic("personaContainer")(personaContainer.asInstanceOf[js.Any])
    if (pulsingBeacon != null) __obj.updateDynamic("pulsingBeacon")(pulsingBeacon.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActivityItemClassNames]
  }
}

