package typings.officeJs.PowerPoint

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.PowerPoint.Interfaces.ParagraphFormatData
import typings.officeJs.PowerPoint.Interfaces.ParagraphFormatLoadOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Distributed
import typings.officeJs.officeJsStrings.Justify
import typings.officeJs.officeJsStrings.JustifyLow
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.ThaiDistributed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the paragraph formatting properties of a text that is attached to the {@link PowerPoint.TextRange}.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@js.native
trait ParagraphFormat
  extends StObject
     with ClientObject {
  
  /**
    * Represents the bullet format of the paragraph. See {@link PowerPoint.BulletFormat} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  val bulletFormat: BulletFormat = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ParagraphFormat: RequestContext = js.native
  
  /**
    * Represents the horizontal alignment of the paragraph. Returns 'null' if the 'TextRange' includes text fragments with different horizontal alignment values. See {@link PowerPoint.ParagraphHorizontalAlignment} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var horizontalAlignment: ParagraphHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ParagraphFormat = js.native
  def load(options: ParagraphFormatLoadOptions): ParagraphFormat = js.native
  def load(propertyNamesAndPaths: Expand): ParagraphFormat = js.native
  def load(propertyNames: String): ParagraphFormat = js.native
  def load(propertyNames: js.Array[String]): ParagraphFormat = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.ParagraphFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ParagraphFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ParagraphFormatData = js.native
}
