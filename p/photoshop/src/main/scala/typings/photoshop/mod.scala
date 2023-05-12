package typings.photoshop

import org.scalablytyped.runtime.Shortcut
import typings.photoshop.anon.Height
import typings.photoshop.anon.Identifier
import typings.photoshop.anon.Message
import typings.photoshop.anon.TypeofphotoshopAction
import typings.photoshop.anon.TypeofphotoshopCore
import typings.photoshop.anon.TypeofphotoshopImaging
import typings.photoshop.anon.X
import typings.photoshop.domConstantsMod.ColorModel
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
import typings.photoshop.domCoreModulesMod.MenuCommandMenuIDOptions
import typings.photoshop.domCoreModulesMod.MenuCommandOptions
import typings.photoshop.domCoreModulesMod.NotificationListener
import typings.photoshop.domCoreModulesMod.PerformMenuCommandResult
import typings.photoshop.domCoreModulesMod.RedrawDocumentOptions
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
import typings.photoshop.domObjectsColorsMod.NoColor
import typings.photoshop.domPhotoshopMod.Photoshop
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

object mod {
  
  object default {
    
    @JSImport("photoshop", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("photoshop", "default.action")
    @js.native
    def action: TypeofphotoshopAction = js.native
    inline def action_=(x: TypeofphotoshopAction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("action")(x.asInstanceOf[js.Any])
    
    @JSImport("photoshop", "default.app")
    @js.native
    def app: Photoshop = js.native
    inline def app_=(x: Photoshop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("app")(x.asInstanceOf[js.Any])
    
    @JSImport("photoshop", "default.constants")
    @js.native
    def constants: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof photoshopConstants */ Any = js.native
    inline def constants_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof photoshopConstants */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constants")(x.asInstanceOf[js.Any])
    
    @JSImport("photoshop", "default.core")
    @js.native
    def core: TypeofphotoshopCore = js.native
    inline def core_=(x: TypeofphotoshopCore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("core")(x.asInstanceOf[js.Any])
    
    @JSImport("photoshop", "default.imaging")
    @js.native
    def imaging: TypeofphotoshopImaging = js.native
    inline def imaging_=(x: TypeofphotoshopImaging): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imaging")(x.asInstanceOf[js.Any])
  }
  
  object action {
    
    @JSImport("photoshop", "action")
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
  
  object app extends Shortcut {
    
    @JSImport("photoshop", "app")
    @js.native
    val ^ : typings.photoshop.domPhotoshopMod.Photoshop = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Action class
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.Action")
    @js.native
    open class Action protected ()
      extends typings.photoshop.domActionsMod.Action {
      /**
        * @ignore
        */
      def this(id: Double) = this()
    }
    
    /**
      * @ignore
      * Allows for polyfills into the Action Set class
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.ActionSet")
    @js.native
    open class ActionSet protected ()
      extends typings.photoshop.domActionsMod.ActionSet {
      /**
        * @ignore
        */
      def this(id: Any) = this()
    }
    
    /**
      * @ignore
      * Allows for polyfills into the Application object
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.ColorSampler")
    @js.native
    open class ColorSampler protected ()
      extends typings.photoshop.domColorSamplerMod.ColorSampler {
      def this(docId: Double, index: Double, position: X, color: NoColor) = this()
      /**
        * @ignore
        */
      def this(
        docId: Double,
        index: Double,
        position: X,
        color: typings.photoshop.domObjectsSolidColorMod.SolidColor
      ) = this()
    }
    
    /**
      * @ignore
      * Allows for polyfills into the Document class
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.Document")
    @js.native
    open class Document protected ()
      extends typings.photoshop.domDocumentMod.Document {
      /**
        * @ignore
        */
      def this(id: Double) = this()
    }
    
    /**
      * @ignore
      * Allows for polyfills into the Guide class
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.Guide")
    @js.native
    open class Guide protected ()
      extends typings.photoshop.domGuideMod.Guide {
      /**
        * @ignore
        */
      def this(id: Double, docId: Double) = this()
    }
    
    /**
      * @ignore
      * Allows for polyfills into the Layer class
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.Layer")
    @js.native
    open class Layer protected ()
      extends typings.photoshop.domLayerMod.Layer {
      /**
        * @ignore
        */
      def this(id: Double, docId: Double) = this()
    }
    
