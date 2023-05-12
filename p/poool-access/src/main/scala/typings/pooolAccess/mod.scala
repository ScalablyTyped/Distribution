package typings.pooolAccess

import org.scalablytyped.runtime.StringDictionary
import typings.pooolAccess.anon.Beacons
import typings.pooolAccess.anon.Content
import typings.pooolAccess.anon.Dictkey
import typings.pooolAccess.pooolAccessStrings.`page-view`
import typings.pooolAccess.pooolAccessStrings.auto
import typings.pooolAccess.pooolAccessStrings.custom
import typings.pooolAccess.pooolAccessStrings.default
import typings.pooolAccess.pooolAccessStrings.disabled
import typings.pooolAccess.pooolAccessStrings.en
import typings.pooolAccess.pooolAccessStrings.events
import typings.pooolAccess.pooolAccessStrings.excerpt
import typings.pooolAccess.pooolAccessStrings.fr
import typings.pooolAccess.pooolAccessStrings.gift
import typings.pooolAccess.pooolAccessStrings.googima
import typings.pooolAccess.pooolAccessStrings.hidden
import typings.pooolAccess.pooolAccessStrings.hide
import typings.pooolAccess.pooolAccessStrings.invisible
import typings.pooolAccess.pooolAccessStrings.landscape
import typings.pooolAccess.pooolAccessStrings.link
import typings.pooolAccess.pooolAccessStrings.newsletter
import typings.pooolAccess.pooolAccessStrings.none
import typings.pooolAccess.pooolAccessStrings.pass
import typings.pooolAccess.pooolAccessStrings.portrait
import typings.pooolAccess.pooolAccessStrings.question
import typings.pooolAccess.pooolAccessStrings.subscription
import typings.pooolAccess.pooolAccessStrings.unlock
import typings.pooolAccess.pooolAccessStrings.vast
import typings.pooolAccess.pooolAccessStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("Access")
    @js.native
    val Access: typings.pooolAccess.mod.Poool.Access = js.native
    
    @JSGlobal("Audit")
    @js.native
    val Audit: typings.pooolAccess.mod.Poool.Audit = js.native
    
    /**
      * Use PooolAccess just if you have done `Access.noConflict()` before
      */
    @JSGlobal("PooolAccess")
    @js.native
    val PooolAccess: typings.pooolAccess.mod.Poool.Access = js.native
    
    /**
      * Use PooolAudit just if you have done `Audit.noConflict()` before
      */
    @JSGlobal("PooolAudit")
    @js.native
    val PooolAudit: typings.pooolAccess.mod.Poool.Audit = js.native
    
    trait Window extends StObject {
      
      var Access: typings.pooolAccess.mod.Poool.Access
      
      var Audit: typings.pooolAccess.mod.Poool.Audit
      
      /**
        * Use PooolAccess just if you have done `Access.noConflict()` before
        */
      var PooolAccess: typings.pooolAccess.mod.Poool.Access
      
      /**
        * Use PooolAudit just if you have done `Audit.noConflict()` before
        */
      var PooolAudit: typings.pooolAccess.mod.Poool.Audit
    }
    object Window {
      
      inline def apply(
        Access: typings.pooolAccess.mod.Poool.Access,
        Audit: typings.pooolAccess.mod.Poool.Audit,
        PooolAccess: typings.pooolAccess.mod.Poool.Access,
        PooolAudit: typings.pooolAccess.mod.Poool.Audit
      ): Window = {
        val __obj = js.Dynamic.literal(Access = Access.asInstanceOf[js.Any], Audit = Audit.asInstanceOf[js.Any], PooolAccess = PooolAccess.asInstanceOf[js.Any], PooolAudit = PooolAudit.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setAccess(value: typings.pooolAccess.mod.Poool.Access): Self = StObject.set(x, "Access", value.asInstanceOf[js.Any])
        
        inline def setAudit(value: typings.pooolAccess.mod.Poool.Audit): Self = StObject.set(x, "Audit", value.asInstanceOf[js.Any])
        
        inline def setPooolAccess(value: typings.pooolAccess.mod.Poool.Access): Self = StObject.set(x, "PooolAccess", value.asInstanceOf[js.Any])
        
        inline def setPooolAudit(value: typings.pooolAccess.mod.Poool.Audit): Self = StObject.set(x, "PooolAudit", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object Poool {
    
    trait Access extends StObject {
      
      /**
        * Creates a new Access instance (required to display paywalls) using your app ID.
        *
        * @param key - Your poool app ID
        * @returns The access factory instance.
        *
        *  More infos: https://poool.dev/docs/access/javascript/access/methods
        */
      def init(key: String): AccessFactory
      
      /**
        * If an `Access` object already exists in the global object of the current page, the `Access.js` library will be renamed to `PooolAccess` and the original `Access` object will be restored.
        *
        * @returns the Access instance
        *
        * More infos: https://poool.dev/docs/access/javascript/access/methods
        */
      def noConflict(): Access
    }
    object Access {
      
      inline def apply(init: String => AccessFactory, noConflict: () => Access): Access = {
        val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), noConflict = js.Any.fromFunction0(noConflict))
        __obj.asInstanceOf[Access]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Access] (val x: Self) extends AnyVal {
        
        inline def setInit(value: String => AccessFactory): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
        
        inline def setNoConflict(value: () => Access): Self = StObject.set(x, "noConflict", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait AccessConfig extends StObject {
      
      /**
        * While the default configuration works for most use cases, you might want to configure some of Access.js behaviors.
        *
        * ℹ️ Your Dashboard configuration will override these configuration values unless they have been set with a read-only mode.
        *
        * @param config - the configuration object
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      def apply(config: AccessConfigOptions): AccessFactory = js.native
      def apply(config: AccessConfigOptions, readonly: Boolean): AccessFactory = js.native
      /**
        * While the default configuration works for most use cases, you might want to configure some of Access.js behaviors.
        *
        * ℹ️ Your Dashboard configuration will override these configuration values unless they have been set with a read-only mode.
        *
        * @param optionName The configuration option name
        * @param optionValue The configuration option value
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      def apply(optionName: String, optionValue: Any): AccessFactory = js.native
      def apply(optionName: String, optionValue: Any, readonly: Boolean): AccessFactory = js.native
    }
    
    trait AccessConfigOptions extends StObject {
      
      /**
        * Shows/hides the 'No, thanks' link for several widgets.
        *
        * Default: `true`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var alternative_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Overrides the default alternative action used by several widgets.
        *
        * Default: `'none'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var alternative_widget: js.UndefOr[none | video | gift | question | subscription | newsletter] = js.undefined
      
      /**
        * Used to set your media's display name for some widgets. This value may be overridden by Dashboard configuration.
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var app_name: js.UndefOr[String] = js.undefined
      
      /**
        * Enable/disable automatic AT Internet tracking (AT Internet SDK integration required) for particular events.
        *
        * ⚠️ AT Internet SDK Version 5.7 or higher is required.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var ati_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Defines the default wait time for the tracking event from AT Internet to be fired.
        * After this time has lapsed, the paywall is loaded using the default method, and all tracking from Poool to AT Internet is disabled.
        *
        * Default: `2000`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var ati_load_timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * Allows to provide configuration options to the ATInternet.Tracker.Tag constructor. See the
        * [ ATInternet documentation](https://developers.atinternet-solutions.com/as2-tagging-en/javascript-en/getting-started-javascript-en/tracker-initialisation-javascript-en/#Annexe)
        * for more information.
        *
        * Default: `{}`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var ati_tag_options: js.UndefOr[StringDictionary[Any]] = js.undefined
      
      /**
        * @deprecated Use {@link ati_auto_tracking_enabled} instead.
        *
        * Enable/disable AT Internet additional tracking (AT Internet SDK integration required).
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var ati_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Used to setup AT Internet method to send tracking event (AT Internet SDK integration required).
        *
        * `tag.publisher.send` is used by default. By setting events, events will be sent with tag.events.send method.
        *
        * ⚠️ AT Internet SDK Version 5.7 or higher is required.
        *
        * Default: `'default'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var ati_tracking_method: js.UndefOr[default | events] = js.undefined
      
      /**
        * In case of a complete integration with Audit and Access, the `audit_load_timeout` config parameter is used to define the wait time (in milliseconds) for the Audit response.
        *
        * If case of timeout, Access will directly display your paywall. Regarding native segmentation, reader may not be correctly updated
        *
        * Default: `2000`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var audit_load_timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * Enable/disable the latest version of the GA, GTM and Gtag connectors.
        * This version is more precise and allows for more detailed performance tracking in Google Analytics.
        *
        * ⚠️ This option cannot be used alone, it must be paired with one of the GA, GTM or Gtag automatic tracking options.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var auto_tracking_spec_v2: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether or not to send some tracking requests (mostly clicks behind a redirect) using `navigator.sendBeacon` instead of a normal XHR request.
        *
        * Default: `true`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var beacons: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Defines the default wait time for all the components inside the Paywall to be full loaded. After this time has lapsed,
        * the onError event is triggered so that you can display a backup paywall.
        *
        * Default: `5000`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var components_load_timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * Allows to define the widget to display by default, if `{cookies_enabled}` config option is false (cookies consent rejection).
        *
        * Default: `'subscription'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var consent_rejection_widget: js.UndefOr[invisible | unlock | gift | subscription] = js.undefined
      
      /**
        * Used to assign a particular custom context to a reader.
        *
        * If no context is specified, native contexts or a default one will be used instead.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var context: js.UndefOr[String] = js.undefined
      
      /**
        * Used to define your own custom domain for Poool cookies.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var cookies_domain: js.UndefOr[String] = js.undefined
      
      /**
        * Enable/disable all tracking actions used by Poool according to the latest GDPR compliancy measures.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var cookies_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Used to define your own custom path for Poool cookies.
        *
        * Default: `'/'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var cookies_path: js.UndefOr[String] = js.undefined
      
      /**
        * Used to assign your own unique custom identifier to one of your readers.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var custom_reader_id: js.UndefOr[String] = js.undefined
      
      /**
        * When a reader is redirected from the paywall (click on login/subscribe links or Link widget's main action),
        *  the return_url query params is provided to the new url. Its default value is the current url.
        *
        * You can use custom_return_url to define your own custom return url.
        *
        * Default: `true`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var custom_return_url: js.UndefOr[String] = js.undefined
      
      /**
        * Used to allocate a reader to a custom group previously created in Poool's Dashboard.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var custom_segment: js.UndefOr[String] = js.undefined
      
      /**
        * Link URL shown inside widgets that require the collection of user information.
        * - `{return_url}` variable can be used to get the current URL.
        * - `{user_id}` variable can be used to get the reader's Poool id.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var data_policy_url: js.UndefOr[String] = js.undefined
      
      /**
        * When debug mode is enabled, Poool's SDK will log everything it does in the browser console.
        *
        * default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var debug: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Used to defined a widget to display in case of network error.
        *
        * It is then possible to unlock the content manually (ex: `gift`, etc..) or automatically with `invisible`.
        *
        * Please check the guide named [Handle timeouts & errors](https://poool.dev/guides/timeouts-and-errors) for more information.
        *
        * Default: `'subscription'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var default_widget: js.UndefOr[invisible | unlock | gift | subscription] = js.undefined
      
      /**
        * When `hide` masking mode is used and after unlocking an article, Poool's paywall will try to calculate the height
        *  of the content to set it back to its default value.
        *
        * In a few rare cases, the size of the content will change between when it's cropped and when it's unlocked
        * (loading twitter modules, loading gifs, etc...).
        * If `disable_content_height_calculation` is set to `true`, the paywall won't try to calculate content height
        *  and will simply strip all CSS modifications applied to the parent container of the article.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var disable_content_height_calculation: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Defines the paywall default wait time for the `DOMContentLoaded` event of the page to be fired (if `wait_for_dom_load` is set to `true`).
        *
        * Default: `2000`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var dom_load_timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * Enable/disable Facebook login button inside the paywall. In order to sign-in using Facebook,
        *  you have to call Facebook's login SDK when `onFacebookLoginClick` event is fired.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var facebook_login_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Used to defined a fallback widget in case of error on advertising widgets (`video`, `viewpay`).
        *
        * Prefer to configure this option in your dashboard (widget edition), especially if your fallback widget requires data (eg: `question` or `form` widgets).
        *
        * Default: `'subscription'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var fallback_widget: js.UndefOr[String] = js.undefined
      
      /**
        * Overrides default paywall behavior and forces a particular type of widget (the type of widget shown by default can differ according to user behavior).
        *
        * Default: `'auto'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var force_widget: js.UndefOr[
            auto | hidden | disabled | none | video | newsletter | subscription | gift | question | unlock | link | pass | invisible
          ] = js.undefined
      
      /**
        * Enable/disable automatic Google Analytics tracking (Google Analytics SDK integration required) for particular events.
        *
        * ⚠️ Regular Google Analytics SDK integration required, e.g using ga() tracking method.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var ga_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Enable/disable Google login button inside the paywall. In order to sign-in using Google,
        *  you have to call Google's login SDK when `onGoogleLoginClick` event is fired.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var google_login_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Enable/disable automatic Google Analytics 4 tracking (Google Analytics 4 tag required) for particular events.
        *
        * ⚠️ Google Analytics 4 integration required, i.e using gtag() tracking method.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var gtag_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Enable/disable automatic Google Tag Manager tracking (GTM SDK integration required) for particular events.
        *
        * Every event information is pushed to the dataLayer with the same structure as a Google Analytics event.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var gtm_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Current paywall locale.
        *
        * Default: `'fr'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var locale: js.UndefOr[fr | en] = js.undefined
      
      /**
        * Shows/hides the login button on every widget.
        *
        * Default: `true`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var login_button_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Your login page url. A user will be redirected here after clicking on the login button.
        * - `{return_url}` variable can be used to get the current URL.
        * - `{user_id}` variable can be used to get the reader's Poool id.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var login_url: js.UndefOr[String] = js.undefined
      
      /**
        * URL needed to display video ads inside the video widget on mobile devices.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var mobile_vast: js.UndefOr[String] = js.undefined
      
      /**
        * This is the method used by Poool to lock the content of your article.
        *
        * Available modes:
        * - `hide`: Your original content will stay where it is, but its container will be modified with css to hide a percentage of the content.
        * Downsides : Users will be able to open the browser's console and remove the css rules.
        * - `excerpt`: Your original content will be placed in a view holder and its container will have its content replaced by trimmed text(only X% of the text will be kept).
        * The original content is not available from outside of Poool.js scope (even from console), and will be put back when onRelease event is fired.
        * Downsides : `<style>` and `<script>` tags inside parent are temporarily detached from trimmed text and put at the end. If you have various `<script>` tags in your content,
        *  they won't necessarily be executed and may even throw javascript errors (such as with some ad scripts that still use
        * obsolete javascript functions), leading to a blank page when unlocking content. This mode is also not recommended for single-page apps (Angular, React, Vue, ...).
        * In these two cases, we suggest that you use hide mode.
        * - `custom`: Nothing will be done to your content and/or its container, but onLock and onRelease events will be fired so you can do your own processing.
        *
        * default: `'hide'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var mode: js.UndefOr[hide | excerpt | custom] = js.undefined
      
      /**
        * Id of the newsletter, linked to the registered email address of a user on the newsletter widget.
        *
        * You will then be able to get all registrations for a particular user through Poool's API.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var newsletter_id: js.UndefOr[String] = js.undefined
      
      /**
        * The name of the newsletter, linked to the registered email address of a user on the newsletter widget.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var newsletter_name: js.UndefOr[String] = js.undefined
      
      /**
        * Defines the default wait time for the Paywall to be fully displayed. After this time has lapsed, the `onError`
        * event is triggered so that you can display a backup paywall.
        *
        * Default: `10000`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var paywall_load_timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * Percentage of text you want to be hidden/stripped.
        *
        * default: `80`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var percent: js.UndefOr[Double] = js.undefined
      
      /**
        * Enable/disable automatic Piano tracking (Piano SDK integration required) for particular events.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var piano_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * When scrolling, if the widget shows up on the screen (`onWidgetSeen` event), the popover will automatically disappear.
        *
        * You can use `popover_auto_hide` with the value set to `false` to disable this behavior.
        *
        * Default: `true`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var popover_auto_hide: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Shows/hides the popover displayed when the paywall is not already inside the viewport.
        *
        * Default: `true`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var popover_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Popover display timeout (in milliseconds).
        *
        * If the value is set to -1, the popover will keep being displayed.
        *
        * Default: `5000`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var popover_timeout: js.UndefOr[Double] = js.undefined
      
      /**
        * CSS Selector locating the post content you want to lock.
        *
        * default: `[data-poool]`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var post_container: js.UndefOr[String] = js.undefined
      
      /**
        * Shows/hides signature text placed at the end of the article once it has been unlocked.
        *
        * Default: `true`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var signature_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Used to enable Stripe credit card form fields inside the paywall.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var stripe_public_key: js.UndefOr[String] = js.undefined
      
      /**
        * Shows/hides the subscription button on every widget (except “Subscription” and “Invisible unlock”).
        *
        * Default: true
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var subscription_button_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Your subscription page URL. The subscription widget will redirect the reader to this when they decide to subscribe.
        * - `{return_url}` variable can be used to get the current URL.
        * - `{user_id}` variable can be used to get the reader's Poool id.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var subscription_url: js.UndefOr[String] = js.undefined
      
      /**
        * Track unlocked articles based on original action instead of its alternative.
        *
        * When an article is unlocked using an alternative (for example if `force_widget` is used or if the user clicks on No, thanks),
        * by default reports will show statistics for this alternative action rather than the original one.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var track_original_action: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Allows you to set a reader status to already subscribed.
        *
        * ⚠️ This value isn't used to automatically unlock the paywall but only for statistical purposes.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var user_is_premium: js.UndefOr[Boolean] = js.undefined
      
      /**
        * URL needed to display video ads inside the video widget on the desktop.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var vast: js.UndefOr[String] = js.undefined
      
      /**
        * Allows you to set the player client for the video widget.
        *
        * Default: `'vast'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var video_client: js.UndefOr[vast | googima] = js.undefined
      
      /**
        * By default, to avoid long loading times, our paywall will not wait for the page to load to be displayed.
        * In some cases, you'll have to wait for the DOM to fully load before the paywall can detect the content of the
        * article that you want to lock (especially when it is placed inside the `<head>` tag of the page).
        * If `wait_for_dom_load` option is `true`, the paywall will wait for the `DOMContentLoaded` event to be fired.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var wait_for_dom_load: js.UndefOr[Boolean] = js.undefined
      
      /**
        * CSS Selector locating the container where Poool will put its paywall.
        *
        * Default: `'#poool-widget'`
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      var widget_container: js.UndefOr[String] = js.undefined
    }
    object AccessConfigOptions {
      
      inline def apply(): AccessConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AccessConfigOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AccessConfigOptions] (val x: Self) extends AnyVal {
        
        inline def setAlternative_enabled(value: Boolean): Self = StObject.set(x, "alternative_enabled", value.asInstanceOf[js.Any])
        
        inline def setAlternative_enabledUndefined: Self = StObject.set(x, "alternative_enabled", js.undefined)
        
        inline def setAlternative_widget(value: none | video | gift | question | subscription | newsletter): Self = StObject.set(x, "alternative_widget", value.asInstanceOf[js.Any])
        
        inline def setAlternative_widgetUndefined: Self = StObject.set(x, "alternative_widget", js.undefined)
        
        inline def setApp_name(value: String): Self = StObject.set(x, "app_name", value.asInstanceOf[js.Any])
        
        inline def setApp_nameUndefined: Self = StObject.set(x, "app_name", js.undefined)
        
        inline def setAti_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "ati_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setAti_auto_tracking_enabledUndefined: Self = StObject.set(x, "ati_auto_tracking_enabled", js.undefined)
        
        inline def setAti_load_timeout(value: Double): Self = StObject.set(x, "ati_load_timeout", value.asInstanceOf[js.Any])
        
        inline def setAti_load_timeoutUndefined: Self = StObject.set(x, "ati_load_timeout", js.undefined)
        
        inline def setAti_tag_options(value: StringDictionary[Any]): Self = StObject.set(x, "ati_tag_options", value.asInstanceOf[js.Any])
        
        inline def setAti_tag_optionsUndefined: Self = StObject.set(x, "ati_tag_options", js.undefined)
        
        inline def setAti_tracking_enabled(value: Boolean): Self = StObject.set(x, "ati_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setAti_tracking_enabledUndefined: Self = StObject.set(x, "ati_tracking_enabled", js.undefined)
        
        inline def setAti_tracking_method(value: default | events): Self = StObject.set(x, "ati_tracking_method", value.asInstanceOf[js.Any])
        
        inline def setAti_tracking_methodUndefined: Self = StObject.set(x, "ati_tracking_method", js.undefined)
        
        inline def setAudit_load_timeout(value: Double): Self = StObject.set(x, "audit_load_timeout", value.asInstanceOf[js.Any])
        
        inline def setAudit_load_timeoutUndefined: Self = StObject.set(x, "audit_load_timeout", js.undefined)
        
        inline def setAuto_tracking_spec_v2(value: Boolean): Self = StObject.set(x, "auto_tracking_spec_v2", value.asInstanceOf[js.Any])
        
        inline def setAuto_tracking_spec_v2Undefined: Self = StObject.set(x, "auto_tracking_spec_v2", js.undefined)
        
        inline def setBeacons(value: Boolean): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
        
        inline def setBeaconsUndefined: Self = StObject.set(x, "beacons", js.undefined)
        
        inline def setComponents_load_timeout(value: Double): Self = StObject.set(x, "components_load_timeout", value.asInstanceOf[js.Any])
        
        inline def setComponents_load_timeoutUndefined: Self = StObject.set(x, "components_load_timeout", js.undefined)
        
        inline def setConsent_rejection_widget(value: invisible | unlock | gift | subscription): Self = StObject.set(x, "consent_rejection_widget", value.asInstanceOf[js.Any])
        
        inline def setConsent_rejection_widgetUndefined: Self = StObject.set(x, "consent_rejection_widget", js.undefined)
        
        inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setCookies_domain(value: String): Self = StObject.set(x, "cookies_domain", value.asInstanceOf[js.Any])
        
        inline def setCookies_domainUndefined: Self = StObject.set(x, "cookies_domain", js.undefined)
        
        inline def setCookies_enabled(value: Boolean): Self = StObject.set(x, "cookies_enabled", value.asInstanceOf[js.Any])
        
        inline def setCookies_enabledUndefined: Self = StObject.set(x, "cookies_enabled", js.undefined)
        
        inline def setCookies_path(value: String): Self = StObject.set(x, "cookies_path", value.asInstanceOf[js.Any])
        
        inline def setCookies_pathUndefined: Self = StObject.set(x, "cookies_path", js.undefined)
        
        inline def setCustom_reader_id(value: String): Self = StObject.set(x, "custom_reader_id", value.asInstanceOf[js.Any])
        
        inline def setCustom_reader_idUndefined: Self = StObject.set(x, "custom_reader_id", js.undefined)
        
        inline def setCustom_return_url(value: String): Self = StObject.set(x, "custom_return_url", value.asInstanceOf[js.Any])
        
        inline def setCustom_return_urlUndefined: Self = StObject.set(x, "custom_return_url", js.undefined)
        
        inline def setCustom_segment(value: String): Self = StObject.set(x, "custom_segment", value.asInstanceOf[js.Any])
        
        inline def setCustom_segmentUndefined: Self = StObject.set(x, "custom_segment", js.undefined)
        
        inline def setData_policy_url(value: String): Self = StObject.set(x, "data_policy_url", value.asInstanceOf[js.Any])
        
        inline def setData_policy_urlUndefined: Self = StObject.set(x, "data_policy_url", js.undefined)
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
        
        inline def setDefault_widget(value: invisible | unlock | gift | subscription): Self = StObject.set(x, "default_widget", value.asInstanceOf[js.Any])
        
        inline def setDefault_widgetUndefined: Self = StObject.set(x, "default_widget", js.undefined)
        
        inline def setDisable_content_height_calculation(value: Boolean): Self = StObject.set(x, "disable_content_height_calculation", value.asInstanceOf[js.Any])
        
        inline def setDisable_content_height_calculationUndefined: Self = StObject.set(x, "disable_content_height_calculation", js.undefined)
        
        inline def setDom_load_timeout(value: Double): Self = StObject.set(x, "dom_load_timeout", value.asInstanceOf[js.Any])
        
        inline def setDom_load_timeoutUndefined: Self = StObject.set(x, "dom_load_timeout", js.undefined)
        
        inline def setFacebook_login_enabled(value: Boolean): Self = StObject.set(x, "facebook_login_enabled", value.asInstanceOf[js.Any])
        
        inline def setFacebook_login_enabledUndefined: Self = StObject.set(x, "facebook_login_enabled", js.undefined)
        
        inline def setFallback_widget(value: String): Self = StObject.set(x, "fallback_widget", value.asInstanceOf[js.Any])
        
        inline def setFallback_widgetUndefined: Self = StObject.set(x, "fallback_widget", js.undefined)
        
        inline def setForce_widget(
          value: auto | hidden | disabled | none | video | newsletter | subscription | gift | question | unlock | link | pass | invisible
        ): Self = StObject.set(x, "force_widget", value.asInstanceOf[js.Any])
        
        inline def setForce_widgetUndefined: Self = StObject.set(x, "force_widget", js.undefined)
        
        inline def setGa_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "ga_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setGa_auto_tracking_enabledUndefined: Self = StObject.set(x, "ga_auto_tracking_enabled", js.undefined)
        
        inline def setGoogle_login_enabled(value: Boolean): Self = StObject.set(x, "google_login_enabled", value.asInstanceOf[js.Any])
        
        inline def setGoogle_login_enabledUndefined: Self = StObject.set(x, "google_login_enabled", js.undefined)
        
        inline def setGtag_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "gtag_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setGtag_auto_tracking_enabledUndefined: Self = StObject.set(x, "gtag_auto_tracking_enabled", js.undefined)
        
        inline def setGtm_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "gtm_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setGtm_auto_tracking_enabledUndefined: Self = StObject.set(x, "gtm_auto_tracking_enabled", js.undefined)
        
        inline def setLocale(value: fr | en): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
        
        inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
        
        inline def setLogin_button_enabled(value: Boolean): Self = StObject.set(x, "login_button_enabled", value.asInstanceOf[js.Any])
        
        inline def setLogin_button_enabledUndefined: Self = StObject.set(x, "login_button_enabled", js.undefined)
        
        inline def setLogin_url(value: String): Self = StObject.set(x, "login_url", value.asInstanceOf[js.Any])
        
        inline def setLogin_urlUndefined: Self = StObject.set(x, "login_url", js.undefined)
        
        inline def setMobile_vast(value: String): Self = StObject.set(x, "mobile_vast", value.asInstanceOf[js.Any])
        
        inline def setMobile_vastUndefined: Self = StObject.set(x, "mobile_vast", js.undefined)
        
        inline def setMode(value: hide | excerpt | custom): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setNewsletter_id(value: String): Self = StObject.set(x, "newsletter_id", value.asInstanceOf[js.Any])
        
        inline def setNewsletter_idUndefined: Self = StObject.set(x, "newsletter_id", js.undefined)
        
        inline def setNewsletter_name(value: String): Self = StObject.set(x, "newsletter_name", value.asInstanceOf[js.Any])
        
        inline def setNewsletter_nameUndefined: Self = StObject.set(x, "newsletter_name", js.undefined)
        
        inline def setPaywall_load_timeout(value: Double): Self = StObject.set(x, "paywall_load_timeout", value.asInstanceOf[js.Any])
        
        inline def setPaywall_load_timeoutUndefined: Self = StObject.set(x, "paywall_load_timeout", js.undefined)
        
        inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
        
        inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
        
        inline def setPiano_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "piano_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setPiano_auto_tracking_enabledUndefined: Self = StObject.set(x, "piano_auto_tracking_enabled", js.undefined)
        
        inline def setPopover_auto_hide(value: Boolean): Self = StObject.set(x, "popover_auto_hide", value.asInstanceOf[js.Any])
        
        inline def setPopover_auto_hideUndefined: Self = StObject.set(x, "popover_auto_hide", js.undefined)
        
        inline def setPopover_enabled(value: Boolean): Self = StObject.set(x, "popover_enabled", value.asInstanceOf[js.Any])
        
        inline def setPopover_enabledUndefined: Self = StObject.set(x, "popover_enabled", js.undefined)
        
        inline def setPopover_timeout(value: Double): Self = StObject.set(x, "popover_timeout", value.asInstanceOf[js.Any])
        
        inline def setPopover_timeoutUndefined: Self = StObject.set(x, "popover_timeout", js.undefined)
        
        inline def setPost_container(value: String): Self = StObject.set(x, "post_container", value.asInstanceOf[js.Any])
        
        inline def setPost_containerUndefined: Self = StObject.set(x, "post_container", js.undefined)
        
        inline def setSignature_enabled(value: Boolean): Self = StObject.set(x, "signature_enabled", value.asInstanceOf[js.Any])
        
        inline def setSignature_enabledUndefined: Self = StObject.set(x, "signature_enabled", js.undefined)
        
        inline def setStripe_public_key(value: String): Self = StObject.set(x, "stripe_public_key", value.asInstanceOf[js.Any])
        
        inline def setStripe_public_keyUndefined: Self = StObject.set(x, "stripe_public_key", js.undefined)
        
        inline def setSubscription_button_enabled(value: Boolean): Self = StObject.set(x, "subscription_button_enabled", value.asInstanceOf[js.Any])
        
        inline def setSubscription_button_enabledUndefined: Self = StObject.set(x, "subscription_button_enabled", js.undefined)
        
        inline def setSubscription_url(value: String): Self = StObject.set(x, "subscription_url", value.asInstanceOf[js.Any])
        
        inline def setSubscription_urlUndefined: Self = StObject.set(x, "subscription_url", js.undefined)
        
        inline def setTrack_original_action(value: Boolean): Self = StObject.set(x, "track_original_action", value.asInstanceOf[js.Any])
        
        inline def setTrack_original_actionUndefined: Self = StObject.set(x, "track_original_action", js.undefined)
        
        inline def setUser_is_premium(value: Boolean): Self = StObject.set(x, "user_is_premium", value.asInstanceOf[js.Any])
        
        inline def setUser_is_premiumUndefined: Self = StObject.set(x, "user_is_premium", js.undefined)
        
        inline def setVast(value: String): Self = StObject.set(x, "vast", value.asInstanceOf[js.Any])
        
        inline def setVastUndefined: Self = StObject.set(x, "vast", js.undefined)
        
        inline def setVideo_client(value: vast | googima): Self = StObject.set(x, "video_client", value.asInstanceOf[js.Any])
        
        inline def setVideo_clientUndefined: Self = StObject.set(x, "video_client", js.undefined)
        
        inline def setWait_for_dom_load(value: Boolean): Self = StObject.set(x, "wait_for_dom_load", value.asInstanceOf[js.Any])
        
        inline def setWait_for_dom_loadUndefined: Self = StObject.set(x, "wait_for_dom_load", js.undefined)
        
        inline def setWidget_container(value: String): Self = StObject.set(x, "widget_container", value.asInstanceOf[js.Any])
        
        inline def setWidget_containerUndefined: Self = StObject.set(x, "widget_container", js.undefined)
      }
    }
    
    trait AccessFactory extends StObject {
      
      /**
        * While the default configuration works for most use cases, you might want to configure some of Access.js behaviors.
        *
        * ℹ️ Your Dashboard configuration will override these configuration values unless they have been set with a read-only mode.
        *
        * @param config - the configuration object
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      def config(config: AccessConfigOptions): AccessFactory
      def config(config: AccessConfigOptions, readonly: Boolean): AccessFactory
      /**
        * While the default configuration works for most use cases, you might want to configure some of Access.js behaviors.
        *
        * ℹ️ Your Dashboard configuration will override these configuration values unless they have been set with a read-only mode.
        *
        * @param optionName The configuration option name
        * @param optionValue The configuration option value
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        *
        * More infos: https://poool.dev/docs/access/javascript/access/configuration
        */
      def config(optionName: String, optionValue: Any): AccessFactory
      def config(optionName: String, optionValue: Any, readonly: Boolean): AccessFactory
      @JSName("config")
      var config_Original: AccessConfig
      
      /**
        * Creates a new Paywall instance.
        *
        * @param config - the paywall configuration object
        * @returns The Access factory instance.
        *
        * More infos: https://poool.dev/docs/access/javascript/access/methods
        */
      def createPaywall(config: Content): AccessFactory
      
      /**
        * Destroys the current paywall.
        *
        * @returns null
        *
        * More infos: https://poool.dev/docs/access/javascript/access/methods
        */
      def destroy(): Null
      
      /**
        * Allows to remove an event callback previously set with {@link on} or {@link once}.
        *
        *
        * @param event - the event name
        * @param callback - the callback function
        * @returns The Access factory instance.
        *
        * More infos: https://poool.dev/docs/access/javascript/access/methods
        */
      def off(event: EventsList, callback: js.Function1[/* props */ Any, Any]): AccessFactory
      
      /**
        * Allows to set a callback to be called when a specific event is triggered
        *
        * @param event - the event name
        * @param callback - the callback function
        * @returns The Access factory instance.
        *
        * More infos: https://poool.dev/docs/access/javascript/access/methods
        */
      def on(event: EventsList, callback: js.Function1[/* props */ Any, Any]): AccessFactory
      
      /**
        * Same as {@link on} but the callback will be called only once and removed afterwards.
        *
        * @param event - the event name
        * @param callback - the callback function
        * @returns The Access factory instance.
        *
        * More infos: https://poool.dev/docs/access/javascript/access/methods
        */
      def once(event: EventsList, callback: js.Function1[/* props */ Any, Any]): AccessFactory
      
      /**
        * Just as you can modify the colors and global design of Poool's paywall in the appearance tab of your Dashboard, you can also do this using code.
        *
        * This front-end customization is especially useful when Access.js isn't able to retrieve the configuration used in your Dashboard.
        *
        * ℹ️ These configuration values are overridden by your Dashboard configuration.
        *
        * @param keyName - the style key name
        * @param value - the style value
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        *
        * More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      def styles(keyName: String, value: String): AccessFactory
      def styles(keyName: String, value: String, readonly: Boolean): AccessFactory
      /**
        * Just as you can modify the colors and global design of Poool's paywall in the appearance tab of your Dashboard, you can also do this using code.
        *
        * This front-end customization is especially useful when Access.js isn't able to retrieve the configuration used in your Dashboard.
        *
        * ℹ️ These configuration values are overridden by your Dashboard configuration.
        *
        * @param styles - the styles object
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        *
        * More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      def styles(styles: typings.pooolAccess.mod.Poool.styles): AccessFactory
      def styles(styles: typings.pooolAccess.mod.Poool.styles, readonly: Boolean): AccessFactory
      @JSName("styles")
      var styles_Original: AccessStyles
      
      /**
        * You may need to override the default text displayed to your visitors, either to change the wording, or to add a new locale.
        *
        * Each text key modified using the .texts function is added to the default locale (if no locale has been defined
        * in the general configuration options, or passed in the .texts function).
        *
        * ℹ️ These configuration values are overridden by your Dashboard configuration.
        *
        * @param keyName - the text key name
        * @param value - the text value
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        * @param [locale] - the locale to use
        *
        * More infos: https://poool.dev/docs/access/javascript/access/texts
        */
      def texts(keyName: String, value: String): AccessFactory
      def texts(keyName: String, value: String, readonly: Boolean): AccessFactory
      def texts(keyName: String, value: String, readonly: Boolean, locale: String): AccessFactory
      def texts(keyName: String, value: String, readonly: Unit, locale: String): AccessFactory
      /**
        * You may need to override the default text displayed to your visitors, either to change the wording, or to add a new locale.
        *
        * Each text key modified using the `.texts` function is added to the default `locale`
        * (if no `locale` has been defined in the general configuration options, or passed in the `.texts` function).
        *
        * ℹ️ These configuration values are overridden by your Dashboard configuration.
        *
        * @param texts - the texts object
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        * @param [locale] - the locale to use
        *
        * More infos: https://poool.dev/docs/access/javascript/access/texts
        */
      def texts(texts: StringDictionary[String]): AccessFactory
      def texts(texts: StringDictionary[String], readonly: Boolean): AccessFactory
      def texts(texts: StringDictionary[String], readonly: Boolean, locale: String): AccessFactory
      def texts(texts: StringDictionary[String], readonly: Unit, locale: String): AccessFactory
      @JSName("texts")
      var texts_Original: AccessTexts
      
      /**
        * Some texts inside the paywall benefit from predefined & automatically integrated variables, such as `{app_name}`.
        *
        * The `.variable` function allows you to define custom variables, which can be used in all paywall texts.
        *
        * @param keyName - the variable key name
        * @param value - the variable value
        *
        * More infos: https://poool.dev/docs/access/javascript/access/variables
        */
      def variables(keyName: String, value: String): AccessFactory
      /**
        * Some texts inside the paywall benefit from predefined & automatically integrated variables, such as `{app_name}`.
        *
        * The `.variable` function allows you to define custom variables, which can be used in all paywall texts.
        *
        * @param variables - the variables object
        *
        * More infos: https://poool.dev/docs/access/javascript/access/variables
        */
      def variables(variables: StringDictionary[String]): AccessFactory
      @JSName("variables")
      var variables_Original: AccessVariables
    }
    object AccessFactory {
      
      inline def apply(
        config: AccessConfig,
        createPaywall: Content => AccessFactory,
        destroy: () => Null,
        off: (EventsList, js.Function1[/* props */ Any, Any]) => AccessFactory,
        on: (EventsList, js.Function1[/* props */ Any, Any]) => AccessFactory,
        once: (EventsList, js.Function1[/* props */ Any, Any]) => AccessFactory,
        styles: AccessStyles,
        texts: AccessTexts,
        variables: AccessVariables
      ): AccessFactory = {
        val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], createPaywall = js.Any.fromFunction1(createPaywall), destroy = js.Any.fromFunction0(destroy), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), styles = styles.asInstanceOf[js.Any], texts = texts.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
        __obj.asInstanceOf[AccessFactory]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AccessFactory] (val x: Self) extends AnyVal {
        
        inline def setConfig(value: AccessConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setCreatePaywall(value: Content => AccessFactory): Self = StObject.set(x, "createPaywall", js.Any.fromFunction1(value))
        
        inline def setDestroy(value: () => Null): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        inline def setOff(value: (EventsList, js.Function1[/* props */ Any, Any]) => AccessFactory): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
        
        inline def setOn(value: (EventsList, js.Function1[/* props */ Any, Any]) => AccessFactory): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
        
        inline def setOnce(value: (EventsList, js.Function1[/* props */ Any, Any]) => AccessFactory): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
        
        inline def setStyles(value: AccessStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
        
        inline def setTexts(value: AccessTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
        
        inline def setVariables(value: AccessVariables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait AccessStyles extends StObject {
      
      /**
        * Just as you can modify the colors and global design of Poool's paywall in the appearance tab of your Dashboard, you can also do this using code.
        *
        * This front-end customization is especially useful when Access.js isn't able to retrieve the configuration used in your Dashboard.
        *
        * ℹ️ These configuration values are overridden by your Dashboard configuration.
        *
        * @param keyName - the style key name
        * @param value - the style value
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        *
        * More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      def apply(keyName: String, value: String): AccessFactory = js.native
      def apply(keyName: String, value: String, readonly: Boolean): AccessFactory = js.native
      /**
        * Just as you can modify the colors and global design of Poool's paywall in the appearance tab of your Dashboard, you can also do this using code.
        *
        * This front-end customization is especially useful when Access.js isn't able to retrieve the configuration used in your Dashboard.
        *
        * ℹ️ These configuration values are overridden by your Dashboard configuration.
        *
        * @param styles - the styles object
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        *
        * More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      def apply(styles: styles): AccessFactory = js.native
      def apply(styles: styles, readonly: Boolean): AccessFactory = js.native
    }
    
    @js.native
    trait AccessTexts extends StObject {
      
      /**
        * You may need to override the default text displayed to your visitors, either to change the wording, or to add a new locale.
        *
        * Each text key modified using the .texts function is added to the default locale (if no locale has been defined
        * in the general configuration options, or passed in the .texts function).
        *
        * ℹ️ These configuration values are overridden by your Dashboard configuration.
        *
        * @param keyName - the text key name
        * @param value - the text value
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        * @param [locale] - the locale to use
        *
        * More infos: https://poool.dev/docs/access/javascript/access/texts
        */
      def apply(keyName: String, value: String): AccessFactory = js.native
      def apply(keyName: String, value: String, readonly: Boolean): AccessFactory = js.native
      def apply(keyName: String, value: String, readonly: Boolean, locale: String): AccessFactory = js.native
      def apply(keyName: String, value: String, readonly: Unit, locale: String): AccessFactory = js.native
      /**
        * You may need to override the default text displayed to your visitors, either to change the wording, or to add a new locale.
        *
        * Each text key modified using the `.texts` function is added to the default `locale`
        * (if no `locale` has been defined in the general configuration options, or passed in the `.texts` function).
        *
        * ℹ️ These configuration values are overridden by your Dashboard configuration.
        *
        * @param texts - the texts object
        * @param [readonly=false] - if true, the configuration will be read-only and cannot be overridden by the Dashboard
        * @param [locale] - the locale to use
        *
        * More infos: https://poool.dev/docs/access/javascript/access/texts
        */
      def apply(texts: StringDictionary[String]): AccessFactory = js.native
      def apply(texts: StringDictionary[String], readonly: Boolean): AccessFactory = js.native
      def apply(texts: StringDictionary[String], readonly: Boolean, locale: String): AccessFactory = js.native
      def apply(texts: StringDictionary[String], readonly: Unit, locale: String): AccessFactory = js.native
    }
    
    @js.native
    trait AccessVariables extends StObject {
      
      /**
        * Some texts inside the paywall benefit from predefined & automatically integrated variables, such as `{app_name}`.
        *
        * The `.variable` function allows you to define custom variables, which can be used in all paywall texts.
        *
        * @param keyName - the variable key name
        * @param value - the variable value
        *
        * More infos: https://poool.dev/docs/access/javascript/access/variables
        */
      def apply(keyName: String, value: String): AccessFactory = js.native
      /**
        * Some texts inside the paywall benefit from predefined & automatically integrated variables, such as `{app_name}`.
        *
        * The `.variable` function allows you to define custom variables, which can be used in all paywall texts.
        *
        * @param variables - the variables object
        *
        * More infos: https://poool.dev/docs/access/javascript/access/variables
        */
      def apply(variables: StringDictionary[String]): AccessFactory = js.native
    }
    
    @js.native
    trait Audit extends StObject {
      
      /**
        * While the default configuration works for most use cases, you might want to configure some of Audit.js behaviors.
        *
        * ℹ️ Your Dashboard configuration will override these configuration values unless they have been set with a read-only mode.
        *
        * @param config - Audit.js configuration object.
        * @param [readonly=false] - Whether or not the configuration should be read-only.
        * @returns The audit instance.
        *
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      def config(config: AuditConfigOptions): Audit = js.native
      def config(config: AuditConfigOptions, readonly: Boolean): Audit = js.native
      /**
        * While the default configuration works for most use cases, you might want to configure some of Audit.js behaviors.
        *
        * ℹ️ Your Dashboard configuration will override these configuration values unless they have been set with a read-only mode.
        *
        * @param optionName - Audit.js configuration option name.
        * @param value - Audit.js configuration option value.
        * @param [readonly=false] - Whether or not the configuration should be read-only.
        * @returns The audit instance.
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      def config(optionName: String, value: Any): Audit = js.native
      def config(optionName: String, value: Any, readonly: Boolean): Audit = js.native
      @JSName("config")
      var config_Original: AuditConfig = js.native
      
      /**
        * Initializes Audit using your app ID.
        *
        * @param key - Your poool app ID
        * @returns the Audit instance
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/methods
        */
      def init(key: String): Audit = js.native
      
      /**
        * If an `Audit` object already exists in the global object of the current page, the `Audit.js` library will be renamed to `PooolAudit` and the original `Audit` object will be restored.
        *
        * @returns the Audit instance
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/methods
        */
      def noConflict(): Audit = js.native
      
      /**
        * Allows to remove an event callback previously set with {@link on} or {@link once}.
        *
        *
        * @param event - the event name
        * @param callback - the callback function
        * @returns The Audit instance.
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/methods
        */
      def off(event: EventsList, callback: js.Function1[/* props */ Any, Any]): Audit = js.native
      
      /**
        * Allows to set a callback to be called when a specific event is triggered
        *
        * @param event - the event name
        * @param callback - the callback function
        * @returns The Audit instance.
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/methods
        */
      def on(eventname: EventsList, callback: js.Function1[/* props */ Any, Any]): Audit = js.native
      
      /**
        * Same as {@link on} but the callback will be called only once and removed afterwards.
        *
        * @param event - the event name
        * @param callback - the callback function
        * @returns The Audit instance.
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/methods
        */
      def once(event: EventsList, callback: js.Function1[/* props */ Any, Any]): Audit = js.native
      
      /**
        * Sends an audit event.
        *
        * @param eventName - the event name
        * @param data - the event datas
        * @param options - the event options
        * @returns the Audit instance
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/methods
        */
      @JSName("sendEvent")
      def sendEvent_pageview(eventName: `page-view`): Audit = js.native
      @JSName("sendEvent")
      def sendEvent_pageview(eventName: `page-view`, data: Unit, options: Beacons): Audit = js.native
      @JSName("sendEvent")
      def sendEvent_pageview(eventName: `page-view`, data: Dictkey): Audit = js.native
      @JSName("sendEvent")
      def sendEvent_pageview(eventName: `page-view`, data: Dictkey, options: Beacons): Audit = js.native
    }
    
    @js.native
    trait AuditConfig extends StObject {
      
      /**
        * While the default configuration works for most use cases, you might want to configure some of Audit.js behaviors.
        *
        * ℹ️ Your Dashboard configuration will override these configuration values unless they have been set with a read-only mode.
        *
        * @param config - Audit.js configuration object.
        * @param [readonly=false] - Whether or not the configuration should be read-only.
        * @returns The audit instance.
        *
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      def apply(config: AuditConfigOptions): Audit = js.native
      def apply(config: AuditConfigOptions, readonly: Boolean): Audit = js.native
      /**
        * While the default configuration works for most use cases, you might want to configure some of Audit.js behaviors.
        *
        * ℹ️ Your Dashboard configuration will override these configuration values unless they have been set with a read-only mode.
        *
        * @param optionName - Audit.js configuration option name.
        * @param value - Audit.js configuration option value.
        * @param [readonly=false] - Whether or not the configuration should be read-only.
        * @returns The audit instance.
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      def apply(optionName: String, value: Any): Audit = js.native
      def apply(optionName: String, value: Any, readonly: Boolean): Audit = js.native
    }
    
    trait AuditConfigOptions extends StObject {
      
      /**
        * Enable/disable automatic AT Internet tracking (AT Internet SDK integration required) for particular events.
        *
        * ⚠️ AT Internet SDK Version `5.7` or higher is required.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var ati_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Allows to provide configuration options to the `ATInternet.Tracker.Tag` constructor.
        * See the [ATInternet documentation](https://developers.atinternet-solutions.com/as2-tagging-en/javascript-en/getting-started-javascript-en/tracker-initialisation-javascript-en/#Annexe)
        *  for more information.
        *
        * Default: `{}`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var ati_tag_options: js.UndefOr[StringDictionary[Any]] = js.undefined
      
      /**
        * Used to setup AT Internet method to send tracking event (AT Internet SDK integration required).
        *
        * `tag.publisher.send` is used by default. By setting `events`, events will be sent with `tag.events.send` method.
        *
        * ⚠️ AT Internet SDK Version `5.7` or higher is required.
        *
        * Default: `'default'`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var ati_tracking_method: js.UndefOr[default | events] = js.undefined
      
      /**
        * Enable/disable the latest version of the GA, GTM and Gtag connectors. This version is more precise and allows for more detailed performance tracking in Google Analytics.
        *
        * ⚠️ This option cannot be used alone, it must be paired with one of the GA, GTM or Gtag automatic tracking options.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var auto_tracking_spec_v2: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Whether or not to send some tracking requests (mostly clicks behind a redirect) using `navigator.sendBeacon` instead of a normal XHR request.
        *
        * Default: `true`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var beacons: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Used to assign a particular custom context to a reader.
        *
        * If no context is specified, native contexts or a default one will be used instead.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var context: js.UndefOr[String] = js.undefined
      
      /**
        * Used to define your own custom domain for Poool cookies.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var cookies_domain: js.UndefOr[String] = js.undefined
      
      /**
        * Enable/disable all tracking actions used by Poool according to the latest GDPR compliancy measures.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var cookies_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Used to define your own custom path for Poool cookies.
        *
        * Default: `'/'`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var cookies_path: js.UndefOr[String] = js.undefined
      
      /**
        * Used to assign your own unique custom identifier to one of your readers.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var custom_reader_id: js.UndefOr[String] = js.undefined
      
      /**
        * Used to allocate a reader to a custom group previously created in Poool's Dashboard.
        *
        * Default: `null`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var custom_segment: js.UndefOr[String] = js.undefined
      
      /**
        * When debug mode is enabled, Poool's SDK will log everything it does in the browser console.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var debug: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Enable/disable automatic Google Analytics tracking (Google Analytics SDK integration required) for particular events.
        *
        * ⚠️ Regular Google Analytics SDK integration required, e.g using `ga()` tracking method.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var ga_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Enable/disable automatic Google Analytics 4 tracking (Google Analytics 4 tag required) for particular events.
        *
        * ⚠️ Google Analytics 4 integration required, i.e using `gtag()` tracking method.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var gtag_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Enable/disable automatic Google Tag Manager tracking (GTM SDK integration required) for particular events.
        *
        * Every event information is pushed to the dataLayer with the same structure as a Google Analytics event.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var gtm_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Enable/disable automatic Piano tracking (Piano SDK integration required) for particular events.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var piano_auto_tracking_enabled: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Allows you to set a reader status to already subscribed.
        *
        * ⚠️ This value is only used for statistical purposes.
        *
        * Default: `false`
        *
        * More infos: https://poool.dev/docs/access/javascript/audit/configuration
        */
      var user_is_premium: js.UndefOr[Boolean] = js.undefined
    }
    object AuditConfigOptions {
      
      inline def apply(): AuditConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AuditConfigOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AuditConfigOptions] (val x: Self) extends AnyVal {
        
        inline def setAti_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "ati_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setAti_auto_tracking_enabledUndefined: Self = StObject.set(x, "ati_auto_tracking_enabled", js.undefined)
        
        inline def setAti_tag_options(value: StringDictionary[Any]): Self = StObject.set(x, "ati_tag_options", value.asInstanceOf[js.Any])
        
        inline def setAti_tag_optionsUndefined: Self = StObject.set(x, "ati_tag_options", js.undefined)
        
        inline def setAti_tracking_method(value: default | events): Self = StObject.set(x, "ati_tracking_method", value.asInstanceOf[js.Any])
        
        inline def setAti_tracking_methodUndefined: Self = StObject.set(x, "ati_tracking_method", js.undefined)
        
        inline def setAuto_tracking_spec_v2(value: Boolean): Self = StObject.set(x, "auto_tracking_spec_v2", value.asInstanceOf[js.Any])
        
        inline def setAuto_tracking_spec_v2Undefined: Self = StObject.set(x, "auto_tracking_spec_v2", js.undefined)
        
        inline def setBeacons(value: Boolean): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
        
        inline def setBeaconsUndefined: Self = StObject.set(x, "beacons", js.undefined)
        
        inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
        
        inline def setCookies_domain(value: String): Self = StObject.set(x, "cookies_domain", value.asInstanceOf[js.Any])
        
        inline def setCookies_domainUndefined: Self = StObject.set(x, "cookies_domain", js.undefined)
        
        inline def setCookies_enabled(value: Boolean): Self = StObject.set(x, "cookies_enabled", value.asInstanceOf[js.Any])
        
        inline def setCookies_enabledUndefined: Self = StObject.set(x, "cookies_enabled", js.undefined)
        
        inline def setCookies_path(value: String): Self = StObject.set(x, "cookies_path", value.asInstanceOf[js.Any])
        
        inline def setCookies_pathUndefined: Self = StObject.set(x, "cookies_path", js.undefined)
        
        inline def setCustom_reader_id(value: String): Self = StObject.set(x, "custom_reader_id", value.asInstanceOf[js.Any])
        
        inline def setCustom_reader_idUndefined: Self = StObject.set(x, "custom_reader_id", js.undefined)
        
        inline def setCustom_segment(value: String): Self = StObject.set(x, "custom_segment", value.asInstanceOf[js.Any])
        
        inline def setCustom_segmentUndefined: Self = StObject.set(x, "custom_segment", js.undefined)
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
        
        inline def setGa_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "ga_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setGa_auto_tracking_enabledUndefined: Self = StObject.set(x, "ga_auto_tracking_enabled", js.undefined)
        
        inline def setGtag_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "gtag_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setGtag_auto_tracking_enabledUndefined: Self = StObject.set(x, "gtag_auto_tracking_enabled", js.undefined)
        
        inline def setGtm_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "gtm_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setGtm_auto_tracking_enabledUndefined: Self = StObject.set(x, "gtm_auto_tracking_enabled", js.undefined)
        
        inline def setPiano_auto_tracking_enabled(value: Boolean): Self = StObject.set(x, "piano_auto_tracking_enabled", value.asInstanceOf[js.Any])
        
        inline def setPiano_auto_tracking_enabledUndefined: Self = StObject.set(x, "piano_auto_tracking_enabled", js.undefined)
        
        inline def setUser_is_premium(value: Boolean): Self = StObject.set(x, "user_is_premium", value.asInstanceOf[js.Any])
        
        inline def setUser_is_premiumUndefined: Self = StObject.set(x, "user_is_premium", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.pooolAccess.pooolAccessStrings.identityAvailable
      - typings.pooolAccess.pooolAccessStrings.lock
      - typings.pooolAccess.pooolAccessStrings.ready
      - typings.pooolAccess.pooolAccessStrings.paywallSeen
      - typings.pooolAccess.pooolAccessStrings.release
      - typings.pooolAccess.pooolAccessStrings.register
      - typings.pooolAccess.pooolAccessStrings.subscribeClick
      - typings.pooolAccess.pooolAccessStrings.loginClick
      - typings.pooolAccess.pooolAccessStrings.discoveryLinkClick
      - typings.pooolAccess.pooolAccessStrings.alternativeClick
      - typings.pooolAccess.pooolAccessStrings.error
      - typings.pooolAccess.pooolAccessStrings.outdatedBrowser
      - typings.pooolAccess.pooolAccessStrings.dataPolicyClick
      - typings.pooolAccess.pooolAccessStrings.formSubmit
      - typings.pooolAccess.pooolAccessStrings.facebookLoginClick
      - typings.pooolAccess.pooolAccessStrings.googleLoginClick
      - typings.pooolAccess.pooolAccessStrings.answer
      - typings.pooolAccess.pooolAccessStrings.consent
      - typings.pooolAccess.pooolAccessStrings.customButtonClick
    */
    trait EventsList extends StObject
    object EventsList {
      
      inline def alternativeClick: typings.pooolAccess.pooolAccessStrings.alternativeClick = "alternativeClick".asInstanceOf[typings.pooolAccess.pooolAccessStrings.alternativeClick]
      
      inline def answer: typings.pooolAccess.pooolAccessStrings.answer = "answer".asInstanceOf[typings.pooolAccess.pooolAccessStrings.answer]
      
      inline def consent: typings.pooolAccess.pooolAccessStrings.consent = "consent".asInstanceOf[typings.pooolAccess.pooolAccessStrings.consent]
      
      inline def customButtonClick: typings.pooolAccess.pooolAccessStrings.customButtonClick = "customButtonClick".asInstanceOf[typings.pooolAccess.pooolAccessStrings.customButtonClick]
      
      inline def dataPolicyClick: typings.pooolAccess.pooolAccessStrings.dataPolicyClick = "dataPolicyClick".asInstanceOf[typings.pooolAccess.pooolAccessStrings.dataPolicyClick]
      
      inline def discoveryLinkClick: typings.pooolAccess.pooolAccessStrings.discoveryLinkClick = "discoveryLinkClick".asInstanceOf[typings.pooolAccess.pooolAccessStrings.discoveryLinkClick]
      
      inline def error: typings.pooolAccess.pooolAccessStrings.error = "error".asInstanceOf[typings.pooolAccess.pooolAccessStrings.error]
      
      inline def facebookLoginClick: typings.pooolAccess.pooolAccessStrings.facebookLoginClick = "facebookLoginClick".asInstanceOf[typings.pooolAccess.pooolAccessStrings.facebookLoginClick]
      
      inline def formSubmit: typings.pooolAccess.pooolAccessStrings.formSubmit = "formSubmit".asInstanceOf[typings.pooolAccess.pooolAccessStrings.formSubmit]
      
      inline def googleLoginClick: typings.pooolAccess.pooolAccessStrings.googleLoginClick = "googleLoginClick".asInstanceOf[typings.pooolAccess.pooolAccessStrings.googleLoginClick]
      
      inline def identityAvailable: typings.pooolAccess.pooolAccessStrings.identityAvailable = "identityAvailable".asInstanceOf[typings.pooolAccess.pooolAccessStrings.identityAvailable]
      
      inline def lock: typings.pooolAccess.pooolAccessStrings.lock = "lock".asInstanceOf[typings.pooolAccess.pooolAccessStrings.lock]
      
      inline def loginClick: typings.pooolAccess.pooolAccessStrings.loginClick = "loginClick".asInstanceOf[typings.pooolAccess.pooolAccessStrings.loginClick]
      
      inline def outdatedBrowser: typings.pooolAccess.pooolAccessStrings.outdatedBrowser = "outdatedBrowser".asInstanceOf[typings.pooolAccess.pooolAccessStrings.outdatedBrowser]
      
      inline def paywallSeen: typings.pooolAccess.pooolAccessStrings.paywallSeen = "paywallSeen".asInstanceOf[typings.pooolAccess.pooolAccessStrings.paywallSeen]
      
      inline def ready: typings.pooolAccess.pooolAccessStrings.ready = "ready".asInstanceOf[typings.pooolAccess.pooolAccessStrings.ready]
      
      inline def register: typings.pooolAccess.pooolAccessStrings.register = "register".asInstanceOf[typings.pooolAccess.pooolAccessStrings.register]
      
      inline def release: typings.pooolAccess.pooolAccessStrings.release = "release".asInstanceOf[typings.pooolAccess.pooolAccessStrings.release]
      
      inline def subscribeClick: typings.pooolAccess.pooolAccessStrings.subscribeClick = "subscribeClick".asInstanceOf[typings.pooolAccess.pooolAccessStrings.subscribeClick]
    }
    
    trait styles extends StObject {
      
      /**
        * URL to your cover image. `.png` or `.jpg` format, `140px` min width, `380px` min height, `200kb` max
        *
        * default: null
        *
        *  More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      var brand_cover: js.UndefOr[String] = js.undefined
      
      /**
        * URL to your media's logo. `.png`, `.jpg` or `.svg` format, `140px` min height, `200kb` max.
        *
        * default: null
        *
        *  More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      var brand_logo: js.UndefOr[String] = js.undefined
      
      /**
        * Main buttons color
        *
        * default: '#1896B4'
        *
        *  More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      var button_color: js.UndefOr[String] = js.undefined
      
      /**
        * Main buttons hover color
        *
        * default: '#0E6176'
        *
        * More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      var button_hover_color: js.UndefOr[String] = js.undefined
      
      /**
        * Custom CSS added inside the paywall frame.
        *
        * Default: null
        *
        * More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      var custom_css: js.UndefOr[String] = js.undefined
      
      /**
        * Defines the base layout of the paywall.
        * - `portrait`: most suited to fairly wide page layouts such as featured articles or exclusive previews. Displays a block of obfuscated lines of text in the background of the paywall.
        * - `landscape`: most suited to fairly small page layouts such as articles with a side bar on the right-hand side for example.
        *
        * default: `portrait`
        *
        * More Infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      var layout: js.UndefOr[portrait | landscape] = js.undefined
      
      /**
        * Subscription color.
        *
        * Default: '#1896B4'
        *
        * More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      var premium_color: js.UndefOr[String] = js.undefined
      
      /**
        * Paywall's skin color.
        *
        * Default: '#4A90E2'
        *
        * More infos: https://poool.dev/docs/access/javascript/access/appearances
        */
      var skin_color: js.UndefOr[String] = js.undefined
    }
    object styles {
      
      inline def apply(): styles = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[styles]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: styles] (val x: Self) extends AnyVal {
        
        inline def setBrand_cover(value: String): Self = StObject.set(x, "brand_cover", value.asInstanceOf[js.Any])
        
        inline def setBrand_coverUndefined: Self = StObject.set(x, "brand_cover", js.undefined)
        
        inline def setBrand_logo(value: String): Self = StObject.set(x, "brand_logo", value.asInstanceOf[js.Any])
        
        inline def setBrand_logoUndefined: Self = StObject.set(x, "brand_logo", js.undefined)
        
        inline def setButton_color(value: String): Self = StObject.set(x, "button_color", value.asInstanceOf[js.Any])
        
        inline def setButton_colorUndefined: Self = StObject.set(x, "button_color", js.undefined)
        
        inline def setButton_hover_color(value: String): Self = StObject.set(x, "button_hover_color", value.asInstanceOf[js.Any])
        
        inline def setButton_hover_colorUndefined: Self = StObject.set(x, "button_hover_color", js.undefined)
        
        inline def setCustom_css(value: String): Self = StObject.set(x, "custom_css", value.asInstanceOf[js.Any])
        
        inline def setCustom_cssUndefined: Self = StObject.set(x, "custom_css", js.undefined)
        
        inline def setLayout(value: portrait | landscape): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
        
        inline def setPremium_color(value: String): Self = StObject.set(x, "premium_color", value.asInstanceOf[js.Any])
        
        inline def setPremium_colorUndefined: Self = StObject.set(x, "premium_color", js.undefined)
        
        inline def setSkin_color(value: String): Self = StObject.set(x, "skin_color", value.asInstanceOf[js.Any])
        
        inline def setSkin_colorUndefined: Self = StObject.set(x, "skin_color", js.undefined)
      }
    }
  }
}
