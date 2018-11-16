package typings
package atMrmlncReaddirDashEnhancedLib.readdirDashEnhancedMod.reNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FileSystem extends js.Object {
  var lstat: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ Callback[nodeLib.fsMod.Stats], 
      scala.Unit
    ]
  ] = js.undefined
  var readdir: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ Callback[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ] = js.undefined
  var stat: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String, 
      /* callback */ Callback[nodeLib.fsMod.Stats], 
      scala.Unit
    ]
  ] = js.undefined
}

