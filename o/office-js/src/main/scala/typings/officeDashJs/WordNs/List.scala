package typings.officeDashJs.WordNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.WordNs.InterfacesNs.ListData
import typings.officeDashJs.WordNs.InterfacesNs.ListLoadOptions
import typings.officeDashJs.officeDashJsStrings.After
import typings.officeDashJs.officeDashJsStrings.Arabic
import typings.officeDashJs.officeDashJsStrings.Arrow
import typings.officeDashJs.officeDashJsStrings.Before
import typings.officeDashJs.officeDashJsStrings.Centered
import typings.officeDashJs.officeDashJsStrings.Checkmark
import typings.officeDashJs.officeDashJsStrings.Custom
import typings.officeDashJs.officeDashJsStrings.Diamonds
import typings.officeDashJs.officeDashJsStrings.End
import typings.officeDashJs.officeDashJsStrings.Hollow
import typings.officeDashJs.officeDashJsStrings.Justified
import typings.officeDashJs.officeDashJsStrings.Left
import typings.officeDashJs.officeDashJsStrings.LowerLetter
import typings.officeDashJs.officeDashJsStrings.LowerRoman
import typings.officeDashJs.officeDashJsStrings.Mixed
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Replace
import typings.officeDashJs.officeDashJsStrings.Right
import typings.officeDashJs.officeDashJsStrings.Solid
import typings.officeDashJs.officeDashJsStrings.Square
import typings.officeDashJs.officeDashJsStrings.Start
import typings.officeDashJs.officeDashJsStrings.Unknown
import typings.officeDashJs.officeDashJsStrings.UpperLetter
import typings.officeDashJs.officeDashJsStrings.UpperRoman
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of {@link Word.Paragraph} objects.
  *
  * [Api set: WordApi 1.3]
  */
