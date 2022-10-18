package typings.nextAuth

import typings.nextAuth.corePagesErrorMod.ErrorType
import typings.nextAuth.corePagesSigninMod.SignInErrorTypes
import typings.nextAuth.coreTypesMod.EventType
import typings.nextAuth.coreTypesMod.NextAuthAction
import typings.nextAuth.coreTypesMod.SessionStrategy
import typings.nextAuth.providersKakaoMod.AgeRange
import typings.nextAuth.providersKakaoMod.Gender
import typings.nextAuth.providersMod.ProviderType
import typings.nextAuth.providersMod.RedirectableProviderType
import typings.nextAuth.providersOauthMod.ChecksType
import typings.nextAuth.providersOauthTypesMod.OAuthProviderType
import typings.nextAuth.providersWikimediaMod.WikimediaGrant
import typings.nextAuth.providersWikimediaMod.WikimediaGroup
import typings.nextAuth.providersWikimediaMod.WikimediaRight
import typings.nextAuth.utilsLoggerMod.WarningCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextAuthStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with ErrorType
       with SignInErrorTypes
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `1` extends StObject
  inline def `1`: `1` = "1".asInstanceOf[`1`]
  
  @js.native
  sealed trait `1-9`
    extends StObject
       with AgeRange
  inline def `1-9`: `1-9` = "1-9".asInstanceOf[`1-9`]
  
  @js.native
  sealed trait `10-14`
    extends StObject
       with AgeRange
  inline def `10-14`: `10-14` = "10-14".asInstanceOf[`10-14`]
  
  @js.native
  sealed trait `15-19`
    extends StObject
       with AgeRange
  inline def `15-19`: `15-19` = "15-19".asInstanceOf[`15-19`]
  
  @js.native
  sealed trait `20-29`
    extends StObject
       with AgeRange
  inline def `20-29`: `20-29` = "20-29".asInstanceOf[`20-29`]
  
  @js.native
  sealed trait `30-39`
    extends StObject
       with AgeRange
  inline def `30-39`: `30-39` = "30-39".asInstanceOf[`30-39`]
  
  @js.native
  sealed trait `40-49`
    extends StObject
       with AgeRange
  inline def `40-49`: `40-49` = "40-49".asInstanceOf[`40-49`]
  
  @js.native
  sealed trait `42-school`
    extends StObject
       with OAuthProviderType
  inline def `42-school`: `42-school` = "42-school".asInstanceOf[`42-school`]
  
  @js.native
  sealed trait `50-59`
    extends StObject
       with AgeRange
  inline def `50-59`: `50-59` = "50-59".asInstanceOf[`50-59`]
  
  @js.native
  sealed trait `60-69`
    extends StObject
       with AgeRange
  inline def `60-69`: `60-69` = "60-69".asInstanceOf[`60-69`]
  
  @js.native
  sealed trait `70-79`
    extends StObject
       with AgeRange
  inline def `70-79`: `70-79` = "70-79".asInstanceOf[`70-79`]
  
  @js.native
  sealed trait `80-89`
    extends StObject
       with AgeRange
  inline def `80-89`: `80-89` = "80-89".asInstanceOf[`80-89`]
  
  @js.native
  sealed trait `90-`
    extends StObject
       with AgeRange
  inline def `90-`: `90-` = "90-".asInstanceOf[`90-`]
  
  @js.native
  sealed trait Asterisk
    extends StObject
       with WikimediaGroup
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait BUSINESS extends StObject
  inline def BUSINESS: BUSINESS = "BUSINESS".asInstanceOf[BUSINESS]
  
  @js.native
  sealed trait Callback
    extends StObject
       with SignInErrorTypes
  inline def Callback: Callback = "Callback".asInstanceOf[Callback]
  
  @js.native
  sealed trait Credentials extends StObject
  inline def Credentials: Credentials = "Credentials".asInstanceOf[Credentials]
  
  @js.native
  sealed trait CredentialsSignin
    extends StObject
       with SignInErrorTypes
  inline def CredentialsSignin: CredentialsSignin = "CredentialsSignin".asInstanceOf[CredentialsSignin]
  
  @js.native
  sealed trait DEBUG_ENABLED
    extends StObject
       with WarningCode
  inline def DEBUG_ENABLED: DEBUG_ENABLED = "DEBUG_ENABLED".asInstanceOf[DEBUG_ENABLED]
  
  @js.native
  sealed trait Email extends StObject
  inline def Email: Email = "Email".asInstanceOf[Email]
  
  @js.native
  sealed trait EmailCreateAccount
    extends StObject
       with SignInErrorTypes
  inline def EmailCreateAccount: EmailCreateAccount = "EmailCreateAccount".asInstanceOf[EmailCreateAccount]
  
  @js.native
  sealed trait EmailSignin
    extends StObject
       with SignInErrorTypes
  inline def EmailSignin: EmailSignin = "EmailSignin".asInstanceOf[EmailSignin]
  
  @js.native
  sealed trait F extends StObject
  inline def F: F = "F".asInstanceOf[F]
  
  @js.native
  sealed trait M extends StObject
  inline def M: M = "M".asInstanceOf[M]
  
  @js.native
  sealed trait NEXTAUTH_URL
    extends StObject
       with WarningCode
  inline def NEXTAUTH_URL: NEXTAUTH_URL = "NEXTAUTH_URL".asInstanceOf[NEXTAUTH_URL]
  
  @js.native
  sealed trait NO_SECRET
    extends StObject
       with WarningCode
  inline def NO_SECRET: NO_SECRET = "NO_SECRET".asInstanceOf[NO_SECRET]
  
  @js.native
  sealed trait OAuthAccountNotLinked
    extends StObject
       with SignInErrorTypes
  inline def OAuthAccountNotLinked: OAuthAccountNotLinked = "OAuthAccountNotLinked".asInstanceOf[OAuthAccountNotLinked]
  
  @js.native
  sealed trait OAuthCallback
    extends StObject
       with SignInErrorTypes
  inline def OAuthCallback: OAuthCallback = "OAuthCallback".asInstanceOf[OAuthCallback]
  
  @js.native
  sealed trait OAuthCreateAccount
    extends StObject
       with SignInErrorTypes
  inline def OAuthCreateAccount: OAuthCreateAccount = "OAuthCreateAccount".asInstanceOf[OAuthCreateAccount]
  
  @js.native
  sealed trait OAuthSignin
    extends StObject
       with SignInErrorTypes
  inline def OAuthSignin: OAuthSignin = "OAuthSignin".asInstanceOf[OAuthSignin]
  
  @js.native
  sealed trait PINNER extends StObject
  inline def PINNER: PINNER = "PINNER".asInstanceOf[PINNER]
  
  @js.native
  sealed trait S256 extends StObject
  inline def S256: S256 = "S256".asInstanceOf[S256]
  
  @js.native
  sealed trait SessionRequired
    extends StObject
       with SignInErrorTypes
  inline def SessionRequired: SessionRequired = "SessionRequired".asInstanceOf[SessionRequired]
  
  @js.native
  sealed trait Signin
    extends StObject
       with SignInErrorTypes
  inline def Signin: Signin = "Signin".asInstanceOf[Signin]
  
  @js.native
  sealed trait TWITTER_OAUTH_2_BETA
    extends StObject
       with WarningCode
  inline def TWITTER_OAUTH_2_BETA: TWITTER_OAUTH_2_BETA = "TWITTER_OAUTH_2_BETA".asInstanceOf[TWITTER_OAUTH_2_BETA]
  
  @js.native
  sealed trait U extends StObject
  inline def U: U = "U".asInstanceOf[U]
  
  @js.native
  sealed trait _log
    extends StObject
       with NextAuthAction
  inline def _log: _log = "_log".asInstanceOf[_log]
  
  @js.native
  sealed trait a extends StObject
  inline def a: a = "a".asInstanceOf[a]
  
  @js.native
  sealed trait `abusefilter-log`
    extends StObject
       with WikimediaRight
  inline def `abusefilter-log`: `abusefilter-log` = "abusefilter-log".asInstanceOf[`abusefilter-log`]
  
  @js.native
  sealed trait accessdenied
    extends StObject
       with ErrorType
  inline def accessdenied: accessdenied = "accessdenied".asInstanceOf[accessdenied]
  
  @js.native
  sealed trait accountcreator
    extends StObject
       with WikimediaGroup
  inline def accountcreator: accountcreator = "accountcreator".asInstanceOf[accountcreator]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait apihighlimits
    extends StObject
       with WikimediaRight
  inline def apihighlimits: apihighlimits = "apihighlimits".asInstanceOf[apihighlimits]
  
  @js.native
  sealed trait apple
    extends StObject
       with OAuthProviderType
  inline def apple: apple = "apple".asInstanceOf[apple]
  
  @js.native
  sealed trait applychangetags
    extends StObject
       with WikimediaRight
  inline def applychangetags: applychangetags = "applychangetags".asInstanceOf[applychangetags]
  
  @js.native
  sealed trait atlassian
    extends StObject
       with OAuthProviderType
  inline def atlassian: atlassian = "atlassian".asInstanceOf[atlassian]
  
  @js.native
  sealed trait auth0
    extends StObject
       with OAuthProviderType
  inline def auth0: auth0 = "auth0".asInstanceOf[auth0]
  
  @js.native
  sealed trait authenticated extends StObject
  inline def authenticated: authenticated = "authenticated".asInstanceOf[authenticated]
  
  @js.native
  sealed trait authentik
    extends StObject
       with OAuthProviderType
  inline def authentik: authentik = "authentik".asInstanceOf[authentik]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait autoconfirmed
    extends StObject
       with WikimediaGroup
       with WikimediaRight
  inline def autoconfirmed: autoconfirmed = "autoconfirmed".asInstanceOf[autoconfirmed]
  
  @js.native
  sealed trait autopatrol
    extends StObject
       with WikimediaRight
  inline def autopatrol: autopatrol = "autopatrol".asInstanceOf[autopatrol]
  
  @js.native
  sealed trait autoreview
    extends StObject
       with WikimediaRight
  inline def autoreview: autoreview = "autoreview".asInstanceOf[autoreview]
  
  @js.native
  sealed trait `azure-ad`
    extends StObject
       with OAuthProviderType
  inline def `azure-ad`: `azure-ad` = "azure-ad".asInstanceOf[`azure-ad`]
  
  @js.native
  sealed trait `azure-ad-b2c`
    extends StObject
       with OAuthProviderType
  inline def `azure-ad-b2c`: `azure-ad-b2c` = "azure-ad-b2c".asInstanceOf[`azure-ad-b2c`]
  
  @js.native
  sealed trait b extends StObject
  inline def b: b = "b".asInstanceOf[b]
  
  @js.native
  sealed trait basic
    extends StObject
       with WikimediaGrant
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait battlenet
    extends StObject
       with OAuthProviderType
  inline def battlenet: battlenet = "battlenet".asInstanceOf[battlenet]
  
  @js.native
  sealed trait bigdelete
    extends StObject
       with WikimediaRight
  inline def bigdelete: bigdelete = "bigdelete".asInstanceOf[bigdelete]
  
  @js.native
  sealed trait block
    extends StObject
       with WikimediaRight
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait blockemail
    extends StObject
       with WikimediaRight
  inline def blockemail: blockemail = "blockemail".asInstanceOf[blockemail]
  
  @js.native
  sealed trait blockusers
    extends StObject
       with WikimediaGrant
  inline def blockusers: blockusers = "blockusers".asInstanceOf[blockusers]
  
  @js.native
  sealed trait bot
    extends StObject
       with WikimediaGroup
       with WikimediaRight
  inline def bot: bot = "bot".asInstanceOf[bot]
  
  @js.native
  sealed trait box
    extends StObject
       with OAuthProviderType
  inline def box: box = "box".asInstanceOf[box]
  
  @js.native
  sealed trait `boxyhq-saml`
    extends StObject
       with OAuthProviderType
  inline def `boxyhq-saml`: `boxyhq-saml` = "boxyhq-saml".asInstanceOf[`boxyhq-saml`]
  
  @js.native
  sealed trait browsearchive
    extends StObject
       with WikimediaRight
  inline def browsearchive: browsearchive = "browsearchive".asInstanceOf[browsearchive]
  
  @js.native
  sealed trait bungie
    extends StObject
       with OAuthProviderType
  inline def bungie: bungie = "bungie".asInstanceOf[bungie]
  
  @js.native
  sealed trait bureaucrat
    extends StObject
       with WikimediaGroup
  inline def bureaucrat: bureaucrat = "bureaucrat".asInstanceOf[bureaucrat]
  
  @js.native
  sealed trait c extends StObject
  inline def c: c = "c".asInstanceOf[c]
  
  @js.native
  sealed trait callback_
    extends StObject
       with NextAuthAction
  inline def callback_ : callback_ = "callback".asInstanceOf[callback_]
  
  @js.native
  sealed trait challenge extends StObject
  inline def challenge: challenge = "challenge".asInstanceOf[challenge]
  
  @js.native
  sealed trait changetags
    extends StObject
       with WikimediaRight
  inline def changetags: changetags = "changetags".asInstanceOf[changetags]
  
  @js.native
  sealed trait checkuser
    extends StObject
       with WikimediaGrant
       with WikimediaGroup
       with WikimediaRight
  inline def checkuser: checkuser = "checkuser".asInstanceOf[checkuser]
  
  @js.native
  sealed trait `checkuser-log`
    extends StObject
       with WikimediaRight
  inline def `checkuser-log`: `checkuser-log` = "checkuser-log".asInstanceOf[`checkuser-log`]
  
  @js.native
  sealed trait child extends StObject
  inline def child: child = "child".asInstanceOf[child]
  
  @js.native
  sealed trait clientSecret extends StObject
  inline def clientSecret: clientSecret = "clientSecret".asInstanceOf[clientSecret]
  
  @js.native
  sealed trait cognito
    extends StObject
       with OAuthProviderType
  inline def cognito: cognito = "cognito".asInstanceOf[cognito]
  
  @js.native
  sealed trait coinbase
    extends StObject
       with OAuthProviderType
  inline def coinbase: coinbase = "coinbase".asInstanceOf[coinbase]
  
  @js.native
  sealed trait configuration
    extends StObject
       with ErrorType
  inline def configuration: configuration = "configuration".asInstanceOf[configuration]
  
  @js.native
  sealed trait confirmed
    extends StObject
       with WikimediaGroup
  inline def confirmed: confirmed = "confirmed".asInstanceOf[confirmed]
  
  @js.native
  sealed trait createUser
    extends StObject
       with EventType
  inline def createUser: createUser = "createUser".asInstanceOf[createUser]
  
  @js.native
  sealed trait createaccount
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def createaccount: createaccount = "createaccount".asInstanceOf[createaccount]
  
  @js.native
  sealed trait createpage
    extends StObject
       with WikimediaRight
  inline def createpage: createpage = "createpage".asInstanceOf[createpage]
  
  @js.native
  sealed trait createpagemainns
    extends StObject
       with WikimediaRight
  inline def createpagemainns: createpagemainns = "createpagemainns".asInstanceOf[createpagemainns]
  
  @js.native
  sealed trait createtalk
    extends StObject
       with WikimediaRight
  inline def createtalk: createtalk = "createtalk".asInstanceOf[createtalk]
  
  @js.native
  sealed trait credentials_
    extends StObject
       with OAuthProviderType
       with ProviderType
       with RedirectableProviderType
  inline def credentials_ : credentials_ = "credentials".asInstanceOf[credentials_]
  
  @js.native
  sealed trait csrf
    extends StObject
       with NextAuthAction
  inline def csrf: csrf = "csrf".asInstanceOf[csrf]
  
  @js.native
  sealed trait d extends StObject
  inline def d: d = "d".asInstanceOf[d]
  
  @js.native
  sealed trait dark extends StObject
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait database
    extends StObject
       with SessionStrategy
  inline def database: database = "database".asInstanceOf[database]
  
  @js.native
  sealed trait delete
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait `delete-redirect`
    extends StObject
       with WikimediaRight
  inline def `delete-redirect`: `delete-redirect` = "delete-redirect".asInstanceOf[`delete-redirect`]
  
  @js.native
  sealed trait deletedhistory
    extends StObject
       with WikimediaRight
  inline def deletedhistory: deletedhistory = "deletedhistory".asInstanceOf[deletedhistory]
  
  @js.native
  sealed trait deletedtext
    extends StObject
       with WikimediaRight
  inline def deletedtext: deletedtext = "deletedtext".asInstanceOf[deletedtext]
  
  @js.native
  sealed trait deletelogentry
    extends StObject
       with WikimediaRight
  inline def deletelogentry: deletelogentry = "deletelogentry".asInstanceOf[deletelogentry]
  
  @js.native
  sealed trait deleterevision
    extends StObject
       with WikimediaRight
  inline def deleterevision: deleterevision = "deleterevision".asInstanceOf[deleterevision]
  
  @js.native
  sealed trait discord
    extends StObject
       with OAuthProviderType
  inline def discord: discord = "discord".asInstanceOf[discord]
  
  @js.native
  sealed trait dropbox
    extends StObject
       with OAuthProviderType
  inline def dropbox: dropbox = "dropbox".asInstanceOf[dropbox]
  
  @js.native
  sealed trait `duende-identity-server6`
    extends StObject
       with OAuthProviderType
  inline def `duende-identity-server6`: `duende-identity-server6` = "duende-identity-server6".asInstanceOf[`duende-identity-server6`]
  
  @js.native
  sealed trait e extends StObject
  inline def e: e = "e".asInstanceOf[e]
  
  @js.native
  sealed trait easy extends StObject
  inline def easy: easy = "easy".asInstanceOf[easy]
  
  @js.native
  sealed trait edit
    extends StObject
       with WikimediaRight
  inline def edit: edit = "edit".asInstanceOf[edit]
  
  @js.native
  sealed trait `edit-legal`
    extends StObject
       with WikimediaRight
  inline def `edit-legal`: `edit-legal` = "edit-legal".asInstanceOf[`edit-legal`]
  
  @js.native
  sealed trait editinterface
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def editinterface: editinterface = "editinterface".asInstanceOf[editinterface]
  
  @js.native
  sealed trait editmycssjs
    extends StObject
       with WikimediaGrant
  inline def editmycssjs: editmycssjs = "editmycssjs".asInstanceOf[editmycssjs]
  
  @js.native
  sealed trait editmyoptions
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def editmyoptions: editmyoptions = "editmyoptions".asInstanceOf[editmyoptions]
  
  @js.native
  sealed trait editmyusercss
    extends StObject
       with WikimediaRight
  inline def editmyusercss: editmyusercss = "editmyusercss".asInstanceOf[editmyusercss]
  
  @js.native
  sealed trait editmyuserjs
    extends StObject
       with WikimediaRight
  inline def editmyuserjs: editmyuserjs = "editmyuserjs".asInstanceOf[editmyuserjs]
  
  @js.native
  sealed trait editmyuserjson
    extends StObject
       with WikimediaRight
  inline def editmyuserjson: editmyuserjson = "editmyuserjson".asInstanceOf[editmyuserjson]
  
  @js.native
  sealed trait editmywatchlist
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def editmywatchlist: editmywatchlist = "editmywatchlist".asInstanceOf[editmywatchlist]
  
  @js.native
  sealed trait editpage
    extends StObject
       with WikimediaGrant
  inline def editpage: editpage = "editpage".asInstanceOf[editpage]
  
  @js.native
  sealed trait editprotected
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def editprotected: editprotected = "editprotected".asInstanceOf[editprotected]
  
  @js.native
  sealed trait editsemiprotected
    extends StObject
       with WikimediaRight
  inline def editsemiprotected: editsemiprotected = "editsemiprotected".asInstanceOf[editsemiprotected]
  
  @js.native
  sealed trait editsiteconfig
    extends StObject
       with WikimediaGrant
  inline def editsiteconfig: editsiteconfig = "editsiteconfig".asInstanceOf[editsiteconfig]
  
  @js.native
  sealed trait editsitecss
    extends StObject
       with WikimediaRight
  inline def editsitecss: editsitecss = "editsitecss".asInstanceOf[editsitecss]
  
  @js.native
  sealed trait editsitejs
    extends StObject
       with WikimediaRight
  inline def editsitejs: editsitejs = "editsitejs".asInstanceOf[editsitejs]
  
  @js.native
  sealed trait editsitejson
    extends StObject
       with WikimediaRight
  inline def editsitejson: editsitejson = "editsitejson".asInstanceOf[editsitejson]
  
  @js.native
  sealed trait editusercss
    extends StObject
       with WikimediaRight
  inline def editusercss: editusercss = "editusercss".asInstanceOf[editusercss]
  
  @js.native
  sealed trait edituserjs
    extends StObject
       with WikimediaRight
  inline def edituserjs: edituserjs = "edituserjs".asInstanceOf[edituserjs]
  
  @js.native
  sealed trait edituserjson
    extends StObject
       with WikimediaRight
  inline def edituserjson: edituserjson = "edituserjson".asInstanceOf[edituserjson]
  
  @js.native
  sealed trait email_
    extends StObject
       with OAuthProviderType
       with ProviderType
       with RedirectableProviderType
  inline def email_ : email_ = "email".asInstanceOf[email_]
  
  @js.native
  sealed trait error
    extends StObject
       with NextAuthAction
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait eveonline
    extends StObject
       with OAuthProviderType
  inline def eveonline: eveonline = "eveonline".asInstanceOf[eveonline]
  
  @js.native
  sealed trait extendedconfirmed
    extends StObject
       with WikimediaGroup
  inline def extendedconfirmed: extendedconfirmed = "extendedconfirmed".asInstanceOf[extendedconfirmed]
  
  @js.native
  sealed trait f_ extends StObject
  inline def f_ : f_ = "f".asInstanceOf[f_]
  
  @js.native
  sealed trait facebook
    extends StObject
       with OAuthProviderType
  inline def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @js.native
  sealed trait faceit
    extends StObject
       with OAuthProviderType
  inline def faceit: faceit = "faceit".asInstanceOf[faceit]
  
  @js.native
  sealed trait female
    extends StObject
       with Gender
  inline def female: female = "female".asInstanceOf[female]
  
  @js.native
  sealed trait finished extends StObject
  inline def finished: finished = "finished".asInstanceOf[finished]
  
  @js.native
  sealed trait flood
    extends StObject
       with WikimediaGroup
  inline def flood: flood = "flood".asInstanceOf[flood]
  
  @js.native
  sealed trait `flow-bot`
    extends StObject
       with WikimediaGroup
  inline def `flow-bot`: `flow-bot` = "flow-bot".asInstanceOf[`flow-bot`]
  
  @js.native
  sealed trait foursquare
    extends StObject
       with OAuthProviderType
  inline def foursquare: foursquare = "foursquare".asInstanceOf[foursquare]
  
  @js.native
  sealed trait freshbooks
    extends StObject
       with OAuthProviderType
  inline def freshbooks: freshbooks = "freshbooks".asInstanceOf[freshbooks]
  
  @js.native
  sealed trait fusionauth
    extends StObject
       with OAuthProviderType
  inline def fusionauth: fusionauth = "fusionauth".asInstanceOf[fusionauth]
  
  @js.native
  sealed trait g extends StObject
  inline def g: g = "g".asInstanceOf[g]
  
  @js.native
  sealed trait getSession extends StObject
  inline def getSession: getSession = "getSession".asInstanceOf[getSession]
  
  @js.native
  sealed trait github
    extends StObject
       with OAuthProviderType
  inline def github: github = "github".asInstanceOf[github]
  
  @js.native
  sealed trait gitlab
    extends StObject
       with OAuthProviderType
  inline def gitlab: gitlab = "gitlab".asInstanceOf[gitlab]
  
  @js.native
  sealed trait globalblock
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def globalblock: globalblock = "globalblock".asInstanceOf[globalblock]
  
  @js.native
  sealed trait google
    extends StObject
       with OAuthProviderType
  inline def google: google = "google".asInstanceOf[google]
  
  @js.native
  sealed trait grandchild extends StObject
  inline def grandchild: grandchild = "grandchild".asInstanceOf[grandchild]
  
  @js.native
  sealed trait grandparent extends StObject
  inline def grandparent: grandparent = "grandparent".asInstanceOf[grandparent]
  
  @js.native
  sealed trait h extends StObject
  inline def h: h = "h".asInstanceOf[h]
  
  @js.native
  sealed trait hard extends StObject
  inline def hard: hard = "hard".asInstanceOf[hard]
  
  @js.native
  sealed trait hidden extends StObject
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait highvolume
    extends StObject
       with WikimediaGrant
  inline def highvolume: highvolume = "highvolume".asInstanceOf[highvolume]
  
  @js.native
  sealed trait httpsColonSlashSlashappleidDotappleDotcom extends StObject
  inline def httpsColonSlashSlashappleidDotappleDotcom: httpsColonSlashSlashappleidDotappleDotcom = "https://appleid.apple.com".asInstanceOf[httpsColonSlashSlashappleidDotappleDotcom]
  
  @js.native
  sealed trait httpsColonSlashSlashwwwDotbattlenetDotcomDotcnSlashoauth extends StObject
  inline def httpsColonSlashSlashwwwDotbattlenetDotcomDotcnSlashoauth: httpsColonSlashSlashwwwDotbattlenetDotcomDotcnSlashoauth = "https://www.battlenet.com.cn/oauth".asInstanceOf[httpsColonSlashSlashwwwDotbattlenetDotcomDotcnSlashoauth]
  
  @js.native
  sealed trait hubspot
    extends StObject
       with OAuthProviderType
  inline def hubspot: hubspot = "hubspot".asInstanceOf[hubspot]
  
  @js.native
  sealed trait i extends StObject
  inline def i: i = "i".asInstanceOf[i]
  
  @js.native
  sealed trait `identity-server4`
    extends StObject
       with OAuthProviderType
  inline def `identity-server4`: `identity-server4` = "identity-server4".asInstanceOf[`identity-server4`]
  
  @js.native
  sealed trait `import`
    extends StObject
       with WikimediaGrant
       with WikimediaGroup
       with WikimediaRight
  inline def `import`: `import` = "import".asInstanceOf[`import`]
  
  @js.native
  sealed trait importupload
    extends StObject
       with WikimediaRight
  inline def importupload: importupload = "importupload".asInstanceOf[importupload]
  
  @js.native
  sealed trait in_progress extends StObject
  inline def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  
  @js.native
  sealed trait index
    extends StObject
       with OAuthProviderType
  inline def index: index = "index".asInstanceOf[index]
  
  @js.native
  sealed trait instagram
    extends StObject
       with OAuthProviderType
  inline def instagram: instagram = "instagram".asInstanceOf[instagram]
  
  @js.native
  sealed trait `ipblock-exempt`
    extends StObject
       with WikimediaGroup
       with WikimediaRight
  inline def `ipblock-exempt`: `ipblock-exempt` = "ipblock-exempt".asInstanceOf[`ipblock-exempt`]
  
  @js.native
  sealed trait `item-merge`
    extends StObject
       with WikimediaRight
  inline def `item-merge`: `item-merge` = "item-merge".asInstanceOf[`item-merge`]
  
  @js.native
  sealed trait `item-redirect`
    extends StObject
       with WikimediaRight
  inline def `item-redirect`: `item-redirect` = "item-redirect".asInstanceOf[`item-redirect`]
  
  @js.native
  sealed trait `item-term`
    extends StObject
       with WikimediaRight
  inline def `item-term`: `item-term` = "item-term".asInstanceOf[`item-term`]
  
  @js.native
  sealed trait j extends StObject
  inline def j: j = "j".asInstanceOf[j]
  
  @js.native
  sealed trait jwt
    extends StObject
       with SessionStrategy
  inline def jwt: jwt = "jwt".asInstanceOf[jwt]
  
  @js.native
  sealed trait k extends StObject
  inline def k: k = "k".asInstanceOf[k]
  
  @js.native
  sealed trait kakao
    extends StObject
       with OAuthProviderType
  inline def kakao: kakao = "kakao".asInstanceOf[kakao]
  
  @js.native
  sealed trait keycloak
    extends StObject
       with OAuthProviderType
  inline def keycloak: keycloak = "keycloak".asInstanceOf[keycloak]
  
  @js.native
  sealed trait l extends StObject
  inline def l: l = "l".asInstanceOf[l]
  
  @js.native
  sealed trait light extends StObject
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait line
    extends StObject
       with OAuthProviderType
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait linkAccount
    extends StObject
       with EventType
  inline def linkAccount: linkAccount = "linkAccount".asInstanceOf[linkAccount]
  
  @js.native
  sealed trait linkedin
    extends StObject
       with OAuthProviderType
  inline def linkedin: linkedin = "linkedin".asInstanceOf[linkedin]
  
  @js.native
  sealed trait loading extends StObject
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait m_ extends StObject
  inline def m_ : m_ = "m".asInstanceOf[m_]
  
  @js.native
  sealed trait mailchimp
    extends StObject
       with OAuthProviderType
  inline def mailchimp: mailchimp = "mailchimp".asInstanceOf[mailchimp]
  
  @js.native
  sealed trait mailru
    extends StObject
       with OAuthProviderType
  inline def mailru: mailru = "mailru".asInstanceOf[mailru]
  
  @js.native
  sealed trait male
    extends StObject
       with Gender
  inline def male: male = "male".asInstanceOf[male]
  
  @js.native
  sealed trait markbotedits
    extends StObject
       with WikimediaRight
  inline def markbotedits: markbotedits = "markbotedits".asInstanceOf[markbotedits]
  
  @js.native
  sealed trait massmessage
    extends StObject
       with WikimediaRight
  inline def massmessage: massmessage = "massmessage".asInstanceOf[massmessage]
  
  @js.native
  sealed trait max extends StObject
  inline def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait medium
    extends StObject
       with OAuthProviderType
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait mergehistory
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def mergehistory: mergehistory = "mergehistory".asInstanceOf[mergehistory]
  
  @js.native
  sealed trait minoredit
    extends StObject
       with WikimediaRight
  inline def minoredit: minoredit = "minoredit".asInstanceOf[minoredit]
  
  @js.native
  sealed trait move
    extends StObject
       with WikimediaRight
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait `move-subpages`
    extends StObject
       with WikimediaRight
  inline def `move-subpages`: `move-subpages` = "move-subpages".asInstanceOf[`move-subpages`]
  
  @js.native
  sealed trait movefile
    extends StObject
       with WikimediaRight
  inline def movefile: movefile = "movefile".asInstanceOf[movefile]
  
  @js.native
  sealed trait movestable
    extends StObject
       with WikimediaRight
  inline def movestable: movestable = "movestable".asInstanceOf[movestable]
  
  @js.native
  sealed trait `mwoauth-authonlyprivate`
    extends StObject
       with WikimediaRight
  inline def `mwoauth-authonlyprivate`: `mwoauth-authonlyprivate` = "mwoauth-authonlyprivate".asInstanceOf[`mwoauth-authonlyprivate`]
  
  @js.native
  sealed trait n extends StObject
  inline def n: n = "n".asInstanceOf[n]
  
  @js.native
  sealed trait naver
    extends StObject
       with OAuthProviderType
  inline def naver: naver = "naver".asInstanceOf[naver]
  
  @js.native
  sealed trait netlify
    extends StObject
       with OAuthProviderType
  inline def netlify: netlify = "netlify".asInstanceOf[netlify]
  
  @js.native
  sealed trait nominornewtalk
    extends StObject
       with WikimediaRight
  inline def nominornewtalk: nominornewtalk = "nominornewtalk".asInstanceOf[nominornewtalk]
  
  @js.native
  sealed trait nonce
    extends StObject
       with ChecksType
  inline def nonce: nonce = "nonce".asInstanceOf[nonce]
  
  @js.native
  sealed trait none
    extends StObject
       with ChecksType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait noratelimit
    extends StObject
       with WikimediaRight
  inline def noratelimit: noratelimit = "noratelimit".asInstanceOf[noratelimit]
  
  @js.native
  sealed trait nuke
    extends StObject
       with WikimediaRight
  inline def nuke: nuke = "nuke".asInstanceOf[nuke]
  
  @js.native
  sealed trait o extends StObject
  inline def o: o = "o".asInstanceOf[o]
  
  @js.native
  sealed trait oath
    extends StObject
       with WikimediaGrant
  inline def oath: oath = "oath".asInstanceOf[oath]
  
  @js.native
  sealed trait oauth
    extends StObject
       with OAuthProviderType
       with ProviderType
  inline def oauth: oauth = "oauth".asInstanceOf[oauth]
  
  @js.native
  sealed trait `oauth-types`
    extends StObject
       with OAuthProviderType
  inline def `oauth-types`: `oauth-types` = "oauth-types".asInstanceOf[`oauth-types`]
  
  @js.native
  sealed trait okta
    extends StObject
       with OAuthProviderType
  inline def okta: okta = "okta".asInstanceOf[okta]
  
  @js.native
  sealed trait onelogin
    extends StObject
       with OAuthProviderType
  inline def onelogin: onelogin = "onelogin".asInstanceOf[onelogin]
  
  @js.native
  sealed trait osso
    extends StObject
       with OAuthProviderType
  inline def osso: osso = "osso".asInstanceOf[osso]
  
  @js.native
  sealed trait osu
    extends StObject
       with OAuthProviderType
  inline def osu: osu = "osu".asInstanceOf[osu]
  
  @js.native
  sealed trait oversight
    extends StObject
       with WikimediaGrant
       with WikimediaGroup
  inline def oversight: oversight = "oversight".asInstanceOf[oversight]
  
  @js.native
  sealed trait owner extends StObject
  inline def owner: owner = "owner".asInstanceOf[owner]
  
  @js.native
  sealed trait p extends StObject
  inline def p: p = "p".asInstanceOf[p]
  
  @js.native
  sealed trait parent extends StObject
  inline def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait patreon
    extends StObject
       with OAuthProviderType
  inline def patreon: patreon = "patreon".asInstanceOf[patreon]
  
  @js.native
  sealed trait patrol
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def patrol: patrol = "patrol".asInstanceOf[patrol]
  
  @js.native
  sealed trait patrolmarks
    extends StObject
       with WikimediaRight
  inline def patrolmarks: patrolmarks = "patrolmarks".asInstanceOf[patrolmarks]
  
  @js.native
  sealed trait pedagogy extends StObject
  inline def pedagogy: pedagogy = "pedagogy".asInstanceOf[pedagogy]
  
  @js.native
  sealed trait pinterest
    extends StObject
       with OAuthProviderType
  inline def pinterest: pinterest = "pinterest".asInstanceOf[pinterest]
  
  @js.native
  sealed trait pipedrive
    extends StObject
       with OAuthProviderType
  inline def pipedrive: pipedrive = "pipedrive".asInstanceOf[pipedrive]
  
  @js.native
  sealed trait pkce
    extends StObject
       with ChecksType
  inline def pkce: pkce = "pkce".asInstanceOf[pkce]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait privateinfo
    extends StObject
       with WikimediaGrant
  inline def privateinfo: privateinfo = "privateinfo".asInstanceOf[privateinfo]
  
  @js.native
  sealed trait profile extends StObject
  inline def profile: profile = "profile".asInstanceOf[profile]
  
  @js.native
  sealed trait project extends StObject
  inline def project: project = "project".asInstanceOf[project]
  
  @js.native
  sealed trait `property-create`
    extends StObject
       with WikimediaRight
  inline def `property-create`: `property-create` = "property-create".asInstanceOf[`property-create`]
  
  @js.native
  sealed trait `property-term`
    extends StObject
       with WikimediaRight
  inline def `property-term`: `property-term` = "property-term".asInstanceOf[`property-term`]
  
  @js.native
  sealed trait propertycreator
    extends StObject
       with WikimediaGroup
  inline def propertycreator: propertycreator = "propertycreator".asInstanceOf[propertycreator]
  
  @js.native
  sealed trait protect
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def protect: protect = "protect".asInstanceOf[protect]
  
  @js.native
  sealed trait providers
    extends StObject
       with NextAuthAction
  inline def providers: providers = "providers".asInstanceOf[providers]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait purge
    extends StObject
       with WikimediaRight
  inline def purge: purge = "purge".asInstanceOf[purge]
  
  @js.native
  sealed trait q extends StObject
  inline def q: q = "q".asInstanceOf[q]
  
  @js.native
  sealed trait r extends StObject
  inline def r: r = "r".asInstanceOf[r]
  
  @js.native
  sealed trait read
    extends StObject
       with WikimediaRight
  inline def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait reddit
    extends StObject
       with OAuthProviderType
  inline def reddit: reddit = "reddit".asInstanceOf[reddit]
  
  @js.native
  sealed trait reupload
    extends StObject
       with WikimediaRight
  inline def reupload: reupload = "reupload".asInstanceOf[reupload]
  
  @js.native
  sealed trait `reupload-own`
    extends StObject
       with WikimediaRight
  inline def `reupload-own`: `reupload-own` = "reupload-own".asInstanceOf[`reupload-own`]
  
  @js.native
  sealed trait `reupload-shared`
    extends StObject
       with WikimediaRight
  inline def `reupload-shared`: `reupload-shared` = "reupload-shared".asInstanceOf[`reupload-shared`]
  
  @js.native
  sealed trait rollback
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def rollback: rollback = "rollback".asInstanceOf[rollback]
  
  @js.native
  sealed trait rollbacker
    extends StObject
       with WikimediaGroup
  inline def rollbacker: rollbacker = "rollbacker".asInstanceOf[rollbacker]
  
  @js.native
  sealed trait s extends StObject
  inline def s: s = "s".asInstanceOf[s]
  
  @js.native
  sealed trait salesforce
    extends StObject
       with OAuthProviderType
  inline def salesforce: salesforce = "salesforce".asInstanceOf[salesforce]
  
  @js.native
  sealed trait school extends StObject
  inline def school: school = "school".asInstanceOf[school]
  
  @js.native
  sealed trait scolarity extends StObject
  inline def scolarity: scolarity = "scolarity".asInstanceOf[scolarity]
  
  @js.native
  sealed trait sendemail
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def sendemail: sendemail = "sendemail".asInstanceOf[sendemail]
  
  @js.native
  sealed trait session
    extends StObject
       with EventType
       with NextAuthAction
  inline def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait shortenurls
    extends StObject
       with WikimediaGrant
  inline def shortenurls: shortenurls = "shortenurls".asInstanceOf[shortenurls]
  
  @js.native
  sealed trait sibling extends StObject
  inline def sibling: sibling = "sibling".asInstanceOf[sibling]
  
  @js.native
  sealed trait signIn_
    extends StObject
       with EventType
  inline def signIn_ : signIn_ = "signIn".asInstanceOf[signIn_]
  
  @js.native
  sealed trait signOut
    extends StObject
       with EventType
  inline def signOut: signOut = "signOut".asInstanceOf[signOut]
  
  @js.native
  sealed trait signin__
    extends StObject
       with NextAuthAction
  inline def signin__ : signin__ = "signin".asInstanceOf[signin__]
  
  @js.native
  sealed trait signout_
    extends StObject
       with NextAuthAction
  inline def signout_ : signout_ = "signout".asInstanceOf[signout_]
  
  @js.native
  sealed trait skipcaptcha
    extends StObject
       with WikimediaRight
  inline def skipcaptcha: skipcaptcha = "skipcaptcha".asInstanceOf[skipcaptcha]
  
  @js.native
  sealed trait slack
    extends StObject
       with OAuthProviderType
  inline def slack: slack = "slack".asInstanceOf[slack]
  
  @js.native
  sealed trait spotify
    extends StObject
       with OAuthProviderType
  inline def spotify: spotify = "spotify".asInstanceOf[spotify]
  
  @js.native
  sealed trait state
    extends StObject
       with ChecksType
  inline def state: state = "state".asInstanceOf[state]
  
  @js.native
  sealed trait steward
    extends StObject
       with WikimediaGroup
  inline def steward: steward = "steward".asInstanceOf[steward]
  
  @js.native
  sealed trait storage extends StObject
  inline def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait strava
    extends StObject
       with OAuthProviderType
  inline def strava: strava = "strava".asInstanceOf[strava]
  
  @js.native
  sealed trait suppressionlog
    extends StObject
       with WikimediaRight
  inline def suppressionlog: suppressionlog = "suppressionlog".asInstanceOf[suppressionlog]
  
  @js.native
  sealed trait sysop
    extends StObject
       with WikimediaGroup
  inline def sysop: sysop = "sysop".asInstanceOf[sysop]
  
  @js.native
  sealed trait tboverride
    extends StObject
       with WikimediaRight
  inline def tboverride: tboverride = "tboverride".asInstanceOf[tboverride]
  
  @js.native
  sealed trait temp extends StObject
  inline def temp: temp = "temp".asInstanceOf[temp]
  
  @js.native
  sealed trait templateeditor
    extends StObject
       with WikimediaRight
  inline def templateeditor: templateeditor = "templateeditor".asInstanceOf[templateeditor]
  
  @js.native
  sealed trait timer extends StObject
  inline def timer: timer = "timer".asInstanceOf[timer]
  
  @js.native
  sealed trait torunblocked
    extends StObject
       with WikimediaRight
  inline def torunblocked: torunblocked = "torunblocked".asInstanceOf[torunblocked]
  
  @js.native
  sealed trait trakt
    extends StObject
       with OAuthProviderType
  inline def trakt: trakt = "trakt".asInstanceOf[trakt]
  
  @js.native
  sealed trait `transcode-reset`
    extends StObject
       with WikimediaRight
  inline def `transcode-reset`: `transcode-reset` = "transcode-reset".asInstanceOf[`transcode-reset`]
  
  @js.native
  sealed trait translate
    extends StObject
       with WikimediaRight
  inline def translate: translate = "translate".asInstanceOf[translate]
  
  @js.native
  sealed trait translationadmin
    extends StObject
       with WikimediaGroup
  inline def translationadmin: translationadmin = "translationadmin".asInstanceOf[translationadmin]
  
  @js.native
  sealed trait transwiki
    extends StObject
       with WikimediaGroup
  inline def transwiki: transwiki = "transwiki".asInstanceOf[transwiki]
  
  @js.native
  sealed trait `true` extends StObject
  inline def `true`: `true` = "true".asInstanceOf[`true`]
  
  @js.native
  sealed trait twitch
    extends StObject
       with OAuthProviderType
  inline def twitch: twitch = "twitch".asInstanceOf[twitch]
  
  @js.native
  sealed trait twitter
    extends StObject
       with OAuthProviderType
  inline def twitter: twitter = "twitter".asInstanceOf[twitter]
  
  @js.native
  sealed trait unauthenticated extends StObject
  inline def unauthenticated: unauthenticated = "unauthenticated".asInstanceOf[unauthenticated]
  
  @js.native
  sealed trait undelete
    extends StObject
       with WikimediaRight
  inline def undelete: undelete = "undelete".asInstanceOf[undelete]
  
  @js.native
  sealed trait `united-effects`
    extends StObject
       with OAuthProviderType
  inline def `united-effects`: `united-effects` = "united-effects".asInstanceOf[`united-effects`]
  
  @js.native
  sealed trait university extends StObject
  inline def university: university = "university".asInstanceOf[university]
  
  @js.native
  sealed trait unwatchedpages
    extends StObject
       with WikimediaRight
  inline def unwatchedpages: unwatchedpages = "unwatchedpages".asInstanceOf[unwatchedpages]
  
  @js.native
  sealed trait updateUser
    extends StObject
       with EventType
  inline def updateUser: updateUser = "updateUser".asInstanceOf[updateUser]
  
  @js.native
  sealed trait upload
    extends StObject
       with WikimediaRight
  inline def upload: upload = "upload".asInstanceOf[upload]
  
  @js.native
  sealed trait upload_by_url
    extends StObject
       with WikimediaRight
  inline def upload_by_url: upload_by_url = "upload_by_url".asInstanceOf[upload_by_url]
  
  @js.native
  sealed trait uploadfile
    extends StObject
       with WikimediaGrant
  inline def uploadfile: uploadfile = "uploadfile".asInstanceOf[uploadfile]
  
  @js.native
  sealed trait user
    extends StObject
       with WikimediaGroup
  inline def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait verification
    extends StObject
       with ErrorType
  inline def verification: verification = "verification".asInstanceOf[verification]
  
  @js.native
  sealed trait `verify-request`
    extends StObject
       with NextAuthAction
  inline def `verify-request`: `verify-request` = "verify-request".asInstanceOf[`verify-request`]
  
  @js.native
  sealed trait viewdeleted
    extends StObject
       with WikimediaGrant
  inline def viewdeleted: viewdeleted = "viewdeleted".asInstanceOf[viewdeleted]
  
  @js.native
  sealed trait viewmywatchlist
    extends StObject
       with WikimediaGrant
       with WikimediaRight
  inline def viewmywatchlist: viewmywatchlist = "viewmywatchlist".asInstanceOf[viewmywatchlist]
  
  @js.native
  sealed trait viewsuppressed
    extends StObject
       with WikimediaRight
  inline def viewsuppressed: viewsuppressed = "viewsuppressed".asInstanceOf[viewsuppressed]
  
  @js.native
  sealed trait vk
    extends StObject
       with OAuthProviderType
  inline def vk: vk = "vk".asInstanceOf[vk]
  
  @js.native
  sealed trait w extends StObject
  inline def w: w = "w".asInstanceOf[w]
  
  @js.native
  sealed trait `wikidata-staff`
    extends StObject
       with WikimediaGroup
  inline def `wikidata-staff`: `wikidata-staff` = "wikidata-staff".asInstanceOf[`wikidata-staff`]
  
  @js.native
  sealed trait wikimedia
    extends StObject
       with OAuthProviderType
  inline def wikimedia: wikimedia = "wikimedia".asInstanceOf[wikimedia]
  
  @js.native
  sealed trait wordpress
    extends StObject
       with OAuthProviderType
  inline def wordpress: wordpress = "wordpress".asInstanceOf[wordpress]
  
  @js.native
  sealed trait work extends StObject
  inline def work: work = "work".asInstanceOf[work]
  
  @js.native
  sealed trait workos
    extends StObject
       with OAuthProviderType
  inline def workos: workos = "workos".asInstanceOf[workos]
  
  @js.native
  sealed trait writeapi
    extends StObject
       with WikimediaRight
  inline def writeapi: writeapi = "writeapi".asInstanceOf[writeapi]
  
  @js.native
  sealed trait x extends StObject
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait y extends StObject
  inline def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait yandex
    extends StObject
       with OAuthProviderType
  inline def yandex: yandex = "yandex".asInstanceOf[yandex]
  
  @js.native
  sealed trait z extends StObject
  inline def z: z = "z".asInstanceOf[z]
  
  @js.native
  sealed trait zitadel
    extends StObject
       with OAuthProviderType
  inline def zitadel: zitadel = "zitadel".asInstanceOf[zitadel]
  
  @js.native
  sealed trait zoho
    extends StObject
       with OAuthProviderType
  inline def zoho: zoho = "zoho".asInstanceOf[zoho]
  
  @js.native
  sealed trait zoom
    extends StObject
       with OAuthProviderType
  inline def zoom: zoom = "zoom".asInstanceOf[zoom]
}
