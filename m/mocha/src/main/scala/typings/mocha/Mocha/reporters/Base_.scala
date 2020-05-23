package typings.mocha.Mocha.reporters

import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.Stats
import typings.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Base` reporter.
  *
  * All other reporters generally inherit from this reporter, providing stats such as test duration,
  * number of tests passed / failed, etc.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Base.html
  */
trait Base_ extends js.Object {
  var done: js.UndefOr[
    js.Function2[
      /* failures */ Double, 
      /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]], 
      Unit
    ]
  ] = js.undefined
  /**
    * Test failures
    */
  var failures: js.Array[Test]
  /**
    * The configured runner
    */
  var runner: Runner
  /**
    * Test run statistics
    */
  var stats: Stats
  /**
    * Output common epilogue used by many of the bundled reporters.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
    */
  def epilogue(): Unit
}

object Base_ {
  @scala.inline
  def apply(
    epilogue: () => Unit,
    failures: js.Array[Test],
    runner: Runner,
    stats: Stats,
    done: (/* failures */ Double, /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]]) => Unit = null
  ): Base_ = {
    val __obj = js.Dynamic.literal(epilogue = js.Any.fromFunction0(epilogue), failures = failures.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction2(done))
    __obj.asInstanceOf[Base_]
  }
}

