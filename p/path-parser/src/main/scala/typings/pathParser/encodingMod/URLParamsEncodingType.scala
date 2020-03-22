package typings.pathParser.encodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pathParser.pathParserStrings.default
  - typings.pathParser.pathParserStrings.uri
  - typings.pathParser.pathParserStrings.uriComponent
  - typings.pathParser.pathParserStrings.none
  - typings.pathParser.pathParserStrings.legacy
*/
trait URLParamsEncodingType extends js.Object

object URLParamsEncodingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def default: typings.pathParser.pathParserStrings.default = this.cast("default")
  @scala.inline
  def legacy: typings.pathParser.pathParserStrings.legacy = this.cast("legacy")
  @scala.inline
  def none: typings.pathParser.pathParserStrings.none = this.cast("none")
  @scala.inline
  def uri: typings.pathParser.pathParserStrings.uri = this.cast("uri")
  @scala.inline
  def uriComponent: typings.pathParser.pathParserStrings.uriComponent = this.cast("uriComponent")
}

