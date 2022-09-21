package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.PowerPoint.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.PowerPoint.Interfaces.SlideLayoutCollectionData
import typings.officeJsPreview.PowerPoint.Interfaces.SlideLayoutCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of layouts provided by the Slide Master for slides.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
@js.native
trait SlideLayoutCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlideLayoutCollection: RequestContext = js.native
  
  /**
    * Gets the number of layouts in the collection.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    * @returns The number of layouts in the collection.
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a layout using its unique ID.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param key The ID of the layout.
    * @returns The layout with the unique ID. If such a layout does not exist, an error is thrown.
    */
  def getItem(key: String): SlideLayout = js.native
  
  /**
    * Gets a layout using its zero-based index in the collection.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param index The index of the layout in the collection.
    * @returns The layout at the given index. An error is thrown if index is out of range.
    */
  def getItemAt(index: Double): SlideLayout = js.native
  
  /**
    * Gets a layout using its unique ID.  If such a layout does not exist, an object with an `isNullObject` property set to true is returned. For further information,
    see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param id The ID of the layout.
    * @returns The layout with the unique ID.
    */
  def getItemOrNullObject(id: String): SlideLayout = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[SlideLayout] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlideLayoutCollection = js.native
  def load(options: SlideLayoutCollectionLoadOptions & CollectionLoadOptions): SlideLayoutCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SlideLayoutCollection = js.native
  def load(propertyNames: String): SlideLayoutCollection = js.native
  def load(propertyNames: js.Array[String]): SlideLayoutCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `PowerPoint.SlideLayoutCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.SlideLayoutCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SlideLayoutCollectionData = js.native
}
