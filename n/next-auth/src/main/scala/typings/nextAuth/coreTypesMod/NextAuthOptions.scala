package typings.nextAuth.coreTypesMod

import typings.nextAuth.adaptersMod.Adapter
import typings.nextAuth.anon.PartialCallbacksOptionsPr
import typings.nextAuth.anon.PartialCookiesOptions
import typings.nextAuth.anon.PartialEventCallbacks
import typings.nextAuth.anon.PartialJWTOptions
import typings.nextAuth.anon.PartialPagesOptions
import typings.nextAuth.anon.PartialSessionOptions
import typings.nextAuth.providersMod.Provider
import typings.nextAuth.utilsLoggerMod.LoggerInstance
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextAuthOptions extends StObject {
  
  /**
    * You can use the adapter option to pass in your database adapter.
    *
    * * **Required**: *No*
    *
    * [Documentation](https://next-auth.js.org/configuration/options#adapter) |
    * [Adapters Overview](https://next-auth.js.org/adapters/overview)
    */
  var adapter: js.UndefOr[Adapter[Boolean]] = js.undefined
  
  /**
    * Callbacks are asynchronous functions you can use to control what happens when an action is performed.
    * Callbacks are *extremely powerful*, especially in scenarios involving JSON Web Tokens
    * as they **allow you to implement access controls without a database** and to **integrate with external databases or APIs**.
    * * **Default value**: See the Callbacks documentation
    * * **Required**: *No*
    *
    * [Documentation](https://next-auth.js.org/configuration/options#callbacks) | [Callbacks documentation](https://next-auth.js.org/configuration/callbacks)
    */
  var callbacks: js.UndefOr[PartialCallbacksOptionsPr] = js.undefined
  
  /**
    * You can override the default cookie names and options for any of the cookies used by NextAuth.js.
    * You can specify one or more cookies with custom properties,
    * but if you specify custom options for a cookie you must provide all the options for that cookie.
    * If you use this feature, you will likely want to create conditional behavior
    * to support setting different cookies policies in development and production builds,
    * as you will be opting out of the built-in dynamic policy.
    * * **Default value**: `{}`
    * * **Required**: No
    *
    * - ⚠ **This is an advanced option.** Advanced options are passed the same way as basic options,
    * but **may have complex implications** or side effects.
    * You should **try to avoid using advanced options** unless you are very comfortable using them.
    *
    * [Documentation](https://next-auth.js.org/configuration/options#cookies) | [Usage example](https://next-auth.js.org/configuration/options#example)
    */
  var cookies: js.UndefOr[PartialCookiesOptions] = js.undefined
  
  /**
    * Set debug to true to enable debug messages for authentication and database operations.
    * * **Default value**: `false`
    * * **Required**: *No*
    *
    * - ⚠ If you added a custom `logger`, this setting is ignored.
    *
    * [Documentation](https://next-auth.js.org/configuration/options#debug) | [Logger documentation](https://next-auth.js.org/configuration/options#logger)
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Events are asynchronous functions that do not return a response, they are useful for audit logging.
    * You can specify a handler for any of these events below - e.g. for debugging or to create an audit log.
    * The content of the message object varies depending on the flow
    * (e.g. OAuth or Email authentication flow, JWT or database sessions, etc),
    * but typically contains a user object and/or contents of the JSON Web Token
    * and other information relevant to the event.
    * * **Default value**: `{}`
    * * **Required**: *No*
    *
    * [Documentation](https://next-auth.js.org/configuration/options#events) | [Events documentation](https://next-auth.js.org/configuration/events)
    */
  var events: js.UndefOr[PartialEventCallbacks] = js.undefined
  
  /**
    * JSON Web Tokens are enabled by default if you have not specified a database.
    * By default JSON Web Tokens are signed (JWS) but not encrypted (JWE),
    * as JWT encryption adds additional overhead and comes with some caveats.
    * You can enable encryption by setting `encryption: true`.
    * * **Default value**: See the documentation page
    * * **Required**: *No*
    *
    * [Documentation](https://next-auth.js.org/configuration/options#jwt)
    */
  var jwt: js.UndefOr[PartialJWTOptions] = js.undefined
  
  /**
    * Override any of the logger levels (`undefined` levels will use the built-in logger),
    * and intercept logs in NextAuth. You can use this option to send NextAuth logs to a third-party logging service.
    * * **Default value**: `console`
    * * **Required**: *No*
    *
    * @example
    *
    * ```js
    * // /pages/api/auth/[...nextauth].js
    * import log from "logging-service"
    * export default NextAuth({
    *   logger: {
    *     error(code, ...message) {
    *       log.error(code, message)
    *     },
    *     warn(code, ...message) {
    *       log.warn(code, message)
    *     },
    *     debug(code, ...message) {
    *       log.debug(code, message)
    *     }
    *   }
    * })
    * ```
    *
    * - ⚠ When set, the `debug` option is ignored
    *
    * [Documentation](https://next-auth.js.org/configuration/options#logger) |
    * [Debug documentation](https://next-auth.js.org/configuration/options#debug)
    */
  var logger: js.UndefOr[Partial[LoggerInstance]] = js.undefined
  
  /**
    * Specify URLs to be used if you want to create custom sign in, sign out and error pages.
    * Pages specified will override the corresponding built-in page.
    * * **Default value**: `{}`
    * * **Required**: *No*
    * @example
    *
    * ```js
    *   pages: {
    *     signIn: '/auth/signin',
    *     signOut: '/auth/signout',
    *     error: '/auth/error',
    *     verifyRequest: '/auth/verify-request',
    *     newUser: '/auth/new-user'
    *   }
    * ```
    *
    * [Documentation](https://next-auth.js.org/configuration/options#pages) | [Pages documentation](https://next-auth.js.org/configuration/pages)
    */
  var pages: js.UndefOr[PartialPagesOptions] = js.undefined
  
  /**
    * An array of authentication providers for signing in
    * (e.g. Google, Facebook, Twitter, GitHub, Email, etc) in any order.
    * This can be one of the built-in providers or an object with a custom provider.
    * * **Default value**: `[]`
    * * **Required**: *Yes*
    *
    * [Documentation](https://next-auth.js.org/configuration/options#providers) | [Providers documentation](https://next-auth.js.org/configuration/providers)
    */
  var providers: js.Array[Provider]
  
  /**
    * A random string used to hash tokens, sign cookies and generate cryptographic keys.
    * If not specified, it falls back to `jwt.secret` or `NEXTAUTH_SECRET` from environment vairables.
    * Otherwise it will use a hash of all configuration options, including Client ID / Secrets for entropy.
    *
    * NOTE: The last behavior is extrmely volatile, and will throw an error in production.
    * * **Default value**: `string` (SHA hash of the "options" object)
    * * **Required**: No - **but strongly recommended**!
    *
    * [Documentation](https://next-auth.js.org/configuration/options#secret)
    */
  var secret: js.UndefOr[String] = js.undefined
  
  /**
    * Configure your session like if you want to use JWT or a database,
    * how long until an idle session expires, or to throttle write operations in case you are using a database.
    * * **Default value**: See the documentation page
    * * **Required**: No
    *
    * [Documentation](https://next-auth.js.org/configuration/options#session)
    */
  var session: js.UndefOr[PartialSessionOptions] = js.undefined
  
  /**
    * Changes the theme of pages.
    * Set to `"light"` if you want to force pages to always be light.
    * Set to `"dark"` if you want to force pages to always be dark.
    * Set to `"auto"`, (or leave this option out)if you want the pages to follow the preferred system theme.
    * * **Default value**: `"auto"`
    * * **Required**: *No*
    *
    * [Documentation](https://next-auth.js.org/configuration/options#theme) | [Pages documentation]("https://next-auth.js.org/configuration/pages")
    */
  var theme: js.UndefOr[Theme] = js.undefined
  
  /**
    * When set to `true` then all cookies set by NextAuth.js will only be accessible from HTTPS URLs.
    * This option defaults to `false` on URLs that start with `http://` (e.g. http://localhost:3000) for developer convenience.
    * You can manually set this option to `false` to disable this security feature and allow cookies
    * to be accessible from non-secured URLs (this is not recommended).
    * * **Default value**: `true` for HTTPS and `false` for HTTP sites
    * * **Required**: No
    *
    * [Documentation](https://next-auth.js.org/configuration/options#usesecurecookies)
    *
    * - ⚠ **This is an advanced option.** Advanced options are passed the same way as basic options,
    * but **may have complex implications** or side effects.
    * You should **try to avoid using advanced options** unless you are very comfortable using them.
    */
  var useSecureCookies: js.UndefOr[Boolean] = js.undefined
}
object NextAuthOptions {
  
  inline def apply(providers: js.Array[Provider]): NextAuthOptions = {
    val __obj = js.Dynamic.literal(providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextAuthOptions]
  }
  
  extension [Self <: NextAuthOptions](x: Self) {
    
    inline def setAdapter(value: Adapter[Boolean]): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    
    inline def setCallbacks(value: PartialCallbacksOptionsPr): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
    
    inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
    
    inline def setCookies(value: PartialCookiesOptions): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setEvents(value: PartialEventCallbacks): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setJwt(value: PartialJWTOptions): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
    
    inline def setJwtUndefined: Self = StObject.set(x, "jwt", js.undefined)
    
    inline def setLogger(value: Partial[LoggerInstance]): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setPages(value: PartialPagesOptions): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setProviders(value: js.Array[Provider]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: Provider*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setSession(value: PartialSessionOptions): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUseSecureCookies(value: Boolean): Self = StObject.set(x, "useSecureCookies", value.asInstanceOf[js.Any])
    
    inline def setUseSecureCookiesUndefined: Self = StObject.set(x, "useSecureCookies", js.undefined)
  }
}
