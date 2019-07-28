package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceObjectFile extends js.Object {
  var Extension: String
  var SourceFilePath: String
  var Title: String
  def Clone(): ISourceObjectFile
}

object ISourceObjectFile {
  @scala.inline
  def apply(Clone: () => ISourceObjectFile, Extension: String, SourceFilePath: String, Title: String): ISourceObjectFile = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Extension = Extension, SourceFilePath = SourceFilePath, Title = Title)
  
    __obj.asInstanceOf[ISourceObjectFile]
  }
}

