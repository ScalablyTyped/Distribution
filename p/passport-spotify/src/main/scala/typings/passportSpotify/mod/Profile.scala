package typings.passportSpotify.mod

import typings.passportSpotify.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var _json: js.Any
  var _raw: String
  var country: String
  var displayName: String
  var emails: js.UndefOr[js.Array[Type]] = js.undefined
  var followers: Double | Null
  var id: String
  var photos: js.Array[String] | Null
  var product: String | Null
  var profileUrl: String | Null
  var provider: String
  var username: String
}

object Profile {
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: String,
    country: String,
    displayName: String,
    id: String,
    provider: String,
    username: String,
    emails: js.Array[Type] = null,
    followers: Double = null.asInstanceOf[Double],
    photos: js.Array[String] = null,
    product: String = null,
    profileUrl: String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], profileUrl = profileUrl.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

