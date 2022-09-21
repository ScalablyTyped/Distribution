package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A URI object.
  *
  * @ignore
  */
@JSImport("playcanvas", "URI")
@js.native
open class URI protected () extends StObject {
  /**
    * Create a new URI instance.
    *
    * @param {string} uri - URI string.
    */
  def this(uri: String) = this()
  
  /**
    * The authority. (e.g. `www.example.com`).
    *
    * @type {string}
    */
  var authority: String = js.native
  
  /**
    * The fragment, the section after a #.
    *
    * @type {string}
    */
  var fragment: String = js.native
  
  /**
    * Returns the query parameters as an Object.
    *
    * @returns {object} The URI's query parameters converted to an Object.
    * @example
    * var s = "http://example.com?a=1&b=2&c=3";
    * var uri = new pc.URI(s);
    * var q = uri.getQuery();
    * console.log(q.a); // logs "1"
    * console.log(q.b); // logs "2"
    * console.log(q.c); // logs "3"
    */
  def getQuery(): js.Object = js.native
  
  /**
    * The path. (e.g. /users/example).
    *
    * @type {string}
    */
  var path: String = js.native
  
  /**
    * The query, the section after a ?. (e.g. search=value).
    *
    * @type {string}
    */
  var query: String = js.native
  
  /**
    * The scheme. (e.g. http).
    *
    * @type {string}
    */
  var scheme: String = js.native
  
  /**
    * Set the query section of the URI from a Object.
    *
    * @param {object} params - Key-Value pairs to encode into the query string.
    * @example
    * var s = "http://example.com";
    * var uri = new pc.URI(s);
    * uri.setQuery({
    *     "a": 1,
    *     "b": 2
    * });
    * console.log(uri.toString()); // logs "http://example.com?a=1&b=2
    */
  def setQuery(params: js.Object): Unit = js.native
}
