package typings
package nodeLib.streamMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableOptions extends js.Object {
  var decodeStrings: js.UndefOr[scala.Boolean] = js.undefined
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var highWaterMark: js.UndefOr[scala.Double] = js.undefined
  var objectMode: js.UndefOr[scala.Boolean] = js.undefined
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
}

object WritableOptions {
  @scala.inline
  def apply(
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.ThisFunction2[
      /* this */ Writable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    `final`: js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    highWaterMark: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Writable, 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null
  ): WritableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    __obj.asInstanceOf[WritableOptions]
  }
}

