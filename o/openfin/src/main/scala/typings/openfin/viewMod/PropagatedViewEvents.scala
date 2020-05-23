package typings.openfin.viewMod

import typings.openfin.eventsApplicationMod.CrashedEvent
import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`view-crashed`
import typings.openfin.openfinStrings.`view-created`
import typings.openfin.openfinStrings.`view-destroyed`
import typings.openfin.openfinStrings.`view-did-change-theme-color`
import typings.openfin.openfinStrings.`view-focused`
import typings.openfin.openfinStrings.`view-hidden`
import typings.openfin.openfinStrings.`view-hotkey`
import typings.openfin.openfinStrings.`view-navigation-rejected`
import typings.openfin.openfinStrings.`view-page-favicon-updated`
import typings.openfin.openfinStrings.`view-page-title-updated`
import typings.openfin.openfinStrings.`view-resource-load-failed`
import typings.openfin.openfinStrings.`view-resource-response-received`
import typings.openfin.openfinStrings.`view-shown`
import typings.openfin.openfinStrings.`view-target-changed`
import typings.openfin.webcontentsMod.WindowResourceLoadFailedEvent
import typings.openfin.webcontentsMod.WindowResourceResponseReceivedEvent
import typings.openfin.windowMod.WindowNavigationRejectedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Type in keyof openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<string, string> ]: openfin.openfin/_v2/api/events/view.PropagatedViewEventMapping<Topic, Type>[Type]} */
trait PropagatedViewEvents[Topic] extends js.Object {
  var listenerRemoved: String
  var newListener: String
  var `view-crashed`: CrashedEvent with (WindowEvent[Topic, typings.openfin.openfinStrings.`view-crashed`])
  var `view-created`: CrashedEvent with (WindowEvent[Topic, typings.openfin.openfinStrings.`view-created`])
  var `view-destroyed`: WindowEvent[Topic, typings.openfin.openfinStrings.`view-destroyed`]
  var `view-did-change-theme-color`: WindowEvent[Topic, typings.openfin.openfinStrings.`view-did-change-theme-color`]
  var `view-focused`: WindowEvent[Topic, typings.openfin.openfinStrings.`view-focused`]
  var `view-hidden`: WindowEvent[Topic, typings.openfin.openfinStrings.`view-hidden`]
  var `view-hotkey`: InputEvent with (WindowEvent[Topic, typings.openfin.openfinStrings.`view-hotkey`])
  var `view-navigation-rejected`: WindowNavigationRejectedEvent[Topic, typings.openfin.openfinStrings.`view-navigation-rejected`]
  var `view-page-favicon-updated`: WindowEvent[Topic, typings.openfin.openfinStrings.`view-page-favicon-updated`]
  var `view-page-title-updated`: WindowEvent[Topic, typings.openfin.openfinStrings.`view-page-title-updated`]
  var `view-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, typings.openfin.openfinStrings.`view-resource-load-failed`]
  var `view-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, typings.openfin.openfinStrings.`view-resource-response-received`]
  var `view-shown`: WindowEvent[Topic, typings.openfin.openfinStrings.`view-shown`]
  var `view-target-changed`: TargetChangedEvent[Topic, typings.openfin.openfinStrings.`view-target-changed`]
}

object PropagatedViewEvents {
  @scala.inline
  def apply[Topic](
    listenerRemoved: String,
    newListener: String,
    `view-crashed`: CrashedEvent with (WindowEvent[Topic, `view-crashed`]),
    `view-created`: CrashedEvent with (WindowEvent[Topic, `view-created`]),
    `view-destroyed`: WindowEvent[Topic, `view-destroyed`],
    `view-did-change-theme-color`: WindowEvent[Topic, `view-did-change-theme-color`],
    `view-focused`: WindowEvent[Topic, `view-focused`],
    `view-hidden`: WindowEvent[Topic, `view-hidden`],
    `view-hotkey`: InputEvent with (WindowEvent[Topic, `view-hotkey`]),
    `view-navigation-rejected`: WindowNavigationRejectedEvent[Topic, `view-navigation-rejected`],
    `view-page-favicon-updated`: WindowEvent[Topic, `view-page-favicon-updated`],
    `view-page-title-updated`: WindowEvent[Topic, `view-page-title-updated`],
    `view-resource-load-failed`: WindowResourceLoadFailedEvent[Topic, `view-resource-load-failed`],
    `view-resource-response-received`: WindowResourceResponseReceivedEvent[Topic, `view-resource-response-received`],
    `view-shown`: WindowEvent[Topic, `view-shown`],
    `view-target-changed`: TargetChangedEvent[Topic, `view-target-changed`]
  ): PropagatedViewEvents[Topic] = {
    val __obj = js.Dynamic.literal(listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
    __obj.updateDynamic("view-crashed")(`view-crashed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-created")(`view-created`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-destroyed")(`view-destroyed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-did-change-theme-color")(`view-did-change-theme-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-focused")(`view-focused`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-hidden")(`view-hidden`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-hotkey")(`view-hotkey`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-navigation-rejected")(`view-navigation-rejected`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-favicon-updated")(`view-page-favicon-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-page-title-updated")(`view-page-title-updated`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-load-failed")(`view-resource-load-failed`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-resource-response-received")(`view-resource-response-received`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-shown")(`view-shown`.asInstanceOf[js.Any])
    __obj.updateDynamic("view-target-changed")(`view-target-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropagatedViewEvents[Topic]]
  }
}

