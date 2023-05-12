package typings.photoshop

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Shortcut
import typings.photoshop.anon.X
import typings.photoshop.domActionsMod.ActionSet
import typings.photoshop.domCollectionsDocumentsMod.Documents
import typings.photoshop.domCollectionsTextFontsMod.TextFonts
import typings.photoshop.domConstantsMod.ColorModel
import typings.photoshop.domConstantsMod.DialogModes
import typings.photoshop.domConstantsMod.Units
import typings.photoshop.domCoreModulesMod.ActionDescriptor
import typings.photoshop.domDocumentMod.Document
import typings.photoshop.domObjectsColorsMod.NoColor
import typings.photoshop.domObjectsSolidColorMod.SolidColor
import typings.photoshop.domObjectsToolMod.Tool
import typings.photoshop.domPreferencesPreferencesMod.Preferences_
import typings.photoshop.domTypesDocumentTypesMod.DocumentCreateOptions
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
      * Allows for polyfills into the Application object
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop/dom/Photoshop", "default.ColorSampler")
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
      * Allows for polyfills into the Guide class
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop/dom/Photoshop", "default.Guide")
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
      * Allows for polyfills into the LayerComp class
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("photoshop/dom/Photoshop", "default.LayerComp")
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
    @JSImport("photoshop/dom/Photoshop", "default.PathPointInfo")
    @js.native
    /** @ignore */
    open class PathPointInfo ()
      extends typings.photoshop.domObjectsPathPointInfoMod.PathPointInfo
    
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
    @JSImport("photoshop/dom/Photoshop", "default.SubPathInfo")
    @js.native
    /** @ignore */
    open class SubPathInfo ()
      extends typings.photoshop.domObjectsSubPathInfoMod.SubPathInfo
    
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
      * Allows for polyfills into the Application object
      */
    var ColorSampler: Instantiable4[
        /* docId */ Double, 
        /* index */ Double, 
        /* position */ X, 
        /* color */ SolidColor | NoColor, 
        typings.photoshop.domColorSamplerMod.ColorSampler
      ] = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Document class
      */
    var Document: Instantiable1[/* id */ Double, typings.photoshop.domDocumentMod.Document] = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Guide class
      */
    var Guide: Instantiable2[/* id */ Double, /* docId */ Double, typings.photoshop.domGuideMod.Guide] = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Layer class
      */
    var Layer: Instantiable2[/* id */ Double, /* docId */ Double, typings.photoshop.domLayerMod.Layer] = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the LayerComp class
      */
    var LayerComp: Instantiable2[/* id */ Double, /* docId */ Double, typings.photoshop.domLayerCompMod.LayerComp] = js.native
    
    /**
      * @ignore
      */
    var PathPointInfo: Instantiable0[typings.photoshop.domObjectsPathPointInfoMod.PathPointInfo] = js.native
    
    /**
      * @ignore
      * Allows for polyfills into the Application object
      */
    var Photoshop: Instantiable0[typings.photoshop.domPhotoshopMod.Photoshop] = js.native
    
    /**
      * @ignore
      * Exposes SolidColor class for constructing objects
      */
    var SolidColor: Instantiable1[
        /* model */ js.UndefOr[ColorModel], 
        typings.photoshop.domObjectsSolidColorMod.SolidColor
      ] = js.native
    
    /**
      * @ignore
      */
    var SubPathInfo: Instantiable0[typings.photoshop.domObjectsSubPathInfoMod.SubPathInfo] = js.native
    
    /**
      * Returns the action tree shown in Actions panel, as an array of ActionSets, each containing Actions.
      * @minVersion 23.0
      */
    def actionTree: js.Array[ActionSet] = js.native
    
    /**
      * The current document that has the application's focus.
      * @minVersion 23.0
      */
    def activeDocument: Document = js.native
    /**
      * Set the current active document to the provided Document.
      * @minVersion 23.0
      */
    def activeDocument_=(doc: Document): Unit = js.native
    
    /**
      * The background color and color style for documents. [(24.2)](/ps_reference/changelog#other-fixes)
      *
      * @minVersion 23.0
      */
    def backgroundColor: SolidColor = js.native
    def backgroundColor_=(color: SolidColor): Unit = js.native
    
    /**
      * At the heart of all our APIs is batchPlay. It is the evolution of executeAction. It accepts
      * ActionDescriptors deserialized from JS objects, and can play multiple descriptors sequentially
      * without updating the UI. This API is subject to change and may be accessible in other ways in the future.
      * @minVersion 23.0
      */
    def batchPlay(commands: Any, options: Any): js.Promise[js.Array[ActionDescriptor]] = js.native
    
    /**
      * Brings application to focus, useful when your script ends, or requires an input.
      * @minVersion 23.0
      */
    def bringToFront(): Unit = js.native
    
    /**
      * Convert the given value from one unit to another. Available units are:
      * Constants.Units.{CM, MM, INCHES, PIXELS, POINTS, PICAS}.
      * Use [[Document.resolution]] when converting from or to PIXELS.
      * For example, use this routine for converting a document's width from pixels to inches.
      *
      * ```javascript
      * // convert the current document's width to inches
      * const exportDoc = psApp.activeDocument;
      * let widthInInches = psApp.convertUnits(exportDoc.width,
      *                                        Constants.Units.PIXELS,
      *                                        Constant.Units.INCHES,
      *                                        exportDoc.resolution);
      *
      * ```
      * @param fromValue The value that is to be converted.
      * @param fromUnits The unit that the fromValue is in. Use [[Constants.Units]] for valid values.
      * @param toUnits The unit that the return value is in. Use [[Constants.Units]] for valid values.
      * @param resolution The pixels per inch value to use when converting to and from pixel values.
      * @minVersion 23.4
      */
    def convertUnits(fromValue: Double, fromUnits: Units, toUnits: Units): Double = js.native
    def convertUnits(fromValue: Double, fromUnits: Units, toUnits: Units, resolution: Double): Double = js.native
    
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
      *
      * @param options @DocumentCreateOptions
      * @async
      * @minVersion 23.0
      */
    def createDocument(): js.Promise[Document | Null] = js.native
    def createDocument(options: DocumentCreateOptions): js.Promise[Document | Null] = js.native
    
    /* private */ var currentDialogMode: Any = js.native
    
    /**
      * Current selected tool. For now, the Tool class is an object with
      * only an `id` field. In the future, we aim to provide tools with their own classes.
      * @minVersion 23.0
      */
    def currentTool: Tool = js.native
    
    /**
      * The dialog mode for the application, which controls what types of
      * dialogs should be displayed when your code is interacting with Photoshop.
      * @minVersion 23.0
      */
    def displayDialogs: DialogModes = js.native
    def displayDialogs_=(mode: DialogModes): Unit = js.native
    
    /**
      * A list of the documents currently open.
      * @minVersion 23.0
      */
    def documents: Documents = js.native
    
    /**
      * The fonts installed on this system.
      * @minVersion 23.0
      */
    def fonts: TextFonts = js.native
    
    /**
      * The foreground color (used to paint, fill, and stroke selections). [(24.2)](/ps_reference/changelog#other-fixes)
      *
      * @minVersion 23.0
      */
    def foregroundColor: SolidColor = js.native
    def foregroundColor_=(color: SolidColor): Unit = js.native
    
    /**
      * List of installed color profiles, for RGB and Gray modes.
      * @param colorMode Specify which color mode's profiles to list. (default: "RGB", options: "Gray")
      * @minVersion 24.1
      */
    def getColorProfiles(): js.Array[String] = js.native
    def getColorProfiles(colorMode: String): js.Array[String] = js.native
    
    /**
      * Opens the specified document and returns the model
      *
      * > *Note that this API requires a
      * [UXPFileEntry](../../../uxp-api/reference-js/Modules/uxp/Persistent%20File%20Storage/File/)
      * object as its argument.
      *
      * ```javascript
      * // Open a file given entry
      * let entry = await require('uxp').storage.localFileSystem.getFileForOpening()
      * const document = await app.open(entry);
      *
      * // Show open file dialog
      * const document = await app.open();
      * ```
      * @async
      * @minVersion 23.0
      */
    def open(): js.Promise[Document] = js.native
    def open(entry: File): js.Promise[Document] = js.native
    
    /**
      * Contains Photoshop preferences grouped into several categories similar to the Preferences dialog.
      * @minVersion 24.0
      */
    def preferences: Preferences_ = js.native
    
    /**
      * Shows an alert in Photoshop with the given message.
      * @minVersion 23.0
      */
    def showAlert(message: String): js.Promise[Unit] = js.native
    
    /**
      * The class name of the referenced object: *"Photoshop"*.
      * @minVersion 23.0
      */
    def typename: typings.photoshop.photoshopStrings.Photoshop = js.native
    
    /**
      * @ignore
      * Disabled validation checks, use at your own risk!
      */
    def validation_=(enable: Boolean): Unit = js.native
  }
}
