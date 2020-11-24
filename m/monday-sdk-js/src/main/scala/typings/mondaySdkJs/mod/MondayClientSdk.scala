package typings.mondaySdkJs.mod

import typings.mondaySdkJs.anon.CancelButton
import typings.mondaySdkJs.anon.Instance
import typings.mondaySdkJs.anon.ItemId
import typings.mondaySdkJs.anon.Message
import typings.mondaySdkJs.mondaySdkJsStrings.confirm
import typings.mondaySdkJs.mondaySdkJsStrings.context
import typings.mondaySdkJs.mondaySdkJsStrings.itemIds
import typings.mondaySdkJs.mondaySdkJsStrings.notice
import typings.mondaySdkJs.mondaySdkJsStrings.openItemCard
import typings.mondaySdkJs.mondaySdkJsStrings.sessionToken
import typings.mondaySdkJs.mondaySdkJsStrings.settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MondayClientSdk extends js.Object {
  
  /**
    * Used for querying the monday.com GraphQL API seamlessly on behalf of the connected user, or using a provided API token.
    * For more information about the GraphQL API and all queries and mutations possible, read the [API Documentation](https://monday.com/developers/v2)
    * @param query A [GraphQL](https://graphql.org/) query, can be either a query (retrieval operation) or a mutation (creation/update/deletion operation).
    * Placeholders may be used, which will be substituted by the variables object passed within the options.
    * @param options
    */
  def api(query: String): js.Promise[_] = js.native
  def api(query: String, options: APIOptions): js.Promise[_] = js.native
  
  /**
    * Opens a confirmation dialog to the user **type** `'confirm'`
    * @param type Which action to perform
    * @param params Optional parameters for the action
    */
  @JSName("execute")
  def execute_confirm(`type`: confirm, params: CancelButton): js.Promise[_] = js.native
  /**
    * Display a message at the top of the user's page. Useful for success, error & general messages.
    * @param type Which action to perform
    * @param params Optional parameters for the action
    */
  @JSName("execute")
  def execute_notice(`type`: notice, params: Message): js.Promise[_] = js.native
  /**
    * Opens a popup card with information from the selected item
    * @param type Which action to perform
    * @param params Optional parameters for the action
    */
  @JSName("execute")
  def execute_openItemCard(`type`: openItemCard, params: ItemId): js.Promise[_] = js.native
  
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
  @JSName("get")
  def get_context(`type`: context): js.Promise[_] = js.native
  @JSName("get")
  def get_context(`type`: context, params: js.Object): js.Promise[_] = js.native
  @JSName("get")
  def get_itemIds(`type`: itemIds): js.Promise[_] = js.native
  @JSName("get")
  def get_itemIds(`type`: itemIds, params: js.Object): js.Promise[_] = js.native
  @JSName("get")
  def get_sessionToken(`type`: sessionToken): js.Promise[_] = js.native
  @JSName("get")
  def get_sessionToken(`type`: sessionToken, params: js.Object): js.Promise[_] = js.native
  @JSName("get")
  def get_settings(`type`: settings): js.Promise[_] = js.native
  @JSName("get")
  def get_settings(`type`: settings, params: js.Object): js.Promise[_] = js.native
  
  def listen(typeOrTypes: js.Array[SubscribableEvents], callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
  def listen(
    typeOrTypes: js.Array[SubscribableEvents],
    callback: js.Function1[/* res */ js.Any, Unit],
    params: js.Object
  ): Unit = js.native
  /**
    * Creates a listener which allows subscribing to certain types of client-side events.
    * @param typeOrTypes The type, or array of types, of events to subscribe to
    * @param callback A callback function that is fired when the listener is triggered by a client-side event
    * @param params Reserved for future use
    */
  def listen(typeOrTypes: SubscribableEvents, callback: js.Function1[/* res */ js.Any, Unit]): Unit = js.native
  def listen(typeOrTypes: SubscribableEvents, callback: js.Function1[/* res */ js.Any, Unit], params: js.Object): Unit = js.native
  
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
