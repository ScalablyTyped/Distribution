package typings.open.mod

import typings.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("open", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Open stuff like URLs, files, executables. Cross-platform.
  Uses the command `open` on OS X, `start` on Windows and `xdg-open` on other platforms.
  There is a caveat for [double-quotes on Windows](https://github.com/sindresorhus/open#double-quotes-on-windows) where all double-quotes are stripped from the `target`.
  @param target - The thing you want to open. Can be a URL, file, or executable. Opens in the default app for the file type. For example, URLs open in your default browser.
  @returns The [spawned child process](https://nodejs.org/api/child_process.html#child_process_class_childprocess). You would normally not need to use this for anything, but it can be useful if you'd like to attach custom event listeners or perform other operations directly on the spawned process.
  @example
  ```
  import open = require('open');
  // Opens the image in the default image viewer
  (async () => {
  	await open('unicorn.png', {wait: true});
  	console.log('The image viewer app closed');
  	// Opens the url in the default browser
  	await open('https://sindresorhus.com');
  	// Specify the app to open in
  	await open('https://sindresorhus.com', {app: 'firefox'});
  	// Specify app arguments
  	await open('https://sindresorhus.com', {app: ['google chrome', '--incognito']});
  })();
  ```
  */
  def apply(target: String): js.Promise[ChildProcess] = js.native
  def apply(target: String, options: Options): js.Promise[ChildProcess] = js.native
}