@JSGlobal("Word.List")
@js.native
class List () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_List: RequestContext = js.native
  /**
    *
    * Gets the list's id.
    *
    * [Api set: WordApi 1.3]
    */
  val id: Double = js.native
  /**
    *
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val levelExistences: js.Array[Boolean] = js.native
  /**
    *
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val levelTypes: js.Array[ListLevelType] = js.native
  /**
    *
    * Gets paragraphs in the list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val paragraphs: ParagraphCollection = js.native
  /**
    *
    * Gets the paragraphs that occur at the specified level in the list.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    */
  def getLevelParagraphs(level: Double): ParagraphCollection = js.native
  /**
    *
    * Gets the bullet, number, or picture at the specified level as a string.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    */
  def getLevelString(level: Double): ClientResult[String] = js.native
  /**
    *
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.3]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'.
    */
  def insertParagraph(paragraphText: String, insertLocation: InsertLocation): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_After(paragraphText: String, insertLocation: After): Paragraph = js.native
  /**
    *
    * Inserts a paragraph at the specified location.
    *
    * [Api set: WordApi 1.3]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'.
    */
  @JSName("insertParagraph")
  def insertParagraph_Before(paragraphText: String, insertLocation: Before): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_End(paragraphText: String, insertLocation: End): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Replace(paragraphText: String, insertLocation: Replace): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Start(paragraphText: String, insertLocation: Start): Paragraph = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.List` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.List` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.List` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): List = js.native
  def load(option: String): List = js.native
  def load(option: js.Array[String]): List = js.native
  def load(option: Anon_Expand): List = js.native
  def load(option: ListLoadOptions): List = js.native
  /**
    *
    * Sets the alignment of the bullet, number, or picture at the specified level in the list.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param alignment Required. The level alignment that can be 'Left', 'Centered', or 'Right'.
    */
  def setLevelAlignment(level: Double, alignment: Alignment): Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Centered(level: Double, alignment: Centered): Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Justified(level: Double, alignment: Justified): Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Left(level: Double, alignment: Left): Unit = js.native
  /**
    *
    * Sets the alignment of the bullet, number, or picture at the specified level in the list.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param alignment Required. The level alignment that can be 'Left', 'Centered', or 'Right'.
    */
  @JSName("setLevelAlignment")
  def setLevelAlignment_Mixed(level: Double, alignment: Mixed): Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Right(level: Double, alignment: Right): Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Unknown(level: Double, alignment: Unknown): Unit = js.native
  /**
    *
    * Sets the bullet format at the specified level in the list. If the bullet is 'Custom', the charCode is required.
    *
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
  @JSName("setLevelBullet")
  def setLevelBullet_Arrow(level: Double, listBullet: Arrow): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Arrow(level: Double, listBullet: Arrow, charCode: Double): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Arrow(level: Double, listBullet: Arrow, charCode: Double, fontName: String): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Checkmark(level: Double, listBullet: Checkmark): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Checkmark(level: Double, listBullet: Checkmark, charCode: Double): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Checkmark(level: Double, listBullet: Checkmark, charCode: Double, fontName: String): Unit = js.native
  /**
    *
    * Sets the bullet format at the specified level in the list. If the bullet is 'Custom', the charCode is required.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param listBullet Required. The bullet.
    * @param charCode Optional. The bullet character's code value. Used only if the bullet is 'Custom'.
    * @param fontName Optional. The bullet's font name. Used only if the bullet is 'Custom'.
    */
  @JSName("setLevelBullet")
  def setLevelBullet_Custom(level: Double, listBullet: Custom): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Custom(level: Double, listBullet: Custom, charCode: Double): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Custom(level: Double, listBullet: Custom, charCode: Double, fontName: String): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Diamonds(level: Double, listBullet: Diamonds): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Diamonds(level: Double, listBullet: Diamonds, charCode: Double): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Diamonds(level: Double, listBullet: Diamonds, charCode: Double, fontName: String): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Hollow(level: Double, listBullet: Hollow): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Hollow(level: Double, listBullet: Hollow, charCode: Double): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Hollow(level: Double, listBullet: Hollow, charCode: Double, fontName: String): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Solid(level: Double, listBullet: Solid): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Solid(level: Double, listBullet: Solid, charCode: Double): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Solid(level: Double, listBullet: Solid, charCode: Double, fontName: String): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Square(level: Double, listBullet: Square): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Square(level: Double, listBullet: Square, charCode: Double): Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Square(level: Double, listBullet: Square, charCode: Double, fontName: String): Unit = js.native
  /**
    *
    * Sets the two indents of the specified level in the list.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param textIndent Required. The text indent in points. It is the same as paragraph left indent.
    * @param bulletNumberPictureIndent Required. The relative indent, in points, of the bullet, number, or picture. It is the same as paragraph first line indent.
    */
  def setLevelIndents(level: Double, textIndent: Double, bulletNumberPictureIndent: Double): Unit = js.native
  /**
    *
    * Sets the numbering format at the specified level in the list.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param listNumbering Required. The ordinal format.
    * @param formatString Optional. The numbering string format defined as an array of strings and/or integers. Each integer is a level of number type that is higher than or equal to this level. For example, an array of ["(", level - 1, ".", level, ")"] can define the format of "(2.c)", where 2 is the parent's item number and c is this level's item number.
    */
  def setLevelNumbering(level: Double, listNumbering: ListNumbering): Unit = js.native
  def setLevelNumbering(level: Double, listNumbering: ListNumbering, formatString: js.Array[String | Double]): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_Arabic(level: Double, listNumbering: Arabic): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_Arabic(level: Double, listNumbering: Arabic, formatString: js.Array[String | Double]): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_LowerLetter(level: Double, listNumbering: LowerLetter): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_LowerLetter(level: Double, listNumbering: LowerLetter, formatString: js.Array[String | Double]): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_LowerRoman(level: Double, listNumbering: LowerRoman): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_LowerRoman(level: Double, listNumbering: LowerRoman, formatString: js.Array[String | Double]): Unit = js.native
  /**
    *
    * Sets the numbering format at the specified level in the list.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param listNumbering Required. The ordinal format.
    * @param formatString Optional. The numbering string format defined as an array of strings and/or integers. Each integer is a level of number type that is higher than or equal to this level. For example, an array of ["(", level - 1, ".", level, ")"] can define the format of "(2.c)", where 2 is the parent's item number and c is this level's item number.
    */
  @JSName("setLevelNumbering")
  def setLevelNumbering_None(level: Double, listNumbering: None): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_None(level: Double, listNumbering: None, formatString: js.Array[String | Double]): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_UpperLetter(level: Double, listNumbering: UpperLetter): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_UpperLetter(level: Double, listNumbering: UpperLetter, formatString: js.Array[String | Double]): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_UpperRoman(level: Double, listNumbering: UpperRoman): Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_UpperRoman(level: Double, listNumbering: UpperRoman, formatString: js.Array[String | Double]): Unit = js.native
  /**
    *
    * Sets the starting number at the specified level in the list. Default value is 1.
    *
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
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): List = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): List = js.native
}

