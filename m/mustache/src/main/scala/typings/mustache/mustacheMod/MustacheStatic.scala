package typings.mustache.mustacheMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MustacheStatic extends js.Object {
  /**
    * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
    */
  var Context: Instantiable2[/* view */ js.Any, /* parentContext */ MustacheContext, MustacheContext] = js.native
  /**
    * A simple string scanner that is used by the template parser to find tokens in template strings.
    */
  var Scanner: Instantiable1[/* string */ String, MustacheScanner] = js.native
  /**
    * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
    *
    * It also maintains a cache of templates to avoid the need to parse the same template twice.
    */
  var Writer: Instantiable0[MustacheWriter] = js.native
  /**
    * The name of the module.
    */
  var name: String = js.native
  /**
    * The opening and closing tags to parse.
    */
  var tags: js.Array[String] = js.native
  /**
    * The version of the module.
    */
  var version: String = js.native
  /**
    * Clears all cached templates in this writer.
    */
  def clearCache(): Unit = js.native
  /**
    * Escapes HTML-characters.
    *
    * @param value
    * The string to escape.
    */
  def escape(value: String): String = js.native
  /**
    * Parses and caches the given template in the default writer and returns the array of tokens it contains.
    *
    * Doing this ahead of time avoids the need to parse templates on the fly as they are rendered.
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
    * Renders the `template` with the given `view` and `partials` using the default writer.
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
  def render(template: String, view: js.Any): String = js.native
  def render(template: String, view: js.Any, partials: js.Any): String = js.native
  def render(template: String, view: js.Any, partials: js.Any, tags: js.Array[String]): String = js.native
  def render(template: String, view: MustacheContext): String = js.native
  def render(template: String, view: MustacheContext, partials: js.Any): String = js.native
  def render(template: String, view: MustacheContext, partials: js.Any, tags: js.Array[String]): String = js.native
  /**
    * Renders the `template` with the given `view` and `partials` using the default writer.
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
    */
  def to_html(template: String, view: js.Any): js.Any = js.native
  def to_html(template: String, view: js.Any, partials: js.Any): js.Any = js.native
  def to_html(template: String, view: js.Any, partials: js.Any, send: js.Any): js.Any = js.native
  def to_html(template: String, view: MustacheContext): js.Any = js.native
  def to_html(template: String, view: MustacheContext, partials: js.Any): js.Any = js.native
  def to_html(template: String, view: MustacheContext, partials: js.Any, send: js.Any): js.Any = js.native
}

