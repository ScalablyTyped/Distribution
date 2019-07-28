package typings.nodeDashVault

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.mustache.mustacheMod.MustacheContext
import typings.mustache.mustacheMod.`^Ns`.Context
import typings.mustache.mustacheMod.`^Ns`.Scanner
import typings.mustache.mustacheMod.`^Ns`.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmustache extends js.Object {
  /**
    * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
    */
  var Context: Instantiable2[
    /* view */ js.Any, 
    /* parentContext */ MustacheContext, 
    typings.mustache.mustacheMod.`^Ns`.Context
  ]
  /**
    * A simple string scanner that is used by the template parser to find tokens in template strings.
    */
  var Scanner: Instantiable1[/* string */ String, typings.mustache.mustacheMod.`^Ns`.Scanner]
  /**
    * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
    *
    * It also maintains a cache of templates to avoid the need to parse the same template twice.
    */
  var Writer: Instantiable0[typings.mustache.mustacheMod.`^Ns`.Writer]
}

object Typeofmustache {
  @scala.inline
  def apply(
    Context: Instantiable2[/* view */ js.Any, /* parentContext */ MustacheContext, Context],
    Scanner: Instantiable1[/* string */ String, Scanner],
    Writer: Instantiable0[Writer]
  ): Typeofmustache = {
    val __obj = js.Dynamic.literal(Context = Context, Scanner = Scanner, Writer = Writer)
  
    __obj.asInstanceOf[Typeofmustache]
  }
}

