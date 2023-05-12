package typings.photoshop.domCoreModulesMod

import typings.photoshop.anon.Height
import typings.photoshop.anon.Identifier
import typings.photoshop.anon.Message
import typings.photoshop.utilColorTypesMod.CMYKColorDescriptor
import typings.photoshop.utilColorTypesMod.ColorConversionModel.CMYK
import typings.photoshop.utilColorTypesMod.ColorConversionModel.Gray
import typings.photoshop.utilColorTypesMod.ColorConversionModel.HSB
import typings.photoshop.utilColorTypesMod.ColorConversionModel.Lab
import typings.photoshop.utilColorTypesMod.ColorConversionModel.RGB
import typings.photoshop.utilColorTypesMod.ColorDescriptor
import typings.photoshop.utilColorTypesMod.GrayscaleColorDescriptor
import typings.photoshop.utilColorTypesMod.HSBColorDescriptor
import typings.photoshop.utilColorTypesMod.LabColorDescriptor
import typings.photoshop.utilColorTypesMod.RGB32ColorDescriptor
import typings.photoshop.utilColorTypesMod.RGBColorDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object photoshopCore {
  
  @JSImport("photoshop/dom/CoreModules", "photoshopCore")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Attach a listener to a Photoshop core event. A callback in the form
    * of `(eventName: string, descriptor: Descriptor) => void` will be performed.
    * The event(s) below are supported:
    *
    * group: '`UI`', event: '`userIdle`'
    *
    * - Invoked after the Photoshop user idles for a specified number of seconds. See [[setUserIdleTime]].
    * - Invoked a second time with the descriptor `{idleEnd: true}` if the user is no longer idle. This signal can
    * be used to finish up tasks being performed during the idle time.
    * ```javascript
    * await PhotoshopCore.addNotificationListener('UI', ['userIdle'], onUserIdle)
    * ```
    * @minVersion 23.3
    * @async
    */
  inline def addNotificationListener(group: String, events: js.Array[String], notifier: NotificationListener): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addNotificationListener")(group.asInstanceOf[js.Any], events.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * API Version declared by the plugin's manifest.json under `host.data.apiVersion` field.
    *
    * If value 1, you will have access to Photoshop 22.0 DOM and be able to make mutable calls outside a modal state.
    * If 2, you will have access to latest DOM, modal execution and everything else new we're adding.
    * @minVersion 22.5
    */
  @JSImport("photoshop/dom/CoreModules", "photoshopCore.apiVersion")
  @js.native
  def apiVersion: Double = js.native
  inline def apiVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the effective size of a dialog.
    * ```javascript
    * var idealSize = { width: 200, height: 500 }
    * { width, height} = await PhotoshopCore.calculateDialogSize(idealSize)
    * ```
    * @minVersion 22.5
    * @async
    */
  inline def calculateDialogSize(options: Identifier): js.Promise[Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDialogSize")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Height]]
  
  /**
    * Convert to CMYK
    * @minVersion 23.0
    */
  inline def convertColor(sourceColor: ColorDescriptor, targetModel: CMYK): CMYKColorDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertColor")(sourceColor.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any])).asInstanceOf[CMYKColorDescriptor]
  /**
    * Convert to Grayscale
    * @minVersion 23.0
    */
  inline def convertColor(sourceColor: ColorDescriptor, targetModel: Gray): GrayscaleColorDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertColor")(sourceColor.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any])).asInstanceOf[GrayscaleColorDescriptor]
  /**
    * Convert to HSB
    * @minVersion 23.0
    */
  inline def convertColor(sourceColor: ColorDescriptor, targetModel: HSB): HSBColorDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertColor")(sourceColor.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any])).asInstanceOf[HSBColorDescriptor]
  /**
    * Convert to Lab
    * @minVersion 23.0
    */
  inline def convertColor(sourceColor: ColorDescriptor, targetModel: Lab): LabColorDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertColor")(sourceColor.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any])).asInstanceOf[LabColorDescriptor]
  /**
    * Converts the given color (in descriptor form) to RGB,
    * returning the color descriptor.
    *
    * This is an internal API that is used for [[SolidColor]]
    * and all the other color classes.
    *
    * Currently, this API uses the application color settings
    * for conversion (Edit > Color Settings...). '
    * In the future, we will provide color conversion
    * based on embedded color profiles.
    * @minVersion 23.0
    */
  inline def convertColor(sourceColor: ColorDescriptor, targetModel: RGB): RGBColorDescriptor | RGB32ColorDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertColor")(sourceColor.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any])).asInstanceOf[RGBColorDescriptor | RGB32ColorDescriptor]
  
  /**
    * End the current modal tool editing state.
    * ```javascript
    * // close the modal dialog, cancelling changes
    * await PhotoshopCore.endModalToolState(false)
    * ```
    * @minVersion 22.5
    * @async
    */
  inline def endModalToolState(commit: Boolean): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("endModalToolState")(commit.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * ExecuteAsModal is needed when a plugin wants to make modifications to the Photoshop state.
    * This includes scenarios where the plugin wants to create or modify documents,
    * or the plugin wants to update UI or preference state.
    *
    * ExecuteAsModal is only available to plugin that is using apiVersion 2 or higher.
    *
    * See [Modal Execution](../executeasmodal) for details
    *
    * ***Fixes in Photoshop 24.0:***
    * - *Returned values can now be instances of classes and contain functions*
    *
    * @minVersion 22.5
    * @async
    */
  inline def executeAsModal[T](
    targetFunction: js.Function2[
      /* executionContext */ ExecutionContext, 
      /* descriptor */ js.UndefOr[js.Object], 
      js.Promise[T]
    ],
    options: ExecuteAsModalOptions
  ): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsModal")(targetFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  /**
    * Returns information about the active Photoshop tool.
    * ```javascript
    * { title } = await PhotoshopCore.getActiveTool()
    * ```
    * @minVersion 22.5
    * @async
    */
  inline def getActiveTool(): js.Promise[GetActiveToolResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTool")().asInstanceOf[js.Promise[GetActiveToolResult]]
  
  /**
    * Returns information about the host CPU.
    * ```javascript
    * { logicalCores, frequencyMhz, vendor } = PhotoshopCore.getCPUInfo()
    * var isAMD = vendor === "AMD"
    * var isARM = vendor === "ARM"
    * ```
    * @minVersion 23.1
    */
  inline def getCPUInfo(): CPUInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getCPUInfo")().asInstanceOf[CPUInfo]
  
  /**
    * Returns display configuration with information about each display
    */
  inline def getDisplayConfiguration(options: DisplayConfigurationOptions): js.Promise[js.Array[DisplayConfiguration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayConfiguration")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DisplayConfiguration]]]
  
  /**
    * Returns OpenGL and OpenCL information about the available graphics processor.
    * ```javascript
    * { gpuInfoList, clgpuInfoList } = PhotoshopCore.getGPUInfo()
    * console.log(JSON.stringify(gpuInfoList))
    * // > [{"version":"2.1 ATI-4.5.14","memoryMB":8192,"name":"16915464", ...}]
    * console.log(JSON.stringify(clgpuInfoList))
    * // > [{"version":"OpenCL 1.2 ","memoryMB":8589,"name":"AMD Radeon Pro 580X Compute Engine", ...}]
    * ```
    * @minVersion 23.1
    */
  inline def getGPUInfo(): GPUInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getGPUInfo")().asInstanceOf[GPUInfo]
  
  /**
    * Returns whether a command menu item is available for invoking.
    * ```javascript
    * // can a Fill be performed?
    * var canFill = await PhotoshopCore.getMenuCommandState({ commandID: 1042 })
    * ```
    * @minVersion 22.5
    * @async
    */
  inline def getMenuCommandState(options: MenuCommandOptions): js.Promise[js.Array[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuCommandState")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Boolean]]]
  
  /**
    * Returns the localized menu title of the menu command item.
    * ```javascript
    * var renameLayerStr = await PhotoshopCore.getMenuCommandTitle({ commandID: 2983 })
    * ```
    * @minVersion 22.5
    * @async
    */
  inline def getMenuCommandTitle(options: MenuCommandMenuIDOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuCommandTitle")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getMenuCommandTitle(options: MenuCommandOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuCommandTitle")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Return information about the execution of the plugin.
    * This method is intended for developing plugins.
    * Shipping code should not use this method.
    *
    * The returned information include the following properties:
    *
    * `numberOfPendingMainThreadTasks`: Number of pending promises.
    *
    * `batchPlayCount`: Number of `batchPlay` calls since the plugin was loaded.
    *
    * `mainThreadTimeOutCount`: Number of JavaScript calls that have timed out.
    * This is typically caused by executing commands while Photoshop is modal without using
    * `executeAsModal`.
    *
    * `v8HeapSize`: V8 heap allocated for the plugin. This number is only accurate
    * when loading plugins through the UXP Developer Tool.
    *
    * ```javascript
    * await PhotoshopCore.getPluginInfo()
    * ```
    * @minVersion 23.2
    * @async
    */
  inline def getPluginInfo(): js.Promise[GetPluginInfoResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPluginInfo")().asInstanceOf[js.Promise[GetPluginInfoResult]]
  
  /**
    * Gets the number of seconds a user must be idle on Photoshop before invoking the
    * userIdle event handler defined with [[addNotificationListener]]. An idleTime of 0
    * means turned off idle notifications.
    */
  inline def getUserIdleTime(): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserIdleTime")().asInstanceOf[js.Promise[Double]]
  
  /**
    * Returns true if the plugin is currently in a modal state using [[executeAsModal]]
    * @minVersion 23.1
    */
  inline def isModal(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModal")().asInstanceOf[Boolean]
  
  /**
    * Invokes the menu command via its `commandID`. Returns false
    * on failure, or if the command is not available.
    * ```javascript
    * // select all
    * await PhotoshopCore.performMenuCommand({ commandID: 1017 })
    * ```
    * @minVersion 22.5
    * @async
    */
  inline def performMenuCommand(options: MenuCommandOptions): js.Promise[PerformMenuCommandResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("performMenuCommand")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PerformMenuCommandResult]]
  
  /**
    * Request that Photoshop redraws (updates) a document immediately.
    * This method can be used to ensure that the document is updated
    * immediately while a user is interacting with a UI element (such as a slider).
    * This can provide a more responsive interaction.
    * Updating a document can be time consuming, and will often happen at a lower frequency
    * than UI events are received.
    * Plugins may therefore want to implement a throttle between UI events and calls to
    * redrawDocument.
    * A throttle could be implemented by using a timer, or by avoiding to call redrawDocument
    * for a small amount of time after a previous request completes.
    * redrawDocument returns the time that it took Photoshop to update the target document
    * in seconds. This number can be used to refine the throttle.
    * redrawDocument is only available to a plugin that is using apiVersion 2 or higher.
    * ```javascript
    * await PhotoshopCore.redrawDocument({ documentID: 123})
    * ```
    *
    * Note: This is not available if DOM API version is set to `1`.
    *
    * @minVersion 24.1
    * @async
    */
  inline def redrawDocument(options: RedrawDocumentOptions): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("redrawDocument")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  
  /**
    * The execution mode can be used while debugging a plugin. It is only available
    * when the developer mode is enabled.
    *
    * The following example illustrate how to enable stacktraces for batchPlay commands
    * that fail. When stacktraces are enabled, then an error result descriptor from a
    * batchPlay request will include a stacktrace property. The property can be used when
    * reporting bugs to Adobe.
    * ```javascript
    * await PhotoshopCore.setExecutionMode({ enableErrorStacktraces: true })
    * ```
    * The following illustrates how to enable console warnings when a promise is rejected:
    * ```javascript
    * await PhotoshopCore.setExecutionMode({ logRejections: true })
    * ```
    * @minVersion 23.2
    * @async
    */
  inline def setExecutionMode(options: SetExecutionModeOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setExecutionMode")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Specifies the number of seconds a user must be idle on Photoshop before invoking the
    * userIdle event handler defined with [[addNotificationListener]]. An idleTime of 0
    * turns off idle notifications.
    *
    * ```javascript
    * await PhotoshopCore.setUserIdleTime(3)
    * ```
    * @minVersion 23.3
    */
  inline def setUserIdleTime(idleTime: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserIdleTime")(idleTime.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Show a generic alert box to the user. 'OK' to dismiss.
    * ```javascript
    * // script has completed.
    * await PhotoshopCore.showAlert({ message: 'Operation successful'})
    * ```
    * @minVersion 22.5
    * @async
    */
  inline def showAlert(options: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("showAlert")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def showAlert(options: Message): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("showAlert")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Changes visibility of resize gripper in bottom right corner of panel. This can be useful when resize gripper
    * is obstructing the view o panel content.
    */
  inline def suppressResizeGripper(options: SuppressResizeGripperOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressResizeGripper")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Given a Photoshop ZString (of format `"$$$/slash/separated/key=english default value"`),
    * will return the translated string for the current UI language
    * @minVersion 22.5
    */
  inline def translateUIString(zstring: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("translateUIString")(zstring.asInstanceOf[js.Any]).asInstanceOf[String]
}
