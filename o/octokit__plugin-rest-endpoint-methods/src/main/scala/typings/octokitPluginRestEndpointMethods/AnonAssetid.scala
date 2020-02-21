package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAssetid extends js.Object {
  var asset_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonAssetid {
  @scala.inline
  def apply(asset_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonAssetid = {
    val __obj = js.Dynamic.literal(asset_id = asset_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAssetid]
  }
}

