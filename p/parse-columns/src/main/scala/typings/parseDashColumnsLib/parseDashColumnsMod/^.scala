package typings
package parseDashColumnsLib.parseDashColumnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse-columns", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def apply[ValuesType /* <: js.Any */](textColumns: java.lang.String): js.Array[org.scalablytyped.runtime.StringDictionary[ValuesType]] = js.native
  def apply[ValuesType /* <: js.Any */](textColumns: java.lang.String, options: Options[ValuesType]): js.Array[org.scalablytyped.runtime.StringDictionary[ValuesType]] = js.native
}

