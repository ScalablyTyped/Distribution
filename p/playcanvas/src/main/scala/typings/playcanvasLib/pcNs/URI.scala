package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @private
     * @name pc.URI
     * @description Create a new URI object
     * @class A URI object
     * @param {String} uri URI string
     */
@JSGlobal("pc.URI")
@js.native
class URI protected () extends js.Object {
  def this(uri: java.lang.String) = this()
  /**
           * @name pc.URI#authority
           * @description The authority. (e.g. www.example.com)
           */
  var authority: java.lang.String = js.native
  /**
           * @name pc.URI#fragment
           * @description The fragment, the section after a #
           */
  var fragment: java.lang.String = js.native
  /**
           * @name pc.URI#path
           * @description The path. (e.g. /users/example)
           */
  var path: java.lang.String = js.native
  /**
           * @name pc.URI#query
           * @description The query, the section after a ?. (e.g. search=value)
           */
  var query: java.lang.String = js.native
  /**
           * @name pc.URI#scheme
           * @description The scheme. (e.g. http)
           */
  var scheme: java.lang.String = js.native
  /**
           * @function
           * @name pc.URI#getQuery
           * @description Returns the query parameters as an Object
           * @example
           * <code><pre lang="javascript">
           * var s = "http://example.com?a=1&b=2&c=3
           * var uri = new pc.URI(s);
           * var q = uri.getQuery();
           * console.log(q.a); // logs "1"
           * console.log(q.b); // logs "2"
           * console.log(q.c); // logs "3"
           * </code></pre>
           */
  def getQuery(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * @function
           * @name pc.URI#setQuery
           * @description Set the query section of the URI from a Object
           * @param {Object} params Key-Value pairs to encode into the query string
           * @example
           * var s = "http://example.com";
           * var uri = new pc.URI(s);
           * uri.setQuery({"a":1,"b":2});
           * console.log(uri.toString()); // logs "http://example.com?a=1&b=2
           */
  def setQuery(params: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double]): scala.Unit = js.native
}

