package typings.photoshop

import typings.photoshop.domConstantsMod.ResampleMethod
import typings.photoshop.domCoreModulesMod.ActionDescriptor
import typings.photoshop.domCoreModulesMod.BatchPlayCommandOptions
import typings.photoshop.domCoreModulesMod.CPUInfo
import typings.photoshop.domCoreModulesMod.ColorConversionModel
import typings.photoshop.domCoreModulesMod.ExecuteAsModalOptions
import typings.photoshop.domCoreModulesMod.ExecutionContext
import typings.photoshop.domCoreModulesMod.GPUInfo
import typings.photoshop.domCoreModulesMod.NotificationListener
import typings.photoshop.domCoreModulesMod.Scheduling
import typings.photoshop.domObjectsMod.BMPSaveOptions
import typings.photoshop.domObjectsMod.GIFSaveOptions
import typings.photoshop.domObjectsMod.JPEGSaveOptions
import typings.photoshop.domObjectsMod.PNGSaveOptions
import typings.photoshop.domObjectsMod.PhotoshopSaveOptions
import typings.photoshop.photoshopStrings.angleUnit
import typings.photoshop.photoshopStrings.document
import typings.photoshop.utilColorTypesMod.ColorDescriptor
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
      */
    /**
      * Save the document as a JPG file.
      * @param entry UXP File token generated from the UXP Storage APIs.
      * @param saveOptions JPEG specific save options. See SaveOptions/JPEGSaveOptions.
      * @param asCopy Whether to save as a copy.
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
      */
    def psd(entry: File): js.Promise[scala.Unit] = js.native
    def psd(entry: File, saveOptions: scala.Unit, asCopy: Boolean): js.Promise[scala.Unit] = js.native
    def psd(entry: File, saveOptions: PhotoshopSaveOptions): js.Promise[scala.Unit] = js.native
    def psd(entry: File, saveOptions: PhotoshopSaveOptions, asCopy: Boolean): js.Promise[scala.Unit] = js.native
  }
  
  trait ClassID extends StObject {
    
    var classID: String
    
    var isModal: Boolean
    
    var key: String
    
    var title: String
  }
  object ClassID {
    
    inline def apply(classID: String, isModal: Boolean, key: String, title: String): ClassID = {
      val __obj = js.Dynamic.literal(classID = classID.asInstanceOf[js.Any], isModal = isModal.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClassID] (val x: Self) extends AnyVal {
      
      inline def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      inline def setIsModal(value: Boolean): Self = StObject.set(x, "isModal", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandID extends StObject {
    
    var commandID: Double
    
    var scheduling: js.UndefOr[Scheduling] = js.undefined
  }
  object CommandID {
    
    inline def apply(commandID: Double): CommandID = {
      val __obj = js.Dynamic.literal(commandID = commandID.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandID] (val x: Self) extends AnyVal {
      
      inline def setCommandID(value: Double): Self = StObject.set(x, "commandID", value.asInstanceOf[js.Any])
      
      inline def setScheduling(value: Scheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
    }
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
  
  trait HistoryStateInfo extends StObject {
    
    var historyStateInfo: typings.photoshop.domCoreModulesMod.HistoryStateInfo
  }
  object HistoryStateInfo {
    
    inline def apply(historyStateInfo: typings.photoshop.domCoreModulesMod.HistoryStateInfo): HistoryStateInfo = {
      val __obj = js.Dynamic.literal(historyStateInfo = historyStateInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistoryStateInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HistoryStateInfo] (val x: Self) extends AnyVal {
      
      inline def setHistoryStateInfo(value: typings.photoshop.domCoreModulesMod.HistoryStateInfo): Self = StObject.set(x, "historyStateInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var _id: Double
    
    var _ref: document
  }
  object Id {
    
    inline def apply(_id: Double): Id = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _ref = "document")
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def set_id(value: Double): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_ref(value: document): Self = StObject.set(x, "_ref", value.asInstanceOf[js.Any])
    }
  }
  
  trait Interpolation extends StObject {
    
    var interpolation: js.UndefOr[ResampleMethod] = js.undefined
  }
  object Interpolation {
    
    inline def apply(): Interpolation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interpolation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Interpolation] (val x: Self) extends AnyVal {
      
      inline def setInterpolation(value: ResampleMethod): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    }
  }
  
  trait MenuID extends StObject {
    
    var commandID: js.UndefOr[Double] = js.undefined
    
    var menuID: js.UndefOr[Double] = js.undefined
    
    var scheduling: js.UndefOr[Scheduling] = js.undefined
  }
  object MenuID {
    
    inline def apply(): MenuID = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuID]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuID] (val x: Self) extends AnyVal {
      
      inline def setCommandID(value: Double): Self = StObject.set(x, "commandID", value.asInstanceOf[js.Any])
      
      inline def setCommandIDUndefined: Self = StObject.set(x, "commandID", js.undefined)
      
      inline def setMenuID(value: Double): Self = StObject.set(x, "menuID", value.asInstanceOf[js.Any])
      
      inline def setMenuIDUndefined: Self = StObject.set(x, "menuID", js.undefined)
      
      inline def setScheduling(value: Scheduling): Self = StObject.set(x, "scheduling", value.asInstanceOf[js.Any])
      
      inline def setSchedulingUndefined: Self = StObject.set(x, "scheduling", js.undefined)
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
  
  trait Name extends StObject {
    
    var name: String
    
    var target: js.Object
  }
  object Name {
    
    inline def apply(name: String, target: js.Object): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResumeHistory extends StObject {
    
    /**
      * Call to resume history on a target document
      */
    def resumeHistory(suspensionID: Double): scala.Unit
    
    /**
      * Call to suspend history on a target document, returns the suspension ID which can be used for resumeHistory
      */
    def suspendHistory(info: HistoryStateInfo): js.Promise[Double]
  }
  object ResumeHistory {
    
    inline def apply(resumeHistory: Double => scala.Unit, suspendHistory: HistoryStateInfo => js.Promise[Double]): ResumeHistory = {
      val __obj = js.Dynamic.literal(resumeHistory = js.Any.fromFunction1(resumeHistory), suspendHistory = js.Any.fromFunction1(suspendHistory))
      __obj.asInstanceOf[ResumeHistory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResumeHistory] (val x: Self) extends AnyVal {
      
      inline def setResumeHistory(value: Double => scala.Unit): Self = StObject.set(x, "resumeHistory", js.Any.fromFunction1(value))
      
      inline def setSuspendHistory(value: HistoryStateInfo => js.Promise[Double]): Self = StObject.set(x, "suspendHistory", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TypeofphotoshopAction extends StObject {
    
    /**
      * Attach a listener to a Photoshop event. A callback in the form
      * of `(eventName: string, descriptor: Descriptor) => void` will be performed.
      * ```javascript
      * await PhotoshopAction.addNotificationListener(['open'], onOpenNewDocument)
      * ```
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
      */
    def batchPlay(commands: js.Array[ActionDescriptor]): js.Promise[js.Array[ActionDescriptor]] = js.native
    def batchPlay(commands: js.Array[ActionDescriptor], options: BatchPlayCommandOptions): js.Promise[js.Array[ActionDescriptor]] = js.native
    
    /**
      * Detaches a listener from a Photoshop event.
      * @see addNotificationListener
      * ```javascript
      * await PhotoshopAction.removeNotificationListener(['open'], onOpenNewDocument)
      * ```
      */
    def removeNotificationListener(events: js.Array[String], notifier: NotificationListener): js.Promise[scala.Unit] = js.native
  }
  
  @js.native
  trait TypeofphotoshopCore extends StObject {
    
    /**
      * API Version declared by the plugin's manifest.json under `host.data.apiVersion` field.
      *
      * If value 1, you will have access to Photoshop 22.0 DOM and be able to make mutable calls outside a modal state.
      * If 2, you will have access to latest DOM, modal execution and everything else new we're adding.
      */
    var apiVersion: Double = js.native
    
    /**
      * Returns the effective size of a dialog.
      * ```javascript
      * var idealSize = { width: 200, height: 500 }
      * { width, height} = await PhotoshopCore.calculateDialogSize(idealSize)
      * ```
      */
    def calculateDialogSize(preferredSize: Height): js.Promise[Height] = js.native
    def calculateDialogSize(preferredSize: Height, identifier: String): js.Promise[Height] = js.native
    def calculateDialogSize(preferredSize: Height, identifier: String, minimumSize: Height): js.Promise[Height] = js.native
    def calculateDialogSize(preferredSize: Height, identifier: scala.Unit, minimumSize: Height): js.Promise[Height] = js.native
    
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
    def convertColor(sourceColor: ColorDescriptor, targetModel: ColorConversionModel): ColorDescriptor = js.native
    
    /**
      * End the current modal tool editing state.
      * ```javascript
      * // close the modal dialog, cancelling changes
      * await PhotoshopCore.endModalToolState(false)
      * ```
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
      */
    def executeAsModal(
      targetFunction: js.Function1[/* executionContext */ ExecutionContext, js.Promise[Any]],
      options: ExecuteAsModalOptions
    ): js.Promise[scala.Unit] = js.native
    
    /**
      * Returns information about the active Photoshop tool.
      * ```javascript
      * { title } = await PhotoshopCore.getActiveTool()
      * ```
      */
    def getActiveTool(): js.Promise[ClassID] = js.native
    
    /**
      * Returns information about the host CPU.
      * ```javascript
      * { logicalCores, frequencyMhz, vendor } = PhotoshopCore.getCPUInfo()
      * var isAMD = vendor === "AMD"
      * var isARM = vendor === "ARM"
      * ```
      */
    def getCPUInfo(): CPUInfo = js.native
    
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
    def getGPUInfo(): GPUInfo = js.native
    
    /**
      * Returns whether a command menu item is available for invoking.
      * ```javascript
      * // can a Fill be performed?
      * var canFill = await PhotoshopCore.getMenuCommandState({ commandID: 1042 })
      * ```
      */
    def getMenuCommandState(options: CommandID): js.Promise[Boolean] = js.native
    
    /**
      * Returns the localized menu title of the menu command item.
      * ```javascript
      * var renameLayerStr = await PhotoshopCore.getMenuCommandTitle({ commandID: 2983 })
      * ```
      */
    def getMenuCommandTitle(options: MenuID): js.Promise[String] = js.native
    
    /**
      * Invokes the menu command via its `commandID`. Returns false
      * on failure, or if the command is not available.
      * ```javascript
      * // select all
      * await PhotoshopCore.performMenuCommand({ commandID: 1017 })
      * ```
      */
    def performMenuCommand(options: CommandID): js.Promise[Boolean] = js.native
    
    /**
      * Show a generic alert box to the user. 'OK' to dismiss.
      * ```javascript
      * // script has completed.
      * await PhotoshopCore.showAlert({ message: 'Operation successful'})
      * ```
      */
    def showAlert(options: Message): js.Promise[scala.Unit] = js.native
    
    /**
      * Given a Photoshop ZString (of format `"$$$/slash/separated/key=english default value"`),
      * will return the translated string for the current UI language
      */
    def translateUIString(zstring: String): String = js.native
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
}
