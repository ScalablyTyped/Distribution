package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.Word.InsertLocation.after
import typings.officeJs.Word.InsertLocation.before
import typings.officeJs.Word.InsertLocation.end
import typings.officeJs.Word.InsertLocation.start
import typings.officeJs.Word.Interfaces.ListData
import typings.officeJs.Word.Interfaces.ListLoadOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.After
import typings.officeJs.officeJsStrings.Arabic
import typings.officeJs.officeJsStrings.Arrow
import typings.officeJs.officeJsStrings.Before
import typings.officeJs.officeJsStrings.Centered
import typings.officeJs.officeJsStrings.Checkmark
import typings.officeJs.officeJsStrings.Custom
import typings.officeJs.officeJsStrings.Diamonds
import typings.officeJs.officeJsStrings.End
import typings.officeJs.officeJsStrings.Hollow
import typings.officeJs.officeJsStrings.Justified
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.LowerLetter
import typings.officeJs.officeJsStrings.LowerRoman
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Solid
import typings.officeJs.officeJsStrings.Square
import typings.officeJs.officeJsStrings.Start
import typings.officeJs.officeJsStrings.Unknown_
import typings.officeJs.officeJsStrings.UpperLetter
import typings.officeJs.officeJsStrings.UpperRoman
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.Paragraph} objects.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@js.native
trait List
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_List: RequestContext = js.native
  
  /**
    * Gets the paragraphs that occur at the specified level in the list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    */
  def getLevelParagraphs(level: Double): ParagraphCollection = js.native
  
  /**
    * Gets the bullet, number, or picture at the specified level as a string.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    */
  def getLevelString(level: Double): ClientResult[String] = js.native
  
  /**
    * Gets the list's id.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val id: Double = js.native
  
  def insertParagraph(paragraphText: String, insertLocation: Start | End | Before | After): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: after): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: before): Paragraph = js.native
  def insertParagraph(paragraphText: String, insertLocation: end): Paragraph = js.native
  /**
    * Inserts a paragraph at the specified location.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value must be 'Start', 'End', 'Before', or 'After'.
    */
  def insertParagraph(paragraphText: String, insertLocation: start): Paragraph = js.native
  
  /**
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val levelExistences: js.Array[Boolean] = js.native
  
  /**
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val levelTypes: js.Array[ListLevelType] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): List = js.native
  def load(options: ListLoadOptions): List = js.native
  def load(propertyNamesAndPaths: Expand): List = js.native
  def load(propertyNames: String): List = js.native
  def load(propertyNames: js.Array[String]): List = js.native
  
  /**
    * Gets paragraphs in the list. Read-only.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  val paragraphs: ParagraphCollection = js.native
  
  /**
    * Sets the alignment of the bullet, number, or picture at the specified level in the list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param alignment Required. The level alignment that must be 'Left', 'Centered', or 'Right'.
    */
  def setLevelAlignment(level: Double, alignment: Mixed | Unknown_ | Left | Centered | Right | Justified): Unit = js.native
  /**
    * Sets the alignment of the bullet, number, or picture at the specified level in the list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param alignment Required. The level alignment that must be 'Left', 'Centered', or 'Right'.
    */
  def setLevelAlignment(level: Double, alignment: Alignment): Unit = js.native
  
  /**
    * Sets the bullet format at the specified level in the list. If the bullet is 'Custom', the charCode is required.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param listBullet Required. The bullet.
    * @param charCode Optional. The bullet character's code value. Used only if the bullet is 'Custom'.
    * @param fontName Optional. The bullet's font name. Used only if the bullet is 'Custom'.
    */
  def setLevelBullet(level: Double, listBullet: Custom | Solid | Hollow | Square | Diamonds | Arrow | Checkmark): Unit = js.native
  def setLevelBullet(
    level: Double,
    listBullet: Custom | Solid | Hollow | Square | Diamonds | Arrow | Checkmark,
    charCode: Double
  ): Unit = js.native
  def setLevelBullet(
    level: Double,
    listBullet: Custom | Solid | Hollow | Square | Diamonds | Arrow | Checkmark,
    charCode: Double,
    fontName: String
  ): Unit = js.native
  def setLevelBullet(
    level: Double,
    listBullet: Custom | Solid | Hollow | Square | Diamonds | Arrow | Checkmark,
    charCode: Unit,
    fontName: String
  ): Unit = js.native
  /**
    * Sets the bullet format at the specified level in the list. If the bullet is 'Custom', the charCode is required.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param listBullet Required. The bullet.
    * @param charCode Optional. The bullet character's code value. Used only if the bullet is 'Custom'.
    * @param fontName Optional. The bullet's font name. Used only if the bullet is 'Custom'.
    */
  def setLevelBullet(level: Double, listBullet: ListBullet): Unit = js.native
  def setLevelBullet(level: Double, listBullet: ListBullet, charCode: Double): Unit = js.native
  def setLevelBullet(level: Double, listBullet: ListBullet, charCode: Double, fontName: String): Unit = js.native
  def setLevelBullet(level: Double, listBullet: ListBullet, charCode: Unit, fontName: String): Unit = js.native
  
  /**
    * Sets the two indents of the specified level in the list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param textIndent Required. The text indent in points. It is the same as paragraph left indent.
    * @param bulletNumberPictureIndent Required. The relative indent, in points, of the bullet, number, or picture. It is the same as paragraph first line indent.
    */
  def setLevelIndents(level: Double, textIndent: Double, bulletNumberPictureIndent: Double): Unit = js.native
  
  /**
    * Sets the numbering format at the specified level in the list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param listNumbering Required. The ordinal format.
    * @param formatString Optional. The numbering string format defined as an array of strings and/or integers. Each integer is a level of number type that is higher than or equal to this level. For example, an array of ["(", level - 1, ".", level, ")"] can define the format of "(2.c)", where 2 is the parent's item number and c is this level's item number.
    */
  def setLevelNumbering(level: Double, listNumbering: None | Arabic | UpperRoman | LowerRoman | UpperLetter | LowerLetter): Unit = js.native
  def setLevelNumbering(
    level: Double,
    listNumbering: None | Arabic | UpperRoman | LowerRoman | UpperLetter | LowerLetter,
    formatString: js.Array[String | Double]
  ): Unit = js.native
  /**
    * Sets the numbering format at the specified level in the list.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param listNumbering Required. The ordinal format.
    * @param formatString Optional. The numbering string format defined as an array of strings and/or integers. Each integer is a level of number type that is higher than or equal to this level. For example, an array of ["(", level - 1, ".", level, ")"] can define the format of "(2.c)", where 2 is the parent's item number and c is this level's item number.
    */
  def setLevelNumbering(level: Double, listNumbering: ListNumbering): Unit = js.native
  def setLevelNumbering(level: Double, listNumbering: ListNumbering, formatString: js.Array[String | Double]): Unit = js.native
  
  /**
    * Sets the starting number at the specified level in the list. Default value is 1.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param startingNumber Required. The number to start with.
    */
  def setLevelStartingNumber(level: Double, startingNumber: Double): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.List object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ListData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ListData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): List = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): List = js.native
}
