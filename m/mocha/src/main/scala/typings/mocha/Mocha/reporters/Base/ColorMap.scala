package typings.mocha.Mocha.reporters.Base

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Default color map
  *
  * @see https://mochajs.org/api/module-base#.colors
  */
@js.native
trait ColorMap extends /* key */ StringDictionary[Double] {
  
  var `bright fail`: Double = js.native
  
  var `bright pass`: Double = js.native
  
  var `bright yellow`: Double = js.native
  
  var checkmark: Double = js.native
  
  var `diff added`: Double = js.native
  
  var `diff gutter`: Double = js.native
  
  var `diff removed`: Double = js.native
  
  var `error message`: Double = js.native
  
  var `error stack`: Double = js.native
  
  var `error title`: Double = js.native
  
  var fail: Double = js.native
  
  var fast: Double = js.native
  
  var green: Double = js.native
  
  var light: Double = js.native
  
  var medium: Double = js.native
  
  // added by Base
  var pass: Double = js.native
  
  var pending: Double = js.native
  
  // added by Landing
  var plane: Double = js.native
  
  var `plane crash`: Double = js.native
  
  // added by Progress
  var progress: Double = js.native
  
  var runway: Double = js.native
  
  var slow: Double = js.native
  
  var suite: Double = js.native
}
object ColorMap {
  
  @scala.inline
  def apply(
    `bright fail`: Double,
    `bright pass`: Double,
    `bright yellow`: Double,
    checkmark: Double,
    `diff added`: Double,
    `diff gutter`: Double,
    `diff removed`: Double,
    `error message`: Double,
    `error stack`: Double,
    `error title`: Double,
    fail: Double,
    fast: Double,
    green: Double,
    light: Double,
    medium: Double,
    pass: Double,
    pending: Double,
    plane: Double,
    `plane crash`: Double,
    progress: Double,
    runway: Double,
    slow: Double,
    suite: Double
  ): ColorMap = {
    val __obj = js.Dynamic.literal(checkmark = checkmark.asInstanceOf[js.Any], fail = fail.asInstanceOf[js.Any], fast = fast.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], runway = runway.asInstanceOf[js.Any], slow = slow.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.updateDynamic("bright fail")((`bright fail`).asInstanceOf[js.Any])
    __obj.updateDynamic("bright pass")((`bright pass`).asInstanceOf[js.Any])
    __obj.updateDynamic("bright yellow")((`bright yellow`).asInstanceOf[js.Any])
    __obj.updateDynamic("diff added")((`diff added`).asInstanceOf[js.Any])
    __obj.updateDynamic("diff gutter")((`diff gutter`).asInstanceOf[js.Any])
    __obj.updateDynamic("diff removed")((`diff removed`).asInstanceOf[js.Any])
    __obj.updateDynamic("error message")((`error message`).asInstanceOf[js.Any])
    __obj.updateDynamic("error stack")((`error stack`).asInstanceOf[js.Any])
    __obj.updateDynamic("error title")((`error title`).asInstanceOf[js.Any])
    __obj.updateDynamic("plane crash")((`plane crash`).asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorMap]
  }
  
  @scala.inline
  implicit class ColorMapOps[Self <: ColorMap] (val x: Self) extends AnyVal {
    
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
    def `setBright fail`(value: Double): Self = this.set("bright fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBright pass`(value: Double): Self = this.set("bright pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBright yellow`(value: Double): Self = this.set("bright yellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckmark(value: Double): Self = this.set("checkmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDiff added`(value: Double): Self = this.set("diff added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDiff gutter`(value: Double): Self = this.set("diff gutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDiff removed`(value: Double): Self = this.set("diff removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setError message`(value: Double): Self = this.set("error message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setError stack`(value: Double): Self = this.set("error stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setError title`(value: Double): Self = this.set("error title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: Double): Self = this.set("fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFast(value: Double): Self = this.set("fast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: Double): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLight(value: Double): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: Double): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: Double): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: Double): Self = this.set("pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlane(value: Double): Self = this.set("plane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPlane crash`(value: Double): Self = this.set("plane crash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunway(value: Double): Self = this.set("runway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlow(value: Double): Self = this.set("slow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuite(value: Double): Self = this.set("suite", value.asInstanceOf[js.Any])
  }
}
