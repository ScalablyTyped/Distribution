package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the styles. WARNING: The StyleCollection items array has a known issue when loading items from the collection. Do not use `StyleCollection.items`, any `load()` method, and the `toJSON()` method.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.StyleCollection")
@js.native
class StyleCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** 
    * WARNING: The StyleCollection items array has a known issue when loading items from the collection. Do not use `StyleCollection.items`, any `load()` method, and the `toJSON()` method.
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
    * WARNING: The StyleCollection items array has a known issue when loading items from the collection. Do not use `StyleCollection.items`, any `load()` method, and the `toJSON()` method.
    */
  def load(): StyleCollection = js.native
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.StyleCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): StyleCollection = js.native
  def load(option: java.lang.String): StyleCollection = js.native
  def load(option: js.Array[java.lang.String]): StyleCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): StyleCollection = js.native
  /**
    * WARNING: The StyleCollection items array has a known issue when loading items from the collection. Do not use `StyleCollection.items`, any `load()` method, and the `toJSON()` method.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.StyleCollectionData = js.native
}

