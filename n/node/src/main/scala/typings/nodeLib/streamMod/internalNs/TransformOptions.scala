package typings
package nodeLib.streamMod.internalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformOptions extends DuplexOptions {
  @JSName("destroy")
  var destroy_TransformOptions: js.UndefOr[
    js.ThisFunction2[
      /* this */ Transform, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  @JSName("final")
  var final_TransformOptions: js.UndefOr[
    js.ThisFunction1[
      /* this */ Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var flush: js.UndefOr[
    js.ThisFunction1[/* this */ Transform, /* callback */ TransformCallback, scala.Unit]
  ] = js.undefined
  @JSName("read")
  var read_TransformOptions: js.UndefOr[js.ThisFunction1[/* this */ Transform, /* size */ scala.Double, scala.Unit]] = js.undefined
  var transform: js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ TransformCallback, 
      scala.Unit
    ]
  ] = js.undefined
  @JSName("write")
  var write_TransformOptions: js.UndefOr[
    js.ThisFunction3[
      /* this */ Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  @JSName("writev")
  var writev_TransformOptions: js.UndefOr[
    js.ThisFunction2[
      /* this */ Transform, 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
}

