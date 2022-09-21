package typings.officeJsPreview.Visio

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.Visio.Interfaces.HyperlinkData
import typings.officeJsPreview.Visio.Interfaces.HyperlinkLoadOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Hyperlink.
  *
  * [Api set:  1.1]
  */
@js.native
trait Hyperlink
  extends StObject
     with ClientObject {
  
  /**
    *
    * Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  val address: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Hyperlink: RequestContext = js.native
  
  /**
    *
    * Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  val description: String = js.native
  
  /**
    *
    * Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  val extraInfo: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Hyperlink = js.native
  def load(options: HyperlinkLoadOptions): Hyperlink = js.native
  def load(propertyNamesAndPaths: Expand): Hyperlink = js.native
  def load(propertyNames: String): Hyperlink = js.native
  def load(propertyNames: js.Array[String]): Hyperlink = js.native
  
  /**
    * Set mock data
    */
  def setMockData(data: HyperlinkData): Unit = js.native
  
  /**
    *
    * Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  val subAddress: String = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.Hyperlink object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.HyperlinkData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): HyperlinkData = js.native
}
