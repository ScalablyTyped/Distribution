package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply[Result /* <: typings.meteor.EJSONable | (js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty]) | typings.meteor.EJSONableProperty */](
  name: java.lang.String,
  args: js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty]
): js.Any = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def apply[Result /* <: typings.meteor.EJSONable | (js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty]) | typings.meteor.EJSONableProperty */](
  name: java.lang.String,
  args: js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty],
  options: scala.Unit,
  asyncCallback: js.Function2[
  /* error */ js.UndefOr[typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error], 
  /* result */ js.UndefOr[Result], 
  scala.Unit
]
): js.Any = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def apply[Result /* <: typings.meteor.EJSONable | (js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty]) | typings.meteor.EJSONableProperty */](
  name: java.lang.String,
  args: js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty],
  options: typings.meteor.anon.OnResultReceived[Result]
): js.Any = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
inline def apply[Result /* <: typings.meteor.EJSONable | (js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty]) | typings.meteor.EJSONableProperty */](
  name: java.lang.String,
  args: js.Array[typings.meteor.EJSONable | typings.meteor.EJSONableProperty],
  options: typings.meteor.anon.OnResultReceived[Result],
  asyncCallback: js.Function2[
  /* error */ js.UndefOr[typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error], 
  /* result */ js.UndefOr[Result], 
  scala.Unit
]
): js.Any = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("apply")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any], asyncCallback.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def bindEnvironment[TFunc /* <: js.Function */](func: TFunc): TFunc = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("bindEnvironment")(func.asInstanceOf[js.Any]).asInstanceOf[TFunc]

