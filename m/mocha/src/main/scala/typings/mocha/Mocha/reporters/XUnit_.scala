package typings.mocha.Mocha.reporters

import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.Stats
import typings.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `XUnit` test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
  */
@js.native
trait XUnit_ extends Base {
  /**
    * Override done to close the stream (if it's a file).
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#done
    */
  @JSName("done")
  def done_MXUnit_(failures: Double, fn: js.Function1[/* failures */ Double, Unit]): Unit = js.native
  /**
    * Output tag for the given `test.`
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#test
    */
  def test(test: Test): Unit = js.native
  /**
    * Write out the given line.
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html#write
    */
  def write(line: String): Unit = js.native
}

object XUnit_ {
  @scala.inline
  def apply(
    done: (Double, js.Function1[/* failures */ Double, Unit]) => Unit,
    epilogue: () => Unit,
    failures: js.Array[Test],
    runner: Runner,
    stats: Stats,
    test: Test => Unit,
    write: String => Unit
  ): XUnit_ = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction2(done), epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], test = js.Any.fromFunction1(test), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[XUnit_]
  }
  @scala.inline
  implicit class XUnit_Ops[Self <: XUnit_] (val x: Self) extends AnyVal {
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
    def setDone(value: (Double, js.Function1[/* failures */ Double, Unit]) => Unit): Self = this.set("done", js.Any.fromFunction2(value))
    @scala.inline
    def setTest(value: Test => Unit): Self = this.set("test", js.Any.fromFunction1(value))
    @scala.inline
    def setWrite(value: String => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

