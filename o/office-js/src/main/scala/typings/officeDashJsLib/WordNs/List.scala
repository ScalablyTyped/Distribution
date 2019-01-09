package typings
package officeDashJsLib.WordNs

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
class List ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets the list's id.
    *
    * [Api set: WordApi 1.3]
    */
  val id: scala.Double = js.native
  /**
    *
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val levelExistences: js.Array[scala.Boolean] = js.native
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
  def getLevelParagraphs(level: scala.Double): ParagraphCollection = js.native
  /**
    *
    * Gets the bullet, number or picture at the specified level as a string.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    */
  def getLevelString(level: scala.Double): officeDashJsLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Inserts a paragraph at the specified location. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.3]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'.
    */
  def insertParagraph(paragraphText: java.lang.String, insertLocation: InsertLocation): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_After(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.After): Paragraph = js.native
  /**
    *
    * Inserts a paragraph at the specified location. The insertLocation value can be 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.3]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Start', 'End', 'Before', or 'After'.
    */
  @JSName("insertParagraph")
  def insertParagraph_Before(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Before): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_End(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.End): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Replace(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Replace): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Start(paragraphText: java.lang.String, insertLocation: officeDashJsLib.officeDashJsLibStrings.Start): Paragraph = js.native
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
  def load(option: java.lang.String): List = js.native
  def load(option: js.Array[java.lang.String]): List = js.native
  def load(option: officeDashJsLib.Anon_Expand): List = js.native
  def load(option: officeDashJsLib.WordNs.InterfacesNs.ListLoadOptions): List = js.native
  /**
    *
    * Sets the alignment of the bullet, number or picture at the specified level in the list.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param alignment Required. The level alignment that can be 'Left', 'Centered', or 'Right'.
    */
  def setLevelAlignment(level: scala.Double, alignment: Alignment): scala.Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Centered(level: scala.Double, alignment: officeDashJsLib.officeDashJsLibStrings.Centered): scala.Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Justified(level: scala.Double, alignment: officeDashJsLib.officeDashJsLibStrings.Justified): scala.Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Left(level: scala.Double, alignment: officeDashJsLib.officeDashJsLibStrings.Left): scala.Unit = js.native
  /**
    *
    * Sets the alignment of the bullet, number or picture at the specified level in the list.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param alignment Required. The level alignment that can be 'Left', 'Centered', or 'Right'.
    */
  @JSName("setLevelAlignment")
  def setLevelAlignment_Mixed(level: scala.Double, alignment: officeDashJsLib.officeDashJsLibStrings.Mixed): scala.Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Right(level: scala.Double, alignment: officeDashJsLib.officeDashJsLibStrings.Right): scala.Unit = js.native
  @JSName("setLevelAlignment")
  def setLevelAlignment_Unknown(level: scala.Double, alignment: officeDashJsLib.officeDashJsLibStrings.Unknown): scala.Unit = js.native
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
  def setLevelBullet(level: scala.Double, listBullet: ListBullet): scala.Unit = js.native
  def setLevelBullet(level: scala.Double, listBullet: ListBullet, charCode: scala.Double): scala.Unit = js.native
  def setLevelBullet(level: scala.Double, listBullet: ListBullet, charCode: scala.Double, fontName: java.lang.String): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Arrow(level: scala.Double, listBullet: officeDashJsLib.officeDashJsLibStrings.Arrow): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Arrow(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Arrow,
    charCode: scala.Double
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Arrow(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Arrow,
    charCode: scala.Double,
    fontName: java.lang.String
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Checkmark(level: scala.Double, listBullet: officeDashJsLib.officeDashJsLibStrings.Checkmark): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Checkmark(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Checkmark,
    charCode: scala.Double
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Checkmark(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Checkmark,
    charCode: scala.Double,
    fontName: java.lang.String
  ): scala.Unit = js.native
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
  def setLevelBullet_Custom(level: scala.Double, listBullet: officeDashJsLib.officeDashJsLibStrings.Custom): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Custom(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Custom,
    charCode: scala.Double
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Custom(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Custom,
    charCode: scala.Double,
    fontName: java.lang.String
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Diamonds(level: scala.Double, listBullet: officeDashJsLib.officeDashJsLibStrings.Diamonds): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Diamonds(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Diamonds,
    charCode: scala.Double
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Diamonds(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Diamonds,
    charCode: scala.Double,
    fontName: java.lang.String
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Hollow(level: scala.Double, listBullet: officeDashJsLib.officeDashJsLibStrings.Hollow): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Hollow(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Hollow,
    charCode: scala.Double
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Hollow(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Hollow,
    charCode: scala.Double,
    fontName: java.lang.String
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Solid(level: scala.Double, listBullet: officeDashJsLib.officeDashJsLibStrings.Solid): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Solid(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Solid,
    charCode: scala.Double
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Solid(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Solid,
    charCode: scala.Double,
    fontName: java.lang.String
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Square(level: scala.Double, listBullet: officeDashJsLib.officeDashJsLibStrings.Square): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Square(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Square,
    charCode: scala.Double
  ): scala.Unit = js.native
  @JSName("setLevelBullet")
  def setLevelBullet_Square(
    level: scala.Double,
    listBullet: officeDashJsLib.officeDashJsLibStrings.Square,
    charCode: scala.Double,
    fontName: java.lang.String
  ): scala.Unit = js.native
  /**
    *
    * Sets the two indents of the specified level in the list.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param textIndent Required. The text indent in points. It is the same as paragraph left indent.
    * @param bulletNumberPictureIndent Required. The relative indent, in points, of the bullet, number or picture. It is the same as paragraph first line indent.
    */
  def setLevelIndents(level: scala.Double, textIndent: scala.Double, bulletNumberPictureIndent: scala.Double): scala.Unit = js.native
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
  def setLevelNumbering(level: scala.Double, listNumbering: ListNumbering): scala.Unit = js.native
  def setLevelNumbering(level: scala.Double, listNumbering: ListNumbering, formatString: js.Array[_]): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_Arabic(level: scala.Double, listNumbering: officeDashJsLib.officeDashJsLibStrings.Arabic): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_Arabic(
    level: scala.Double,
    listNumbering: officeDashJsLib.officeDashJsLibStrings.Arabic,
    formatString: js.Array[_]
  ): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_LowerLetter(level: scala.Double, listNumbering: officeDashJsLib.officeDashJsLibStrings.LowerLetter): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_LowerLetter(
    level: scala.Double,
    listNumbering: officeDashJsLib.officeDashJsLibStrings.LowerLetter,
    formatString: js.Array[_]
  ): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_LowerRoman(level: scala.Double, listNumbering: officeDashJsLib.officeDashJsLibStrings.LowerRoman): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_LowerRoman(
    level: scala.Double,
    listNumbering: officeDashJsLib.officeDashJsLibStrings.LowerRoman,
    formatString: js.Array[_]
  ): scala.Unit = js.native
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
  def setLevelNumbering_None(level: scala.Double, listNumbering: officeDashJsLib.officeDashJsLibStrings.None): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_None(
    level: scala.Double,
    listNumbering: officeDashJsLib.officeDashJsLibStrings.None,
    formatString: js.Array[_]
  ): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_UpperLetter(level: scala.Double, listNumbering: officeDashJsLib.officeDashJsLibStrings.UpperLetter): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_UpperLetter(
    level: scala.Double,
    listNumbering: officeDashJsLib.officeDashJsLibStrings.UpperLetter,
    formatString: js.Array[_]
  ): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_UpperRoman(level: scala.Double, listNumbering: officeDashJsLib.officeDashJsLibStrings.UpperRoman): scala.Unit = js.native
  @JSName("setLevelNumbering")
  def setLevelNumbering_UpperRoman(
    level: scala.Double,
    listNumbering: officeDashJsLib.officeDashJsLibStrings.UpperRoman,
    formatString: js.Array[_]
  ): scala.Unit = js.native
  /**
    *
    * Sets the starting number at the specified level in the list. Default value is 1.
    *
    * [Api set: WordApi 1.3]
    *
    * @param level Required. The level in the list.
    * @param startingNumber Required. The number to start with.
    */
  def setLevelStartingNumber(level: scala.Double, startingNumber: scala.Double): scala.Unit = js.native
  def toJSON(): officeDashJsLib.WordNs.InterfacesNs.ListData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): List = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): List = js.native
}