inline def call(name: java.lang.String, args: js.Any*): js.Any = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("call")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def clearInterval(id: scala.Double): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def clearTimeout(id: scala.Double): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(id.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def debug(args: js.Any*): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("_debug")(args.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def defer(func: js.Function): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("defer")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def disconnect(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("disconnect")().asInstanceOf[scala.Unit]

/** Global props **/
inline def isClient: scala.Boolean = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isClient").asInstanceOf[scala.Boolean]
inline def isClient_=(x: scala.Boolean): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isClient")(x.asInstanceOf[js.Any])

inline def isCordova: scala.Boolean = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isCordova").asInstanceOf[scala.Boolean]
inline def isCordova_=(x: scala.Boolean): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isCordova")(x.asInstanceOf[js.Any])

/** Global props **/
inline def isDevelopment: scala.Boolean = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isDevelopment").asInstanceOf[scala.Boolean]
inline def isDevelopment_=(x: scala.Boolean): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isDevelopment")(x.asInstanceOf[js.Any])

inline def isProduction: scala.Boolean = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isProduction").asInstanceOf[scala.Boolean]
inline def isProduction_=(x: scala.Boolean): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(x.asInstanceOf[js.Any])

inline def isServer: scala.Boolean = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isServer").asInstanceOf[scala.Boolean]
inline def isServer_=(x: scala.Boolean): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isServer")(x.asInstanceOf[js.Any])

inline def isTest: scala.Boolean = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("isTest").asInstanceOf[scala.Boolean]
inline def isTest_=(x: scala.Boolean): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("isTest")(x.asInstanceOf[js.Any])

inline def loggingIn(): scala.Boolean = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loggingIn")().asInstanceOf[scala.Boolean]

inline def loggingOut(): scala.Boolean = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loggingOut")().asInstanceOf[scala.Boolean]

inline def loginWith[ExternalService](): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")().asInstanceOf[scala.Unit]
inline def loginWith[ExternalService](
  options: scala.Unit,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWith[ExternalService](options: typings.meteor.anon.LoginStyle): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWith[ExternalService](
  options: typings.meteor.anon.LoginStyle,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWith")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithFacebook(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")().asInstanceOf[scala.Unit]
inline def loginWithFacebook(
  options: scala.Unit,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithFacebook(options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithFacebook(
  options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithFacebook")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithGithub(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")().asInstanceOf[scala.Unit]
inline def loginWithGithub(
  options: scala.Unit,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithGithub(options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithGithub(
  options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGithub")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithGoogle(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")().asInstanceOf[scala.Unit]
inline def loginWithGoogle(
  options: scala.Unit,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithGoogle(options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithGoogle(
  options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithGoogle")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithMeetup(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")().asInstanceOf[scala.Unit]
inline def loginWithMeetup(
  options: scala.Unit,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithMeetup(options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithMeetup(
  options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeetup")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithMeteorDeveloperAccount(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")().asInstanceOf[scala.Unit]
inline def loginWithMeteorDeveloperAccount(
  options: scala.Unit,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithMeteorDeveloperAccount(options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithMeteorDeveloperAccount(
  options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithMeteorDeveloperAccount")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithPassword(user: java.lang.String, password: java.lang.String): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithPassword(
  user: java.lang.String,
  password: java.lang.String,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithPassword(user: js.Object, password: java.lang.String): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithPassword(
  user: js.Object,
  password: java.lang.String,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPassword")(user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithToken(token: java.lang.String): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithToken(
  token: java.lang.String,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithToken")(token.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithTwitter(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")().asInstanceOf[scala.Unit]
inline def loginWithTwitter(
  options: scala.Unit,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithTwitter(options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithTwitter(
  options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithTwitter")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def loginWithWeibo(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")().asInstanceOf[scala.Unit]
inline def loginWithWeibo(
  options: scala.Unit,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def loginWithWeibo(options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
inline def loginWithWeibo(
  options: typings.meteor.meteorMod.Meteor.LoginWithExternalServiceOptions,
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("loginWithWeibo")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def logout(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[scala.Unit]
inline def logout(
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def logoutOtherClients(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")().asInstanceOf[scala.Unit]
inline def logoutOtherClients(
  callback: js.Function1[
  /* error */ js.UndefOr[
    typings.meteor.meteorMod.globalError | typings.meteor.meteorMod.Meteor.Error | typings.meteor.meteorMod.Meteor.TypedError
  ], 
  scala.Unit
]
): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("logoutOtherClients")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def methods(
  methods: org.scalablytyped.runtime.StringDictionary[
  js.ThisFunction1[
    /* this */ typings.meteor.meteorMod.Meteor.MethodThisType, 
    /* repeated */ js.Any, 
    js.Any
  ]
]
): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("methods")(methods.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def onConnection(callback: js.Function1[/* connection */ typings.meteor.meteorMod.Meteor.Connection, scala.Unit]): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("onConnection")(callback.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/** Connection **/
inline def publish(
  name: java.lang.String,
  func: js.ThisFunction1[/* this */ typings.meteor.meteorMod.Subscription, /* repeated */ js.Any, scala.Unit]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def publish(
  name: java.lang.String,
  func: js.ThisFunction1[/* this */ typings.meteor.meteorMod.Subscription, /* repeated */ js.Any, scala.Unit],
  options: typings.meteor.anon.Isauto
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def publish(
  name: scala.Null,
  func: js.ThisFunction1[/* this */ typings.meteor.meteorMod.Subscription, /* repeated */ js.Any, scala.Unit]
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def publish(
  name: scala.Null,
  func: js.ThisFunction1[/* this */ typings.meteor.meteorMod.Subscription, /* repeated */ js.Any, scala.Unit],
  options: typings.meteor.anon.Isauto
): scala.Unit = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("publish")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Event **/
/** Connection **/
inline def reconnect(): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("reconnect")().asInstanceOf[scala.Unit]

inline def release: java.lang.String = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("release").asInstanceOf[java.lang.String]
inline def release_=(x: java.lang.String): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("release")(x.asInstanceOf[js.Any])

/** Url **/
/** Timeout **/
inline def setInterval(func: js.Function, delay: scala.Double): scala.Double = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def setTimeout(func: js.Function, delay: scala.Double): scala.Double = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def settings: typings.meteor.meteorMod.Meteor.Settings_ = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("settings").asInstanceOf[typings.meteor.meteorMod.Meteor.Settings_]
inline def settings_=(x: typings.meteor.meteorMod.Meteor.Settings_): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("settings")(x.asInstanceOf[js.Any])

/** Timeout **/
/** utils **/
inline def startup(func: js.Function): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("startup")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

/** Connection **/
/** Status **/
inline def status(): typings.meteor.DDP.DDPStatus = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("status")().asInstanceOf[typings.meteor.DDP.DDPStatus]

/** Status **/
/** Pub/Sub **/
inline def subscribe(name: java.lang.String, args: js.Any*): typings.meteor.meteorMod.Meteor.SubscriptionHandle = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typings.meteor.meteorMod.Meteor.SubscriptionHandle]

inline def user(): typings.meteor.meteorMod.Meteor.User_ | scala.Null = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("user")().asInstanceOf[typings.meteor.meteorMod.Meteor.User_ | scala.Null]

inline def userId(): java.lang.String | scala.Null = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("userId")().asInstanceOf[java.lang.String | scala.Null]

inline def users: typings.meteor.Mongo.Collection[typings.meteor.meteorMod.Meteor.User_, typings.meteor.meteorMod.Meteor.User_] = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].selectDynamic("users").asInstanceOf[typings.meteor.Mongo.Collection[typings.meteor.meteorMod.Meteor.User_, typings.meteor.meteorMod.Meteor.User_]]
inline def users_=(
  x: typings.meteor.Mongo.Collection[typings.meteor.meteorMod.Meteor.User_, typings.meteor.meteorMod.Meteor.User_]
): scala.Unit = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].updateDynamic("users")(x.asInstanceOf[js.Any])

inline def wrapAsync(func: js.Function): js.Any = typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Any]
inline def wrapAsync(func: js.Function, context: js.Object): js.Any = (typings.meteor.meteorMod.Meteor.^.asInstanceOf[js.Dynamic].applyDynamic("wrapAsync")(func.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]

type EventMap = org.scalablytyped.runtime.StringDictionary[typings.meteor.meteorMod.Meteor.EventHandlerFunction]
