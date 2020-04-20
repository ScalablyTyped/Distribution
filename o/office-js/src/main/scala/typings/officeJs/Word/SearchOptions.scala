package typings.officeJs.Word

import typings.officeJs.AnonExpand
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientRequestContext
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.Interfaces.SearchOptionsData
import typings.officeJs.Word.Interfaces.SearchOptionsLoadOptions
import typings.officeJs.Word.Interfaces.SearchOptionsUpdateData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Specifies the options to be included in a search operation.
  * 
  * To learn more about how to use search options in the Word JavaScript APIs, read {@link https://docs.microsoft.com/office/dev/add-ins/word/search-option-guidance | Use search options to find text in your Word add-in}.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SearchOptions")
@js.native
class SearchOptions () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SearchOptions: RequestContext = js.native
  /**
    *
    * Gets or sets a value that indicates whether to ignore all punctuation characters between words. Corresponds to the Ignore punctuation check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var ignorePunct: Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates whether to ignore all whitespace between words. Corresponds to the Ignore whitespace characters check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var ignoreSpace: Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates whether to perform a case sensitive search. Corresponds to the Match case check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchCase: Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates whether to match words that begin with the search string. Corresponds to the Match prefix check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchPrefix: Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates whether to match words that end with the search string. Corresponds to the Match suffix check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchSuffix: Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates whether to find operation only entire words, not text that is part of a larger word. Corresponds to the Find whole words only check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchWholeWord: Boolean = js.native
  var matchWildCards: Boolean = js.native
  /**
    *
    * Gets or sets a value that indicates whether the search will be performed using special search operators. Corresponds to the Use wildcards check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchWildcards: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.SearchOptions` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.SearchOptions` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.SearchOptions` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SearchOptions = js.native
  def load(option: String): SearchOptions = js.native
  def load(option: js.Array[String]): SearchOptions = js.native
  def load(option: AnonExpand): SearchOptions = js.native
  def load(option: SearchOptionsLoadOptions): SearchOptions = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.SearchOptions): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: SearchOptionsUpdateData): Unit = js.native
  def set(properties: SearchOptionsUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: SearchOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.SearchOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.SearchOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): SearchOptionsData = js.native
}

/* static members */
@JSGlobal("Word.SearchOptions")
@js.native
object SearchOptions extends js.Object {
  /**
    * Create a new instance of Word.SearchOptions object
    */
  def newObject(context: ClientRequestContext): SearchOptions = js.native
}

