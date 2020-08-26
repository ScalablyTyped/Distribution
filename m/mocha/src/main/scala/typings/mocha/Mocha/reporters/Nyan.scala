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
@js.native
trait Nyan extends Base {
  var appendRainbow: js.Any = js.native
  var colorIndex: js.Any = js.native
  var cursorDown: js.Any = js.native
  var cursorUp: js.Any = js.native
  var draw: js.Any = js.native
  var drawNyanCat: js.Any = js.native
  var drawRainbow: js.Any = js.native
  var drawScoreboard: js.Any = js.native
  var face: js.Any = js.native
  var generateColors: js.Any = js.native
  var numberOfLines: js.Any = js.native
  var rainbowColors: js.Any = js.native
  var rainbowify: js.Any = js.native
  var scoreboardWidth: js.Any = js.native
  var tick: js.Any = js.native
  var trajectories: js.Any = js.native
  var trajectoryWidthMax: js.Any = js.native
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
    trajectoryWidthMax: js.Any
  ): Nyan = {
    val __obj = js.Dynamic.literal(appendRainbow = appendRainbow.asInstanceOf[js.Any], colorIndex = colorIndex.asInstanceOf[js.Any], cursorDown = cursorDown.asInstanceOf[js.Any], cursorUp = cursorUp.asInstanceOf[js.Any], draw = draw.asInstanceOf[js.Any], drawNyanCat = drawNyanCat.asInstanceOf[js.Any], drawRainbow = drawRainbow.asInstanceOf[js.Any], drawScoreboard = drawScoreboard.asInstanceOf[js.Any], epilogue = js.Any.fromFunction0(epilogue), face = face.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], generateColors = generateColors.asInstanceOf[js.Any], numberOfLines = numberOfLines.asInstanceOf[js.Any], rainbowColors = rainbowColors.asInstanceOf[js.Any], rainbowify = rainbowify.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], scoreboardWidth = scoreboardWidth.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], tick = tick.asInstanceOf[js.Any], trajectories = trajectories.asInstanceOf[js.Any], trajectoryWidthMax = trajectoryWidthMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nyan]
  }
  @scala.inline
  implicit class NyanOps[Self <: Nyan] (val x: Self) extends AnyVal {
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
    def setAppendRainbow(value: js.Any): Self = this.set("appendRainbow", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorIndex(value: js.Any): Self = this.set("colorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorDown(value: js.Any): Self = this.set("cursorDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorUp(value: js.Any): Self = this.set("cursorUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraw(value: js.Any): Self = this.set("draw", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawNyanCat(value: js.Any): Self = this.set("drawNyanCat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawRainbow(value: js.Any): Self = this.set("drawRainbow", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawScoreboard(value: js.Any): Self = this.set("drawScoreboard", value.asInstanceOf[js.Any])
    @scala.inline
    def setFace(value: js.Any): Self = this.set("face", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenerateColors(value: js.Any): Self = this.set("generateColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfLines(value: js.Any): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setRainbowColors(value: js.Any): Self = this.set("rainbowColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setRainbowify(value: js.Any): Self = this.set("rainbowify", value.asInstanceOf[js.Any])
    @scala.inline
    def setScoreboardWidth(value: js.Any): Self = this.set("scoreboardWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTick(value: js.Any): Self = this.set("tick", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrajectories(value: js.Any): Self = this.set("trajectories", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrajectoryWidthMax(value: js.Any): Self = this.set("trajectoryWidthMax", value.asInstanceOf[js.Any])
  }
  
}

