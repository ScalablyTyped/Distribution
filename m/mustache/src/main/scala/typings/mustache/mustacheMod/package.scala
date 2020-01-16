package typings.mustache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mustacheMod {
  import typings.std.Record

  /**
    * An array of two strings, representing the opening and closing tags respectively, to be used in the templates being rendered.
    */
  type OpeningAndClosingTags = js.Tuple2[String, String]
  type PartialLookupFn = js.Function1[/* partialName */ String, js.UndefOr[String]]
  /**
    * Whenever partials are provided, it can either be an object that contains the names and templates of partials that are used in tempaltes
    *
    * -- or --
    *
    * A function that is used to load partial template on the fly that takes a single argument: the name of the partial.
    */
  type PartialsOrLookupFn = (Record[String, String]) | PartialLookupFn
}
