package typings.nextAuth.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Providers extends js.Object {
  
  var Apple: typings.nextAuth.providersMod.Apple = js.native
  
  var Auth0: typings.nextAuth.providersMod.Auth0 = js.native
  
  var Basecamp: typings.nextAuth.providersMod.Basecamp = js.native
  
  var BattleNet: typings.nextAuth.providersMod.BattleNet = js.native
  
  var Box: typings.nextAuth.providersMod.Box = js.native
  
  var Cognito: typings.nextAuth.providersMod.Cognito = js.native
  
  var Credentials: typings.nextAuth.providersMod.Credentials = js.native
  
  var Discord: typings.nextAuth.providersMod.Discord = js.native
  
  var Email: typings.nextAuth.providersMod.Email = js.native
  
  var Facebook: typings.nextAuth.providersMod.Facebook = js.native
  
  var GitHub: typings.nextAuth.providersMod.GitHub = js.native
  
  var GitLab: typings.nextAuth.providersMod.GitLab = js.native
  
  var Google: typings.nextAuth.providersMod.Google = js.native
  
  var IdentityServer4: typings.nextAuth.providersMod.IdentityServer4 = js.native
  
  var LinkedIn: typings.nextAuth.providersMod.LinkedIn = js.native
  
  var Mixer: typings.nextAuth.providersMod.Mixer = js.native
  
  var Okta: typings.nextAuth.providersMod.Okta = js.native
  
  var Reddit: typings.nextAuth.providersMod.Reddit = js.native
  
  var Slack: typings.nextAuth.providersMod.Slack = js.native
  
  var Spotify: typings.nextAuth.providersMod.Spotify = js.native
  
  var Twitch: typings.nextAuth.providersMod.Twitch = js.native
  
  var Twitter: typings.nextAuth.providersMod.Twitter = js.native
  
  var Yandex: typings.nextAuth.providersMod.Yandex = js.native
}
object Providers {
  
  @scala.inline
  def apply(
    Apple: /* options */ ProviderAppleOptions => GenericReturnConfig,
    Auth0: /* options */ ProviderAuth0Options => GenericReturnConfig,
    Basecamp: /* options */ ProviderBasecampOptions => GenericReturnConfig,
    BattleNet: /* options */ ProviderBattleNetOptions => GenericReturnConfig,
    Box: /* options */ ProviderBoxOptions => GenericReturnConfig,
    Cognito: /* options */ ProviderCognitoOptions => GenericReturnConfig,
    Credentials: /* options */ ProviderCredentialsOptions => GenericReturnConfig,
    Discord: /* options */ ProviderDiscordOptions => GenericReturnConfig,
    Email: /* options */ ProviderEmailOptions => GenericReturnConfig,
    Facebook: /* options */ ProviderFacebookOptions => GenericReturnConfig,
    GitHub: /* options */ ProviderGitHubOptions => GenericReturnConfig,
    GitLab: /* options */ ProviderGitLabOptions => GenericReturnConfig,
    Google: /* options */ ProviderGoogleOptions => GenericReturnConfig,
    IdentityServer4: /* options */ ProviderIS4Options => GenericReturnConfig,
    LinkedIn: /* options */ ProviderLinkedInOptions => GenericReturnConfig,
    Mixer: /* options */ ProviderMixerOptions => GenericReturnConfig,
    Okta: /* options */ ProviderOktaOptions => GenericReturnConfig,
    Reddit: /* options */ ProviderRedditOptions => GenericReturnConfig,
    Slack: /* options */ ProviderSlackOptions => GenericReturnConfig,
    Spotify: /* options */ ProviderSpotifyOptions => GenericReturnConfig,
    Twitch: /* options */ ProviderTwitchOptions => GenericReturnConfig,
    Twitter: /* options */ ProviderTwitterOptions => GenericReturnConfig,
    Yandex: /* options */ ProviderYandexOptions => GenericReturnConfig
  ): Providers = {
    val __obj = js.Dynamic.literal(Apple = js.Any.fromFunction1(Apple), Auth0 = js.Any.fromFunction1(Auth0), Basecamp = js.Any.fromFunction1(Basecamp), BattleNet = js.Any.fromFunction1(BattleNet), Box = js.Any.fromFunction1(Box), Cognito = js.Any.fromFunction1(Cognito), Credentials = js.Any.fromFunction1(Credentials), Discord = js.Any.fromFunction1(Discord), Email = js.Any.fromFunction1(Email), Facebook = js.Any.fromFunction1(Facebook), GitHub = js.Any.fromFunction1(GitHub), GitLab = js.Any.fromFunction1(GitLab), Google = js.Any.fromFunction1(Google), IdentityServer4 = js.Any.fromFunction1(IdentityServer4), LinkedIn = js.Any.fromFunction1(LinkedIn), Mixer = js.Any.fromFunction1(Mixer), Okta = js.Any.fromFunction1(Okta), Reddit = js.Any.fromFunction1(Reddit), Slack = js.Any.fromFunction1(Slack), Spotify = js.Any.fromFunction1(Spotify), Twitch = js.Any.fromFunction1(Twitch), Twitter = js.Any.fromFunction1(Twitter), Yandex = js.Any.fromFunction1(Yandex))
    __obj.asInstanceOf[Providers]
  }
  
