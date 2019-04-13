package typings
package mustacheLib.mustacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to render templates with `{{mustaches}}`.
  */
@JSImport("mustache", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  /**
    * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
    */
  @js.native
  class Context protected ()
    extends mustacheLib.mustacheMod.MustacheContext {
    /**
      * Initializes a new instance of the `MustacheContenxt` class.
      */
    def this(view: js.Any, parentContext: mustacheLib.mustacheMod.MustacheContext) = this()
    /* CompleteClass */
    override var parentContext: mustacheLib.mustacheMod.MustacheContext = js.native
    /* CompleteClass */
    override var view: js.Any = js.native
    /**
      * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
      *
      * @param name
      * The name to look up.
      */
    /* CompleteClass */
    override def lookup(name: java.lang.String): js.Any = js.native
    /**
      * Creates a new context using the given view with this context as the parent.
      *
      * @param view
      * The view to create the new context with.
      */
    /* CompleteClass */
    override def push(view: js.Any): mustacheLib.mustacheMod.MustacheContext = js.native
  }
  
  /**
    * A simple string scanner that is used by the template parser to find tokens in template strings.
    */
  @js.native
  class Scanner protected ()
    extends mustacheLib.mustacheMod.MustacheScanner {
    /**
      * Initializes a new instance of the `MustacheScanner` class.
      */
    def this(string: java.lang.String) = this()
    /* CompleteClass */
    override var pos: scala.Double = js.native
    /* CompleteClass */
    override var string: java.lang.String = js.native
    /* CompleteClass */
    override var tail: java.lang.String = js.native
    /**
      * Returns `true` if the tail is empty (end of string).
      */
    /* CompleteClass */
    override def eos(): scala.Boolean = js.native
    /**
      * Tries to match the given regular expression at the current position.
      *
      * @param re
      * The regex-pattern to match.
      *
      * @returns
      * The matched text if it can match, the empty string otherwise.
      */
    /* CompleteClass */
    override def scan(re: stdLib.RegExp): java.lang.String = js.native
    /**
      * Skips all text until the given regular expression can be matched.
      *
      * @param re
      * The regex-pattern to match.
      *
      * @returns
      * Returns the skipped string, which is the entire tail if no match can be made.
      */
    /* CompleteClass */
    override def scanUntil(re: stdLib.RegExp): java.lang.String = js.native
  }
  
  /**
    * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
    *
    * It also maintains a cache of templates to avoid the need to parse the same template twice.
    */
  @js.native
  /**
    * Initializes a new instance of the `MustacheWriter` class.
    */
  class Writer ()
    extends mustacheLib.mustacheMod.MustacheWriter
  
}

