package typings.photoshop

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.photoshop.domActionsMod.ActionSet
import typings.photoshop.domCollectionsDocumentsMod.Documents
import typings.photoshop.domCollectionsTextFontsMod.TextFonts
import typings.photoshop.domConstantsMod.DialogModes
import typings.photoshop.domCoreModulesMod.ActionDescriptor
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domObjectsCreateOptionsMod.DocumentCreateOptions
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import typings.photoshop.domObjectsToolMod.Tool
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domPhotoshopMod {
  
  /** @ignore */
  object default extends Shortcut {
    
    @JSImport("photoshop/dom/Photoshop", JSImport.Default)
    @js.native
    val ^ : Photoshop = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Action class
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop/dom/Photoshop", "default.Action")
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
    @JSImport("photoshop/dom/Photoshop", "default.ActionSet")
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
    @JSImport("photoshop/dom/Photoshop", "default.Document")
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
    @JSImport("photoshop/dom/Photoshop", "default.Layer")
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
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("photoshop/dom/Photoshop", "default.Photoshop")
    @js.native
    /**
      * @ignore
      */
    open class PhotoshopCls () extends Photoshop
    
    /**
      * @ignore
      * Exposes SolidColor class for constructing objects
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop/dom/Photoshop", "default.SolidColor")
    @js.native
    open class SolidColor ()
      extends typings.photoshop.domObjectsSolidColorMod.SolidColor
    
    type _To = Photoshop
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: Photoshop = ^
  }
  
  @JSImport("photoshop/dom/Photoshop", "Photoshop")
  @js.native
  /**
    * @ignore
    */
  open class Photoshop () extends StObject {
    
    /**
      * @ignore
      * Allows for polyfills into the Action class
      */
    var Action: Instantiable1[/* id */ Double, typings.photoshop.domActionsMod.Action] = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Action Set class
      */
    var ActionSet: Instantiable1[/* id */ Any, typings.photoshop.domActionsMod.ActionSet] = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Document class
      */
    var Document: Instantiable1[/* id */ Double, typings.photoshop.domDocumentMod.Document] = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Layer class
      */
    var Layer: Instantiable2[/* id */ Double, /* docId */ Double, typings.photoshop.domLayerMod.Layer] = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Application object
      */
    var Photoshop: Instantiable0[typings.photoshop.domPhotoshopMod.Photoshop] = js.native
    
    /**
      * @ignore
      * Exposes SolidColor class for constructing objects
      */
    var SolidColor: Instantiable0[typings.photoshop.domObjectsSolidColorMod.SolidColor] = js.native
    
    /**
      * Returns the action tree shown in Actions panel, as an array of ActionSets, each containing actions
      */
    def actionTree: js.Array[ActionSet] = js.native
    
    /**
      * The current active document
      */
    def activeDocument: Document = js.native
    /**
      * Set the current active document to the provided Document
      */
    def activeDocument_=(doc: Document): Unit = js.native
    
    /**
      * The default background color and color style for documents.
      */
    def backgroundColor: SolidColor = js.native
    
    /**
      * At the heart of all our APIs is batchPlay. It is the evolution of executeAction. It accepts
      * ActionDescriptors deserialized from JS objects, and can play multiple descriptors sequentially
      * without updating the UI. This API is subject to change and may be accessible in other ways in the future.
      *
      */
    def batchPlay(commands: Any, options: Any): js.Promise[js.Array[ActionDescriptor]] = js.native
    
    /**
      * Brings application to focus, useful when your script ends, or requires an input
      */
    def bringToFront(): Unit = js.native
    
    /**
      * Create a new document.
      *
      * No options will create a document of 7 x 5 inches at 300 pixels per inch.
      * This is the same as the "Default Photoshop Size" preset.
      *
      * An object with a 'preset' string parameter can be used to specify any of
      * the other presets that come installed with Photoshop or created by users.
      *
      * An object with one or more parameters can also be supplied. Any parameter
      * missing will be set to the default of: width 2100 pixels, height 1500 pixels,
      * resolution 300 pixels per inch, mode: @RGBColorMode and a fill of white with
      * no transparency.
      *
      * @param options @DocumentCreateOptions
      *
      * @async
      * ```javascript
      * // "Default Photoshop Size" 7x5 inches at 300ppi
      * let newDoc1 = await app.documents.add();
      * let newDoc2 = await app.documents.add({
      *    width: 800,
      *    height: 600,
      *    resolution: 300,
      *    mode: "RGBColorMode",
      *    fill: "transparent"
      * });
      * let newDoc3 = await app.documents.add({preset: "My Default Size 1"});
      * ```
      */
    def createDocument(): js.Promise[Document | Null] = js.native
    def createDocument(options: DocumentCreateOptions): js.Promise[Document | Null] = js.native
    
    /* private */ var currentDialogMode: Any = js.native
    
    /**
      * Current selected tool. For now, the Tool class is an object with
      * only an `id` field. In the future, we aim to provide tools with their own classes
      */
    def currentTool: Tool = js.native
    
    /**
      * The dialog mode for the application, which controls what types of
      * dialogs should be displayed when your plugin is interacting with Photoshop.
      */
    def displayDialogs: DialogModes = js.native
    def displayDialogs_=(mode: DialogModes): Unit = js.native
    
    /**
      * A list of the documents currently open
      */
    def documents: Documents = js.native
    
    /**
      * The fonts installed on this system.
      */
    def fonts: TextFonts = js.native
    
    /**
      * The default foreground color (used to paint, fill, and stroke selections)
      */
    def foregroundColor: SolidColor = js.native
    def foregroundColor_=(color: SolidColor): Unit = js.native
    
    /**
      * Opens the specified document and returns it's model
      *
      * > (0.4.0) Please note that this API now requires you to provide a UXPFileEntry
      *
      * @async
      *
      * ```javascript
      * // Open a file given entry
      * let entry = await require('uxp').storage.localFileSystem.getFileForOpening()
      * const document = await app.open(entry);
      *
      * // Show open file dialog
      * const document = await app.open();
      * ```
      */
    def open(): js.Promise[Document] = js.native
    def open(entry: File): js.Promise[Document] = js.native
    
    /**
      * Shows an alert in Photoshop with the given message
      */
    def showAlert(message: String): js.Promise[Unit] = js.native
    
    /**
      * The class name of the referenced Photoshop object
      */
    def typename: String = js.native
    
    /**
      * @ignore
      * Disabled validation checks, use at your own risk!
      */
    def validation_=(enable: Boolean): Unit = js.native
  }
}
