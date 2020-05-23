package typings.pizzip.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.pizzip.anon.GenerateOptionstypearrayb
import typings.pizzip.anon.GenerateOptionstypeblob
import typings.pizzip.anon.GenerateOptionstypenodebu
import typings.pizzip.anon.GenerateOptionstypestring
import typings.pizzip.anon.GenerateOptionstypeuint8a
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.RegExp
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PizZip extends js.Object {
  /**
    * the comment of the zip file.
    */
  var comment: String = js.native
  /**
    * the ZipObjects inside the zip with the name as key.
    */
  var files: StringDictionary[ZipObject] = js.native
  /**
    * Get a file with the specified name. You can specify folders in the name : the folder separator is a forward slash ("/").
    * @param name the name of the file.
    */
  def file(name: String): ZipObject | Null = js.native
  /**
    * Add (or update) a file to the zip file.
    * You shouldn't update the data given to this method : it is kept as it so any update will impact the stored data.
    * Throws an exception if the data is not in a supported format.
    * @param name the name of the file. You can specify folders in the name : the folder separator is a forward slash ("/").
    * @param data the content of the file.
    * @param options the options.
    */
  def file(name: String, data: Data): this.type = js.native
  def file(name: String, data: Data, options: FileOptions): this.type = js.native
  /**
    * Search a file in the current folder and subfolders with a regular expression. The regex is tested against the relative filename.
    * @param regex the regex to use.
    */
  def file(regex: RegExp): js.Array[ZipObject] = js.native
  /**
    * Filter nested files/folders with the specified function. The predicate must return true if the file should be included, false otherwise.
    * @param predicate the predicate to use.
    */
  def filter(predicate: js.Function2[/* relativePath */ String, /* file */ ZipObject, Boolean]): js.Array[ZipObject] = js.native
  /**
    * Create a directory if it doesn't exist, return a new PizZip object with the new folder as root.
    * @param name the name of the directory.
    */
  def folder(name: String): this.type = js.native
  /**
    * Search a subdirectory in the current directory with a regular expression. The regex is tested against the relative path.
    * @param regex the regex to use.
    */
  def folder(regex: RegExp): js.Array[ZipObject] = js.native
  /**
    * Generates the complete zip file.
    * Throws an exception if the asked type is not available in the browser,
    * see https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    * @param options the options to generate the zip file
    */
  def generate(): String = js.native
  def generate(options: GenerateOptionstypearrayb): ArrayBuffer = js.native
  def generate(options: GenerateOptionstypeblob): Blob = js.native
  def generate(options: GenerateOptionstypenodebu): Buffer = js.native
  def generate(options: GenerateOptionstypestring): String = js.native
  def generate(options: GenerateOptionstypeuint8a): Uint8Array = js.native
  /**
    * Read an existing zip and merge the data in the current PizZip object at the current folder level.
    * This technique has some limitations, see https://github.com/open-xml-templating/pizzip/blob/master/documentation/limitations.md
    * You shouldn't update the data given to this method : it is kept as it so any update will impact the stored data.
    * Throws an exception if the loaded data is not valid zip data or if it uses features (multi volume, password protected, etc).
    * @param data the zip file
    * @param options the options to load the zip file
    */
  def load(data: LoadData): this.type = js.native
  def load(data: LoadData, options: LoadOptions): this.type = js.native
  /**
    * Delete a file or folder (recursively).
    * @param name the name of the file/folder to delete.
    */
  def remove(name: String): this.type = js.native
}

