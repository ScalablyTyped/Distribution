package typings.mondaySdkJs

import typings.mondaySdkJs.anon.AssetId
import typings.mondaySdkJs.anon.BoardId
import typings.mondaySdkJs.anon.CancelButton
import typings.mondaySdkJs.anon.Data
import typings.mondaySdkJs.anon.DataAny
import typings.mondaySdkJs.anon.DataConfirm
import typings.mondaySdkJs.anon.Height
import typings.mondaySdkJs.anon.Instance
import typings.mondaySdkJs.anon.ItemId
import typings.mondaySdkJs.anon.Message
import typings.mondaySdkJs.anon.PartialclientIdstringapiT
import typings.mondaySdkJs.anon.Partialtokenstring
import typings.mondaySdkJs.anon.Partialtokenstringvariabl
import typings.mondaySdkJs.mondaySdkJsStrings.closeAppFeatureModal
import typings.mondaySdkJs.mondaySdkJsStrings.confirm
import typings.mondaySdkJs.mondaySdkJsStrings.context
import typings.mondaySdkJs.mondaySdkJsStrings.itemIds
import typings.mondaySdkJs.mondaySdkJsStrings.notice
import typings.mondaySdkJs.mondaySdkJsStrings.openAppFeatureModal
import typings.mondaySdkJs.mondaySdkJsStrings.openFilesDialog
import typings.mondaySdkJs.mondaySdkJsStrings.openItemCard
import typings.mondaySdkJs.mondaySdkJsStrings.sessionToken
import typings.mondaySdkJs.mondaySdkJsStrings.settings
import typings.mondaySdkJs.mondaySdkJsStrings.triggerFilesUpload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): MondayClientSdk = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MondayClientSdk]
  inline def apply(config: PartialclientIdstringapiT): MondayClientSdk = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[MondayClientSdk]
  inline def apply(config: Partialtokenstring): MondayServerSdk = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[MondayServerSdk]
  
  @JSImport("monday-sdk-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait APIOptions extends StObject {
    
    /**
      * Access token for the API
      * If not set, will use the credentials of the current user (client only)
      */
    var token: js.UndefOr[String] = js.undefined
    
    /**
      * An object containing GraphQL query variables
      */
    var variables: js.UndefOr[js.Object] = js.undefined
  }
  object APIOptions {
    
    inline def apply(): APIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[APIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: APIOptions] (val x: Self) extends AnyVal {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setVariables(value: js.Object): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  trait GetResponse extends StObject {
    
    var value: Any
    
    var version: Any
  }
  object GetResponse {
    
    inline def apply(value: Any, version: Any): GetResponse = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetResponse] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MondayClientSdk extends StObject {
    
    /**
      * Used for querying the monday.com GraphQL API seamlessly on behalf of the connected user, or using a provided API token.
      * For more information about the GraphQL API and all queries and mutations possible, read the [API Documentation](https://monday.com/developers/v2)
      * @param query A [GraphQL](https://graphql.org/) query, can be either a query (retrieval operation) or a mutation (creation/update/deletion operation).
      * Placeholders may be used, which will be substituted by the variables object passed within the options.
      * @param options
      */
    def api(query: String): js.Promise[Data] = js.native
    def api(query: String, options: APIOptions): js.Promise[Data] = js.native
    
    /**
      * Closes the modal window.
      * @param type Which action to perform
      * @param params Optional parameters for the action
      */
    @JSName("execute")
    def execute_closeAppFeatureModal(`type`: closeAppFeatureModal): js.Promise[DataAny] = js.native
    /**
      * Opens a confirmation dialog to the user **type** `'confirm'`
      * @param type Which action to perform
      * @param params Optional parameters for the action
      */
    @JSName("execute")
    def execute_confirm(`type`: confirm, params: CancelButton): js.Promise[DataConfirm] = js.native
    /**
      * Display a message at the top of the user's page. Useful for success, error & general messages.
      * @param type Which action to perform
      * @param params Optional parameters for the action
      */
    @JSName("execute")
    def execute_notice(`type`: notice, params: Message): js.Promise[Any] = js.native
    /**
      * Opens a new modal window as an iFrame.
      * @param type Which action to perform
      * @param params Optional parameters for the action
      */
    @JSName("execute")
    def execute_openAppFeatureModal(`type`: openAppFeatureModal, params: Height): js.Promise[DataAny] = js.native
    /**
      * Opens a modal with the preview of an asset
      * @param type Which action to perform
      * @param params Optional parameters for the action
      */
    @JSName("execute")
    def execute_openFilesDialog(`type`: openFilesDialog, params: AssetId): js.Promise[Any] = js.native
    /**
      * Opens a popup card with information from the selected item
      * @param type Which action to perform
      * @param params Optional parameters for the action
      */
    @JSName("execute")
    def execute_openItemCard(`type`: openItemCard, params: ItemId): js.Promise[Any] = js.native
    /**
      * Opens a modal to let the current user upload a file to a specific file column.
      *
      * Returns a promise. In case of error, the promise is rejected
      *
      * After the file is successfully uploaded, the "change_column_value" event will be triggered. See the {@link listen} method to subscribe to these events.
      *
      * _Requires boards:write scope_
      * @param type Which action to perform
      * @param params Optional parameters for the action
      */
    @JSName("execute")
    def execute_triggerFilesUpload(`type`: triggerFilesUpload, params: BoardId): js.Promise[Any] = js.native
    
    /**
      * Used for retrieving data from the parent monday.com application where your app is currently running.
      * This object can only be used when your app is running inside an `iframe`. This can only be used in client-side apps.
      * @param type The type of requested information (available values below)
      * - `'context'` Information about where this app is currently displayed, depending on the type of feature
      * - `'settings'` The application settings as configured by the user that installed the app
      * - `'itemIds'` The list of item IDs that are filtered in the current board (or all items if no filters are applied)
      * - `'sessionToken'` A JWT token which is decoded with your app's secret and can be used as a session token between your app's frontend & backend
      * @param params Reserved for future use
      */
    def get(`type`: context | settings | itemIds | sessionToken): js.Promise[Any] = js.native
    def get(`type`: context | settings | itemIds | sessionToken, params: js.Object): js.Promise[Any] = js.native
    
    def listen(typeOrTypes: js.Array[SubscribableEvents], callback: js.Function1[/* res */ Data, Unit]): Unit = js.native
    def listen(
      typeOrTypes: js.Array[SubscribableEvents],
      callback: js.Function1[/* res */ Data, Unit],
      params: js.Object
    ): Unit = js.native
    /**
      * Creates a listener which allows subscribing to certain types of client-side events.
      * @param typeOrTypes The type, or array of types, of events to subscribe to
      * @param callback A callback function that is fired when the listener is triggered by a client-side event
      * @param params Reserved for future use
      */
    def listen(typeOrTypes: SubscribableEvents, callback: js.Function1[/* res */ Data, Unit]): Unit = js.native
    def listen(typeOrTypes: SubscribableEvents, callback: js.Function1[/* res */ Data, Unit], params: js.Object): Unit = js.native
    
    /**
      * Performs a client-side redirection of the user to the monday OAuth screen with your client ID embedded in the URL,
      * sin order to get their approval to generate a temporary OAuth token based on your requested permission scopes.
      * @param object An object with options
      */
    def oauth(): Unit = js.native
    def oauth(`object`: OAuthOptions): Unit = js.native
    
    /**
      * Instead of passing the API token to the `api()` method on each request, you can set the API token once using:
      * @param token Access token for the API
      */
    def setToken(token: String): Unit = js.native
    
    /**
      * The Storage API is in early beta stages, its API is likely to change
      *
      * The monday apps infrastructure includes a persistent, key-value database storage that developers
      * can leverage to store data without having to create their own backend and maintain their own database.
      *
      * The database currently offers instance-level storage only, meaning that each application instance (i.e. a single board view or a dashboard widget) maintains its own storage.
      * Apps cannot share storage across accounts or even across apps installed in the same location.
      */
    var storage: Instance = js.native
  }
  
  @js.native
  trait MondayServerSdk extends StObject {
    
    def api(query: String): js.Promise[Any] = js.native
    def api(query: String, options: Partialtokenstringvariabl): js.Promise[Any] = js.native
    
    def oauthToken(code: String, clientId: String, clientSecret: String): js.Promise[Any] = js.native
    
    def setToken(token: String): Unit = js.native
  }
  
  trait OAuthOptions extends StObject {
    
    /**
      * The OAuth client ID of the requesting application
      * Defaults to your client ID
      */
    var clientId: js.UndefOr[String] = js.undefined
    
    /**
      * The URL of the monday OAuth endpoint
      */
    var mondayOauthUrl: js.UndefOr[String] = js.undefined
  }
  object OAuthOptions {
    
    inline def apply(): OAuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OAuthOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OAuthOptions] (val x: Self) extends AnyVal {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setMondayOauthUrl(value: String): Self = StObject.set(x, "mondayOauthUrl", value.asInstanceOf[js.Any])
      
      inline def setMondayOauthUrlUndefined: Self = StObject.set(x, "mondayOauthUrl", js.undefined)
    }
  }
  
  trait SetResponse extends StObject {
    
    var reason: js.UndefOr[String] = js.undefined
    
    var success: Boolean
  }
  object SetResponse {
    
    inline def apply(success: Boolean): SetResponse = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetResponse] (val x: Self) extends AnyVal {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mondaySdkJs.mondaySdkJsStrings.context
    - typings.mondaySdkJs.mondaySdkJsStrings.settings
    - typings.mondaySdkJs.mondaySdkJsStrings.itemIds
    - typings.mondaySdkJs.mondaySdkJsStrings.events
  */
  trait SubscribableEvents extends StObject
  object SubscribableEvents {
    
    inline def context: typings.mondaySdkJs.mondaySdkJsStrings.context = "context".asInstanceOf[typings.mondaySdkJs.mondaySdkJsStrings.context]
    
    inline def events: typings.mondaySdkJs.mondaySdkJsStrings.events = "events".asInstanceOf[typings.mondaySdkJs.mondaySdkJsStrings.events]
    
    inline def itemIds: typings.mondaySdkJs.mondaySdkJsStrings.itemIds = "itemIds".asInstanceOf[typings.mondaySdkJs.mondaySdkJsStrings.itemIds]
    
    inline def settings: typings.mondaySdkJs.mondaySdkJsStrings.settings = "settings".asInstanceOf[typings.mondaySdkJs.mondaySdkJsStrings.settings]
  }
}
