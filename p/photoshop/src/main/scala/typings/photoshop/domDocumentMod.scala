package typings.photoshop

import typings.photoshop.anon.Bmp
import typings.photoshop.anon.ResumeHistory
import typings.photoshop.domChannelMod.Channel
import typings.photoshop.domCollectionsChannelsMod.Channels
import typings.photoshop.domCollectionsGuidesMod.Guides
import typings.photoshop.domCollectionsHistoryStatesMod.HistoryStates
import typings.photoshop.domCollectionsLayersMod.Layers
import typings.photoshop.domConstantsMod.AnchorPosition
import typings.photoshop.domConstantsMod.BitsPerChannelType
import typings.photoshop.domConstantsMod.ChangeMode
import typings.photoshop.domConstantsMod.ColorProfileType
import typings.photoshop.domConstantsMod.DocumentMode
import typings.photoshop.domConstantsMod.Intent
import typings.photoshop.domConstantsMod.ResampleMethod
import typings.photoshop.domConstantsMod.SaveOptions
import typings.photoshop.domConstantsMod.TrimType
import typings.photoshop.domCoreModulesMod.ExecutionContext
import typings.photoshop.domHistoryStateMod.HistoryState
import typings.photoshop.domLayerMod.Layer
import typings.photoshop.domObjectsBoundsMod.Bounds
import typings.photoshop.domObjectsConversionOptionsMod.BitmapConversionOptions
import typings.photoshop.domObjectsConversionOptionsMod.IndexedConversionOptions
import typings.photoshop.domObjectsCreateOptionsMod.GroupLayerCreateOptions
import typings.photoshop.domObjectsCreateOptionsMod.LayerCreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domDocumentMod {
  
  @JSImport("photoshop/dom/Document", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("photoshop/dom/Document", "Document")
  @js.native
  open class Document protected () extends StObject {
    /**
      * @ignore
      */
    def this(id: Double) = this()
    
    /**
      * Currently active channels of the document
      */
    def activeChannels: js.Array[Channel] = js.native
    def activeChannels_=(channels: js.Array[Channel]): Unit = js.native
    
    /**
      * The history state that history brush tool will use as its source
      */
    def activeHistoryBrushSource: HistoryState = js.native
    def activeHistoryBrushSource_=(historyState: HistoryState): Unit = js.native
    
    /**
      * Currently active history state of the document
      */
    def activeHistoryState: HistoryState = js.native
    /**
      * Selects the given history state to be the active one
      */
    def activeHistoryState_=(historyState: HistoryState): Unit = js.native
    
    /**
      * The selected layers in the document
      */
    def activeLayers: Layers = js.native
    
    /**
      * The artboards in the document
      */
    def artboards: Layers = js.native
    
    /**
      * Background layer, if it exists
      */
    def backgroundLayer: Layer | Null = js.native
    
    /**
      * The bits per color channel.
      */
    def bitsPerChannel: BitsPerChannelType = js.native
    def bitsPerChannel_=(bitDepth: BitsPerChannelType): Unit = js.native
    
    /**
      * Changes the color profile of the document
      * @async
      */
    def changeMode(mode: ChangeMode): js.Promise[Unit] = js.native
    def changeMode(mode: ChangeMode, options: BitmapConversionOptions): js.Promise[Unit] = js.native
    def changeMode(mode: ChangeMode, options: IndexedConversionOptions): js.Promise[Unit] = js.native
    
    /**
      * All channels in the document.
      */
    def channels: Channels = js.native
    
    /**
      * Closes the document, showing a prompt to save
      * unsaved changes if specified
      *
      * @param saveOptions By default, prompts a save dialog
      *                    if there are unsaved changes
      *
      * @async
      */
    def close(): js.Promise[Unit] = js.native
    def close(saveDialogOptions: SaveOptions): js.Promise[Unit] = js.native
    
    /**
      * Close the document, reverting all unsaved changes.
      */
    def closeWithoutSaving(): Unit = js.native
    
    /**
      * This document is in the Adobe Creative Cloud.
      */
    def cloudDocument: Boolean = js.native
    
    /**
      * Local directory for this cloud document.
      */
    def cloudWorkAreaDirectory: String = js.native
    
    /**
      * Name of the color profile.
      *
      * Valid only when [[colorProfileType]] is `CUSTOM` or `WORKING`, returns "None" otherwise
      */
    def colorProfileName: String = js.native
    def colorProfileName_=(profile: String): Unit = js.native
    
    /**
      * Whether the document uses the working color profile, a custom profile, or no profile.
      */
    def colorProfileType: ColorProfileType = js.native
    def colorProfileType_=(`type`: ColorProfileType): Unit = js.native
    
    /**
      * Composite channels in the document.
      */
    def compositeChannels: js.Array[Channel] = js.native
    
    /**
      * Changes the color profile.
      *
      * `destinationProfile` must be either a string that names the color mode,
      * or one of these below, meaning of the working color spaces or Lab color.
      *
      * `"Working RGB", "Working CMYK", "Working Gray", "Lab Color"`
      *
      * @async
      */
    def convertProfile(destinationProfile: String, intent: Intent): js.Promise[Unit] = js.native
    def convertProfile(destinationProfile: String, intent: Intent, blackPointCompensation: Boolean): js.Promise[Unit] = js.native
    def convertProfile(destinationProfile: String, intent: Intent, blackPointCompensation: Boolean, dither: Boolean): js.Promise[Unit] = js.native
    def convertProfile(destinationProfile: String, intent: Intent, blackPointCompensation: Unit, dither: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Create a layer. See @CreateOptions
      * ```javascript
      * const myEmptyLayer = await doc.createLayer()
      * const myLayer = await doc.createLayer({ name: "myLayer", opacity: 80, mode: "colorDodge" })
      * ```
      * @async
      */
    def createLayer(): js.Promise[Layer | Null] = js.native
    def createLayer(options: LayerCreateOptions): js.Promise[Layer | Null] = js.native
    
    /**
      * Create a layer group. See [[GroupLayerCreateOptions]]
      * ```javascript
      * const myEmptyGroup = await doc.createLayerGroup()
      * const myGroup = await doc.createLayerGroup({ name: "myLayer", opacity: 80, mode: "colorDodge" })
      * const nonEmptyGroup = await doc.createLayerGroup({ name: "group", fromLayers: [layer1, layer2] })
      * ```
      * @async
      */
    def createLayerGroup(): js.Promise[Layer | Null] = js.native
    def createLayerGroup(options: GroupLayerCreateOptions): js.Promise[Layer | Null] = js.native
    
    /**
      * Crops the document to given bounds
      *
      * @async
      */
    def crop(bounds: Bounds): js.Promise[Unit] = js.native
    def crop(bounds: Bounds, angle: Double): js.Promise[Unit] = js.native
    def crop(bounds: Bounds, angle: Double, width: Double): js.Promise[Unit] = js.native
    def crop(bounds: Bounds, angle: Double, width: Double, height: Double): js.Promise[Unit] = js.native
    def crop(bounds: Bounds, angle: Double, width: Unit, height: Double): js.Promise[Unit] = js.native
    def crop(bounds: Bounds, angle: Unit, width: Double): js.Promise[Unit] = js.native
    def crop(bounds: Bounds, angle: Unit, width: Double, height: Double): js.Promise[Unit] = js.native
    def crop(bounds: Bounds, angle: Unit, width: Unit, height: Double): js.Promise[Unit] = js.native
    
    /**
      * Creates a duplicate of the document, making the duplicate active.
      *
      * The optional parameter `name` provides the name for the duplicated document.
      *
      * The optional parameter `mergeLayersOnly` indicates whether to only duplicate merged layers.
      */
    def duplicate(): js.Promise[Document] = js.native
    def duplicate(name: String): js.Promise[Document] = js.native
    def duplicate(name: String, mergeLayersOnly: Boolean): js.Promise[Document] = js.native
    def duplicate(name: Unit, mergeLayersOnly: Boolean): js.Promise[Document] = js.native
    
    /**
      * Duplicates given layer(s), creating all copies above the top most one in layer stack,
      * and returns the newly created layers.
      * ```javascript
      * // duplicate some layers
      * const layerCopies = await document.duplicateLayers([layer1, layer3])
      * layerCopies.forEach((layer) => { layer.blendMode = 'multiply' })
      * // ...to another document
      * const finalDoc = await photoshop.open('~/path/to/collated/image.psd')
      * await document.duplicateLayers([logo1, textLayer1], finalDoc)
      * await finalDoc.close(SaveOptions.SAVECHANGES)
      * ```
      * @param layers
      * @param targetDocument if specified, duplicate to a different document target.
      *
      * @async
      */
    def duplicateLayers(layers: js.Array[Layer]): js.Promise[js.Array[Layer]] = js.native
    def duplicateLayers(layers: js.Array[Layer], targetDocument: Document): js.Promise[js.Array[Layer]] = js.native
    
    /**
      * Flatten all layers in the document
      * @async
      */
    def flatten(): js.Promise[Unit] = js.native
    
    /**
      * Create a layer group from existing layers.
      * ```javascript
      * const layers = doc.layers
      * const group = await doc.groupLayers([layers[1], layers[2], layers[4]])
      * ```
      * @async
      */
    def groupLayers(layers: js.Array[Layer]): js.Promise[Layer | Null] = js.native
    
    def guides: Guides = js.native
    
    /**
      * Document's height in pixels
      */
    def height: Double = js.native
    
    /**
      * A histogram containing the number of pixels at each color
      * intensity level for the composite channel. The array contains 256
      * members.
      *
      * Valid only when [[mode]] = `DocumentMode.{RGB,CMYK,INDEXEDCOLOR}`
      */
    def histogram: js.Array[Double] = js.native
    
    /**
      * History states of the document
      */
    def historyStates: HistoryStates = js.native
    
    /**
      * The internal ID of this document, valid as long as this document is open
      * Can be used for batchPlay calls to refer to this document, used internally
      */
    def id: Double = js.native
    
    /**
      * All the layers in the document at the top level
      */
    def layers: Layers = js.native
    
    /**
      * Links layers together if possible, and returns a list of linked layers.
      * @param layers array of layers to link together
      * @returns array of successfully linked layers
      */
    def linkLayers(layers: js.Array[Layer]): js.Array[Layer] = js.native
    
    /**
      * Merges all visible layers in the document into a single layer.
      * @async
      */
    def mergeVisibleLayers(): js.Promise[Unit] = js.native
    
    /**
      * The color profile. To change it, please use [[Document.changeMode]]
      */
    def mode: DocumentMode = js.native
    
    /**
      * The name of the document
      */
    def name: String = js.native
    
    /**
      * Pastes the contents of the clipboard into the document. If the optional argument is
      * set to true and a selection is active, the contents are pasted into the selection.
      * @param intoSelection
      *
      * @async
      */
    def paste(): js.Promise[Layer | Null] = js.native
    def paste(intoSelection: Boolean): js.Promise[Layer | Null] = js.native
    
    /**
      * Full file system path to this document, or the identifier if it is a cloud document
      */
    def path: String = js.native
    
    /**
      * The (custom) pixel aspect ratio to use
      */
    def pixelAspectRatio: Double = js.native
    def pixelAspectRatio_=(newValue: Double): Unit = js.native
    
    /**
      * The state of Quick Mask mode. If true, the app is in Quick Mask mode.
      */
    def quickMaskMode: Boolean = js.native
    def quickMaskMode_=(qmMode: Boolean): Unit = js.native
    
    /**
      * Rasterizes all layers.
      * @async
      */
    def rasterizeAllLayers(): js.Promise[Unit] = js.native
    
    /**
      * Changes the size of the canvas, but does not change image size
      * To change the image size, see [[resizeImage]]
      *
      *
      * ```javascript
      * // grow the canvas by 400px
      * let width = await document.width
      * let height = await document.height
      * await document.resizeCanvas(width + 400, height + 400)
      * ```
      * @param width Numeric value of new width in pixels
      * @param height Numeric value of new height in pixels
      * @param anchor Anchor point for resizing, by default will resize an equal amount on all sides.
      *
      * @async
      */
    def resizeCanvas(width: Double, height: Double): js.Promise[Unit] = js.native
    def resizeCanvas(width: Double, height: Double, anchor: AnchorPosition): js.Promise[Unit] = js.native
    
    /**
      * Changes the size of the image
      *
      * ```javascript
      * await document.resizeImage(800, 600)
      * ```
      * @param width Numeric value of new width in pixels
      * @param height Numeric value of new height in pixels
      * @param resolution Image resolution in pixels per inch (ppi)
      * @param resampleMethod Method used during image interpolation.
      * @param amount Numeric value that controls the amount of noise value when using preserve details 0..100
      *
      * @async
      */
    def resizeImage(): js.Promise[Unit] = js.native
    def resizeImage(width: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Double, resolution: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Double, resolution: Double, resampleMethod: Unit, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Double, resolution: Double, resampleMethod: ResampleMethod): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Double, resolution: Double, resampleMethod: ResampleMethod, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Double, resolution: Unit, resampleMethod: Unit, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Double, resolution: Unit, resampleMethod: ResampleMethod): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Double, resolution: Unit, resampleMethod: ResampleMethod, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Unit, resolution: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Unit, resolution: Double, resampleMethod: Unit, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Unit, resolution: Double, resampleMethod: ResampleMethod): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Unit, resolution: Double, resampleMethod: ResampleMethod, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Unit, resolution: Unit, resampleMethod: Unit, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Unit, resolution: Unit, resampleMethod: ResampleMethod): js.Promise[Unit] = js.native
    def resizeImage(width: Double, height: Unit, resolution: Unit, resampleMethod: ResampleMethod, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Double, resolution: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Double, resolution: Double, resampleMethod: Unit, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Double, resolution: Double, resampleMethod: ResampleMethod): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Double, resolution: Double, resampleMethod: ResampleMethod, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Double, resolution: Unit, resampleMethod: Unit, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Double, resolution: Unit, resampleMethod: ResampleMethod): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Double, resolution: Unit, resampleMethod: ResampleMethod, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Unit, resolution: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Unit, resolution: Double, resampleMethod: Unit, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Unit, resolution: Double, resampleMethod: ResampleMethod): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Unit, resolution: Double, resampleMethod: ResampleMethod, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Unit, resolution: Unit, resampleMethod: Unit, amount: Double): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Unit, resolution: Unit, resampleMethod: ResampleMethod): js.Promise[Unit] = js.native
    def resizeImage(width: Unit, height: Unit, resolution: Unit, resampleMethod: ResampleMethod, amount: Double): js.Promise[Unit] = js.native
    
    /**
      * Document's resolution (in pixels per inch)
      */
    def resolution: Double = js.native
    
    /**
      * Expands the document to show clipped sections.
      * @async
      */
    def revealAll(): js.Promise[Unit] = js.native
    
    /**
      * Rotates the image clockwise in given angle, expanding canvas if necessary. (Previously rotateCanvas)
      * @param angle
      *
      * @async
      */
    def rotate(angles: Double): js.Promise[Unit] = js.native
    
    /**
      * Performs a save of the document. The user will be presented with
      * a Save dialog if the file has yet to be saved on disk.
      *
      * ```javascript
      * // To save a document in the current location
      * document.save()
      *
      * // Shows the save dialog
      * unsavedDocument.save()
      * ```
      *
      * @async
      */
    def save(): js.Promise[Unit] = js.native
    
    /**
      * Save the document to a desired file type.
      *
      * For operations that require a UXP File token, use the UXP storage APIs to generate one.
      * See https://www.adobe.com/go/ps-api-uxp-filesystemprovider.
      *
      *
      * ```javascript
      * let entry = await require('uxp').storage.localFileSystem.getFileForSaving("target.psd");
      * document.saveAs.psd(entry);
      *
      * // Save as a Copy (High JPG quality)
      * document.saveAs.jpg(entryJpg, { quality: 12 }, true);
      *
      * // Save a PSB, with some options:
      * document.saveAs.psb(entryPsb, { embedColorProfile: true });
      *
      * ```
      */
    var saveAs: Bmp = js.native
    
    /**
      * True if the document has been saved since the last change.
      */
    def saved: Boolean = js.native
    
    /**
      * Splits the document channels into separate, single-channel
      * documents.
      * @async
      */
    def splitChannels(): js.Promise[js.Array[Document]] = js.native
    
    /**
      * Creates a single history state encapsulating everything that is done
      * in the callback, only for this document. All changes to the document should
      * be done in this callback.
      *
      * Note: If you make changes to any other document, those changes will
      * not be suspended in the same history state.
      *
      * The callback is passed in a SuspendHistoryContext object,
      * which contains the current document in a variable `document`.
      *
      * For more info and advanced context, see [`core.executeAsModal`](../media/executeAsModal)
      * API, for which this API is a simple wrapper for.
      *
      * ```javascript
      *    require("photoshop").app.activeDocument.suspendHistory(async (context) => {
      *        // context.document is the `app.activeDocument`
      *        context.document.activeLayers[0].name = "Changed name";
      *    });
      * ```
      */
    def suspendHistory(callback: js.Function1[/* e */ SuspendHistoryContext, Unit], historyStateName: String): js.Promise[Any] = js.native
    
    /**
      * Document title
      */
    def title: String = js.native
    
    /**
      * Applies trapping to a CMYK document.
      *
      * Valid only when [[Document.mode]] is `Constants.DocumentMode.CMYK`
      *
      * @async
      */
    def trap(width: Double): js.Promise[Unit] = js.native
    
    /**
      * Trims the transparent area around the image on the specified sides of the canvas
      * base on trimType
      *
      * @param trimType
      * @param top
      * @param left
      * @param bottom
      * @param right
      *
      * @async
      */
    def trim(trimType: TrimType): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Boolean, left: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Boolean, left: Boolean, bottom: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Boolean, left: Boolean, bottom: Boolean, right: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Boolean, left: Boolean, bottom: Unit, right: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Boolean, left: Unit, bottom: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Boolean, left: Unit, bottom: Boolean, right: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Boolean, left: Unit, bottom: Unit, right: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Unit, left: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Unit, left: Boolean, bottom: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Unit, left: Boolean, bottom: Boolean, right: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Unit, left: Boolean, bottom: Unit, right: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Unit, left: Unit, bottom: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Unit, left: Unit, bottom: Boolean, right: Boolean): js.Promise[Unit] = js.native
    def trim(trimType: TrimType, top: Unit, left: Unit, bottom: Unit, right: Boolean): js.Promise[Unit] = js.native
    
    /**
      * The class name of the referenced Document object
      */
    def typename: String = js.native
    
    /**
      * Document's width in pixels
      */
    def width: Double = js.native
  }
  
  inline def PSDocument(id: Double): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("PSDocument")(id.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  inline def validateDocument(d: Document): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateDocument")(d.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait SuspendHistoryContext
    extends StObject
       with ExecutionContext {
    
    var document: Document
  }
  object SuspendHistoryContext {
    
    inline def apply(
      document: Document,
      hostControl: ResumeHistory,
      isCancelled: Boolean,
      onCancel: Unit,
      reportProgress: Unit
    ): SuspendHistoryContext = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], hostControl = hostControl.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any], onCancel = onCancel.asInstanceOf[js.Any], reportProgress = reportProgress.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuspendHistoryContext]
    }
    
    extension [Self <: SuspendHistoryContext](x: Self) {
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    }
  }
}
