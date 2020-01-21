package typings.pizzip.mod

import typings.node.Buffer
import typings.pizzip.AnonBase64
import typings.std.ArrayBuffer
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipObject extends js.Object {
  /**
    * the comment for this file
    */
  var comment: String
  /**
    * the last modification date
    */
  var date: Date
  /**
    * true if this is a directory
    */
  var dir: Boolean
  /**
    * The DOS permissions of the file, if any.
    */
  var dosPermissions: Double
  /**
    * the absolute path of the file
    */
  var name: String
  /**
    * the options of the file.
    */
  var options: AnonBase64
  /**
    * The UNIX permissions of the file, if any. Also accepts a string representing the octal value : "644", "755", etc. On nodejs you can use the mode attribute of nodejs' fs.Stats.
    */
  var unixPermissions: Double | String
  /**
    * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asArrayBuffer(): ArrayBuffer
  /**
    * the content as binary string.
    */
  def asBinary(): String
  /**
    * need nodejs. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asNodeBuffer(): Buffer
  /**
    * the content as an unicode string.
    */
  def asText(): String
  /**
    * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asUint8Array(): Uint8Array
}

object ZipObject {
  @scala.inline
  def apply(
    asArrayBuffer: () => ArrayBuffer,
    asBinary: () => String,
    asNodeBuffer: () => Buffer,
    asText: () => String,
    asUint8Array: () => Uint8Array,
    comment: String,
    date: Date,
    dir: Boolean,
    dosPermissions: Double,
    name: String,
    options: AnonBase64,
    unixPermissions: Double | String
  ): ZipObject = {
    val __obj = js.Dynamic.literal(asArrayBuffer = js.Any.fromFunction0(asArrayBuffer), asBinary = js.Any.fromFunction0(asBinary), asNodeBuffer = js.Any.fromFunction0(asNodeBuffer), asText = js.Any.fromFunction0(asText), asUint8Array = js.Any.fromFunction0(asUint8Array), comment = comment.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dosPermissions = dosPermissions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], unixPermissions = unixPermissions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZipObject]
  }
}

