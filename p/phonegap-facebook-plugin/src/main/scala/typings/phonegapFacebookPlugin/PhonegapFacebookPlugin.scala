package typings.phonegapFacebookPlugin

import typings.phonegapFacebookPlugin.anon.AccessToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PhonegapFacebookPlugin {
  
  //#endregion
  //#region Method Parameters
  trait BaseDialogOptions extends StObject {
    
    /**
      * The type of dialog to show, can be one of the following.
      *
      * Depeneding on the type, a different options object will be used:
      *
      * Method               Options Type
      * feed                 FeedDialogOptions
      * send                 SendDialogOptions
      * share                ShareDialogOptions
      * share_open_graph     ShareOpenGraphDialogOptions
      */
    var method: String
  }
  object BaseDialogOptions {
    
    inline def apply(method: String): BaseDialogOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDialogOptions]
    }
    
    extension [Self <: BaseDialogOptions](x: Self) {
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The base result type for all showDialog() success callbacks.
    */
  trait BaseDialogResult extends StObject {
    
    var error_code: String
    
    var error_message: String
  }
  object BaseDialogResult {
    
    inline def apply(error_code: String, error_message: String): BaseDialogResult = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDialogResult]
    }
    
    extension [Self <: BaseDialogResult](x: Self) {
      
      inline def setError_code(value: String): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      inline def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    }
  }
  
  //#region API Methods
  @js.native
  trait FacebookConnectPluginStatic extends StObject {
    
    /**
      * Allows access to the Facebook Graph API. This API allows for additional permission because, unlike login, the Graph API can
      * accept multiple permissions. In order to make calls to the Graph API on behalf of a user, the user has to be logged into your
      * app using Facebook login.
      *
      * @param graphPath The graph API path to use for the query.
      * @param permissions The permissions to request.
      * @param successCallback The callback to be executed when the call completes successfully.
      * @param failureCallback The callback to be executed when the call fails.
      */
    def api(graphPath: String, permissions: js.Array[String]): Unit = js.native
    def api(
      graphPath: String,
      permissions: js.Array[String],
      successCallback: js.Function1[/* result */ js.Any, Unit]
    ): Unit = js.native
    def api(
      graphPath: String,
      permissions: js.Array[String],
      successCallback: js.Function1[/* result */ js.Any, Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def api(
      graphPath: String,
      permissions: js.Array[String],
      successCallback: Unit,
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Used to retreive the access token for the current user.
      *
      * @param successCallback The callback to be executed when the call completes successfully.
      * @param failureCallback The callback to be executed when the call fails.
      */
    def getAccessToken(): Unit = js.native
    def getAccessToken(successCallback: js.Function1[/* token */ String, Unit]): Unit = js.native
    def getAccessToken(
      successCallback: js.Function1[/* token */ String, Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def getAccessToken(successCallback: Unit, failureCallback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    /**
      * Used to get the login status for the current user.
      *
      * @param successCallback The callback to be executed when the call completes successfully.
      * @param failureCallback The callback to be executed when the call fails.
      */
    def getLoginStatus(): Unit = js.native
    def getLoginStatus(successCallback: js.Function1[/* status */ LoginResult, Unit]): Unit = js.native
    def getLoginStatus(
      successCallback: js.Function1[/* status */ LoginResult, Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def getLoginStatus(successCallback: Unit, failureCallback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    /**
      * Used to log an event.
      *
      * @param name Name of the event.
      * @param params Extra data to log with the event (optional).
      * @param valueToSum a property which is an arbitrary number that can represent any value (e.g., a price or a quantity).
      *          When reported, all of the valueToSum properties will be summed together. For example, if 10 people each purchased
      *          one item that cost $10 (and passed in valueToSum) then they would be summed to report a number of $100. (optional)
      * @param successCallback The callback to be executed when the call completes successfully.
      * @param failureCallback The callback to be executed when the call fails.
      */
    def logEvent(name: String): Unit = js.native
    def logEvent(name: String, params: js.Any): Unit = js.native
    def logEvent(name: String, params: js.Any, valueToSum: Double): Unit = js.native
    def logEvent(name: String, params: js.Any, valueToSum: Double, successCallback: js.Function0[Unit]): Unit = js.native
    def logEvent(
      name: String,
      params: js.Any,
      valueToSum: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logEvent(
      name: String,
      params: js.Any,
      valueToSum: Double,
      successCallback: Unit,
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logEvent(name: String, params: js.Any, valueToSum: Unit, successCallback: js.Function0[Unit]): Unit = js.native
    def logEvent(
      name: String,
      params: js.Any,
      valueToSum: Unit,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logEvent(
      name: String,
      params: js.Any,
      valueToSum: Unit,
      successCallback: Unit,
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logEvent(name: String, params: Unit, valueToSum: Double): Unit = js.native
    def logEvent(name: String, params: Unit, valueToSum: Double, successCallback: js.Function0[Unit]): Unit = js.native
    def logEvent(
      name: String,
      params: Unit,
      valueToSum: Double,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logEvent(
      name: String,
      params: Unit,
      valueToSum: Double,
      successCallback: Unit,
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logEvent(name: String, params: Unit, valueToSum: Unit, successCallback: js.Function0[Unit]): Unit = js.native
    def logEvent(
      name: String,
      params: Unit,
      valueToSum: Unit,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logEvent(
      name: String,
      params: Unit,
      valueToSum: Unit,
      successCallback: Unit,
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Used to log a purchase.
      *
      * @param value The value of the purchase.
      * @param currency An ISO-4217 currency code.
      * @param successCallback The callback to be executed when the call completes successfully.
      * @param failureCallback The callback to be executed when the call fails.
      */
    def logPurchase(value: Double, currency: String): Unit = js.native
    def logPurchase(value: Double, currency: String, successCallback: js.Function0[Unit]): Unit = js.native
    def logPurchase(
      value: Double,
      currency: String,
      successCallback: js.Function0[Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def logPurchase(
      value: Double,
      currency: String,
      successCallback: Unit,
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Used to log the user in via Facebook. Calling this will result in a Facebook login dialog (or external
      * webpage) launching. Once the user completes the flow, one of the two callbacks will be executed.
      *
      * @param permissions The permissions to request during login.
      * @param successCallback The callback to be executed when the call completes successfully.
      * @param failureCallback The callback to be executed when the call fails.
      */
    def login(permissions: js.Array[String]): Unit = js.native
    def login(permissions: js.Array[String], successCallback: js.Function1[/* result */ LoginResult, Unit]): Unit = js.native
    def login(
      permissions: js.Array[String],
      successCallback: js.Function1[/* result */ LoginResult, Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def login(
      permissions: js.Array[String],
      successCallback: Unit,
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    
    /**
      * Used to log the user out of Facebook. This will invalidate their access token.
      *
      * @param successCallback The callback to be executed when the call completes successfully.
      * @param failureCallback The callback to be executed when the call fails.
      */
    def logout(): Unit = js.native
    def logout(successCallback: js.Function0[Unit]): Unit = js.native
    def logout(successCallback: js.Function0[Unit], failureCallback: js.Function1[/* error */ String, Unit]): Unit = js.native
    def logout(successCallback: Unit, failureCallback: js.Function1[/* error */ String, Unit]): Unit = js.native
    
    /**
      * Used to open a Facebook dialog.
      *
      * @param options The options that control the dialog and it's behavior.
      * @param successCallback The callback to be executed when the call completes successfully.
      * @param failureCallback The callback to be executed when the call fails.
      */
    def showDialog(options: BaseDialogOptions): Unit = js.native
    def showDialog(options: BaseDialogOptions, successCallback: js.Function1[/* status */ BaseDialogResult, Unit]): Unit = js.native
    def showDialog(
      options: BaseDialogOptions,
      successCallback: js.Function1[/* status */ BaseDialogResult, Unit],
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
    def showDialog(
      options: BaseDialogOptions,
      successCallback: Unit,
      failureCallback: js.Function1[/* error */ String, Unit]
    ): Unit = js.native
  }
  
  /**
    * You can add the Feed Dialog to your app so people can publish individual stories to their timeline. This
    * includes captions that your app manages and a personal comment from the person sharing the content.
    *
    * For use with showDialog() of method type 'feed'.
    */
  trait FeedDialogOptions
    extends StObject
       with BaseDialogOptions {
    
    /**
      * The caption of the link (appears beneath the link name). If not specified, this field is automatically
      * populated with the URL of the link.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * The description of the link (appears beneath the link caption). If not specified, this field is
      * automatically populated by information scraped from the link, typically the title of the page.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the person posting the message. If this is unspecified, it defaults to the current person.
      * If specified, it must be the ID of the person or of a page that the person administers.
      */
    var from: js.UndefOr[String] = js.undefined
    
    /**
      * The link attached to this post.
      */
    var link: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the link attachment.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of a picture attached to this post. The picture must be at least 200px by 200px.
      */
    var picture: js.UndefOr[String] = js.undefined
    
    /**
      * This argument is a comma-separated list, consisting of at most 5 distinct items, each of length at
      * least 1 and at most 15 characters drawn from the set
      * '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_'.
      * Each category is used in Facebook Insights to help you measure the performance of different types
      * of post.
      */
    var ref: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of a media file (either SWF or MP3) attached to this post. If SWF, you must also specify
      * 'picture' to provide a thumbnail for the video.
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the profile that this story will be published to. If this is unspecified, it defaults to
      * the value of from. The ID must be a friend who also uses your app.
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object FeedDialogOptions {
    
    inline def apply(method: String): FeedDialogOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedDialogOptions]
    }
    
    extension [Self <: FeedDialogOptions](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      inline def setPictureUndefined: Self = StObject.set(x, "picture", js.undefined)
      
      inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /**
    * The response object returned from a success callback for showDialog() of type 'feed'.
    */
  trait FeedDialogResult
    extends StObject
       with BaseDialogResult {
    
    /**
      * The ID of the posted story, if the person chose to publish.
      */
    var post_id: String
  }
  object FeedDialogResult {
    
    inline def apply(error_code: String, error_message: String, post_id: String): FeedDialogResult = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], post_id = post_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeedDialogResult]
    }
    
    extension [Self <: FeedDialogResult](x: Self) {
      
      inline def setPost_id(value: String): Self = StObject.set(x, "post_id", value.asInstanceOf[js.Any])
    }
  }
  
  //#endregion
  //#region Callback Results
  /**
    * Result for the login() and getLoginStatus() success callbacks.
    */
  trait LoginResult extends StObject {
    
    var authResponse: AccessToken
    
    var status: String
  }
  object LoginResult {
    
    inline def apply(authResponse: AccessToken, status: String): LoginResult = {
      val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoginResult]
    }
    
    extension [Self <: LoginResult](x: Self) {
      
      inline def setAuthResponse(value: AccessToken): Self = StObject.set(x, "authResponse", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The Send Dialog lets people privately send content to specific friends. They'll have the option to privately
    * share a link as a Facebook message or group post. The Send Dialog does not require any extended permissions.
    *
    * For use with showDialog() of method type 'send'.
    */
  trait SendDialogOptions
    extends StObject
       with BaseDialogOptions {
    
    /**
      * Required parameter. The URL that is being sent in the message.
      */
    var link: String
    
    /**
      * A user ID of a recipient. Once the dialog comes up, the sender can specify additional people, and groups
      * addresses as recipients. Sending content to a Facebook group will post it to the group's wall.
      */
    var to: String
  }
  object SendDialogOptions {
    
    inline def apply(link: String, method: String, to: String): SendDialogOptions = {
      val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendDialogOptions]
    }
    
    extension [Self <: SendDialogOptions](x: Self) {
      
      inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The response object returned from a success callback for showDialog() of type 'send'.
    */
  type SendDialogResult = BaseDialogResult
  
  /**
    * The Share dialog prompts a person to publish an individual story or an Open Graph story to their timeline.
    * This does not require Facebook Login or any extended permissions, so it is the easiest way to enable
    * sharing on web.
    *
    * For use with showDialog() of method type 'share'.
    */
  trait ShareDialogOptions
    extends StObject
       with BaseDialogOptions {
    
    /**
      * The link attached to this post. Required when using method share. Include open graph meta tags in the
      * page at this URL to customize the story that is shared.
      */
    var href: String
  }
  object ShareDialogOptions {
    
    inline def apply(href: String, method: String): ShareDialogOptions = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareDialogOptions]
    }
    
    extension [Self <: ShareDialogOptions](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The response object returned from a success callback for showDialog() of type 'share' or 'share_open_graph'.
    */
  trait ShareDialogResult
    extends StObject
       with BaseDialogResult {
    
    /**
      * Only available if the user is logged into your app using Facebook and has granted publish_actions.
      * If present, this is the ID of the published Open Graph story.
      */
    var post_id: String
  }
  object ShareDialogResult {
    
    inline def apply(error_code: String, error_message: String, post_id: String): ShareDialogResult = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_message = error_message.asInstanceOf[js.Any], post_id = post_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareDialogResult]
    }
    
    extension [Self <: ShareDialogResult](x: Self) {
      
      inline def setPost_id(value: String): Self = StObject.set(x, "post_id", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The Share dialog prompts a person to publish an individual story or an Open Graph story to their timeline.
    * This does not require Facebook Login or any extended permissions, so it is the easiest way to enable
    * sharing on web.
    *
    * For use with showDialog() of method type 'share_open_graph'.
    */
  trait ShareOpenGraphDialogOptions
    extends StObject
       with BaseDialogOptions {
    
    /**
      * A JSON object of key/value pairs specifying parameters which correspond to the action_type being used.
      * Valid key/value pairs are the same parameters that can be used when publishing Open Graph Actions using
      * the API.
      */
    var action_properties: String
    
    /**
      * A string specifying which Open Graph action type to publish, e.g., og.likes for the built in like type.
      * The dialog also supports approved custom types.
      */
    var action_type: String
  }
  object ShareOpenGraphDialogOptions {
    
    inline def apply(action_properties: String, action_type: String, method: String): ShareOpenGraphDialogOptions = {
      val __obj = js.Dynamic.literal(action_properties = action_properties.asInstanceOf[js.Any], action_type = action_type.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareOpenGraphDialogOptions]
    }
    
    extension [Self <: ShareOpenGraphDialogOptions](x: Self) {
      
      inline def setAction_properties(value: String): Self = StObject.set(x, "action_properties", value.asInstanceOf[js.Any])
      
      inline def setAction_type(value: String): Self = StObject.set(x, "action_type", value.asInstanceOf[js.Any])
    }
  }
}