  @scala.inline
  implicit class ProvidersOps[Self <: Providers] (val x: Self) extends AnyVal {
    
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
    def setApple(value: /* options */ ProviderAppleOptions => GenericReturnConfig): Self = this.set("Apple", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAuth0(value: /* options */ ProviderAuth0Options => GenericReturnConfig): Self = this.set("Auth0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBasecamp(value: /* options */ ProviderBasecampOptions => GenericReturnConfig): Self = this.set("Basecamp", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBattleNet(value: /* options */ ProviderBattleNetOptions => GenericReturnConfig): Self = this.set("BattleNet", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBox(value: /* options */ ProviderBoxOptions => GenericReturnConfig): Self = this.set("Box", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCognito(value: /* options */ ProviderCognitoOptions => GenericReturnConfig): Self = this.set("Cognito", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCredentials(value: /* options */ ProviderCredentialsOptions => GenericReturnConfig): Self = this.set("Credentials", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDiscord(value: /* options */ ProviderDiscordOptions => GenericReturnConfig): Self = this.set("Discord", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmail(value: /* options */ ProviderEmailOptions => GenericReturnConfig): Self = this.set("Email", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFacebook(value: /* options */ ProviderFacebookOptions => GenericReturnConfig): Self = this.set("Facebook", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGitHub(value: /* options */ ProviderGitHubOptions => GenericReturnConfig): Self = this.set("GitHub", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGitLab(value: /* options */ ProviderGitLabOptions => GenericReturnConfig): Self = this.set("GitLab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGoogle(value: /* options */ ProviderGoogleOptions => GenericReturnConfig): Self = this.set("Google", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIdentityServer4(value: /* options */ ProviderIS4Options => GenericReturnConfig): Self = this.set("IdentityServer4", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLinkedIn(value: /* options */ ProviderLinkedInOptions => GenericReturnConfig): Self = this.set("LinkedIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMixer(value: /* options */ ProviderMixerOptions => GenericReturnConfig): Self = this.set("Mixer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOkta(value: /* options */ ProviderOktaOptions => GenericReturnConfig): Self = this.set("Okta", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReddit(value: /* options */ ProviderRedditOptions => GenericReturnConfig): Self = this.set("Reddit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSlack(value: /* options */ ProviderSlackOptions => GenericReturnConfig): Self = this.set("Slack", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpotify(value: /* options */ ProviderSpotifyOptions => GenericReturnConfig): Self = this.set("Spotify", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTwitch(value: /* options */ ProviderTwitchOptions => GenericReturnConfig): Self = this.set("Twitch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTwitter(value: /* options */ ProviderTwitterOptions => GenericReturnConfig): Self = this.set("Twitter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setYandex(value: /* options */ ProviderYandexOptions => GenericReturnConfig): Self = this.set("Yandex", js.Any.fromFunction1(value))
  }
}
