package typings.overwatchDashApi.overwatchDashApiMod.owl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamData extends js.Object {
  var abbreviatedName: String
  var addressCountry: String
  var availableLanguages: js.Array[String]
  var game: String
  var handle: String
  var homeLocation: String
  var icon: String
  var id: Double
  var logo: String
  var name: String
  var primaryColor: String
  var secondaryColor: String
  var secondaryPhoto: String
  var `type`: String
}

object TeamData {
  @scala.inline
  def apply(
    abbreviatedName: String,
    addressCountry: String,
    availableLanguages: js.Array[String],
    game: String,
    handle: String,
    homeLocation: String,
    icon: String,
    id: Double,
    logo: String,
    name: String,
    primaryColor: String,
    secondaryColor: String,
    secondaryPhoto: String,
    `type`: String
  ): TeamData = {
    val __obj = js.Dynamic.literal(abbreviatedName = abbreviatedName, addressCountry = addressCountry, availableLanguages = availableLanguages, game = game, handle = handle, homeLocation = homeLocation, icon = icon, id = id, logo = logo, name = name, primaryColor = primaryColor, secondaryColor = secondaryColor, secondaryPhoto = secondaryPhoto)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TeamData]
  }
}

