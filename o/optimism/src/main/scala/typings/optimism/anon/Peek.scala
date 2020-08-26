package typings.optimism.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Peek[TKeyArgs /* <: js.Array[_] */, TResult] extends js.Object {
  def dirty(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
  ): Unit = js.native
  def peek(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
  ): js.UndefOr[TResult] = js.native
}

object Peek {
  @scala.inline
  def apply[/* <: js.Array[_] */ TKeyArgs, TResult](dirty: TKeyArgs => Unit, peek: TKeyArgs => js.UndefOr[TResult]): Peek[TKeyArgs, TResult] = {
    val __obj = js.Dynamic.literal(dirty = js.Any.fromFunction1(dirty), peek = js.Any.fromFunction1(peek))
    __obj.asInstanceOf[Peek[TKeyArgs, TResult]]
  }
  @scala.inline
  implicit class PeekOps[Self <: Peek[_, _], /* <: js.Array[_] */ TKeyArgs, TResult] (val x: Self with (Peek[TKeyArgs, TResult])) extends AnyVal {
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
    def setDirty(value: TKeyArgs => Unit): Self = this.set("dirty", js.Any.fromFunction1(value))
    @scala.inline
    def setPeek(value: TKeyArgs => js.UndefOr[TResult]): Self = this.set("peek", js.Any.fromFunction1(value))
  }
  
}

