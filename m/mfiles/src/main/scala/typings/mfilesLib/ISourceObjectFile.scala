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
    Clone: js.Function0[ISourceObjectFile],
    Extension: java.lang.String,
    SourceFilePath: java.lang.String,
    Title: java.lang.String
  ): ISourceObjectFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Extension")(Extension)
    __obj.updateDynamic("SourceFilePath")(SourceFilePath)
    __obj.updateDynamic("Title")(Title)
    __obj.asInstanceOf[ISourceObjectFile]
  }
}

