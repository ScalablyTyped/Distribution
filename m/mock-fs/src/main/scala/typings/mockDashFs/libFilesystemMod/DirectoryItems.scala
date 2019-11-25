package typings.mockDashFs.libFilesystemMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryItems
  extends /* name */ StringDictionary[
      String | Buffer | (js.Function0[
        typings.mockDashFs.libFileMod.^  | typings.mockDashFs.libDirectoryMod.^  | typings.mockDashFs.libSymlinkMod.^ 
      ]) | DirectoryItems
    ]

object DirectoryItems {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[
      String | Buffer | (js.Function0[
        typings.mockDashFs.libFileMod.^  | typings.mockDashFs.libDirectoryMod.^  | typings.mockDashFs.libSymlinkMod.^ 
      ]) | DirectoryItems
    ] = null
  ): DirectoryItems = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DirectoryItems]
  }
}

