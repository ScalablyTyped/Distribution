package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceObjectFile extends js.Object {
  var Extension: java.lang.String
  var SourceFilePath: java.lang.String
  var Title: java.lang.String
  def Clone(): ISourceObjectFile
}

object ISourceObjectFile {
  @scala.inline
  def apply(
    Clone: () => ISourceObjectFile,
    Extension: java.lang.String,
    SourceFilePath: java.lang.String,
    Title: java.lang.String
  ): ISourceObjectFile = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Extension = Extension, SourceFilePath = SourceFilePath, Title = Title)
  
    __obj.asInstanceOf[ISourceObjectFile]
  }
}

