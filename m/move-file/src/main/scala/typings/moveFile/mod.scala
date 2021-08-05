package typings.moveFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply(source: String, destination: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(source: String, destination: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("move-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Move a file synchronously.
  	@param source - File you want to move.
  	@param destination - Where you want the file moved.
  	*/
  inline def sync(source: String, destination: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def sync(source: String, destination: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
    		Overwrite existing destination file.
    		@default true
    		*/
    val overwrite: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
}
