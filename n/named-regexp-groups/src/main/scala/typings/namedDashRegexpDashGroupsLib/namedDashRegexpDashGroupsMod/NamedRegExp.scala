package typings
package namedDashRegexpDashGroupsLib.namedDashRegexpDashGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedRegExp extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.`match`)
  var `match`: js.Function1[/* str */ java.lang.String, NamedRegExpExecArray]
  @JSName(org.scalablytyped.runtime.Symbol.replace)
  var replace: js.Function2[
    /* str */ java.lang.String, 
    /* replacement */ java.lang.String | (js.Function2[/* match */ java.lang.String, /* repeated */ java.lang.String, java.lang.String]), 
    java.lang.String
  ]
  @JSName(org.scalablytyped.runtime.Symbol.search)
  var search: js.Function1[/* str */ java.lang.String, scala.Double]
  @JSName(org.scalablytyped.runtime.Symbol.split)
  var split: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]]
  /**
    * Executes a search on a string using a regular expression pattern, and returns an array containing the results of that search.
    * @param string The String object or string literal on which to perform the search.
    */
  def exec(string: java.lang.String): NamedRegExpExecArray | scala.Null
  /**
    * Returns a Boolean value that indicates whether or not a pattern exists in a searched string.
    * @param string String on which to perform the search.
    */
  def test(string: java.lang.String): scala.Boolean
}

object NamedRegExp {
  @scala.inline
  def apply(
    exec: js.Function1[java.lang.String, NamedRegExpExecArray | scala.Null],
    `match`: js.Function1[/* str */ java.lang.String, NamedRegExpExecArray],
    replace: js.Function2[
      /* str */ java.lang.String, 
      /* replacement */ java.lang.String | (js.Function2[/* match */ java.lang.String, /* repeated */ java.lang.String, java.lang.String]), 
      java.lang.String
    ],
    search: js.Function1[/* str */ java.lang.String, scala.Double],
    split: js.Function1[/* str */ java.lang.String, js.Array[java.lang.String]],
    test: js.Function1[java.lang.String, scala.Boolean],
    toString: js.Function0[java.lang.String]
  ): NamedRegExp = {
    val __obj = js.Dynamic.literal(`match` = `match`)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("replace")(replace)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("split")(split)
    __obj.updateDynamic("test")(test)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[NamedRegExp]
  }
}

