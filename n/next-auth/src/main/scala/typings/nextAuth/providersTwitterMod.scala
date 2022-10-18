package typings.nextAuth

import typings.nextAuth.anon.Contributors
import typings.nextAuth.anon.Description
import typings.nextAuth.anon.Entities
import typings.nextAuth.anon.Tweets
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersTwitterMod {
  
  @JSImport("next-auth/providers/twitter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: Record[String, Any] */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  inline def TwitterLegacy[P /* <: Record[String, Any] */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("TwitterLegacy")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  trait TwitterLegacyProfile extends StObject {
    
    var contributors_enabled: Boolean
    
    var created_at: String
    
    var default_profile: Boolean
    
    var default_profile_image: Boolean
    
    var description: String
    
    var entities: Description
    
    var favourites_count: Double
    
    var follow_request_sent: Boolean
    
    var followers_count: Double
    
    var following: Boolean
    
    var friends_count: Double
    
    var geo_enabled: Boolean
    
    var has_extended_profile: Boolean
    
    var id: Double
    
    var id_str: String
    
    var is_translation_enabled: Boolean
    
    var is_translator: Boolean
    
    var lang: js.UndefOr[Any] = js.undefined
    
    var listed_count: Double
    
    var location: String
    
    var name: String
    
    var needs_phone_verification: Boolean
    
    var notifications: Boolean
    
    var profile_background_color: String
    
    var profile_background_image_url: String
    
    var profile_background_image_url_https: String
    
    var profile_background_tile: Boolean
    
    var profile_banner_url: String
    
    var profile_image_url: String
    
    var profile_image_url_https: String
    
    var profile_link_color: String
    
    var profile_sidebar_border_color: String
    
    var profile_sidebar_fill_color: String
    
    var profile_text_color: String
    
    var profile_use_background_image: Boolean
    
    var `protected`: Boolean
    
    var screen_name: String
    
    var status: Contributors
    
    var statuses_count: Double
    
    var suspended: Boolean
    
    var time_zone: js.UndefOr[Any] = js.undefined
    
    var translator_type: String
    
    var url: String
    
    var utc_offset: js.UndefOr[Any] = js.undefined
    
    var verified: Boolean
    
    var withheld_in_countries: js.Array[Any]
  }
  object TwitterLegacyProfile {
    
    inline def apply(
      contributors_enabled: Boolean,
      created_at: String,
      default_profile: Boolean,
      default_profile_image: Boolean,
      description: String,
      entities: Description,
      favourites_count: Double,
      follow_request_sent: Boolean,
      followers_count: Double,
      following: Boolean,
      friends_count: Double,
      geo_enabled: Boolean,
      has_extended_profile: Boolean,
      id: Double,
      id_str: String,
      is_translation_enabled: Boolean,
      is_translator: Boolean,
      listed_count: Double,
      location: String,
      name: String,
      needs_phone_verification: Boolean,
      notifications: Boolean,
      profile_background_color: String,
      profile_background_image_url: String,
      profile_background_image_url_https: String,
      profile_background_tile: Boolean,
      profile_banner_url: String,
      profile_image_url: String,
      profile_image_url_https: String,
      profile_link_color: String,
      profile_sidebar_border_color: String,
      profile_sidebar_fill_color: String,
      profile_text_color: String,
      profile_use_background_image: Boolean,
      `protected`: Boolean,
      screen_name: String,
      status: Contributors,
      statuses_count: Double,
      suspended: Boolean,
      translator_type: String,
      url: String,
      verified: Boolean,
      withheld_in_countries: js.Array[Any]
    ): TwitterLegacyProfile = {
      val __obj = js.Dynamic.literal(contributors_enabled = contributors_enabled.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], default_profile = default_profile.asInstanceOf[js.Any], default_profile_image = default_profile_image.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], entities = entities.asInstanceOf[js.Any], favourites_count = favourites_count.asInstanceOf[js.Any], follow_request_sent = follow_request_sent.asInstanceOf[js.Any], followers_count = followers_count.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], friends_count = friends_count.asInstanceOf[js.Any], geo_enabled = geo_enabled.asInstanceOf[js.Any], has_extended_profile = has_extended_profile.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], is_translation_enabled = is_translation_enabled.asInstanceOf[js.Any], is_translator = is_translator.asInstanceOf[js.Any], listed_count = listed_count.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], needs_phone_verification = needs_phone_verification.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], profile_background_color = profile_background_color.asInstanceOf[js.Any], profile_background_image_url = profile_background_image_url.asInstanceOf[js.Any], profile_background_image_url_https = profile_background_image_url_https.asInstanceOf[js.Any], profile_background_tile = profile_background_tile.asInstanceOf[js.Any], profile_banner_url = profile_banner_url.asInstanceOf[js.Any], profile_image_url = profile_image_url.asInstanceOf[js.Any], profile_image_url_https = profile_image_url_https.asInstanceOf[js.Any], profile_link_color = profile_link_color.asInstanceOf[js.Any], profile_sidebar_border_color = profile_sidebar_border_color.asInstanceOf[js.Any], profile_sidebar_fill_color = profile_sidebar_fill_color.asInstanceOf[js.Any], profile_text_color = profile_text_color.asInstanceOf[js.Any], profile_use_background_image = profile_use_background_image.asInstanceOf[js.Any], screen_name = screen_name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statuses_count = statuses_count.asInstanceOf[js.Any], suspended = suspended.asInstanceOf[js.Any], translator_type = translator_type.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any], withheld_in_countries = withheld_in_countries.asInstanceOf[js.Any])
      __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwitterLegacyProfile]
    }
    
    extension [Self <: TwitterLegacyProfile](x: Self) {
      
      inline def setContributors_enabled(value: Boolean): Self = StObject.set(x, "contributors_enabled", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setDefault_profile(value: Boolean): Self = StObject.set(x, "default_profile", value.asInstanceOf[js.Any])
      
      inline def setDefault_profile_image(value: Boolean): Self = StObject.set(x, "default_profile_image", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEntities(value: Description): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setFavourites_count(value: Double): Self = StObject.set(x, "favourites_count", value.asInstanceOf[js.Any])
      
      inline def setFollow_request_sent(value: Boolean): Self = StObject.set(x, "follow_request_sent", value.asInstanceOf[js.Any])
      
      inline def setFollowers_count(value: Double): Self = StObject.set(x, "followers_count", value.asInstanceOf[js.Any])
      
      inline def setFollowing(value: Boolean): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setFriends_count(value: Double): Self = StObject.set(x, "friends_count", value.asInstanceOf[js.Any])
      
      inline def setGeo_enabled(value: Boolean): Self = StObject.set(x, "geo_enabled", value.asInstanceOf[js.Any])
      
      inline def setHas_extended_profile(value: Boolean): Self = StObject.set(x, "has_extended_profile", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
      
      inline def setIs_translation_enabled(value: Boolean): Self = StObject.set(x, "is_translation_enabled", value.asInstanceOf[js.Any])
      
      inline def setIs_translator(value: Boolean): Self = StObject.set(x, "is_translator", value.asInstanceOf[js.Any])
      
      inline def setLang(value: Any): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      inline def setListed_count(value: Double): Self = StObject.set(x, "listed_count", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNeeds_phone_verification(value: Boolean): Self = StObject.set(x, "needs_phone_verification", value.asInstanceOf[js.Any])
      
      inline def setNotifications(value: Boolean): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setProfile_background_color(value: String): Self = StObject.set(x, "profile_background_color", value.asInstanceOf[js.Any])
      
      inline def setProfile_background_image_url(value: String): Self = StObject.set(x, "profile_background_image_url", value.asInstanceOf[js.Any])
      
      inline def setProfile_background_image_url_https(value: String): Self = StObject.set(x, "profile_background_image_url_https", value.asInstanceOf[js.Any])
      
      inline def setProfile_background_tile(value: Boolean): Self = StObject.set(x, "profile_background_tile", value.asInstanceOf[js.Any])
      
      inline def setProfile_banner_url(value: String): Self = StObject.set(x, "profile_banner_url", value.asInstanceOf[js.Any])
      
      inline def setProfile_image_url(value: String): Self = StObject.set(x, "profile_image_url", value.asInstanceOf[js.Any])
      
      inline def setProfile_image_url_https(value: String): Self = StObject.set(x, "profile_image_url_https", value.asInstanceOf[js.Any])
      
      inline def setProfile_link_color(value: String): Self = StObject.set(x, "profile_link_color", value.asInstanceOf[js.Any])
      
      inline def setProfile_sidebar_border_color(value: String): Self = StObject.set(x, "profile_sidebar_border_color", value.asInstanceOf[js.Any])
      
      inline def setProfile_sidebar_fill_color(value: String): Self = StObject.set(x, "profile_sidebar_fill_color", value.asInstanceOf[js.Any])
      
      inline def setProfile_text_color(value: String): Self = StObject.set(x, "profile_text_color", value.asInstanceOf[js.Any])
      
      inline def setProfile_use_background_image(value: Boolean): Self = StObject.set(x, "profile_use_background_image", value.asInstanceOf[js.Any])
      
      inline def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
      
      inline def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Contributors): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatuses_count(value: Double): Self = StObject.set(x, "statuses_count", value.asInstanceOf[js.Any])
      
      inline def setSuspended(value: Boolean): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
      
      inline def setTime_zone(value: Any): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
      
      inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
      
      inline def setTranslator_type(value: String): Self = StObject.set(x, "translator_type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUtc_offset(value: Any): Self = StObject.set(x, "utc_offset", value.asInstanceOf[js.Any])
      
      inline def setUtc_offsetUndefined: Self = StObject.set(x, "utc_offset", js.undefined)
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
      
      inline def setWithheld_in_countries(value: js.Array[Any]): Self = StObject.set(x, "withheld_in_countries", value.asInstanceOf[js.Any])
      
      inline def setWithheld_in_countriesVarargs(value: Any*): Self = StObject.set(x, "withheld_in_countries", js.Array(value*))
    }
  }
  
  trait TwitterProfile extends StObject {
    
    var data: Entities
    
    var includes: js.UndefOr[Tweets] = js.undefined
  }
  object TwitterProfile {
    
    inline def apply(data: Entities): TwitterProfile = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwitterProfile]
    }
    
    extension [Self <: TwitterProfile](x: Self) {
      
      inline def setData(value: Entities): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIncludes(value: Tweets): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
    }
  }
}
