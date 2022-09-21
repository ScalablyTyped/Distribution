package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.PowerPoint.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.PowerPoint.Interfaces.SlideMasterCollectionData
import typings.officeJsPreview.PowerPoint.Interfaces.SlideMasterCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of Slide Masters in the presentation.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
@js.native
trait SlideMasterCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlideMasterCollection: RequestContext = js.native
  
  /**
    * Gets the number of Slide Masters in the collection.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    * @returns The number of Slide Masters in the collection.
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a Slide Master using its unique ID.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param key The ID of the Slide Master.
    * @returns The Slide Master with the unique ID. If such a Slide Master does not exist, an error is thrown.
    */
  def getItem(key: String): SlideMaster = js.native
  
  /**
    * Gets a Slide Master using its zero-based index in the collection.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param index The index of the Slide Master in the collection.
    * @returns The Slide Master at the given index. An error is thrown if index is out of range.
    */
  def getItemAt(index: Double): SlideMaster = js.native
  
  /**
    * Gets a Slide Master using its unique ID. If such a Slide Master does not exist, an object with an `isNullObject` property set to true is returned.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}."
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    *
    * @param id The ID of the Slide Master.
    * @returns The Slide Master with the unique ID.
    */
  def getItemOrNullObject(id: String): SlideMaster = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[SlideMaster] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlideMasterCollection = js.native
  def load(options: SlideMasterCollectionLoadOptions & CollectionLoadOptions): SlideMasterCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SlideMasterCollection = js.native
  def load(propertyNames: String): SlideMasterCollection = js.native
  def load(propertyNames: js.Array[String]): SlideMasterCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `PowerPoint.SlideMasterCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.SlideMasterCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SlideMasterCollectionData = js.native
}
