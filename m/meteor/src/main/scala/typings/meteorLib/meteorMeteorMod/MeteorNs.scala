package typings
package meteorLib.meteorMeteorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor")
@js.native
object MeteorNs extends js.Object {
  /** Connection **/
  
  trait Connection extends js.Object {
    var clientAddress: java.lang.String
    var close: js.Function
    var httpHeaders: js.Object
    var id: java.lang.String
    var onClose: js.Function
  }
  
  
  trait Error extends js.Object {
    var details: js.UndefOr[java.lang.String] = js.undefined
    var error: java.lang.String | scala.Double
    var reason: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  trait ErrorStatic
    extends org.scalablytyped.runtime.Instantiable2[
          (/* error */ java.lang.String) | (/* error */ scala.Double), 
          /* reason */ java.lang.String, 
          Error
        ]
       with org.scalablytyped.runtime.Instantiable1[(/* error */ java.lang.String) | (/* error */ scala.Double), Error]
       with org.scalablytyped.runtime.Instantiable3[
          (/* error */ java.lang.String) | (/* error */ scala.Double), 
          /* reason */ java.lang.String, 
          /* details */ java.lang.String, 
          Error
        ]
  
  /** Login **/
  
  /** Event **/
  
  trait Event extends js.Object {
    var currentTarget: reactLib.HTMLElement
    var target: reactLib.HTMLElement
    var `type`: java.lang.String
    var which: scala.Double
    def isDefaultPrevented(): scala.Boolean
    def isImmediatePropagationStopped(): scala.Boolean
    def isPropagationStopped(): scala.Boolean
    def preventDefault(): scala.Unit
    def stopImmediatePropagation(): scala.Unit
    def stopPropagation(): scala.Unit
  }
  
  @js.native
  trait EventHandlerFunction
    extends js.Function {
    def apply(): scala.Unit = js.native
    def apply(event: Event): scala.Unit = js.native
    def apply(event: Event, templateInstance: meteorLib.BlazeNs.TemplateInstance): scala.Unit = js.native
  }
  
  
  trait EventMap
    extends /* id */ org.scalablytyped.runtime.StringDictionary[EventHandlerFunction]
  
  
  trait LiveQueryHandle extends js.Object {
    def stop(): scala.Unit
  }
  
  /** Login **/
  
  trait LoginWithExternalServiceOptions extends js.Object {
    var forceApprovalPrompt: js.UndefOr[scala.Boolean] = js.undefined
    var loginHint: js.UndefOr[java.lang.String] = js.undefined
    var loginStyle: js.UndefOr[java.lang.String] = js.undefined
    var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
    var redirectUrl: js.UndefOr[java.lang.String] = js.undefined
    var requestOfflineToken: js.UndefOr[scala.Boolean] = js.undefined
    var requestPermissions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  }
  
  /** Global props **/
  
  /** Settings **/
  
  trait Settings
    extends /* id */ org.scalablytyped.runtime.StringDictionary[js.Any] {
    var public: org.scalablytyped.runtime.StringDictionary[js.Any]
  }
  
  /** utils **/
  
  /** Pub/Sub **/
  
  trait SubscriptionHandle extends js.Object {
    def ready(): scala.Boolean
    def stop(): scala.Unit
  }
  
  
  trait User extends js.Object {
    var _id: js.UndefOr[java.lang.String] = js.undefined
    var createdAt: js.UndefOr[scala.Double] = js.undefined
    var emails: js.UndefOr[js.Array[UserEmail]] = js.undefined
    var profile: js.UndefOr[js.Any] = js.undefined
    var services: js.UndefOr[js.Any] = js.undefined
    var username: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /** Settings **/
  
  /** User **/
  
  trait UserEmail extends js.Object {
    var address: java.lang.String
    var verified: scala.Boolean
  }
  
  /** User **/
  
  /** Error **/
  var Error: ErrorStatic = js.native
  /** Global props **/
  var isClient: scala.Boolean = js.native
  var isCordova: scala.Boolean = js.native
  /** Global props **/
  var isDevelopment: scala.Boolean = js.native
  var isProduction: scala.Boolean = js.native
  var isServer: scala.Boolean = js.native
  var isTest: scala.Boolean = js.native
  var release: java.lang.String = js.native
  var settings: Settings = js.native
  var users: meteorLib.MongoNs.Collection[User] = js.native
  def _debug(args: js.Any*): scala.Unit = js.native
  /** Method **/
  
  /** Url **/
  def absoluteUrl(): java.lang.String = js.native
  /** Method **/
  
  /** Url **/
  def absoluteUrl(path: java.lang.String): java.lang.String = js.native
  /** Method **/
  
