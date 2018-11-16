package typings
package mixpanelLib.MixpanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Config extends js.Object {
  /**
           * @default HTTP_PROTOCOL + 'api.mixpanel.com'
           */
  var api_host: js.UndefOr[java.lang.String] = js.undefined
  /**
           * @default HTTP_PROTOCOL + 'mixpanel.com'
           */
  var app_host: js.UndefOr[java.lang.String] = js.undefined
  /**
           * @default true
           */
  var autotrack: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default HTTP_PROTOCOL + 'cdn.mxpnl.com'
           */
  var cdn: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Super properties cookie expiration (in days)
           *
           * @default 365
           */
  var cookie_expiration: js.UndefOr[scala.Double] = js.undefined
  /**
           * @deprecated Use `persistence_name` instead
           * @default ''
           */
  var cookie_name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Super properties span subdomains
           *
           * @default true
           */
  var cross_subdomain_cookie: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Debug mode
           *
           * @default false
           */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @deprecated Use `disable_persistence` instead
           * @default false
           */
  var disable_cookie: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If this is true, the mixpanel cookie or localStorage entry
           * will be deleted, and no user persistence will take place
           *
           * @default false
           */
  var disable_persistence: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default false
           */
  var img: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If this is true, Mixpanel will automatically determine City,
           * Region and Country data using the IP address of the client
           *
           * @default true
           */
  var ip: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default function() {}
           */
  var loaded: js.UndefOr[js.Function1[/* lib */ mixpanelLib.Mixpanel, scala.Unit]] = js.undefined
  /**
           * Type of persistent store for super properties
           *
           * If set to 'localStorage', any existing mixpanel cookie
           * value with the same `persistence_name` will be transferred
           * to localStorage and deleted.
           *
           * @default 'cookie'
           */
  var persistence: js.UndefOr[
    mixpanelLib.mixpanelLibStrings.localStorage | mixpanelLib.mixpanelLibStrings.cookie
  ] = js.undefined
  /**
           * Name for super properties persistent store
           *
           * @default ''
           */
  var persistence_name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Names of (super) properties which should never be sent
           * with track() calls
           *
           * @default []
           */
  var property_blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * @default true
           */
  var save_referrer: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If this is true, mixpanel cookies will be marked as secure,
           * meaning they will only be transmitted over https
           *
           * @default false
           */
  var secure_cookie: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default true
           */
  var store_google: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default false
           */
  var test: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The amount of time track_links will wait for Mixpanel's
           * servers to respond
           *
           * @default 300
           */
  var track_links_timeout: js.UndefOr[scala.Double] = js.undefined
  /**
           * Should we track a page view on page load
           *
           * @default true
           */
  var track_pageview: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If you set upgrade to be true, the library will check for
           * a cookie from our old js library and import super
           * properties from it, then the old cookie is deleted
           * The upgrade config option only works in the initialization,
           * so make sure you set it when you create the library.
           *
           * @default false
           */
  var upgrade: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * @default false
           */
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

