package typings.mustache.mustacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
  *
  * It also maintains a cache of templates to avoid the need to parse the same template twice.
  */
@js.native
trait MustacheWriter extends js.Object {
  /**
    * Clears all cached templates in this writer.
    */
  def clearCache(): Unit = js.native
  /**
    * Parses and caches the given `template` and returns the array of tokens that is generated from the parse.
    *
    * @param template
    * The template to parse.
    *
    * @param tags
    * The tags to use.
    */
  def parse(template: String): js.Any = js.native
  def parse(template: String, tags: js.Array[String]): js.Any = js.native
  /**
    * High-level method that is used to render the given `template` with the given `view`.
    *
    * @param template
    * The template to render.
    *
    * @param view
    * The view to render the template with.
    *
    * @param partials
    * Either an object that contains the names and templates of partials that are used in a template
    *
    * -- or --
    *
    * A function that is used to load partial template on the fly that takes a single argument: the name of the partial.
    *
    * @param tags
    * The tags to use.
    */
  def render(template: String, view: js.Any, partials: js.Any): String = js.native
  def render(template: String, view: js.Any, partials: js.Any, tags: js.Array[String]): String = js.native
  def render(template: String, view: MustacheContext, partials: js.Any): String = js.native
  def render(template: String, view: MustacheContext, partials: js.Any, tags: js.Array[String]): String = js.native
  /**
    * Low-level method that renders the given array of `tokens` using the given `context` and `partials`.
    *
    * @param tokens
    * The tokens to render.
    *
    * @param context
    * The context to use for rendering the tokens.
    *
    * @param partials
    * The partials to use for rendering the tokens.
    *
    * @param originalTemplate
    * An object used to extract the portion of the original template that was contained in a higher-order section.
    *
    * If the template doesn't use higher-order sections, this argument may be omitted.
    */
  def renderTokens(tokens: js.Array[String], context: MustacheContext, partials: js.Any, originalTemplate: js.Any): String = js.native
}

