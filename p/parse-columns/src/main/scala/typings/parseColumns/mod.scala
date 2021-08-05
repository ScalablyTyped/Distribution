package typings.parseColumns

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def apply[ValuesType /* <: js.Any */](textColumns: String): js.Array[StringDictionary[ValuesType]] = ^.asInstanceOf[js.Dynamic].apply(textColumns.asInstanceOf[js.Any]).asInstanceOf[js.Array[StringDictionary[ValuesType]]]
  inline def apply[ValuesType /* <: js.Any */](textColumns: String, options: Options[ValuesType]): js.Array[StringDictionary[ValuesType]] = (^.asInstanceOf[js.Dynamic].apply(textColumns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[StringDictionary[ValuesType]]]
  
  @JSImport("parse-columns", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options[ValuesType /* <: js.Any */] extends StObject {
    
    /**
    		Headers to use instead of the existing ones.
    		*/
    val headers: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
    		Separator to split columns on.
    		@default ' '
    		*/
    val separator: js.UndefOr[String] = js.undefined
    
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
      ] = js.undefined
  }
  object Options {
    
    inline def apply[ValuesType /* <: js.Any */](): Options[ValuesType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[ValuesType]]
    }
    
    extension [Self <: Options[?], ValuesType /* <: js.Any */](x: Self & Options[ValuesType]) {
      
      inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setTransform(
        value: (/* element */ String, /* header */ String, /* columnIndex */ Double, /* rowIndex */ Double) => ValuesType
      ): Self = StObject.set(x, "transform", js.Any.fromFunction4(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
}
