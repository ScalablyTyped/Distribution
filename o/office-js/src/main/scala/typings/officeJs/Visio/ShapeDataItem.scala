package typings.officeJs.Visio

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.Visio.Interfaces.ShapeDataItemData
import typings.officeJs.Visio.Interfaces.ShapeDataItemLoadOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the ShapeDataItem.
  *
  * [Api set:  1.1]
  */
@js.native
trait ShapeDataItem
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeDataItem: RequestContext = js.native
  
  /**
    *
    * A string that specifies the format of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  val format: String = js.native
  
  /**
    *
    * A string that specifies the formatted value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  val formattedValue: String = js.native
  
  /**
    *
    * A string that specifies the label of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  val label: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeDataItem = js.native
  def load(options: ShapeDataItemLoadOptions): ShapeDataItem = js.native
  def load(propertyNamesAndPaths: Expand): ShapeDataItem = js.native
  def load(propertyNames: String): ShapeDataItem = js.native
  def load(propertyNames: js.Array[String]): ShapeDataItem = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: ShapeDataItemData): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.ShapeDataItem object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.ShapeDataItemData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeDataItemData = js.native
  
  /**
    *
    * A string that specifies the value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  val value: String = js.native
}
