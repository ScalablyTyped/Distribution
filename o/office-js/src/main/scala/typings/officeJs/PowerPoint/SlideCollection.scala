package typings.officeJs.PowerPoint

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.PowerPoint.Interfaces.CollectionLoadOptions
import typings.officeJs.PowerPoint.Interfaces.SlideCollectionData
import typings.officeJs.PowerPoint.Interfaces.SlideCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of slides in the presentation.
  *
  * @remarks
  * [Api set: PowerPointApi 1.2]
  */
@js.native
trait SlideCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new slide at the end of the collection.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param options The options that define the theme of the new slide.
    */
  def add(): Unit = js.native
  def add(options: AddSlideOptions): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlideCollection: RequestContext = js.native
  
  /**
    * Gets the number of slides in the collection.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    * @returns The number of slides in the collection.
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a slide using its unique ID.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    *
    * @param key The ID of the slide.
    * @returns The slide with the unique ID. If such a slide does not exist, an error is thrown.
    */
  def getItem(key: String): Slide = js.native
  
  /**
    * Gets a slide using its zero-based index in the collection. Slides are stored in the same order as they
    are shown in the presentation.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    *
    * @param index The index of the slide in the collection.
    * @returns The slide at the given index. An error is thrown if index is out of range.
    */
  def getItemAt(index: Double): Slide = js.native
  
  /**
    * Gets a slide using its unique ID. If such a slide does not exist, an object with an `isNullObject` property set to true is returned. For further information,
    see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods
    and properties}.
    *
    * @remarks
    * [Api set: PowerPointApi 1.2]
    *
    * @param id The ID of the slide.
    * @returns The slide with the unique ID.
    */
  def getItemOrNullObject(id: String): Slide = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Slide] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlideCollection = js.native
  def load(options: SlideCollectionLoadOptions & CollectionLoadOptions): SlideCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SlideCollection = js.native
  def load(propertyNames: String): SlideCollection = js.native
  def load(propertyNames: js.Array[String]): SlideCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `PowerPoint.SlideCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.SlideCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SlideCollectionData = js.native
}
