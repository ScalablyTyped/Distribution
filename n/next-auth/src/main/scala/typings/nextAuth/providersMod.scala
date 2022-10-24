package typings.nextAuth

import typings.nextAuth.anon.PartialOAuthConfigany
import typings.nextAuth.nextAuthStrings.credentials_
import typings.nextAuth.nextAuthStrings.email_
import typings.nextAuth.providersCredentialsMod.CredentialInput
import typings.nextAuth.providersCredentialsMod.CredentialsConfig
import typings.nextAuth.providersCredentialsMod.CredentialsProvider
import typings.nextAuth.providersCredentialsMod.UserCredentialsConfig
import typings.nextAuth.providersEmailMod.EmailConfig
import typings.nextAuth.providersEmailMod.EmailProvider
import typings.nextAuth.providersEmailMod.EmailUserConfig
import typings.nextAuth.providersOauthMod.OAuthConfig
import typings.nextAuth.providersOauthMod.OAuthProvider
import typings.std.Partial
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersMod {
  
  @JSImport("next-auth/providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C /* <: Record[String, CredentialInput] */](options: UserCredentialsConfig[C]): CredentialsConfig[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[CredentialsConfig[C]]
  
  trait AppProvider
    extends StObject
       with CommonProviderOptions {
    
    var callbackUrl: String
    
    var signinUrl: String
  }
  object AppProvider {
    
    inline def apply(callbackUrl: String, id: String, name: String, signinUrl: String, `type`: ProviderType): AppProvider = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], signinUrl = signinUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppProvider]
    }
    
    extension [Self <: AppProvider](x: Self) {
      
      inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
      
      inline def setSigninUrl(value: String): Self = StObject.set(x, "signinUrl", value.asInstanceOf[js.Any])
    }
  }
  
  type AppProviders = js.Array[Provider | (ReturnType[CredentialsProvider | OAuthProvider | EmailProvider])]
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextAuth.providersMod.RedirectableProviderType
    - typings.nextAuth.providersOauthTypesMod.OAuthProviderType
  */
  trait BuiltInProviderType extends StObject
  
  /* Inlined std.Record<next-auth.next-auth/providers/oauth.OAuthProviderType, next-auth.next-auth/providers/oauth.OAuthProvider> & std.Record<next-auth.next-auth/providers/credentials.CredentialsProviderType, next-auth.next-auth/providers/credentials.CredentialsProvider> & std.Record<next-auth.next-auth/providers/email.EmailProviderType, next-auth.next-auth/providers/email.EmailProvider> */
  trait BuiltInProviders extends StObject {
    
    var `42-school`: OAuthProvider
    
    var Credentials: CredentialsProvider
    
    var Email: EmailProvider
    
    var apple: OAuthProvider
    
    var atlassian: OAuthProvider
    
    var auth0: OAuthProvider
    
    var authentik: OAuthProvider
    
    var `azure-ad`: OAuthProvider
    
    var `azure-ad-b2c`: OAuthProvider
    
    var battlenet: OAuthProvider
    
    var box: OAuthProvider
    
    var `boxyhq-saml`: OAuthProvider
    
    var bungie: OAuthProvider
    
    var cognito: OAuthProvider
    
    var coinbase: OAuthProvider
    
    var credentials: OAuthProvider
    
    var discord: OAuthProvider
    
    var dropbox: OAuthProvider
    
    var `duende-identity-server6`: OAuthProvider
    
    var email: OAuthProvider
    
    var eveonline: OAuthProvider
    
    var facebook: OAuthProvider
    
    var faceit: OAuthProvider
    
    var foursquare: OAuthProvider
    
    var freshbooks: OAuthProvider
    
    var fusionauth: OAuthProvider
    
    var github: OAuthProvider
    
    var gitlab: OAuthProvider
    
    var google: OAuthProvider
    
    var hubspot: OAuthProvider
    
    var `identity-server4`: OAuthProvider
    
    var index: OAuthProvider
    
    var instagram: OAuthProvider
    
    var kakao: OAuthProvider
    
    var keycloak: OAuthProvider
    
    var line: OAuthProvider
    
    var linkedin: OAuthProvider
    
    var mailchimp: OAuthProvider
    
    var mailru: OAuthProvider
    
    var medium: OAuthProvider
    
    var naver: OAuthProvider
    
    var netlify: OAuthProvider
    
    var oauth: OAuthProvider
    
    var `oauth-types`: OAuthProvider
    
    var okta: OAuthProvider
    
    var onelogin: OAuthProvider
    
    var osso: OAuthProvider
    
    var osu: OAuthProvider
    
    var patreon: OAuthProvider
    
    var pinterest: OAuthProvider
    
    var pipedrive: OAuthProvider
    
    var reddit: OAuthProvider
    
    var salesforce: OAuthProvider
    
    var slack: OAuthProvider
    
    var spotify: OAuthProvider
    
    var strava: OAuthProvider
    
    var todoist: OAuthProvider
    
    var trakt: OAuthProvider
    
    var twitch: OAuthProvider
    
    var twitter: OAuthProvider
    
    var `united-effects`: OAuthProvider
    
    var vk: OAuthProvider
    
    var wikimedia: OAuthProvider
    
    var wordpress: OAuthProvider
    
    var workos: OAuthProvider
    
    var yandex: OAuthProvider
    
    var zitadel: OAuthProvider
    
    var zoho: OAuthProvider
    
    var zoom: OAuthProvider
  }
  object BuiltInProviders {
    
    inline def apply(
      `42-school`: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      Credentials: /* options */ Partial[CredentialsConfig[Record[String, CredentialInput]]] => CredentialsConfig[Record[String, CredentialInput]],
      Email: /* options */ EmailUserConfig => EmailConfig,
      apple: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      atlassian: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      auth0: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      authentik: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      `azure-ad`: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      `azure-ad-b2c`: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      battlenet: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      box: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      `boxyhq-saml`: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      bungie: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      cognito: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      coinbase: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      credentials: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      discord: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      dropbox: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      `duende-identity-server6`: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      email: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      eveonline: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      facebook: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      faceit: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      foursquare: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      freshbooks: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      fusionauth: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      github: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      gitlab: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      google: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      hubspot: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      `identity-server4`: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      index: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      instagram: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      kakao: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      keycloak: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      line: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      linkedin: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      mailchimp: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      mailru: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      medium: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      naver: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      netlify: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      oauth: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      `oauth-types`: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      okta: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      onelogin: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      osso: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      osu: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      patreon: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      pinterest: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      pipedrive: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      reddit: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      salesforce: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      slack: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      spotify: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      strava: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      todoist: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      trakt: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      twitch: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      twitter: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      `united-effects`: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      vk: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      wikimedia: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      wordpress: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      workos: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      yandex: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      zitadel: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      zoho: /* options */ PartialOAuthConfigany => OAuthConfig[Any],
      zoom: /* options */ PartialOAuthConfigany => OAuthConfig[Any]
    ): BuiltInProviders = {
      val __obj = js.Dynamic.literal(Credentials = js.Any.fromFunction1(Credentials), Email = js.Any.fromFunction1(Email), apple = js.Any.fromFunction1(apple), atlassian = js.Any.fromFunction1(atlassian), auth0 = js.Any.fromFunction1(auth0), authentik = js.Any.fromFunction1(authentik), battlenet = js.Any.fromFunction1(battlenet), box = js.Any.fromFunction1(box), bungie = js.Any.fromFunction1(bungie), cognito = js.Any.fromFunction1(cognito), coinbase = js.Any.fromFunction1(coinbase), credentials = js.Any.fromFunction1(credentials), discord = js.Any.fromFunction1(discord), dropbox = js.Any.fromFunction1(dropbox), email = js.Any.fromFunction1(email), eveonline = js.Any.fromFunction1(eveonline), facebook = js.Any.fromFunction1(facebook), faceit = js.Any.fromFunction1(faceit), foursquare = js.Any.fromFunction1(foursquare), freshbooks = js.Any.fromFunction1(freshbooks), fusionauth = js.Any.fromFunction1(fusionauth), github = js.Any.fromFunction1(github), gitlab = js.Any.fromFunction1(gitlab), google = js.Any.fromFunction1(google), hubspot = js.Any.fromFunction1(hubspot), index = js.Any.fromFunction1(index), instagram = js.Any.fromFunction1(instagram), kakao = js.Any.fromFunction1(kakao), keycloak = js.Any.fromFunction1(keycloak), line = js.Any.fromFunction1(line), linkedin = js.Any.fromFunction1(linkedin), mailchimp = js.Any.fromFunction1(mailchimp), mailru = js.Any.fromFunction1(mailru), medium = js.Any.fromFunction1(medium), naver = js.Any.fromFunction1(naver), netlify = js.Any.fromFunction1(netlify), oauth = js.Any.fromFunction1(oauth), okta = js.Any.fromFunction1(okta), onelogin = js.Any.fromFunction1(onelogin), osso = js.Any.fromFunction1(osso), osu = js.Any.fromFunction1(osu), patreon = js.Any.fromFunction1(patreon), pinterest = js.Any.fromFunction1(pinterest), pipedrive = js.Any.fromFunction1(pipedrive), reddit = js.Any.fromFunction1(reddit), salesforce = js.Any.fromFunction1(salesforce), slack = js.Any.fromFunction1(slack), spotify = js.Any.fromFunction1(spotify), strava = js.Any.fromFunction1(strava), todoist = js.Any.fromFunction1(todoist), trakt = js.Any.fromFunction1(trakt), twitch = js.Any.fromFunction1(twitch), twitter = js.Any.fromFunction1(twitter), vk = js.Any.fromFunction1(vk), wikimedia = js.Any.fromFunction1(wikimedia), wordpress = js.Any.fromFunction1(wordpress), workos = js.Any.fromFunction1(workos), yandex = js.Any.fromFunction1(yandex), zitadel = js.Any.fromFunction1(zitadel), zoho = js.Any.fromFunction1(zoho), zoom = js.Any.fromFunction1(zoom))
      __obj.updateDynamic("42-school")(js.Any.fromFunction1(`42-school`))
      __obj.updateDynamic("azure-ad")(js.Any.fromFunction1(`azure-ad`))
      __obj.updateDynamic("azure-ad-b2c")(js.Any.fromFunction1(`azure-ad-b2c`))
      __obj.updateDynamic("boxyhq-saml")(js.Any.fromFunction1(`boxyhq-saml`))
      __obj.updateDynamic("duende-identity-server6")(js.Any.fromFunction1(`duende-identity-server6`))
      __obj.updateDynamic("identity-server4")(js.Any.fromFunction1(`identity-server4`))
      __obj.updateDynamic("oauth-types")(js.Any.fromFunction1(`oauth-types`))
      __obj.updateDynamic("united-effects")(js.Any.fromFunction1(`united-effects`))
      __obj.asInstanceOf[BuiltInProviders]
    }
    
    extension [Self <: BuiltInProviders](x: Self) {
      
      inline def `set42-school`(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "42-school", js.Any.fromFunction1(value))
      
      inline def setApple(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
      
      inline def setAtlassian(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "atlassian", js.Any.fromFunction1(value))
      
      inline def setAuth0(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "auth0", js.Any.fromFunction1(value))
      
      inline def setAuthentik(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "authentik", js.Any.fromFunction1(value))
      
      inline def `setAzure-ad`(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "azure-ad", js.Any.fromFunction1(value))
      
      inline def `setAzure-ad-b2c`(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "azure-ad-b2c", js.Any.fromFunction1(value))
      
      inline def setBattlenet(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "battlenet", js.Any.fromFunction1(value))
      
      inline def setBox(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "box", js.Any.fromFunction1(value))
      
      inline def `setBoxyhq-saml`(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "boxyhq-saml", js.Any.fromFunction1(value))
      
      inline def setBungie(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "bungie", js.Any.fromFunction1(value))
      
      inline def setCognito(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "cognito", js.Any.fromFunction1(value))
      
      inline def setCoinbase(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "coinbase", js.Any.fromFunction1(value))
      
      inline def setCredentials(
        value: /* options */ Partial[CredentialsConfig[Record[String, CredentialInput]]] => CredentialsConfig[Record[String, CredentialInput]]
      ): Self = StObject.set(x, "Credentials", js.Any.fromFunction1(value))
      
      inline def setDiscord(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "discord", js.Any.fromFunction1(value))
      
      inline def setDropbox(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "dropbox", js.Any.fromFunction1(value))
      
      inline def `setDuende-identity-server6`(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "duende-identity-server6", js.Any.fromFunction1(value))
      
      inline def setEmail(value: /* options */ EmailUserConfig => EmailConfig): Self = StObject.set(x, "Email", js.Any.fromFunction1(value))
      
      inline def setEveonline(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "eveonline", js.Any.fromFunction1(value))
      
      inline def setFacebook(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "facebook", js.Any.fromFunction1(value))
      
      inline def setFaceit(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "faceit", js.Any.fromFunction1(value))
      
      inline def setFoursquare(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "foursquare", js.Any.fromFunction1(value))
      
      inline def setFreshbooks(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "freshbooks", js.Any.fromFunction1(value))
      
      inline def setFusionauth(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "fusionauth", js.Any.fromFunction1(value))
      
      inline def setGithub(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "github", js.Any.fromFunction1(value))
      
      inline def setGitlab(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "gitlab", js.Any.fromFunction1(value))
      
      inline def setGoogle(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "google", js.Any.fromFunction1(value))
      
      inline def setHubspot(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "hubspot", js.Any.fromFunction1(value))
      
      inline def `setIdentity-server4`(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "identity-server4", js.Any.fromFunction1(value))
      
      inline def setIndex(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
      
      inline def setInstagram(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "instagram", js.Any.fromFunction1(value))
      
      inline def setKakao(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "kakao", js.Any.fromFunction1(value))
      
      inline def setKeycloak(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "keycloak", js.Any.fromFunction1(value))
      
      inline def setLine(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "line", js.Any.fromFunction1(value))
      
      inline def setLinkedin(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "linkedin", js.Any.fromFunction1(value))
      
      inline def setMailchimp(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "mailchimp", js.Any.fromFunction1(value))
      
      inline def setMailru(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "mailru", js.Any.fromFunction1(value))
      
      inline def setMedium(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "medium", js.Any.fromFunction1(value))
      
      inline def setNaver(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "naver", js.Any.fromFunction1(value))
      
      inline def setNetlify(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "netlify", js.Any.fromFunction1(value))
      
      inline def setOauth(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "oauth", js.Any.fromFunction1(value))
      
      inline def `setOauth-types`(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "oauth-types", js.Any.fromFunction1(value))
      
      inline def setOkta(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "okta", js.Any.fromFunction1(value))
      
      inline def setOnelogin(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "onelogin", js.Any.fromFunction1(value))
      
      inline def setOsso(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "osso", js.Any.fromFunction1(value))
      
      inline def setOsu(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "osu", js.Any.fromFunction1(value))
      
      inline def setPatreon(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "patreon", js.Any.fromFunction1(value))
      
      inline def setPinterest(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "pinterest", js.Any.fromFunction1(value))
      
      inline def setPipedrive(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "pipedrive", js.Any.fromFunction1(value))
      
      inline def setReddit(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "reddit", js.Any.fromFunction1(value))
      
      inline def setSalesforce(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "salesforce", js.Any.fromFunction1(value))
      
      inline def setSlack(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "slack", js.Any.fromFunction1(value))
      
      inline def setSpotify(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "spotify", js.Any.fromFunction1(value))
      
      inline def setStrava(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "strava", js.Any.fromFunction1(value))
      
      inline def setTodoist(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "todoist", js.Any.fromFunction1(value))
      
      inline def setTrakt(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "trakt", js.Any.fromFunction1(value))
      
      inline def setTwitch(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "twitch", js.Any.fromFunction1(value))
      
      inline def setTwitter(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "twitter", js.Any.fromFunction1(value))
      
      inline def `setUnited-effects`(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "united-effects", js.Any.fromFunction1(value))
      
      inline def setVk(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "vk", js.Any.fromFunction1(value))
      
      inline def setWikimedia(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "wikimedia", js.Any.fromFunction1(value))
      
      inline def setWordpress(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "wordpress", js.Any.fromFunction1(value))
      
      inline def setWorkos(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "workos", js.Any.fromFunction1(value))
      
      inline def setYandex(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "yandex", js.Any.fromFunction1(value))
      
      inline def setZitadel(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "zitadel", js.Any.fromFunction1(value))
      
      inline def setZoho(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "zoho", js.Any.fromFunction1(value))
      
      inline def setZoom(value: /* options */ PartialOAuthConfigany => OAuthConfig[Any]): Self = StObject.set(x, "zoom", js.Any.fromFunction1(value))
    }
  }
  
  trait CommonProviderOptions extends StObject {
    
    var id: String
    
    var name: String
    
    var options: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `type`: ProviderType
  }
  object CommonProviderOptions {
    
    inline def apply(id: String, name: String, `type`: ProviderType): CommonProviderOptions = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonProviderOptions]
    }
    
    extension [Self <: CommonProviderOptions](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Record[String, Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: ProviderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Provider = OAuthConfig[Any] | EmailConfig | (CredentialsConfig[Record[String, CredentialInput]])
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextAuth.nextAuthStrings.oauth
    - typings.nextAuth.nextAuthStrings.email_
    - typings.nextAuth.nextAuthStrings.credentials_
  */
  trait ProviderType extends StObject
  object ProviderType {
    
    inline def credentials: credentials_ = "credentials".asInstanceOf[credentials_]
    
    inline def email: email_ = "email".asInstanceOf[email_]
    
    inline def oauth: typings.nextAuth.nextAuthStrings.oauth = "oauth".asInstanceOf[typings.nextAuth.nextAuthStrings.oauth]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nextAuth.nextAuthStrings.email_
    - typings.nextAuth.nextAuthStrings.credentials_
  */
  trait RedirectableProviderType
    extends StObject
       with BuiltInProviderType
  object RedirectableProviderType {
    
    inline def credentials: credentials_ = "credentials".asInstanceOf[credentials_]
    
    inline def email: email_ = "email".asInstanceOf[email_]
  }
}
