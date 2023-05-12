package typings.photoshop

import typings.photoshop.domConstantsMod.InterpolationMethod
import typings.photoshop.domCoreModulesMod.ActionDescriptor
import typings.photoshop.domCoreModulesMod.ActionReference
import typings.photoshop.domCoreModulesMod.BatchPlayCommandOptions
import typings.photoshop.domCoreModulesMod.CPUInfo
import typings.photoshop.domCoreModulesMod.DisplayConfiguration
import typings.photoshop.domCoreModulesMod.DisplayConfigurationOptions
import typings.photoshop.domCoreModulesMod.ExecuteAsModalOptions
import typings.photoshop.domCoreModulesMod.ExecutionContext
import typings.photoshop.domCoreModulesMod.GPUInfo
import typings.photoshop.domCoreModulesMod.GetActiveToolResult
import typings.photoshop.domCoreModulesMod.GetPluginInfoResult
import typings.photoshop.domCoreModulesMod.HistoryStateInfo
import typings.photoshop.domCoreModulesMod.HistorySuspension
import typings.photoshop.domCoreModulesMod.MenuCommandMenuIDOptions
import typings.photoshop.domCoreModulesMod.MenuCommandOptions
import typings.photoshop.domCoreModulesMod.NotificationListener
import typings.photoshop.domCoreModulesMod.PerformMenuCommandResult
import typings.photoshop.domCoreModulesMod.RedrawDocumentOptions
import typings.photoshop.domCoreModulesMod.ResumeHistorySuspensionOptions
import typings.photoshop.domCoreModulesMod.SetExecutionModeOptions
import typings.photoshop.domCoreModulesMod.SuppressResizeGripperOptions
import typings.photoshop.domImagingModuleMod.imaging.CreateImageDataFromBufferOptions
import typings.photoshop.domImagingModuleMod.imaging.EncodeImageDataOptions
import typings.photoshop.domImagingModuleMod.imaging.GetLayerMaskOptions
import typings.photoshop.domImagingModuleMod.imaging.GetLayerMaskResult
import typings.photoshop.domImagingModuleMod.imaging.GetPixelsOptions
import typings.photoshop.domImagingModuleMod.imaging.GetPixelsResult
import typings.photoshop.domImagingModuleMod.imaging.GetSelectionOptions
import typings.photoshop.domImagingModuleMod.imaging.GetSelectionResult
import typings.photoshop.domImagingModuleMod.imaging.PhotoshopImageData
import typings.photoshop.domImagingModuleMod.imaging.PutLayerMaskOptions
import typings.photoshop.domImagingModuleMod.imaging.PutPixelsOptions
import typings.photoshop.domImagingModuleMod.imaging.PutSelectionOptions
import typings.photoshop.domObjectsMod.BMPSaveOptions
import typings.photoshop.domObjectsMod.GIFSaveOptions
import typings.photoshop.domObjectsMod.JPEGSaveOptions
import typings.photoshop.domObjectsMod.PNGSaveOptions
import typings.photoshop.domObjectsMod.PhotoshopSaveOptions
import typings.photoshop.photoshopStrings.angleUnit
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
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bmp extends StObject {
    
    /**
      * Save the document as a BMP file.
      * @param entry UXP File token generated from the UXP Storage APIs.
      * @param saveOptions JPEG specific save options. See SaveOptions/BMPSaveOptions.
      * @param asCopy Whether to save as a copy.
      * @minVersion 23.0
      */
    def bmp(entry: File): js.Promise[scala.Unit] = js.native
    def bmp(entry: File, saveOptions: scala.Unit, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    def bmp(entry: File, saveOptions: BMPSaveOptions): js.Promise[scala.Unit] = js.native
    def bmp(entry: File, saveOptions: BMPSaveOptions, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    
    /**
      * Save the document as a GIF file.
      * @param entry UXP File token generated from the UXP Storage APIs.
      * @param saveOptions GIF specific save options. See SaveOptions/GIFSaveOptions.
      * @param asCopy Whether to save as a copy.
      * @minVersion 23.0
      */
    def gif(entry: File): js.Promise[scala.Unit] = js.native
    def gif(entry: File, saveOptions: scala.Unit, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    def gif(entry: File, saveOptions: GIFSaveOptions): js.Promise[scala.Unit] = js.native
    def gif(entry: File, saveOptions: GIFSaveOptions, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    
    /**
      * @TODO reenable when we get the green-light to script PSDC
      * Save the document into Cloud Documents (PSDC).
      * @param path String title or path (separated by slash '/') location to save to.
      * @param saveOptions PSD/PSB specific save options. See SaveOptions/PhotoshopSaveOptions.
      * @minVersion ?
      */
    /**
      * Save the document as a JPG file.
      * @param entry UXP File token generated from the UXP Storage APIs.
      * @param saveOptions JPEG specific save options. See SaveOptions/JPEGSaveOptions.
      * @param asCopy Whether to save as a copy.
      * @minVersion 23.0
      */
    def jpg(entry: File): js.Promise[scala.Unit] = js.native
    def jpg(entry: File, saveOptions: scala.Unit, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    def jpg(entry: File, saveOptions: JPEGSaveOptions): js.Promise[scala.Unit] = js.native
    def jpg(entry: File, saveOptions: JPEGSaveOptions, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    
    /**
      * Save the document as a PNG file.
      * @param entry UXP File token generated from the UXP Storage APIs.
      * @param saveOptions PNG specific save options. See SaveOptions/PNGSaveOptions.
      * @param asCopy Whether to save as a copy.
      * @minVersion 23.0
      */
    def png(entry: File): js.Promise[scala.Unit] = js.native
    def png(entry: File, saveOptions: scala.Unit, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    def png(entry: File, saveOptions: PNGSaveOptions): js.Promise[scala.Unit] = js.native
    def png(entry: File, saveOptions: PNGSaveOptions, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    
    /**
      * Save the document as a PSB file.
      * @param entry UXP File token generated from the UXP Storage APIs.
      * @param saveOptions PSD/PSB specific save options. See SaveOptions/PhotoshopSaveOptions.
      * @param asCopy Whether to save as a copy.
      * @minVersion 23.0
      */
    def psb(entry: File): js.Promise[scala.Unit] = js.native
    def psb(entry: File, saveOptions: scala.Unit, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    def psb(entry: File, saveOptions: PhotoshopSaveOptions): js.Promise[scala.Unit] = js.native
    def psb(entry: File, saveOptions: PhotoshopSaveOptions, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    
    /**
      * Save the document as a PSD file.
      * @param entry UXP File token generated from the UXP Storage APIs.
      * @param saveOptions PSD specific save options. See SaveOptions/PhotoshopSaveOptions.
      * @param asCopy Whether to save as a copy.
      * @minVersion 23.0
      */
    def psd(entry: File): js.Promise[scala.Unit] = js.native
    def psd(entry: File, saveOptions: scala.Unit, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    def psd(entry: File, saveOptions: PhotoshopSaveOptions): js.Promise[scala.Unit] = js.native
    def psd(entry: File, saveOptions: PhotoshopSaveOptions, asCopy: Boolean): js.Promise[scala.Unit] = js.native
  }
  
  trait Get extends StObject {
    
    def get(obj: Any, key: Any): Any
  }
  object Get {
    
    inline def apply(get: (Any, Any) => Any): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      inline def setGet(value: (Any, Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Identifier extends StObject {
    
    var identifier: js.UndefOr[String] = js.undefined
    
    var minimumSize: js.UndefOr[Height] = js.undefined
    
    var preferredSize: Height
  }
  object Identifier {
    
    inline def apply(preferredSize: Height): Identifier = {
      val __obj = js.Dynamic.literal(preferredSize = preferredSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identifier] (val x: Self) extends AnyVal {
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      inline def setMinimumSize(value: Height): Self = StObject.set(x, "minimumSize", value.asInstanceOf[js.Any])
      
      inline def setMinimumSizeUndefined: Self = StObject.set(x, "minimumSize", js.undefined)
      
      inline def setPreferredSize(value: Height): Self = StObject.set(x, "preferredSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var layerID: Double
    
    var layerKind: Double
    
    var name: String
  }
  object Index {
    
    inline def apply(index: Double, layerID: Double, layerKind: Double, name: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], layerID = layerID.asInstanceOf[js.Any], layerKind = layerKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLayerID(value: Double): Self = StObject.set(x, "layerID", value.asInstanceOf[js.Any])
      
      inline def setLayerKind(value: Double): Self = StObject.set(x, "layerKind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Interpolation extends StObject {
    
    var interpolation: js.UndefOr[InterpolationMethod] = js.undefined
  }
  object Interpolation {
    
    inline def apply(): Interpolation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interpolation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Interpolation] (val x: Self) extends AnyVal {
      
      inline def setInterpolation(value: InterpolationMethod): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    }
  }
  
  trait Message extends StObject {
    
    var message: String
  }
  object Message {
    
    inline def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RegisterAutoCloseDocument extends StObject {
    
    /**
      * Register a document to be closed when the modal scope exits.
      * @param documentID
      */
    def registerAutoCloseDocument(documentID: Double): js.Promise[scala.Unit] = js.native
    
    /**
      * Call to resume history on a target document.
      * commit (optional): if false, the current modified document state is dropped, and the document returns to
      * the state when `suspendHistory` was invoked.
      * @minVersion 23.0
      */
    def resumeHistory(params: ResumeHistorySuspensionOptions): js.Promise[scala.Unit] = js.native
    def resumeHistory(params: ResumeHistorySuspensionOptions, commit: Boolean): js.Promise[scala.Unit] = js.native
    
    /**
      * Call to suspend history on a target document, returns the suspension ID which can be used for resumeHistory.
      * @minVersion 23.0
      */
    def suspendHistory(params: HistoryStateInfo): js.Promise[HistorySuspension] = js.native
    
    /**
      * Unregister a document from being closed when the modal scope exits.
      * @param documentID
      */
    def unregisterAutoCloseDocument(documentID: Double): js.Promise[scala.Unit] = js.native
  }
  
  @js.native
  trait TypeofphotoshopAction extends StObject {
    
    /**
      * Attach a listener to a Photoshop event. A callback in the form
      * of `(eventName: string, descriptor: Descriptor) => void` will be performed.
      * ```javascript
      * await PhotoshopAction.addNotificationListener(['open'], onOpenNewDocument)
      * ```
      * @minVersion 23.0
      */
    def addNotificationListener(events: js.Array[String], notifier: NotificationListener): js.Promise[scala.Unit] = js.native
    
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
    def batchPlay(commands: js.Array[ActionDescriptor]): js.Promise[js.Array[ActionDescriptor]] = js.native
    def batchPlay(commands: js.Array[ActionDescriptor], options: BatchPlayCommandOptions): js.Promise[js.Array[ActionDescriptor]] = js.native
    
    /**
      * Return the identifier number assigned to an action string value.
      * If the string is not already registered, a new ID will be created and returned.
      * @minVersion 24.0
      */
    def getIDFromString(value: String): Double = js.native
    
    /**
      * Detaches a listener from a Photoshop event.
      * See [addNotificationListener](#addNotificationListener)
      * ```javascript
      * await PhotoshopAction.removeNotificationListener(['open'], onOpenNewDocument)
      * ```
      * @minVersion 23.0
      */
    def removeNotificationListener(events: js.Array[String], notifier: NotificationListener): js.Promise[scala.Unit] = js.native
    
    def validateReference(ref: js.Array[ActionReference]): Boolean = js.native
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
    def validateReference(ref: ActionReference): Boolean = js.native
  }
  
  @js.native
  trait TypeofphotoshopCore extends StObject {
    
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
    def addNotificationListener(group: String, events: js.Array[String], notifier: NotificationListener): js.Promise[scala.Unit] = js.native
    
    /**
      * API Version declared by the plugin's manifest.json under `host.data.apiVersion` field.
      *
      * If value 1, you will have access to Photoshop 22.0 DOM and be able to make mutable calls outside a modal state.
      * If 2, you will have access to latest DOM, modal execution and everything else new we're adding.
      * @minVersion 22.5
      */
    var apiVersion: Double = js.native
    
    /**
      * Returns the effective size of a dialog.
      * ```javascript
      * var idealSize = { width: 200, height: 500 }
      * { width, height} = await PhotoshopCore.calculateDialogSize(idealSize)
      * ```
      * @minVersion 22.5
      * @async
      */
    def calculateDialogSize(options: Identifier): js.Promise[Height] = js.native
    
    /**
      * Convert to CMYK
      * @minVersion 23.0
      */
    def convertColor(sourceColor: ColorDescriptor, targetModel: CMYK): CMYKColorDescriptor = js.native
    /**
      * Convert to Grayscale
      * @minVersion 23.0
      */
    def convertColor(sourceColor: ColorDescriptor, targetModel: Gray): GrayscaleColorDescriptor = js.native
    /**
      * Convert to HSB
      * @minVersion 23.0
      */
    def convertColor(sourceColor: ColorDescriptor, targetModel: HSB): HSBColorDescriptor = js.native
    /**
      * Convert to Lab
      * @minVersion 23.0
      */
    def convertColor(sourceColor: ColorDescriptor, targetModel: Lab): LabColorDescriptor = js.native
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
    def convertColor(sourceColor: ColorDescriptor, targetModel: RGB): RGBColorDescriptor | RGB32ColorDescriptor = js.native
    
    /**
      * End the current modal tool editing state.
      * ```javascript
      * // close the modal dialog, cancelling changes
      * await PhotoshopCore.endModalToolState(false)
      * ```
      * @minVersion 22.5
      * @async
      */
    def endModalToolState(commit: Boolean): js.Promise[scala.Unit] = js.native
    
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
    def executeAsModal[T](
      targetFunction: js.Function2[
          /* executionContext */ ExecutionContext, 
          /* descriptor */ js.UndefOr[js.Object], 
          js.Promise[T]
        ],
      options: ExecuteAsModalOptions
    ): js.Promise[T] = js.native
    
    /**
      * Returns information about the active Photoshop tool.
      * ```javascript
      * { title } = await PhotoshopCore.getActiveTool()
      * ```
      * @minVersion 22.5
      * @async
      */
    def getActiveTool(): js.Promise[GetActiveToolResult] = js.native
    
    /**
      * Returns information about the host CPU.
      * ```javascript
      * { logicalCores, frequencyMhz, vendor } = PhotoshopCore.getCPUInfo()
      * var isAMD = vendor === "AMD"
      * var isARM = vendor === "ARM"
      * ```
      * @minVersion 23.1
      */
    def getCPUInfo(): CPUInfo = js.native
    
    /**
      * Returns display configuration with information about each display
      */
    def getDisplayConfiguration(options: DisplayConfigurationOptions): js.Promise[js.Array[DisplayConfiguration]] = js.native
    
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
    def getGPUInfo(): GPUInfo = js.native
    
    /**
      * Returns whether a command menu item is available for invoking.
      * ```javascript
      * // can a Fill be performed?
      * var canFill = await PhotoshopCore.getMenuCommandState({ commandID: 1042 })
      * ```
      * @minVersion 22.5
      * @async
      */
    def getMenuCommandState(options: MenuCommandOptions): js.Promise[js.Array[Boolean]] = js.native
    
    /**
      * Returns the localized menu title of the menu command item.
      * ```javascript
      * var renameLayerStr = await PhotoshopCore.getMenuCommandTitle({ commandID: 2983 })
      * ```
      * @minVersion 22.5
      * @async
      */
    def getMenuCommandTitle(options: MenuCommandMenuIDOptions): Any = js.native
    def getMenuCommandTitle(options: MenuCommandOptions): Any = js.native
    
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
    def getPluginInfo(): js.Promise[GetPluginInfoResult] = js.native
    
    /**
      * Gets the number of seconds a user must be idle on Photoshop before invoking the
      * userIdle event handler defined with [[addNotificationListener]]. An idleTime of 0
      * means turned off idle notifications.
      */
    def getUserIdleTime(): js.Promise[Double] = js.native
    
    /**
      * Returns true if the plugin is currently in a modal state using [[executeAsModal]]
      * @minVersion 23.1
      */
    def isModal(): Boolean = js.native
    
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
    def performMenuCommand(options: MenuCommandOptions): js.Promise[PerformMenuCommandResult] = js.native
    
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
    def redrawDocument(options: RedrawDocumentOptions): js.Promise[Double] = js.native
    
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
    def setExecutionMode(options: SetExecutionModeOptions): js.Promise[scala.Unit] = js.native
    
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
    def setUserIdleTime(idleTime: Double): js.Promise[scala.Unit] = js.native
    
    /**
      * Show a generic alert box to the user. 'OK' to dismiss.
      * ```javascript
      * // script has completed.
      * await PhotoshopCore.showAlert({ message: 'Operation successful'})
      * ```
      * @minVersion 22.5
      * @async
      */
    def showAlert(options: String): js.Promise[scala.Unit] = js.native
    def showAlert(options: Message): js.Promise[scala.Unit] = js.native
    
    /**
      * Changes visibility of resize gripper in bottom right corner of panel. This can be useful when resize gripper
      * is obstructing the view o panel content.
      */
    def suppressResizeGripper(options: SuppressResizeGripperOptions): js.Promise[scala.Unit] = js.native
    
    /**
      * Given a Photoshop ZString (of format `"$$$/slash/separated/key=english default value"`),
      * will return the translated string for the current UI language
      * @minVersion 22.5
      */
    def translateUIString(zstring: String): String = js.native
  }
  
  @js.native
  trait TypeofphotoshopImaging extends StObject {
    
    def createImageDataFromBuffer(arrayBuffer: js.typedarray.Float32Array, options: CreateImageDataFromBufferOptions): js.Promise[PhotoshopImageData] = js.native
    def createImageDataFromBuffer(arrayBuffer: js.typedarray.Uint16Array, options: CreateImageDataFromBufferOptions): js.Promise[PhotoshopImageData] = js.native
    /**
      * This API allows JavaScript to create arbitrary image data from a memory buffer.
      *
      * ```javascript
      * const imageData = await imaging.createImageDataFromBuffer(arrayBuffer, options);
      * ```
      *
      * The number of elements in imageData must be equal to: `width * height * components`.
      *
      * Example:
      * ```javascript
      * const width = 30;
      * const height = 40;
      * const components = 4;  // RGBA
      * const componentCount = width * height;
      * const dataSize = componentCount * components;
      * const arrayBuffer = new Uint8Array(dataSize);
      *
      * // Add some (chunky) data to the buffer
      * for (let i = 0 ; i < componentCount; i += components) {
      *     arrayBuffer[index]   = 255;      // red
      *     arrayBuffer[index+1] = 0;        // green
      *     arrayBuffer[index+2] = 0;        // blue
      *     arrayBuffer[index+3] = 127;      // alpha
      * }
      *
      * const options = {
      * width: width,
      * height: height,
      * components: components,
      * colorProfile: "sRGB IEC61966-2.1",
      * colorSpace: "RGB"
      * };
      * const imageData = await imaging.createImageDataFromBuffer(arrayBuffer, options)
      * ```
      *
      * Image data that is used for layer masks or document selections uses a single grayscale component.
      * When creating such data, use `components: 1`, `colorSpace: "Grayscale"`
      * and `colorProfile: "Gray Gamma 2.2"` as shown in the following example:
      *
      * ```javascript
      * const width = 30;
      * const height = 40;
      * const componentCount = width * height;
      * const arrayBuffer = new Uint8Array(componentCount);
      *
      * for (let i = 0 ; i < componentCount; ++i) {
      * arrayBuffer[i] = 127; // all set to the median value
      * }
      *
      * const options = {
      * width: width,
      * height: height,
      * components: 1,  // masks are grayscale
      * chunky: false,
      * colorProfile: "Gray Gamma 2.2",
      * colorSpace: "Grayscale"
      * };
      * const maskData = await imaging.createImageDataFromBuffer(arrayBuffer, options)
      * ```
      *
      * @minVersion 24.4
      * @async
      */
    def createImageDataFromBuffer(arrayBuffer: js.typedarray.Uint8Array, options: CreateImageDataFromBufferOptions): js.Promise[PhotoshopImageData] = js.native
    
    /**
      * This API is exposed to allow image data to be used with UXP image elements. With the current version of UXP
      * you must use jpeg/base64 encoding when assigning to an image element.
      *
      * ```javascript
      * const dataImage = await imaging.encodeImageData(options);
      * ```
      *
      * Example:
      * ```javascript
      * const imageElement = document.createElement('img');
      *
      * const jpegData = await imaging.encodeImageData({"imageData": imgObj.imageData, "base64": true});
      *
      * const dataUrl = "data:image/jpeg;base64," + jpegData;
      * imageElement.src = dataUrl;
      * document.body.appendChild(imageElement);
      * ```
      *
      * @minVersion 24.4
      * @async
      */
    def encodeImageData(options: EncodeImageDataOptions): js.Promise[js.Array[Double] | String] = js.native
    
    /**
      * This API allows JavaScript to retrieve the pixel data representing a layer's mask.
      * ```javascript
      * const imageObj = await imaging.getLayerMask(options);
      * ```
      *
      * Example - get the user mask for a layer
      * ```javascript
      * const imageObj = await imaging.getLayerMask({
      *     documentID: 123,
      *     layerID: 5,
      *     kind: "user"
      *     sourceBounds: { left: 0, top: 0, right: 300, bottom: 300 },
      *     targetSize: { height: 100 }
      * });
      * ```
      *
      * @minVersion 24.4
      * @async
      */
    def getLayerMask(options: GetLayerMaskOptions): js.Promise[GetLayerMaskResult] = js.native
    
    /**
      * This API allows JavaScript to obtain pixel data from a Photoshop document.
      * You can request pixels from an individual layer, or from the full document composite.
      *
      * ```javascript
      * const imageObj = await imaging.getPixels(options);
      * ```
      *
      * Note: the `components` property of the image data depends on whether or not the pixel source
      * includes an alpha channel, e.g., 4 for RGBA.
      *
      * If the targetSize is smaller than the requested region, then the resulting image data will
      * be scaled down. When scaling, Photoshop may use a smaller (cached) version of the image canvas.
      * This is known as a pyramid level. The number of pyramid levels that are available in a document
      * is determined by the preference: *"Performance Cache Levels"*. Using a cache level may result in
      * dramatic performance improvements. The returned level indicates which level that was used.
      * Level 0 indicates the full resolution canvas. Level 1 indicates a cache that is half of the
      * size of the full resolution, and so forth. The returned `sourceBounds` are relative to the
      * bounds of the source cache level (not relative to the full resolution bounds).
      *
      * The valid bounds for the `sourceBounds` depend on the pixel source. The origin of the composite
      * image is `(0, 0)`,and the size is given by the properties `width` and `height` on the DOM object
      * for the source document. The origin of a pixel layer can be different from `(0, 0)`. You can get
      * the valid pixel bounds for a layer by calling `boundsNoEffects` on the DOM object corresponding
      * to the source layer.
      *
      *
      * Example - create a thumbnail of an region of the target document that is 100 pixels tall.
      * ```javascript
      * const thumbnail = await imaging.getPixels({
      *     sourceBounds: { left: 0, top: 0, right: 300, bottom: 300 },
      *     targetSize: { height: 100 }
      * });
      * ```
      *
      * @minVersion 24.4
      * @async
      */
    def getPixels(options: GetPixelsOptions): js.Promise[GetPixelsResult] = js.native
    
    /**
      * This API allows JavaScript to obtain a pixel representation of the active selection.
      * Think of it like entering [Quick Mask mode](https://helpx.adobe.com/photoshop/using/create-temporary-quick-mask.html).
      * ```javascript
      * const imageObj = await imaging.getSelection(options);
      * ```
      *
      * Example - get the document selection
      * ```javascript
      * const imageObj = await imaging.getSelection({
      *     documentID: 123,
      *     sourceBounds: { left: 0, top: 0, right: 300, bottom: 300 }
      * });
      * ```
      *
      * @minVersion 24.4
      * @async
      */
    def getSelection(options: GetSelectionOptions): js.Promise[GetSelectionResult] = js.native
    
    /**
      * This API allows JavaScript to edit the pixels of a layer's mask.  At this time, only pixel
      * masks are editable. In the UI, they are what is referred to as a "Layer Mask".
      *
      * ```javascript
      * await imaging.putLayerMask(options);
      * ```
      *
      * Example:
      * ```javascript
      * await imaging.putLayerMask({
      *     layerID: 123
      *     imageData: grayImageData
      * });
      * ```
      *
      * @minVersion 24.4
      * @async
      */
    def putLayerMask(options: PutLayerMaskOptions): js.Promise[scala.Unit] = js.native
    
    /**
      * This API allows JavaScript to change pixel data in a layer. You can replace all pixels
      * in a layer or a region of the layer.
      *
      * ```javascript
      * await imaging.putPixels(options);
      * ```
      *
      * @minVersion 24.4
      * @async
      */
    def putPixels(options: PutPixelsOptions): js.Promise[scala.Unit] = js.native
    
    /**
      * This API allows JavaScript to change the selection itself using a provided pixel data representation.
      * Think of it like exiting [Quick Mask mode](https://helpx.adobe.com/photoshop/using/create-temporary-quick-mask.html).
      *
      * ```javascript
      * await imaging.putSelection(options);
      * ```
      *
      * Example:
      * ```javascript
      * await imaging.putSelection({ imageData: grayImageData });
      * ```
      *
      * @minVersion 24.4
      * @async
      */
    def putSelection(options: PutSelectionOptions): js.Promise[scala.Unit] = js.native
  }
  
  trait Unit extends StObject {
    
    var _unit: angleUnit
    
    var _value: Double
  }
  object Unit {
    
    inline def apply(_value: Double): Unit = {
      val __obj = js.Dynamic.literal(_unit = "angleUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      inline def set_unit(value: angleUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
      
      inline def set_value(value: Double): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
