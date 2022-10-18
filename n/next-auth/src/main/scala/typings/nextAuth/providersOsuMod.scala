package typings.nextAuth

import typings.nextAuth.anon.Available
import typings.nextAuth.anon.Code
import typings.nextAuth.anon.Customurl
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersOsuMod {
  
  @JSImport("next-auth/providers/osu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: OsuProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait OsuProfile
    extends StObject
       with OsuUserCompact {
    
    var country: Code
    
    var cover: Customurl
    
    var discord: String | Null
    
    var has_supported: Boolean
    
    var interests: String | Null
    
    var is_restricted: Boolean
    
    var join_date: js.Date
    
    var kudosu: Available
    
    var location: String | Null
    
    var max_blocks: Double
    
    var max_friends: Double
    
    var occupation: String | Null
    
    var playmode: String
    
    var playstyle: js.Array[String]
    
    var post_count: Double
    
    var profile_order: js.Array[String]
    
    var title: String | Null
    
    var title_url: String | Null
    
    var twitter: String | Null
    
    var website: String | Null
  }
  object OsuProfile {
    
    inline def apply(
      avatar_url: String,
      country: Code,
      country_code: String,
      cover: Customurl,
      default_group: String,
      has_supported: Boolean,
      id: String,
      is_active: Boolean,
      is_bot: Boolean,
      is_deleted: Boolean,
      is_online: Boolean,
      is_restricted: Boolean,
      is_supporter: Boolean,
      join_date: js.Date,
      kudosu: Available,
      max_blocks: Double,
      max_friends: Double,
      playmode: String,
      playstyle: js.Array[String],
      pm_friends_only: Boolean,
      post_count: Double,
      profile_order: js.Array[String],
      username: String
    ): OsuProfile = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], cover = cover.asInstanceOf[js.Any], default_group = default_group.asInstanceOf[js.Any], has_supported = has_supported.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_active = is_active.asInstanceOf[js.Any], is_bot = is_bot.asInstanceOf[js.Any], is_deleted = is_deleted.asInstanceOf[js.Any], is_online = is_online.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], is_supporter = is_supporter.asInstanceOf[js.Any], join_date = join_date.asInstanceOf[js.Any], kudosu = kudosu.asInstanceOf[js.Any], max_blocks = max_blocks.asInstanceOf[js.Any], max_friends = max_friends.asInstanceOf[js.Any], playmode = playmode.asInstanceOf[js.Any], playstyle = playstyle.asInstanceOf[js.Any], pm_friends_only = pm_friends_only.asInstanceOf[js.Any], post_count = post_count.asInstanceOf[js.Any], profile_order = profile_order.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], discord = null, interests = null, last_visit = null, location = null, occupation = null, profile_colour = null, title = null, title_url = null, twitter = null, website = null)
      __obj.asInstanceOf[OsuProfile]
    }
    
    extension [Self <: OsuProfile](x: Self) {
      
      inline def setCountry(value: Code): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCover(value: Customurl): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setDiscord(value: String): Self = StObject.set(x, "discord", value.asInstanceOf[js.Any])
      
      inline def setDiscordNull: Self = StObject.set(x, "discord", null)
      
      inline def setHas_supported(value: Boolean): Self = StObject.set(x, "has_supported", value.asInstanceOf[js.Any])
      
      inline def setInterests(value: String): Self = StObject.set(x, "interests", value.asInstanceOf[js.Any])
      
      inline def setInterestsNull: Self = StObject.set(x, "interests", null)
      
      inline def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
      
      inline def setJoin_date(value: js.Date): Self = StObject.set(x, "join_date", value.asInstanceOf[js.Any])
      
      inline def setKudosu(value: Available): Self = StObject.set(x, "kudosu", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationNull: Self = StObject.set(x, "location", null)
      
      inline def setMax_blocks(value: Double): Self = StObject.set(x, "max_blocks", value.asInstanceOf[js.Any])
      
      inline def setMax_friends(value: Double): Self = StObject.set(x, "max_friends", value.asInstanceOf[js.Any])
      
      inline def setOccupation(value: String): Self = StObject.set(x, "occupation", value.asInstanceOf[js.Any])
      
      inline def setOccupationNull: Self = StObject.set(x, "occupation", null)
      
      inline def setPlaymode(value: String): Self = StObject.set(x, "playmode", value.asInstanceOf[js.Any])
      
      inline def setPlaystyle(value: js.Array[String]): Self = StObject.set(x, "playstyle", value.asInstanceOf[js.Any])
      
      inline def setPlaystyleVarargs(value: String*): Self = StObject.set(x, "playstyle", js.Array(value*))
      
      inline def setPost_count(value: Double): Self = StObject.set(x, "post_count", value.asInstanceOf[js.Any])
      
      inline def setProfile_order(value: js.Array[String]): Self = StObject.set(x, "profile_order", value.asInstanceOf[js.Any])
      
      inline def setProfile_orderVarargs(value: String*): Self = StObject.set(x, "profile_order", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitle_url(value: String): Self = StObject.set(x, "title_url", value.asInstanceOf[js.Any])
      
      inline def setTitle_urlNull: Self = StObject.set(x, "title_url", null)
      
      inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      inline def setTwitterNull: Self = StObject.set(x, "twitter", null)
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteNull: Self = StObject.set(x, "website", null)
    }
  }
  
  trait OsuUserCompact extends StObject {
    
    var avatar_url: String
    
    var country_code: String
    
    var default_group: String
    
    var id: String
    
    var is_active: Boolean
    
    var is_bot: Boolean
    
    var is_deleted: Boolean
    
    var is_online: Boolean
    
    var is_supporter: Boolean
    
    var last_visit: js.Date | Null
    
    var pm_friends_only: Boolean
    
    var profile_colour: String | Null
    
    var username: String
  }
  object OsuUserCompact {
    
    inline def apply(
      avatar_url: String,
      country_code: String,
      default_group: String,
      id: String,
      is_active: Boolean,
      is_bot: Boolean,
      is_deleted: Boolean,
      is_online: Boolean,
      is_supporter: Boolean,
      pm_friends_only: Boolean,
      username: String
    ): OsuUserCompact = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], default_group = default_group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_active = is_active.asInstanceOf[js.Any], is_bot = is_bot.asInstanceOf[js.Any], is_deleted = is_deleted.asInstanceOf[js.Any], is_online = is_online.asInstanceOf[js.Any], is_supporter = is_supporter.asInstanceOf[js.Any], pm_friends_only = pm_friends_only.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], last_visit = null, profile_colour = null)
      __obj.asInstanceOf[OsuUserCompact]
    }
    
    extension [Self <: OsuUserCompact](x: Self) {
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setDefault_group(value: String): Self = StObject.set(x, "default_group", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIs_active(value: Boolean): Self = StObject.set(x, "is_active", value.asInstanceOf[js.Any])
      
      inline def setIs_bot(value: Boolean): Self = StObject.set(x, "is_bot", value.asInstanceOf[js.Any])
      
      inline def setIs_deleted(value: Boolean): Self = StObject.set(x, "is_deleted", value.asInstanceOf[js.Any])
      
      inline def setIs_online(value: Boolean): Self = StObject.set(x, "is_online", value.asInstanceOf[js.Any])
      
      inline def setIs_supporter(value: Boolean): Self = StObject.set(x, "is_supporter", value.asInstanceOf[js.Any])
      
      inline def setLast_visit(value: js.Date): Self = StObject.set(x, "last_visit", value.asInstanceOf[js.Any])
      
      inline def setLast_visitNull: Self = StObject.set(x, "last_visit", null)
      
      inline def setPm_friends_only(value: Boolean): Self = StObject.set(x, "pm_friends_only", value.asInstanceOf[js.Any])
      
      inline def setProfile_colour(value: String): Self = StObject.set(x, "profile_colour", value.asInstanceOf[js.Any])
      
      inline def setProfile_colourNull: Self = StObject.set(x, "profile_colour", null)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
