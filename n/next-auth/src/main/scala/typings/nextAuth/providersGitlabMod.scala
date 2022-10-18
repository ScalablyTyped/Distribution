package typings.nextAuth

import typings.nextAuth.anon.Externuid
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersGitlabMod {
  
  @JSImport("next-auth/providers/gitlab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: GitLabProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait GitLabProfile extends StObject {
    
    var avatar_url: String
    
    var bio: String
    
    var bot: Boolean
    
    var can_create_group: Boolean
    
    var can_create_project: Boolean
    
    var color_scheme_id: Double
    
    var commit_email: String
    
    var confirmed_at: String
    
    var created_at: String
    
    var current_sign_in_at: String
    
    var email: String
    
    var external: Boolean
    
    var extra_shared_runners_minutes_limit: Double
    
    var followers: Double
    
    var following: Double
    
    var id: Double
    
    var identities: js.Array[Externuid]
    
    var job_title: String
    
    var last_activity_on: String
    
    var last_sign_in_at: String
    
    var linkedin: String
    
    var local_time: String
    
    var location: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var organization: String
    
    var private_profile: Boolean
    
    var projects_limit: Double
    
    var pronouns: String
    
    var public_email: String
    
    var shared_runners_minutes_limit: Double
    
    var skype: String
    
    var state: String
    
    var theme_id: Double
    
    var twitter: String
    
    var two_factor_enabled: Boolean
    
    var username: String
    
    var web_url: String
    
    var website_url: String
    
    var work_information: js.UndefOr[String] = js.undefined
  }
  object GitLabProfile {
    
    inline def apply(
      avatar_url: String,
      bio: String,
      bot: Boolean,
      can_create_group: Boolean,
      can_create_project: Boolean,
      color_scheme_id: Double,
      commit_email: String,
      confirmed_at: String,
      created_at: String,
      current_sign_in_at: String,
      email: String,
      external: Boolean,
      extra_shared_runners_minutes_limit: Double,
      followers: Double,
      following: Double,
      id: Double,
      identities: js.Array[Externuid],
      job_title: String,
      last_activity_on: String,
      last_sign_in_at: String,
      linkedin: String,
      local_time: String,
      name: String,
      organization: String,
      private_profile: Boolean,
      projects_limit: Double,
      pronouns: String,
      public_email: String,
      shared_runners_minutes_limit: Double,
      skype: String,
      state: String,
      theme_id: Double,
      twitter: String,
      two_factor_enabled: Boolean,
      username: String,
      web_url: String,
      website_url: String
    ): GitLabProfile = {
      val __obj = js.Dynamic.literal(avatar_url = avatar_url.asInstanceOf[js.Any], bio = bio.asInstanceOf[js.Any], bot = bot.asInstanceOf[js.Any], can_create_group = can_create_group.asInstanceOf[js.Any], can_create_project = can_create_project.asInstanceOf[js.Any], color_scheme_id = color_scheme_id.asInstanceOf[js.Any], commit_email = commit_email.asInstanceOf[js.Any], confirmed_at = confirmed_at.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], current_sign_in_at = current_sign_in_at.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], extra_shared_runners_minutes_limit = extra_shared_runners_minutes_limit.asInstanceOf[js.Any], followers = followers.asInstanceOf[js.Any], following = following.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], job_title = job_title.asInstanceOf[js.Any], last_activity_on = last_activity_on.asInstanceOf[js.Any], last_sign_in_at = last_sign_in_at.asInstanceOf[js.Any], linkedin = linkedin.asInstanceOf[js.Any], local_time = local_time.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], private_profile = private_profile.asInstanceOf[js.Any], projects_limit = projects_limit.asInstanceOf[js.Any], pronouns = pronouns.asInstanceOf[js.Any], public_email = public_email.asInstanceOf[js.Any], shared_runners_minutes_limit = shared_runners_minutes_limit.asInstanceOf[js.Any], skype = skype.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], theme_id = theme_id.asInstanceOf[js.Any], twitter = twitter.asInstanceOf[js.Any], two_factor_enabled = two_factor_enabled.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any], website_url = website_url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitLabProfile]
    }
    
    extension [Self <: GitLabProfile](x: Self) {
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setBio(value: String): Self = StObject.set(x, "bio", value.asInstanceOf[js.Any])
      
      inline def setBot(value: Boolean): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
      
      inline def setCan_create_group(value: Boolean): Self = StObject.set(x, "can_create_group", value.asInstanceOf[js.Any])
      
      inline def setCan_create_project(value: Boolean): Self = StObject.set(x, "can_create_project", value.asInstanceOf[js.Any])
      
      inline def setColor_scheme_id(value: Double): Self = StObject.set(x, "color_scheme_id", value.asInstanceOf[js.Any])
      
      inline def setCommit_email(value: String): Self = StObject.set(x, "commit_email", value.asInstanceOf[js.Any])
      
      inline def setConfirmed_at(value: String): Self = StObject.set(x, "confirmed_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCurrent_sign_in_at(value: String): Self = StObject.set(x, "current_sign_in_at", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExtra_shared_runners_minutes_limit(value: Double): Self = StObject.set(x, "extra_shared_runners_minutes_limit", value.asInstanceOf[js.Any])
      
      inline def setFollowers(value: Double): Self = StObject.set(x, "followers", value.asInstanceOf[js.Any])
      
      inline def setFollowing(value: Double): Self = StObject.set(x, "following", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdentities(value: js.Array[Externuid]): Self = StObject.set(x, "identities", value.asInstanceOf[js.Any])
      
      inline def setIdentitiesVarargs(value: Externuid*): Self = StObject.set(x, "identities", js.Array(value*))
      
      inline def setJob_title(value: String): Self = StObject.set(x, "job_title", value.asInstanceOf[js.Any])
      
      inline def setLast_activity_on(value: String): Self = StObject.set(x, "last_activity_on", value.asInstanceOf[js.Any])
      
      inline def setLast_sign_in_at(value: String): Self = StObject.set(x, "last_sign_in_at", value.asInstanceOf[js.Any])
      
      inline def setLinkedin(value: String): Self = StObject.set(x, "linkedin", value.asInstanceOf[js.Any])
      
      inline def setLocal_time(value: String): Self = StObject.set(x, "local_time", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setPrivate_profile(value: Boolean): Self = StObject.set(x, "private_profile", value.asInstanceOf[js.Any])
      
      inline def setProjects_limit(value: Double): Self = StObject.set(x, "projects_limit", value.asInstanceOf[js.Any])
      
      inline def setPronouns(value: String): Self = StObject.set(x, "pronouns", value.asInstanceOf[js.Any])
      
      inline def setPublic_email(value: String): Self = StObject.set(x, "public_email", value.asInstanceOf[js.Any])
      
      inline def setShared_runners_minutes_limit(value: Double): Self = StObject.set(x, "shared_runners_minutes_limit", value.asInstanceOf[js.Any])
      
      inline def setSkype(value: String): Self = StObject.set(x, "skype", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTheme_id(value: Double): Self = StObject.set(x, "theme_id", value.asInstanceOf[js.Any])
      
      inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
      
      inline def setTwo_factor_enabled(value: Boolean): Self = StObject.set(x, "two_factor_enabled", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setWeb_url(value: String): Self = StObject.set(x, "web_url", value.asInstanceOf[js.Any])
      
      inline def setWebsite_url(value: String): Self = StObject.set(x, "website_url", value.asInstanceOf[js.Any])
      
      inline def setWork_information(value: String): Self = StObject.set(x, "work_information", value.asInstanceOf[js.Any])
      
      inline def setWork_informationUndefined: Self = StObject.set(x, "work_information", js.undefined)
    }
  }
}