    /**
      * @ignore
      * Allows for polyfills into the LayerComp class
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.LayerComp")
    @js.native
    open class LayerComp protected ()
      extends typings.photoshop.domLayerCompMod.LayerComp {
      /**
        * @ignore
        */
      def this(id: Double, docId: Double) = this()
    }
    
    /**
      * @ignore
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.PathPointInfo")
    @js.native
    /** @ignore */
    open class PathPointInfo ()
      extends typings.photoshop.domObjectsPathPointInfoMod.PathPointInfo
    
    /**
      * @ignore
      * Allows for polyfills into the Application object
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.Photoshop")
    @js.native
    /**
      * @ignore
      */
    open class Photoshop ()
      extends typings.photoshop.domPhotoshopMod.Photoshop
    
    /**
      * @ignore
      * Exposes SolidColor class for constructing objects
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.SolidColor")
    @js.native
    /**
      * All colors default to pure white.
      *
      * ```
      * const SolidColor = require("photoshop").app.SolidColor;
      * const color = new SolidColor();
      * ```
      *
      * @param model Color model to start.
      * @minVersion 23.0
      */
    open class SolidColor ()
      extends typings.photoshop.domObjectsSolidColorMod.SolidColor {
      def this(model: ColorModel) = this()
    }
    
    /**
      * @ignore
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop", "app.SubPathInfo")
    @js.native
    /** @ignore */
    open class SubPathInfo ()
      extends typings.photoshop.domObjectsSubPathInfoMod.SubPathInfo
    
    type _To = typings.photoshop.domPhotoshopMod.Photoshop
    
    /* This means you don't have to write `^`, but can instead just say `app.foo` */
    override def _to: typings.photoshop.domPhotoshopMod.Photoshop = ^
  }
  
  @JSImport("photoshop", "constants")
  @js.native
  val constants: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof photoshopConstants */ Any = js.native
  
  object core {
    
    @JSImport("photoshop", "core")
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
    @JSImport("photoshop", "core.apiVersion")
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
  
  object imaging {
    
    @JSImport("photoshop", "imaging")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createImageDataFromBuffer(arrayBuffer: js.typedarray.Float32Array, options: CreateImageDataFromBufferOptions): js.Promise[PhotoshopImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageDataFromBuffer")(arrayBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhotoshopImageData]]
    inline def createImageDataFromBuffer(arrayBuffer: js.typedarray.Uint16Array, options: CreateImageDataFromBufferOptions): js.Promise[PhotoshopImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageDataFromBuffer")(arrayBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhotoshopImageData]]
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
    inline def createImageDataFromBuffer(arrayBuffer: js.typedarray.Uint8Array, options: CreateImageDataFromBufferOptions): js.Promise[PhotoshopImageData] = (^.asInstanceOf[js.Dynamic].applyDynamic("createImageDataFromBuffer")(arrayBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PhotoshopImageData]]
    
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
    inline def encodeImageData(options: EncodeImageDataOptions): js.Promise[js.Array[Double] | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeImageData")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Double] | String]]
    
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
    inline def getLayerMask(options: GetLayerMaskOptions): js.Promise[GetLayerMaskResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayerMask")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetLayerMaskResult]]
    
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
    inline def getPixels(options: GetPixelsOptions): js.Promise[GetPixelsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPixels")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPixelsResult]]
    
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
    inline def getSelection(options: GetSelectionOptions): js.Promise[GetSelectionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelection")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSelectionResult]]
    
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
    inline def putLayerMask(options: PutLayerMaskOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("putLayerMask")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
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
    inline def putPixels(options: PutPixelsOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("putPixels")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
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
    inline def putSelection(options: PutSelectionOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("putSelection")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  }
}
