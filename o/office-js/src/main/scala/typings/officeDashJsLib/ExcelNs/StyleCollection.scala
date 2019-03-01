package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the styles. 
  * WARNING: There's currently a known issue with the StyleCollection.items array when loading items from the collection. 
  * Until this issue is resolved, do not use the StyleCollection.items property, the StyleCollection.load() method, 
  * or the StyleCollection.toJSON() method.
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.StyleCollection")
@js.native
class StyleCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_StyleCollection: RequestContext = js.native
  /**
    * WARNING: There's currently a known issue with the `StyleCollection.items` array when loading items from the collection. 
    * Until this issue is resolved, do not use the `StyleCollection.items` property, the `StyleCollection.load()` method, 
    * or the `StyleCollection.toJSON()` method.
    */
  val items: js.Array[Style] = js.native
  /**
    *
    * Adds a new style to the collection.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param name Name of the style to be added.
    */
  def add(name: java.lang.String): scala.Unit = js.native
  /**
    *
    * Gets a style by name.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param name Name of the style to be retrieved.
    */
  def getItem(name: java.lang.String): Style = js.native
  /**
    * WARNING: There's currently a known issue with the `StyleCollection.items` array when loading items from the collection. 
    * Until this issue is resolved, do not use the `StyleCollection.items` property, the `StyleCollection.load()` method, 
    * or the `StyleCollection.toJSON()` method.
    */
  def load(): StyleCollection = js.native
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.StyleCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): StyleCollection = js.native
  def load(option: java.lang.String): StyleCollection = js.native
  def load(option: js.Array[java.lang.String]): StyleCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): StyleCollection = js.native
  /**
    * WARNING: There's currently a known issue with the `StyleCollection.items` array when loading items from the collection. 
    * Until this issue is resolved, do not use the `StyleCollection.items` property, the `StyleCollection.load()` method, 
    * or the `StyleCollection.toJSON()` method.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.StyleCollectionData = js.native
}

