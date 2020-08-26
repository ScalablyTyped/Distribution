package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayerStats extends js.Object {
  var name: js.UndefOr[String] = js.native
  var nameEscaped: String = js.native
  var nameEscapedUrl: js.UndefOr[String] = js.native
  var platform: String = js.native
  var region: js.UndefOr[String] = js.native
  var stats: Stats = js.native
}

object PlayerStats {
  @scala.inline
  def apply(nameEscaped: String, platform: String, stats: Stats): PlayerStats = {
    val __obj = js.Dynamic.literal(nameEscaped = nameEscaped.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerStats]
  }
  @scala.inline
  implicit class PlayerStatsOps[Self <: PlayerStats] (val x: Self) extends AnyVal {
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
    def setNameEscaped(value: String): Self = this.set("nameEscaped", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameEscapedUrl(value: String): Self = this.set("nameEscapedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameEscapedUrl: Self = this.set("nameEscapedUrl", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

