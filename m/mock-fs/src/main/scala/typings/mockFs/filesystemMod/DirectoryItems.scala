package typings.mockFs.filesystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryItems
  extends /* name */ StringDictionary[
      String | Buffer | (js.Function0[
        typings.mockFs.fileMod.^  | typings.mockFs.directoryMod.^  | typings.mockFs.symlinkMod.^ 
      ]) | DirectoryItems
    ]

object DirectoryItems {
  @scala.inline
  def apply(): DirectoryItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryItems]
  }
}

