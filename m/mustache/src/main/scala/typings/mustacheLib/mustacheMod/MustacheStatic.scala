package typings
package mustacheLib.mustacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MustacheStatic extends js.Object {
  /**
       * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
       */
  var Context: ScalablyTyped.runtime.Instantiable2[/* view */ js.Any, /* parentContext */ MustacheContext, MustacheContext] = js.native
  /**
       * A simple string scanner that is used by the template parser to find tokens in template strings.
       */
  var Scanner: ScalablyTyped.runtime.Instantiable1[/* string */ java.lang.String, MustacheScanner] = js.native
  /**
       * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
       *
       * It also maintains a cache of templates to avoid the need to parse the same template twice.
       */
  var Writer: ScalablyTyped.runtime.Instantiable0[MustacheWriter] = js.native
  /**
       * The name of the module.
       */
  var name: java.lang.String = js.native
  /**
       * The opening and closing tags to parse.
       */
  var tags: js.Array[java.lang.String] = js.native
  /**
       * The version of the module.
       */
  var version: java.lang.String = js.native
  /**
       * Clears all cached templates in this writer.
       */
  def clearCache(): scala.Unit = js.native
  /**
       * Escapes HTML-characters.
       *
       * @param value
       * The string to escape.
       */
  def escape(value: java.lang.String): java.lang.String = js.native
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
  def parse(template: java.lang.String): js.Any = js.native
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
  def parse(template: java.lang.String, tags: js.Array[java.lang.String]): js.Any = js.native
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
  def render(template: java.lang.String, view: js.Any): java.lang.String = js.native
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
  def render(template: java.lang.String, view: js.Any, partials: js.Any): java.lang.String = js.native
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
  def render(template: java.lang.String, view: js.Any, partials: js.Any, tags: js.Array[java.lang.String]): java.lang.String = js.native
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
  def render(template: java.lang.String, view: MustacheContext): java.lang.String = js.native
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
  def render(template: java.lang.String, view: MustacheContext, partials: js.Any): java.lang.String = js.native
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
  def render(
    template: java.lang.String,
    view: MustacheContext,
    partials: js.Any,
    tags: js.Array[java.lang.String]
  ): java.lang.String = js.native
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
  def to_html(template: java.lang.String, view: js.Any): js.Any = js.native
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
  def to_html(template: java.lang.String, view: js.Any, partials: js.Any): js.Any = js.native
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
  def to_html(template: java.lang.String, view: js.Any, partials: js.Any, send: js.Any): js.Any = js.native
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
  def to_html(template: java.lang.String, view: MustacheContext): js.Any = js.native
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
  def to_html(template: java.lang.String, view: MustacheContext, partials: js.Any): js.Any = js.native
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
  def to_html(template: java.lang.String, view: MustacheContext, partials: js.Any, send: js.Any): js.Any = js.native
}

