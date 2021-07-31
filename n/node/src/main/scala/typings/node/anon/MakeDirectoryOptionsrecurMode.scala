package typings.node.anon

import typings.node.fsMod.Mode
import typings.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.fs.MakeDirectoryOptions & {  recursive :false | undefined} */
trait MakeDirectoryOptionsrecurMode extends StObject {
  
  /**
    * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
    * @default 0o777
    */
  var mode: js.UndefOr[Mode] = js.undefined
  
  /**
    * Indicates whether parent folders should be created.
    * If a folder was created, the path to the first created folder will be returned.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] & js.UndefOr[`false`]
}
object MakeDirectoryOptionsrecurMode {
  
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] & js.UndefOr[`false`]): MakeDirectoryOptionsrecurMode = {
    val __obj = js.Dynamic.literal(recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeDirectoryOptionsrecurMode]
  }
  
  @scala.inline
  implicit class MakeDirectoryOptionsrecurModeMutableBuilder[Self <: MakeDirectoryOptionsrecurMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setRecursive(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
  }
}
