package typings.node.streamMod

import typings.node.BufferEncoding
import typings.node.anon.Chunk
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.node.streamMod.WritableOptions because var conflicts: autoDestroy, destroy, highWaterMark, objectMode. Inlined decodeStrings, defaultEncoding, emitClose, write, writev, `final` */ @js.native
trait DuplexOptions extends ReadableOptions {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  var decodeStrings: js.UndefOr[Boolean] = js.native
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
  @JSName("destroy")
  var destroy_DuplexOptions: js.UndefOr[
    js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  var emitClose: js.UndefOr[Boolean] = js.native
  var `final`: js.UndefOr[
    js.ThisFunction1[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  @JSName("read")
  var read_DuplexOptions: js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]] = js.native
  var readableHighWaterMark: js.UndefOr[Double] = js.native
  var readableObjectMode: js.UndefOr[Boolean] = js.native
  var writableCorked: js.UndefOr[Double] = js.native
  var writableHighWaterMark: js.UndefOr[Double] = js.native
  var writableObjectMode: js.UndefOr[Boolean] = js.native
  var write: js.UndefOr[
    js.ThisFunction3[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  var writev: js.UndefOr[
    js.ThisFunction2[
      (/* this */ Duplex) | (/* this */ Writable), 
      /* chunks */ js.Array[Chunk], 
      /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
}

object DuplexOptions {
  @scala.inline
  def apply(): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplexOptions]
  }
  @scala.inline
  implicit class DuplexOptionsOps[Self <: DuplexOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowHalfOpen(value: Boolean): Self = this.set("allowHalfOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHalfOpen: Self = this.set("allowHalfOpen", js.undefined)
    @scala.inline
    def setDecodeStrings(value: Boolean): Self = this.set("decodeStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecodeStrings: Self = this.set("decodeStrings", js.undefined)
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEncoding: Self = this.set("defaultEncoding", js.undefined)
    @scala.inline
    def setDestroy(
      value: js.ThisFunction2[
          /* this */ Duplex, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
    ): Self = this.set("destroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setEmitClose(value: Boolean): Self = this.set("emitClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitClose: Self = this.set("emitClose", js.undefined)
    @scala.inline
    def setFinal(
      value: js.ThisFunction1[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = this.set("final", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinal: Self = this.set("final", js.undefined)
    @scala.inline
    def setRead(value: js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setReadableHighWaterMark(value: Double): Self = this.set("readableHighWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadableHighWaterMark: Self = this.set("readableHighWaterMark", js.undefined)
    @scala.inline
    def setReadableObjectMode(value: Boolean): Self = this.set("readableObjectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadableObjectMode: Self = this.set("readableObjectMode", js.undefined)
    @scala.inline
    def setWritableCorked(value: Double): Self = this.set("writableCorked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritableCorked: Self = this.set("writableCorked", js.undefined)
    @scala.inline
    def setWritableHighWaterMark(value: Double): Self = this.set("writableHighWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritableHighWaterMark: Self = this.set("writableHighWaterMark", js.undefined)
    @scala.inline
    def setWritableObjectMode(value: Boolean): Self = this.set("writableObjectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritableObjectMode: Self = this.set("writableObjectMode", js.undefined)
    @scala.inline
    def setWrite(
      value: js.ThisFunction3[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding, 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = this.set("write", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
    @scala.inline
    def setWritev(
      value: js.ThisFunction2[
          (/* this */ Duplex) | (/* this */ Writable), 
          /* chunks */ js.Array[Chunk], 
          /* callback */ js.Function1[js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = this.set("writev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWritev: Self = this.set("writev", js.undefined)
  }
  
}

