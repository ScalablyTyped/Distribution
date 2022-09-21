package typings.officeJs.PowerPoint

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.PowerPoint.Interfaces.TagData
import typings.officeJs.PowerPoint.Interfaces.TagLoadOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single tag in the slide.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
@js.native
trait Tag
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Tag: RequestContext = js.native
  
  /**
    * Gets the unique ID of the tag. The `key` is unique within the owning `TagCollection` and always stored as uppercase letters within the document.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  val key: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Tag = js.native
  def load(options: TagLoadOptions): Tag = js.native
  def load(propertyNamesAndPaths: Expand): Tag = js.native
  def load(propertyNames: String): Tag = js.native
  def load(propertyNames: js.Array[String]): Tag = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.Tag object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.TagData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TagData = js.native
  
  /**
    * Gets the value of the tag.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var value: String = js.native
}
