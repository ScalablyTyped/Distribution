package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.PowerPoint.Interfaces.BulletFormatData
import typings.officeJsPreview.PowerPoint.Interfaces.BulletFormatLoadOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the bullet formatting properties of a text that is attached to the {@link PowerPoint.ParagraphFormat}.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@js.native
trait BulletFormat
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_BulletFormat: RequestContext = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): BulletFormat = js.native
  def load(options: BulletFormatLoadOptions): BulletFormat = js.native
  def load(propertyNamesAndPaths: Expand): BulletFormat = js.native
  def load(propertyNames: String): BulletFormat = js.native
  def load(propertyNames: js.Array[String]): BulletFormat = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.BulletFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.BulletFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): BulletFormatData = js.native
  
  /**
    * Specifies if the bullets in the paragraph are visible. Returns 'null' if the 'TextRange' includes text fragments with different bullet visibility values.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var visible: Boolean = js.native
}
