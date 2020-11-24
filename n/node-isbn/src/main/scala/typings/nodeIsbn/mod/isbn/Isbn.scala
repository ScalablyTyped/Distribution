package typings.nodeIsbn.mod.isbn

import typings.axios.mod.AxiosRequestConfig
import typings.nodeIsbn.anon.GOOGLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Isbn extends js.Object {
  
  var PROVIDER_NAMES: GOOGLE = js.native
  
  /**
    * Provider API that gets chained before `resolve`. If this is specified, the
    * `resolve` fn will honor this order.
    *
    * @param providers - Array of providers. Must be one of more from `isbn.PROVIDER_NAMES`
    *
    * @example
    *
    * ```
    * isbn
    *  .provider([isbn.PROVIDER_NAMES.OPENLIBRARY, isbn.PROVIDER_NAMES.GOOGLE])
    *  .resolve(...)
    * ```
    */
  def provider(providers: js.Array[String]): this.type = js.native
  
  def resolve(isbn: String, callback: ResolveCallback): Unit = js.native
  /**
    * Resolves book info, given an isbn
    * @param isbn
    */
  def resolve(isbn: String, options: AxiosRequestConfig): Unit = js.native
  def resolve(isbn: String, options: AxiosRequestConfig, callback: ResolveCallback): Unit = js.native
  def resolve(isnb: String): js.Promise[Book] = js.native
  @JSName("resolve")
  def resolve_Promise(isnb: String, options: AxiosRequestConfig): js.Promise[Book] = js.native
}
