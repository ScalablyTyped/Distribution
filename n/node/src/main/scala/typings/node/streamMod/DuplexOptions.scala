package typings.node.streamMod

import typings.node.Anon_Chunk
import typings.node.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.node.streamMod.WritableOptions because var conflicts: autoDestroy, destroy, highWaterMark, objectMode. Inlined decodeStrings, defaultEncoding, emitClose, write, writev, `final` */ trait DuplexOptions extends ReadableOptions {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var decodeStrings: js.UndefOr[Boolean] = js.undefined
  var defaultEncoding: js.UndefOr[java.lang.String] = js.undefined
  @JSName("destroy")
  var destroy_DuplexOptions: js.UndefOr[
    js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  var emitClose: js.UndefOr[Boolean] = js.undefined
  var `final`: js.UndefOr[
    js.ThisFunction1[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  @JSName("read")
  var read_DuplexOptions: js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]] = js.undefined
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
  var writableObjectMode: js.UndefOr[Boolean] = js.undefined
  var write: js.UndefOr[
    js.ThisFunction3[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var writev: js.UndefOr[
    js.ThisFunction2[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}

object DuplexOptions {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    decodeStrings: js.UndefOr[Boolean] = js.undefined,
    defaultEncoding: java.lang.String = null,
    destroy: js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    emitClose: js.UndefOr[Boolean] = js.undefined,
    encoding: java.lang.String = null,
    `final`: js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit] = null,
    readableObjectMode: js.UndefOr[Boolean] = js.undefined,
    writableObjectMode: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null
  ): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    __obj.asInstanceOf[DuplexOptions]
  }
}

