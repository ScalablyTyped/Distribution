package typings.photoshop

import org.scalablytyped.runtime.Shortcut
import typings.photoshop.anon.ClassID
import typings.photoshop.anon.CommandID
import typings.photoshop.anon.Height
import typings.photoshop.anon.MenuID
import typings.photoshop.anon.Message
import typings.photoshop.anon.TypeofphotoshopAction
import typings.photoshop.anon.TypeofphotoshopCore
import typings.photoshop.domCoreModulesMod.ActionDescriptor
import typings.photoshop.domCoreModulesMod.BatchPlayCommandOptions
import typings.photoshop.domCoreModulesMod.CPUInfo
import typings.photoshop.domCoreModulesMod.ColorConversionModel
import typings.photoshop.domCoreModulesMod.ExecuteAsModalOptions
import typings.photoshop.domCoreModulesMod.ExecutionContext
import typings.photoshop.domCoreModulesMod.GPUInfo
import typings.photoshop.domCoreModulesMod.NotificationListener
import typings.photoshop.domPhotoshopMod.Photoshop
import typings.photoshop.utilColorTypesMod.ColorDescriptor
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
    open class SolidColor ()
      extends typings.photoshop.domObjectsSolidColorMod.SolidColor
    
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
      * API Version declared by the plugin's manifest.json under `host.data.apiVersion` field.
      *
      * If value 1, you will have access to Photoshop 22.0 DOM and be able to make mutable calls outside a modal state.
      * If 2, you will have access to latest DOM, modal execution and everything else new we're adding.
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
}
