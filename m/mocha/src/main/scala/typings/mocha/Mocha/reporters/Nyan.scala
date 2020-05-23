package typings.mocha.Mocha.reporters

import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.Stats
import typings.mocha.Mocha.Test
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `NyanCat` test reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
  */
trait Nyan extends Base {
  var appendRainbow: js.Any
  var colorIndex: js.Any
  var cursorDown: js.Any
  var cursorUp: js.Any
  var draw: js.Any
  var drawNyanCat: js.Any
  var drawRainbow: js.Any
  var drawScoreboard: js.Any
  var face: js.Any
  var generateColors: js.Any
  var numberOfLines: js.Any
  var rainbowColors: js.Any
  var rainbowify: js.Any
  var scoreboardWidth: js.Any
  var tick: js.Any
  var trajectories: js.Any
  var trajectoryWidthMax: js.Any
}

object Nyan {
  @scala.inline
  def apply(
    appendRainbow: js.Any,
    colorIndex: js.Any,
    cursorDown: js.Any,
    cursorUp: js.Any,
    draw: js.Any,
    drawNyanCat: js.Any,
    drawRainbow: js.Any,
    drawScoreboard: js.Any,
    epilogue: () => Unit,
    face: js.Any,
    failures: js.Array[Test],
    generateColors: js.Any,
    numberOfLines: js.Any,
    rainbowColors: js.Any,
    rainbowify: js.Any,
    runner: Runner,
    scoreboardWidth: js.Any,
    stats: Stats,
    tick: js.Any,
    trajectories: js.Any,
    trajectoryWidthMax: js.Any,
    done: (/* failures */ Double, /* fn */ js.UndefOr[js.Function1[/* failures */ Double, Unit]]) => Unit = null
  ): Nyan = {
    val __obj = js.Dynamic.literal(appendRainbow = appendRainbow.asInstanceOf[js.Any], colorIndex = colorIndex.asInstanceOf[js.Any], cursorDown = cursorDown.asInstanceOf[js.Any], cursorUp = cursorUp.asInstanceOf[js.Any], draw = draw.asInstanceOf[js.Any], drawNyanCat = drawNyanCat.asInstanceOf[js.Any], drawRainbow = drawRainbow.asInstanceOf[js.Any], drawScoreboard = drawScoreboard.asInstanceOf[js.Any], epilogue = js.Any.fromFunction0(epilogue), face = face.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], generateColors = generateColors.asInstanceOf[js.Any], numberOfLines = numberOfLines.asInstanceOf[js.Any], rainbowColors = rainbowColors.asInstanceOf[js.Any], rainbowify = rainbowify.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], scoreboardWidth = scoreboardWidth.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], trajectories = trajectories.asInstanceOf[js.Any], trajectoryWidthMax = trajectoryWidthMax.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction2(done))
    __obj.asInstanceOf[Nyan]
  }
}

