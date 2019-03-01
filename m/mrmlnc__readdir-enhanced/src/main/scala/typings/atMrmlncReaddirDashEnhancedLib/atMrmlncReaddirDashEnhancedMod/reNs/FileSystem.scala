package typings
package atMrmlncReaddirDashEnhancedLib.atMrmlncReaddirDashEnhancedMod.reNs

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

object FileSystem {
  @scala.inline
  def apply(
    lstat: js.Function2[
      /* path */ java.lang.String, 
      /* callback */ Callback[nodeLib.fsMod.Stats], 
      scala.Unit
    ] = null,
    readdir: js.Function2[
      /* path */ java.lang.String, 
      /* callback */ Callback[js.Array[java.lang.String]], 
      scala.Unit
    ] = null,
    stat: js.Function2[
      /* path */ java.lang.String, 
      /* callback */ Callback[nodeLib.fsMod.Stats], 
      scala.Unit
    ] = null
  ): FileSystem = {
    val __obj = js.Dynamic.literal()
    if (lstat != null) __obj.updateDynamic("lstat")(lstat)
    if (readdir != null) __obj.updateDynamic("readdir")(readdir)
    if (stat != null) __obj.updateDynamic("stat")(stat)
    __obj.asInstanceOf[FileSystem]
  }
}

