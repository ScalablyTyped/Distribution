package typings.mockFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object filesystemMod {
  
  type DirectoryItem = java.lang.String | typings.node.Buffer | (js.Function0[
    typings.mockFs.fileMod.^  | typings.mockFs.directoryMod.^  | typings.mockFs.symlinkMod.^ 
  ]) | typings.mockFs.filesystemMod.DirectoryItems
}
