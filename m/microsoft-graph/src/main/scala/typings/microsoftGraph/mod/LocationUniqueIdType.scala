package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.locationStore
  - typings.microsoftGraph.microsoftGraphStrings.directory
  - typings.microsoftGraph.microsoftGraphStrings.`private`
  - typings.microsoftGraph.microsoftGraphStrings.bing
*/
trait LocationUniqueIdType extends js.Object

object LocationUniqueIdType {
  @scala.inline
  def bing: typings.microsoftGraph.microsoftGraphStrings.bing = this.cast("bing")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def directory: typings.microsoftGraph.microsoftGraphStrings.directory = this.cast("directory")
  @scala.inline
  def locationStore: typings.microsoftGraph.microsoftGraphStrings.locationStore = this.cast("locationStore")
  @scala.inline
  def `private`: typings.microsoftGraph.microsoftGraphStrings.`private` = this.cast("private")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

