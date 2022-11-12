package typings.officeJs.PowerPoint

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.PowerPoint.Interfaces.CollectionLoadOptions
import typings.officeJs.PowerPoint.Interfaces.ShapeScopedCollectionData
import typings.officeJs.PowerPoint.Interfaces.ShapeScopedCollectionLoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of shapes.
  *
  * @remarks
  * [Api set: PowerPointApi 1.5]
  */
@js.native
trait ShapeScopedCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeScopedCollection: RequestContext = js.native
  
  /**
    * Gets the number of shapes in the collection.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    * @returns The number of shapes in the collection.
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a shape using its unique ID. An error is thrown if the shape does not exist.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    *
    * @param key The ID of the shape.
    * @returns The shape with the unique ID. If such a shape does not exist, an error is thrown.
    */
  def getItem(key: String): Shape = js.native
  
  /**
    * Gets a shape using its zero-based index in the collection. An error is thrown if the index is out of range.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    *
    * @param index The index of the shape in the collection.
    * @returns The shape at the given index. An error is thrown if index is out of range.
    */
  def getItemAt(index: Double): Shape = js.native
  
  /**
    * Gets a shape using its unique ID. If such a shape does not exist, an object with an `isNullObject` property set to true is returned.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    *
    * @param id The ID of the shape.
    * @returns The shape with the unique ID. If such a shape does not exist, an object with an `isNullObject` property set to true is returned.
    */
  def getItemOrNullObject(id: String): Shape = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeScopedCollection = js.native
  def load(options: ShapeScopedCollectionLoadOptions & CollectionLoadOptions): ShapeScopedCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): ShapeScopedCollection = js.native
  def load(propertyNames: String): ShapeScopedCollection = js.native
  def load(propertyNames: js.Array[String]): ShapeScopedCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `PowerPoint.ShapeScopedCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ShapeScopedCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): ShapeScopedCollectionData = js.native
}
