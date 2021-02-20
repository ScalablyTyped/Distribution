package typings.parseColumns

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Parse text columns, like the output of Unix commands.
  @param textColumns - Text columns to parse.
  @example
  ```
  import {promisify} from 'util';
  import * as childProcess from 'child_process';
  import parseColumns = require('parse-columns');
  const execFileP = promisify(childProcess.execFile);
  (async () => {
  	const {stdout} = await execFileP('df', ['-kP']);
  	console.log(parseColumns(stdout, {
  		transform: (item, header, columnIndex) => {
  			// Coerce elements in column index 1 to 3 to a number
  			if (columnIndex >= 1 && columnIndex <= 3) {
  				return Number(item);
  			}
  			return item;
  		}
  	}));
  	// [
  	// 	{
  	// 		Filesystem: '/dev/disk1',
  	// 		'1024-blocks': 487350400,
  	// 		Used: 467528020,
  	// 		Available: 19566380,
  	// 		Capacity: '96%',
  	// 		'Mounted on': '/'
  	// 	},
  	// 	…
  	// ]
  })();
  ```
  */
  @JSImport("parse-columns", JSImport.Namespace)
  @js.native
  def apply[ValuesType /* <: js.Any */](textColumns: String): js.Array[StringDictionary[ValuesType]] = js.native
  @JSImport("parse-columns", JSImport.Namespace)
  @js.native
  def apply[ValuesType /* <: js.Any */](textColumns: String, options: Options[ValuesType]): js.Array[StringDictionary[ValuesType]] = js.native
  
  @js.native
  trait Options[ValuesType /* <: js.Any */] extends StObject {
    
    /**
    		Headers to use instead of the existing ones.
    		*/
    val headers: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		Separator to split columns on.
    		@default ' '
    		*/
    val separator: js.UndefOr[String] = js.native
    
    /**
    		Transform elements.
    		Useful for being able to cleanup or change the type of elements.
    		*/
    val transform: js.UndefOr[
        js.Function4[
          /* element */ String, 
          /* header */ String, 
          /* columnIndex */ Double, 
          /* rowIndex */ Double, 
          ValuesType
        ]
      ] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[ValuesType /* <: js.Any */](): Options[ValuesType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ValuesType]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], ValuesType /* <: js.Any */] (val x: Self with Options[ValuesType]) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setTransform(
        value: (/* element */ String, /* header */ String, /* columnIndex */ Double, /* rowIndex */ Double) => ValuesType
      ): Self = StObject.set(x, "transform", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
