package typings.nodeRedUtil.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait I18n extends js.Object {
  
  /**
    * Perform a message catalog lookup.
    */
  @JSName("_")
  def _underscore(id: String): String = js.native
  @JSName("_")
  def _underscore(id: String, tplStrs: Record[String, String | Double]): String = js.native
  /**
    * Perform a message catalog lookup.
    */
  @JSName("_")
  var _underscore_Original: I18nTFunction = js.native
  
  /**
    * Gets a list of languages a given catalog is available in.
    */
  def availableLanguages(namespace: String): js.Array[String] = js.native
  
  /**
    * Gets a message catalog.
    */
  def catalog(namespace: String, lang: String): MessageCatalog = js.native
  
  /**
    * Register a message catalog with i18n.
    */
  def registerMessageCatalog(namespace: String, dir: String, file: String): js.Promise[Unit] = js.native
  
  /**
    * Register multiple message catalogs with i18n.
    */
  def registerMessageCatalogs(catalogs: js.Array[MessageCatalog]): js.Promise[js.Array[js.Object]] = js.native
}
