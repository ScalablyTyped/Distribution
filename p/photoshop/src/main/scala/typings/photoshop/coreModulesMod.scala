package typings.photoshop

import org.scalablytyped.runtime.StringDictionary
import typings.photoshop.anon.ClassID
import typings.photoshop.anon.CommandID
import typings.photoshop.anon.Height
import typings.photoshop.anon.Id
import typings.photoshop.anon.MenuID
import typings.photoshop.anon.Message
import typings.photoshop.anon.Name
import typings.photoshop.anon.ResumeHistory
import typings.photoshop.colorTypesMod.ColorDescriptor
import typings.photoshop.photoshopInts.`15`
import typings.photoshop.photoshopInts.`16`
import typings.photoshop.photoshopInts.`4`
import typings.photoshop.photoshopInts.`5`
import typings.photoshop.photoshopInts.`6`
import typings.photoshop.photoshopStrings.execute
import typings.photoshop.photoshopStrings.fail
import typings.photoshop.photoshopStrings.rosetta2
import typings.photoshop.photoshopStrings.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreModulesMod {
  
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
      */
    inline def batchPlay(commands: js.Array[ActionDescriptor]): js.Promise[js.Array[ActionDescriptor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("batchPlay")(commands.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ActionDescriptor]]]
    inline def batchPlay(commands: js.Array[ActionDescriptor], options: BatchPlayCommandOptions): js.Promise[js.Array[ActionDescriptor]] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchPlay")(commands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ActionDescriptor]]]
    
    /**
      * Detaches a listener from a Photoshop event.
      * @see addNotificationListener
      * ```javascript
      * await PhotoshopAction.removeNotificationListener(['open'], onOpenNewDocument)
      * ```
      */
    inline def removeNotificationListener(events: js.Array[String], notifier: NotificationListener): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNotificationListener")(events.asInstanceOf[js.Any], notifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  object photoshopCore {
    
    @JSImport("photoshop/dom/CoreModules", "photoshopCore")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * API Version declared by the plugin's manifest.json under `host.data.apiVersion` field.
      *
      * If value 1, you will have access to Photoshop 22.0 DOM and be able to make mutable calls outside a modal state.
      * If 2, you will have access to latest DOM, modal execution and everything else new we're adding.
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
      */
    inline def calculateDialogSize(preferredSize: Height): js.Promise[Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateDialogSize")(preferredSize.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Height]]
    inline def calculateDialogSize(preferredSize: Height, identifier: String): js.Promise[Height] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDialogSize")(preferredSize.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Height]]
    inline def calculateDialogSize(preferredSize: Height, identifier: String, minimumSize: Height): js.Promise[Height] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDialogSize")(preferredSize.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], minimumSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Height]]
    inline def calculateDialogSize(preferredSize: Height, identifier: Unit, minimumSize: Height): js.Promise[Height] = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateDialogSize")(preferredSize.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any], minimumSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Height]]
    
    /**
      * Converts the given color (in descriptor form) to the
      * given color space, returning the color descriptor.
      *
      * This is an internal API that is used for [[SolidColor]]
      * and all the other color classes.
      *
      * Currently, this API uses the application color settings
      * for conversion (Edit > Color Settings...). '
      * In the future, we will provide color conversion
      * based on embedded color profiles.
      */
    inline def convertColor(sourceColor: ColorDescriptor, targetModel: ColorConversionModel): ColorDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("convertColor")(sourceColor.asInstanceOf[js.Any], targetModel.asInstanceOf[js.Any])).asInstanceOf[ColorDescriptor]
    
    /**
      * End the current modal tool editing state.
      * ```javascript
      * // close the modal dialog, cancelling changes
      * await PhotoshopCore.endModalToolState(false)
      * ```
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
      */
    inline def executeAsModal(
      targetFunction: js.Function1[/* executionContext */ ExecutionContext, js.Promise[Any]],
      options: ExecuteAsModalOptions
    ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeAsModal")(targetFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Returns information about the active Photoshop tool.
      * ```javascript
      * { title } = await PhotoshopCore.getActiveTool()
      * ```
      */
    inline def getActiveTool(): js.Promise[ClassID] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveTool")().asInstanceOf[js.Promise[ClassID]]
    
    /**
      * Returns information about the host CPU.
      * ```javascript
      * { logicalCores, frequencyMhz, vendor } = PhotoshopCore.getCPUInfo()
      * var isAMD = vendor === "AMD"
      * var isARM = vendor === "ARM"
      * ```
      */
    inline def getCPUInfo(): CPUInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getCPUInfo")().asInstanceOf[CPUInfo]
    
    /**
      * Returns OpenGL and OpenCL information about the available graphics processor.
      * ```javascript
      * { gpuInfoList, clgpuInfoList } = PhotoshopCore.getGPUInfo()
      * console.log(JSON.stringify(gpuInfoList))
      * // > [{"version":"2.1 ATI-4.5.14","memoryMB":8192,"name":"16915464", ...}]
      * console.log(JSON.stringify(clgpuInfoList))
      * // > [{"version":"OpenCL 1.2 ","memoryMB":8589,"name":"AMD Radeon Pro 580X Compute Engine", ...}]
      * ```
      */
    inline def getGPUInfo(): GPUInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getGPUInfo")().asInstanceOf[GPUInfo]
    
    /**
      * Returns whether a command menu item is available for invoking.
      * ```javascript
      * // can a Fill be performed?
      * var canFill = await PhotoshopCore.getMenuCommandState({ commandID: 1042 })
      * ```
      */
    inline def getMenuCommandState(options: CommandID): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuCommandState")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Returns the localized menu title of the menu command item.
      * ```javascript
      * var renameLayerStr = await PhotoshopCore.getMenuCommandTitle({ commandID: 2983 })
      * ```
      */
    inline def getMenuCommandTitle(options: MenuID): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuCommandTitle")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    /**
      * Invokes the menu command via its `commandID`. Returns false
      * on failure, or if the command is not available.
      * ```javascript
      * // select all
      * await PhotoshopCore.performMenuCommand({ commandID: 1017 })
      * ```
      */
    inline def performMenuCommand(options: CommandID): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("performMenuCommand")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Show a generic alert box to the user. 'OK' to dismiss.
      * ```javascript
      * // script has completed.
      * await PhotoshopCore.showAlert({ message: 'Operation successful'})
      * ```
      */
    inline def showAlert(options: Message): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("showAlert")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Given a Photoshop ZString (of format `"$$$/slash/separated/key=english default value"`),
      * will return the translated string for the current UI language
      */
    inline def translateUIString(zstring: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("translateUIString")(zstring.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  trait ActionDescriptor
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    var _obj: String
  }
  object ActionDescriptor {
    
    inline def apply(_obj: String): ActionDescriptor = {
      val __obj = js.Dynamic.literal(_obj = _obj.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionDescriptor]
    }
    
    extension [Self <: ActionDescriptor](x: Self) {
      
      inline def set_obj(value: String): Self = StObject.set(x, "_obj", value.asInstanceOf[js.Any])
    }
  }
  
  trait BatchPlayCommandOptions extends StObject {
    
    var historyStateInfo: js.UndefOr[Name] = js.undefined
    
    var modalBehavior: js.UndefOr[wait | execute | fail] = js.undefined
    
    var propagateErrorToDefaultHandler: js.UndefOr[Boolean] = js.undefined
  }
  object BatchPlayCommandOptions {
    
    inline def apply(): BatchPlayCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchPlayCommandOptions]
    }
    
    extension [Self <: BatchPlayCommandOptions](x: Self) {
      
      inline def setHistoryStateInfo(value: Name): Self = StObject.set(x, "historyStateInfo", value.asInstanceOf[js.Any])
      
      inline def setHistoryStateInfoUndefined: Self = StObject.set(x, "historyStateInfo", js.undefined)
      
      inline def setModalBehavior(value: wait | execute | fail): Self = StObject.set(x, "modalBehavior", value.asInstanceOf[js.Any])
      
      inline def setModalBehaviorUndefined: Self = StObject.set(x, "modalBehavior", js.undefined)
      
      inline def setPropagateErrorToDefaultHandler(value: Boolean): Self = StObject.set(x, "propagateErrorToDefaultHandler", value.asInstanceOf[js.Any])
      
      inline def setPropagateErrorToDefaultHandlerUndefined: Self = StObject.set(x, "propagateErrorToDefaultHandler", js.undefined)
    }
  }
  
  trait CPUInfo extends StObject {
    
    var emulationMode: js.UndefOr[rosetta2] = js.undefined
    
    var frequencyMhz: Double
    
    var logicalCores: Double
    
    var physicalCores: Double
    
    var vendor: CPUVendorKind
  }
  object CPUInfo {
    
    inline def apply(frequencyMhz: Double, logicalCores: Double, physicalCores: Double, vendor: CPUVendorKind): CPUInfo = {
      val __obj = js.Dynamic.literal(frequencyMhz = frequencyMhz.asInstanceOf[js.Any], logicalCores = logicalCores.asInstanceOf[js.Any], physicalCores = physicalCores.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[CPUInfo]
    }
    
    extension [Self <: CPUInfo](x: Self) {
      
      inline def setEmulationMode(value: rosetta2): Self = StObject.set(x, "emulationMode", value.asInstanceOf[js.Any])
      
      inline def setEmulationModeUndefined: Self = StObject.set(x, "emulationMode", js.undefined)
      
      inline def setFrequencyMhz(value: Double): Self = StObject.set(x, "frequencyMhz", value.asInstanceOf[js.Any])
      
      inline def setLogicalCores(value: Double): Self = StObject.set(x, "logicalCores", value.asInstanceOf[js.Any])
      
      inline def setPhysicalCores(value: Double): Self = StObject.set(x, "physicalCores", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: CPUVendorKind): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.photoshop.photoshopStrings.Intel
    - typings.photoshop.photoshopStrings.AMD
    - typings.photoshop.photoshopStrings.ARM
    - typings.photoshop.photoshopStrings.Unknown
  */
  trait CPUVendorKind extends StObject
  object CPUVendorKind {
    
    inline def AMD: typings.photoshop.photoshopStrings.AMD = "AMD".asInstanceOf[typings.photoshop.photoshopStrings.AMD]
    
    inline def ARM: typings.photoshop.photoshopStrings.ARM = "ARM".asInstanceOf[typings.photoshop.photoshopStrings.ARM]
    
    inline def Intel: typings.photoshop.photoshopStrings.Intel = "Intel".asInstanceOf[typings.photoshop.photoshopStrings.Intel]
    
    inline def Unknown: typings.photoshop.photoshopStrings.Unknown = "Unknown".asInstanceOf[typings.photoshop.photoshopStrings.Unknown]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.photoshop.photoshopInts.`15`
    - typings.photoshop.photoshopInts.`4`
    - typings.photoshop.photoshopInts.`5`
    - typings.photoshop.photoshopInts.`6`
    - typings.photoshop.photoshopInts.`16`
  */
  trait ColorConversionModel extends StObject
  object ColorConversionModel {
    
    inline def CMYK: `5` = 5.asInstanceOf[`5`]
    
    inline def Gray: `16` = 16.asInstanceOf[`16`]
    
    inline def HSB: `4` = 4.asInstanceOf[`4`]
    
    inline def Lab: `6` = 6.asInstanceOf[`6`]
    
    inline def RGB: `15` = 15.asInstanceOf[`15`]
  }
  
  trait ExecuteAsModalOptions extends StObject {
    
    /**
      * Name of the command, it will be used in the progress bar if the operation takes a noticeable amount of time
      */
    var commandName: String
  }
  object ExecuteAsModalOptions {
    
    inline def apply(commandName: String): ExecuteAsModalOptions = {
      val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecuteAsModalOptions]
    }
    
    extension [Self <: ExecuteAsModalOptions](x: Self) {
      
      inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExecutionContext extends StObject {
    
    /**
      * Use the methods in here to control Photoshop state
      */
    var hostControl: ResumeHistory
    
    /**
      * True if user has cancelled the modal interaction.
      *
      * User can cancel by hitting the Escape key, or by pressing the "Cancel" button in the progress bar.
      */
    var isCancelled: Boolean
    
    /**
      * If assigned a method, it will be called when user cancels the modal interaction.
      */
    var onCancel: Unit
    
    /**
      * Call this to customize the progress bar.
      */
    var reportProgress: Unit
  }
  object ExecutionContext {
    
    inline def apply(hostControl: ResumeHistory, isCancelled: Boolean, onCancel: Unit, reportProgress: Unit): ExecutionContext = {
      val __obj = js.Dynamic.literal(hostControl = hostControl.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], reportProgress = reportProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExecutionContext]
    }
    
    extension [Self <: ExecutionContext](x: Self) {
      
      inline def setHostControl(value: ResumeHistory): Self = StObject.set(x, "hostControl", value.asInstanceOf[js.Any])
      
      inline def setIsCancelled(value: Boolean): Self = StObject.set(x, "isCancelled", value.asInstanceOf[js.Any])
      
      inline def setOnCancel(value: Unit): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
      
      inline def setReportProgress(value: Unit): Self = StObject.set(x, "reportProgress", value.asInstanceOf[js.Any])
    }
  }
  
  trait GPUInfo extends StObject {
    
    var clgpuInfoList: js.UndefOr[js.Array[OpenCLDeviceInfo]] = js.undefined
    
    var gpuInfoList: js.UndefOr[js.Array[OpenGLDeviceInfo]] = js.undefined
  }
  object GPUInfo {
    
    inline def apply(): GPUInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GPUInfo]
    }
    
    extension [Self <: GPUInfo](x: Self) {
      
      inline def setClgpuInfoList(value: js.Array[OpenCLDeviceInfo]): Self = StObject.set(x, "clgpuInfoList", value.asInstanceOf[js.Any])
      
      inline def setClgpuInfoListUndefined: Self = StObject.set(x, "clgpuInfoList", js.undefined)
      
      inline def setClgpuInfoListVarargs(value: OpenCLDeviceInfo*): Self = StObject.set(x, "clgpuInfoList", js.Array(value*))
      
      inline def setGpuInfoList(value: js.Array[OpenGLDeviceInfo]): Self = StObject.set(x, "gpuInfoList", value.asInstanceOf[js.Any])
      
      inline def setGpuInfoListUndefined: Self = StObject.set(x, "gpuInfoList", js.undefined)
      
      inline def setGpuInfoListVarargs(value: OpenGLDeviceInfo*): Self = StObject.set(x, "gpuInfoList", js.Array(value*))
    }
  }
  
  trait HistoryStateInfo extends StObject {
    
    /**
      * Name of the history state to be shown in History panel
      */
    var name: String
    
    /**
      * A single document reference in an array with `_id` of the document whose history will be suspended
      */
    var target: js.Array[Id]
  }
  object HistoryStateInfo {
    
    inline def apply(name: String, target: js.Array[Id]): HistoryStateInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryStateInfo]
    }
    
    extension [Self <: HistoryStateInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Array[Id]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetVarargs(value: Id*): Self = StObject.set(x, "target", js.Array(value*))
    }
  }
  
  /** @ignore */
  type NotificationListener = js.Function2[/* name */ String, /* descriptor */ ActionDescriptor, Unit]
  
  trait OpenCLDeviceInfo extends StObject {
    
    var clDeviceVersion: String
    
    var clPlatformVersion: String
    
    var driverVersion: String
    
    var isIntegrated: String
    
    var memoryMB: Double
    
    var name: String
    
    var oclBandwidth: Double
    
    var oclCompute: Double
    
    var vendor: String
    
    var version: String
  }
  object OpenCLDeviceInfo {
    
    inline def apply(
      clDeviceVersion: String,
      clPlatformVersion: String,
      driverVersion: String,
      isIntegrated: String,
      memoryMB: Double,
      name: String,
      oclBandwidth: Double,
      oclCompute: Double,
      vendor: String,
      version: String
    ): OpenCLDeviceInfo = {
      val __obj = js.Dynamic.literal(clDeviceVersion = clDeviceVersion.asInstanceOf[js.Any], clPlatformVersion = clPlatformVersion.asInstanceOf[js.Any], driverVersion = driverVersion.asInstanceOf[js.Any], isIntegrated = isIntegrated.asInstanceOf[js.Any], memoryMB = memoryMB.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oclBandwidth = oclBandwidth.asInstanceOf[js.Any], oclCompute = oclCompute.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenCLDeviceInfo]
    }
    
    extension [Self <: OpenCLDeviceInfo](x: Self) {
      
      inline def setClDeviceVersion(value: String): Self = StObject.set(x, "clDeviceVersion", value.asInstanceOf[js.Any])
      
      inline def setClPlatformVersion(value: String): Self = StObject.set(x, "clPlatformVersion", value.asInstanceOf[js.Any])
      
      inline def setDriverVersion(value: String): Self = StObject.set(x, "driverVersion", value.asInstanceOf[js.Any])
      
      inline def setIsIntegrated(value: String): Self = StObject.set(x, "isIntegrated", value.asInstanceOf[js.Any])
      
      inline def setMemoryMB(value: Double): Self = StObject.set(x, "memoryMB", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOclBandwidth(value: Double): Self = StObject.set(x, "oclBandwidth", value.asInstanceOf[js.Any])
      
      inline def setOclCompute(value: Double): Self = StObject.set(x, "oclCompute", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenGLDeviceInfo extends StObject {
    
    var driverVersion: String
    
    var glDriver: String
    
    var isIntegrated: String
    
    var memoryMB: Double
    
    var name: String
    
    var vendor: String
    
    var version: String
  }
  object OpenGLDeviceInfo {
    
    inline def apply(
      driverVersion: String,
      glDriver: String,
      isIntegrated: String,
      memoryMB: Double,
      name: String,
      vendor: String,
      version: String
    ): OpenGLDeviceInfo = {
      val __obj = js.Dynamic.literal(driverVersion = driverVersion.asInstanceOf[js.Any], glDriver = glDriver.asInstanceOf[js.Any], isIntegrated = isIntegrated.asInstanceOf[js.Any], memoryMB = memoryMB.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenGLDeviceInfo]
    }
    
    extension [Self <: OpenGLDeviceInfo](x: Self) {
      
      inline def setDriverVersion(value: String): Self = StObject.set(x, "driverVersion", value.asInstanceOf[js.Any])
      
      inline def setGlDriver(value: String): Self = StObject.set(x, "glDriver", value.asInstanceOf[js.Any])
      
      inline def setIsIntegrated(value: String): Self = StObject.set(x, "isIntegrated", value.asInstanceOf[js.Any])
      
      inline def setMemoryMB(value: Double): Self = StObject.set(x, "memoryMB", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scheduling extends StObject {
    
    var eventLevel: js.UndefOr[Double] = js.undefined
    
    var playLevel: js.UndefOr[Double] = js.undefined
    
    var timeOut: js.UndefOr[Double] = js.undefined
  }
  object Scheduling {
    
    inline def apply(): Scheduling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scheduling]
    }
    
    extension [Self <: Scheduling](x: Self) {
      
      inline def setEventLevel(value: Double): Self = StObject.set(x, "eventLevel", value.asInstanceOf[js.Any])
      
      inline def setEventLevelUndefined: Self = StObject.set(x, "eventLevel", js.undefined)
      
      inline def setPlayLevel(value: Double): Self = StObject.set(x, "playLevel", value.asInstanceOf[js.Any])
      
      inline def setPlayLevelUndefined: Self = StObject.set(x, "playLevel", js.undefined)
      
      inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
    }
  }
}
