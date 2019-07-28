package typings.moveDashFile.moveDashFileMod

import typings.moveDashFile.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("move-file", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Move a file.
  	@param source - File you want to move.
  	@param destination - Where you want the file moved.
  	@returns A `Promise` that resolves when the file has been moved.
  	@example
  	```
  	import moveFile = require('move-file');
  	(async () => {
  		await moveFile('source/unicorn.png', 'destination/unicorn.png');
  		console.log('The file has been moved');
  	})();
  	```
  	*/
  def apply(source: String, destination: String): js.Promise[Unit] = js.native
  def apply(source: String, destination: String, options: Options): js.Promise[Unit] = js.native
  /**
  	Move a file.
  	@param source - File you want to move.
  	@param destination - Where you want the file moved.
  	@returns A `Promise` that resolves when the file has been moved.
  	@example
  	```
  	import moveFile = require('move-file');
  	(async () => {
  		await moveFile('source/unicorn.png', 'destination/unicorn.png');
  		console.log('The file has been moved');
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release
  def default(source: String, destination: String): js.Promise[Unit] = js.native
  def default(source: String, destination: String, options: Options): js.Promise[Unit] = js.native
  /**
  	Move a file synchronously.
  	@param source - File you want to move.
  	@param destination - Where you want the file moved.
  	*/
  def sync(source: String, destination: String): Unit = js.native
  def sync(source: String, destination: String, options: Options): Unit = js.native
}

