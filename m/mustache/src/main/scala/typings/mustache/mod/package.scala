package typings.mustache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * An array of two strings, representing the opening and closing tags respectively, to be used in the templates being rendered.
    */
  type OpeningAndClosingTags = js.Tuple2[java.lang.String, java.lang.String]
  type PartialLookupFn = js.Function1[/* partialName */ java.lang.String, js.UndefOr[java.lang.String]]
  /**
    * Whenever partials are provided, it can either be an object that contains the names and templates of partials that are used in tempaltes
    *
    * -- or --
    *
    * A function that is used to load partial template on the fly that takes a single argument: the name of the partial.
    */
  type PartialsOrLookupFn = (typings.std.Record[java.lang.String, java.lang.String]) | typings.mustache.mod.PartialLookupFn
}
