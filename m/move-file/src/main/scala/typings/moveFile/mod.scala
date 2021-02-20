package typings.moveFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @JSImport("move-file", JSImport.Namespace)
  @js.native
  def apply(source: String, destination: String): js.Promise[Unit] = js.native
  @JSImport("move-file", JSImport.Namespace)
  @js.native
  def apply(source: String, destination: String, options: Options): js.Promise[Unit] = js.native
  
  /**
  	Move a file synchronously.
  	@param source - File you want to move.
  	@param destination - Where you want the file moved.
  	*/
  @JSImport("move-file", "sync")
  @js.native
  def sync(source: String, destination: String): Unit = js.native
  @JSImport("move-file", "sync")
  @js.native
  def sync(source: String, destination: String, options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Overwrite existing destination file.
    		@default true
    		*/
    val overwrite: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
}
