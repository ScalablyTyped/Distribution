package typings.microsoftteams.microsoftTeams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabInstanceParameters extends js.Object {
  /**
    * Flag allowing to select favorite channels only
    */
  var favoriteChannelsOnly: js.UndefOr[Boolean] = js.native
  /**
    * Flag allowing to select favorite teams only
    */
  var favoriteTeamsOnly: js.UndefOr[Boolean] = js.native
}

object TabInstanceParameters {
  @scala.inline
  def apply(): TabInstanceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabInstanceParameters]
  }
  @scala.inline
  implicit class TabInstanceParametersOps[Self <: TabInstanceParameters] (val x: Self) extends AnyVal {
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
    def setFavoriteChannelsOnly(value: Boolean): Self = this.set("favoriteChannelsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFavoriteChannelsOnly: Self = this.set("favoriteChannelsOnly", js.undefined)
    @scala.inline
    def setFavoriteTeamsOnly(value: Boolean): Self = this.set("favoriteTeamsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFavoriteTeamsOnly: Self = this.set("favoriteTeamsOnly", js.undefined)
  }
  
}

