package typings.openDashEditor.openDashEditorMod

import typings.lineDashColumnDashPath.lineDashColumnDashPathMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("open-editor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Open the given files in the user's editor at specific line and column if supported by the editor. It does not wait for the editor to start or quit.
  	@param files - Items should be in the format `foo.js:1:5` or `{file: 'foo.js', line: 1: column: 5}`.
  	@example
  	```
  	import openEditor = require('open-editor');
  	openEditor([
  		'unicorn.js:5:3',
  		{
  			file: 'readme.md',
  			line: 10,
  			column: 2
  		}
  	]);
  	```
  	*/
  def apply(files: js.Array[PathLike]): Unit = js.native
  def apply(files: js.Array[PathLike], options: Options): Unit = js.native
  /**
  	Same as `openEditor()`, but returns an object with the binary name, arguments, and a flag indicating whether the editor runs in the terminal.
  	Can be useful if you want to handle opening the files yourself.
  	@example
  	```
  	{binary: 'subl', arguments: ['foo.js:1:5'], isTerminalEditor: false}
  	```
  	*/
  def make(files: js.Array[PathLike]): EditorRunConfig = js.native
  def make(files: js.Array[PathLike], options: Options): EditorRunConfig = js.native
}

