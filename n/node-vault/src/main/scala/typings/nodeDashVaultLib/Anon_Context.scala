package typings
package nodeDashVaultLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  /**
    * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
    */
  var Context: org.scalablytyped.runtime.Instantiable2[
    /* view */ js.Any, 
    /* parentContext */ mustacheLib.mustacheMod.MustacheContext, 
    mustacheLib.mustacheMod.`^Ns`.Context
  ]
  /**
    * A simple string scanner that is used by the template parser to find tokens in template strings.
    */
  var Scanner: org.scalablytyped.runtime.Instantiable1[/* string */ java.lang.String, mustacheLib.mustacheMod.`^Ns`.Scanner]
  /**
    * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
    *
    * It also maintains a cache of templates to avoid the need to parse the same template twice.
    */
  var Writer: org.scalablytyped.runtime.Instantiable0[mustacheLib.mustacheMod.`^Ns`.Writer]
}

object Anon_Context {
  @scala.inline
  def apply(
    Context: org.scalablytyped.runtime.Instantiable2[
      /* view */ js.Any, 
      /* parentContext */ mustacheLib.mustacheMod.MustacheContext, 
      mustacheLib.mustacheMod.`^Ns`.Context
    ],
    Scanner: org.scalablytyped.runtime.Instantiable1[/* string */ java.lang.String, mustacheLib.mustacheMod.`^Ns`.Scanner],
    Writer: org.scalablytyped.runtime.Instantiable0[mustacheLib.mustacheMod.`^Ns`.Writer]
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(Context = Context, Scanner = Scanner, Writer = Writer)
  
    __obj.asInstanceOf[Anon_Context]
  }
}

