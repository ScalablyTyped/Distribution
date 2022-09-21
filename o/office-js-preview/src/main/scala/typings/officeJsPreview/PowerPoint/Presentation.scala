package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.PowerPoint.Interfaces.PresentationData
import typings.officeJsPreview.PowerPoint.Interfaces.PresentationLoadOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @remarks
  * [Api set: PowerPointApi 1.0]
  */
@js.native
trait Presentation
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Presentation: RequestContext = js.native
  
  /**
    * Returns the selected shapes in the current slide of the presentation.
    If no shapes are selected, an empty collection is returned.
    *
    * @remarks
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getSelectedShapes(): ShapeScopedCollection = js.native
  
  /**
    * Returns the selected slides in the current view of the presentation.
    The first item in the collection is the active slide that is visible in the editing area.
    If no slides are selected, an empty collection is returned.
    *
    * @remarks
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getSelectedSlides(): SlideScopedCollection = js.native
  
  /**
    * Returns the selected {@link PowerPoint.TextRange} in the current view of the presentation.
    Throws an exception if no text is selected.
    *
    * @remarks
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getSelectedTextRange(): TextRange = js.native
  
  /**
    * Returns the selected {@link PowerPoint.TextRange} in the current view of the presentation.
    If no text is selected, an object with an `isNullObject` property set to `true` is returned.
    *
    * @remarks
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getSelectedTextRangeOrNullObject(): TextRange = js.native
  
  /**
    * Inserts the specified slides from a presentation into the current presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    *
    * @param base64File The base64-encoded string representing the source presentation file.
    * @param options The options that define which slides will be inserted, where the new slides will go, and which presentation's formatting will be used.
    */
  def insertSlidesFromBase64(base64File: String): Unit = js.native
  def insertSlidesFromBase64(base64File: String, options: InsertSlideOptions): Unit = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Presentation = js.native
  def load(options: PresentationLoadOptions): Presentation = js.native
  def load(propertyNamesAndPaths: Expand): Presentation = js.native
  def load(propertyNames: String): Presentation = js.native
  def load(propertyNames: js.Array[String]): Presentation = js.native
  
  /**
    * Selects the slides in the current view of the presentation. Existing slide selection is replaced with the new selection.
    *
    * @remarks
    * [Api set: PowerPointApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param slideIds List of slide IDs to select in the presentation. If the list is empty, selection is cleared.
    */
  def setSelectedSlides(slideIds: js.Array[String]): Unit = js.native
  
  /**
    * Returns the collection of `SlideMaster` objects that are in the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val slideMasters: SlideMasterCollection = js.native
  
  /**
    * Returns an ordered collection of slides in the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    */
  val slides: SlideCollection = js.native
  
  /**
    * Returns a collection of tags attached to the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val tags: TagCollection = js.native
  
  val title: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.Presentation object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.PresentationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): PresentationData = js.native
}
