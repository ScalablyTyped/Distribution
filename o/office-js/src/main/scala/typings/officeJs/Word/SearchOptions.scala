package typings.officeJs.Word

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.Word.Interfaces.SearchOptionsData
import typings.officeJs.Word.Interfaces.SearchOptionsLoadOptions
import typings.officeJs.Word.Interfaces.SearchOptionsUpdateData
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Specifies the options to be included in a search operation.
  * 
  * To learn more about how to use search options in the Word JavaScript APIs, read {@link https://docs.microsoft.com/office/dev/add-ins/word/search-option-guidance | Use search options to find text in your Word add-in}.
  *
  * [Api set: WordApi 1.1]
  */
@js.native
trait SearchOptions
  extends StObject
     with ClientObject {
  
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
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SearchOptions = js.native
  def load(options: SearchOptionsLoadOptions): SearchOptions = js.native
  def load(propertyNamesAndPaths: Expand): SearchOptions = js.native
  def load(propertyNames: String): SearchOptions = js.native
  def load(propertyNames: js.Array[String]): SearchOptions = js.native
  
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
  
  /**
    *
    * Gets or sets a value that indicates whether the search will be performed using special search operators. Corresponds to the Use wildcards check box in the Find and Replace dialog box.
    *
    * [Api set: WordApi 1.1]
    */
  var matchWildcards: Boolean = js.native
  
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
