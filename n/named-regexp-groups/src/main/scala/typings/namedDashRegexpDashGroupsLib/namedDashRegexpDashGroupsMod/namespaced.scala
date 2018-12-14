package typings
package namedDashRegexpDashGroupsLib.namedDashRegexpDashGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("named-regexp-groups", JSImport.Namespace)
@js.native
class namespaced () extends NamedRegExp {
  def this(pattern: java.lang.String) = this()
  def this(pattern: stdLib.RegExp) = this()
  def this(pattern: java.lang.String, flags: java.lang.String) = this()
  def this(pattern: stdLib.RegExp, flags: java.lang.String) = this()
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.`match`)
  override var `match`: js.Function1[/* str */ java.lang.String, NamedRegExpExecArray] = js.native
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.replace)
  override var replace: js.Function2[
    /* str */ java.lang.String, 
    /* replacement */ java.lang.String | (js.Function2[/* match */ java.lang.String, /* repeated */java.lang.String, java.lang.String]), 
    java.lang.String
  ] = js.native
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.search)
  override var search: js.Function1[/* str */ java.lang.String, scala.Double] = js.native
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.split)
  override var split: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]] = js.native
  /**
       * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
       * @param string The String object or string literal on which to perform the search.
       */
  /* CompleteClass */
  override def exec(string: java.lang.String): NamedRegExpExecArray | scala.Null = js.native
  /**
       * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
       * @param string String on which to perform the search.
       */
  /* CompleteClass */
  override def test(string: java.lang.String): scala.Boolean = js.native
}

