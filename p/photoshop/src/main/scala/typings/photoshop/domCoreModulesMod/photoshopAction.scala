package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object photoshopAction {
  
  @JSImport("photoshop/dom/CoreModules", "photoshopAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Attach a listener to a Photoshop event. A callback in the form
    * of `(eventName: string, descriptor: Descriptor) => void` will be performed.
    * ```javascript
    * await PhotoshopAction.addNotificationListener(['open'], onOpenNewDocument)
    * ```
    * @minVersion 23.0
    */
  inline def addNotificationListener(events: js.Array[String], notifier: NotificationListener): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addNotificationListener")(events.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Performs a batchPlay call with the provided commands. Equivalent
    * to an `executeAction` in ExtendScript.
    * ```javascript
    * var target = { _ref: 'layer', _enum: 'ordinal', _value: 'targetEnum'}
    * var commands = [{ _obj: 'hide', _target: target }]
    * await PhotoshopAction.batchPlay(commands)
    * ```
    * @minVersion 23.0
    */
  inline def batchPlay(commands: js.Array[ActionDescriptor]): js.Promise[js.Array[ActionDescriptor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("batchPlay")(commands.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ActionDescriptor]]]
  inline def batchPlay(commands: js.Array[ActionDescriptor], options: BatchPlayCommandOptions): js.Promise[js.Array[ActionDescriptor]] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchPlay")(commands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ActionDescriptor]]]
  
  /**
    * Return the identifier number assigned to an action string value.
    * If the string is not already registered, a new ID will be created and returned.
    * @minVersion 24.0
    */
  inline def getIDFromString(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getIDFromString")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * Detaches a listener from a Photoshop event.
    * See [addNotificationListener](#addNotificationListener)
    * ```javascript
    * await PhotoshopAction.removeNotificationListener(['open'], onOpenNewDocument)
    * ```
    * @minVersion 23.0
    */
  inline def removeNotificationListener(events: js.Array[String], notifier: NotificationListener): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNotificationListener")(events.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def validateReference(ref: js.Array[ActionReference]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateReference")(ref.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  /**
    * Synchronously validates the given action reference, returning true if it still
    * exists. For example, calling this with a closed document would return false.
    *
    * This feature is intended for advanced developers who understand well how batchPlay works.
    * Validate reference could get handy when you want to add new DOM functionality or use low-level code for
    * performance optimization.
    *
    * See [Action references](../batchplay#action-references) for details.
    *
    * Supported reference classes:
    * `action`,
    * `document`,
    * `channel`,
    * `layer`,
    * `guide`,
    * `historyState`,
    * `compsClass`,
    * `path`,
    * `actionSet`
    *
    * @minVersion 23.1
    */
  inline def validateReference(ref: ActionReference): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateReference")(ref.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
