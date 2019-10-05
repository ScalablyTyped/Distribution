package typings.passportDotSocketio.passportDotSocketioMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.NextFunction
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.Response
import typings.expressDashSession.expressDashSessionMod.Store
import typings.passport.passportMod.PassportStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PassportSocketIoOptions extends js.Object {
  /**
    * the same middleware you registrer in express.
    */
  var cookieParser: js.UndefOr[RequestHandler] = js.undefined
  /**
    * callback on fail/error.
    */
  var fail: js.UndefOr[
    js.Function4[
      /* data */ js.Any, 
      /* message */ String, 
      /* critical */ String, 
      /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * the name of the cookie where express/connect stores its session_id.
    */
  var key: js.UndefOr[String] = js.undefined
  var passport: js.UndefOr[PassportStatic] = js.undefined
  /**
    * the session_secret to parse the cookie.
    */
  var secret: js.UndefOr[String] = js.undefined
  /**
    * we NEED to use a sessionstore. No MemoryStore please.
    */
  var store: Store
  /**
    * callback on success.
    */
  var success: js.UndefOr[
    js.Function2[
      /* data */ js.Any, 
      /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit], 
      Unit
    ]
  ] = js.undefined
}

object PassportSocketIoOptions {
  @scala.inline
  def apply(
    store: Store,
    cookieParser: (/* req */ Request[ParamsDictionary], /* res */ Response, /* next */ NextFunction) => js.Any = null,
    fail: (/* data */ js.Any, /* message */ String, /* critical */ String, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit = null,
    key: String = null,
    passport: PassportStatic = null,
    secret: String = null,
    success: (/* data */ js.Any, /* accept */ js.Function2[/* err */ js.UndefOr[js.Any], /* accepted */ js.UndefOr[Boolean], Unit]) => Unit = null
  ): PassportSocketIoOptions = {
    val __obj = js.Dynamic.literal(store = store)
    if (cookieParser != null) __obj.updateDynamic("cookieParser")(js.Any.fromFunction3(cookieParser))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction4(fail))
    if (key != null) __obj.updateDynamic("key")(key)
    if (passport != null) __obj.updateDynamic("passport")(passport)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2(success))
    __obj.asInstanceOf[PassportSocketIoOptions]
  }
}