  /** Url **/
  def absoluteUrl(path: java.lang.String, options: meteorLib.Anon_RootUrl): java.lang.String = js.native
  @JSName("apply")
  def apply(name: java.lang.String, args: js.Array[meteorLib.EJSONable]): js.Any = js.native
  @JSName("apply")
  def apply(
    name: java.lang.String,
    args: js.Array[meteorLib.EJSONable],
    options: meteorLib.Anon_OnResultReceived
  ): js.Any = js.native
  @JSName("apply")
  def apply(
    name: java.lang.String,
    args: js.Array[meteorLib.EJSONable],
    options: meteorLib.Anon_OnResultReceived,
    asyncCallback: js.Function
  ): js.Any = js.native
  def bindEnvironment(func: js.Function): js.Any = js.native
  def call(name: java.lang.String, args: js.Any*): js.Any = js.native
  def clearInterval(id: scala.Double): scala.Unit = js.native
  def clearTimeout(id: scala.Double): scala.Unit = js.native
  def defer(func: js.Function): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def loggingIn(): scala.Boolean = js.native
  def loginWith[ExternalService](): scala.Unit = js.native
  def loginWith[ExternalService](options: meteorLib.Anon_RedirectUrl): scala.Unit = js.native
  def loginWith[ExternalService](options: meteorLib.Anon_RedirectUrl, callback: js.Function): scala.Unit = js.native
  def loginWithFacebook(): scala.Unit = js.native
  def loginWithFacebook(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithFacebook(options: LoginWithExternalServiceOptions, callback: js.Function): scala.Unit = js.native
  def loginWithGithub(): scala.Unit = js.native
  def loginWithGithub(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithGithub(options: LoginWithExternalServiceOptions, callback: js.Function): scala.Unit = js.native
  def loginWithGoogle(): scala.Unit = js.native
  def loginWithGoogle(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithGoogle(options: LoginWithExternalServiceOptions, callback: js.Function): scala.Unit = js.native
  def loginWithMeetup(): scala.Unit = js.native
  def loginWithMeetup(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithMeetup(options: LoginWithExternalServiceOptions, callback: js.Function): scala.Unit = js.native
  def loginWithMeteorDeveloperAccount(): scala.Unit = js.native
  def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithMeteorDeveloperAccount(options: LoginWithExternalServiceOptions, callback: js.Function): scala.Unit = js.native
  def loginWithPassword(user: java.lang.String, password: java.lang.String): scala.Unit = js.native
  def loginWithPassword(user: java.lang.String, password: java.lang.String, callback: js.Function): scala.Unit = js.native
  def loginWithPassword(user: js.Object, password: java.lang.String): scala.Unit = js.native
  def loginWithPassword(user: js.Object, password: java.lang.String, callback: js.Function): scala.Unit = js.native
  def loginWithToken(token: java.lang.String): scala.Unit = js.native
  def loginWithToken(token: java.lang.String, callback: js.Function): scala.Unit = js.native
  def loginWithTwitter(): scala.Unit = js.native
  def loginWithTwitter(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithTwitter(options: LoginWithExternalServiceOptions, callback: js.Function): scala.Unit = js.native
  def loginWithWeibo(): scala.Unit = js.native
  def loginWithWeibo(options: LoginWithExternalServiceOptions): scala.Unit = js.native
  def loginWithWeibo(options: LoginWithExternalServiceOptions, callback: js.Function): scala.Unit = js.native
  def logout(): scala.Unit = js.native
  def logout(callback: js.Function): scala.Unit = js.native
  def logoutOtherClients(): scala.Unit = js.native
  def logoutOtherClients(callback: js.Function): scala.Unit = js.native
  /** Error **/
  
  /** Method **/
  def methods(methods: js.Object): scala.Unit = js.native
  def onConnection(callback: js.Function): scala.Unit = js.native
  /** Connection **/
  
  def publish(name: java.lang.String, func: js.Function): scala.Unit = js.native
  /** Event **/
  
  /** Connection **/
  def reconnect(): scala.Unit = js.native
  /** Url **/
  
  /** Timeout **/
  def setInterval(func: js.Function, delay: scala.Double): scala.Double = js.native
  def setTimeout(func: js.Function, delay: scala.Double): scala.Double = js.native
  /** Timeout **/
  
  /** utils **/
  def startup(func: js.Function): scala.Unit = js.native
  /** Connection **/
  
  /** Status **/
  def status(): meteorLib.DDPNs.DDPStatus = js.native
  /** Status **/
  
  /** Pub/Sub **/
  def subscribe(name: java.lang.String, args: js.Any*): SubscriptionHandle = js.native
  def user(): User = js.native
  def userId(): java.lang.String = js.native
  def wrapAsync(func: js.Function): js.Any = js.native
  def wrapAsync(func: js.Function, context: js.Object): js.Any = js.native
}

