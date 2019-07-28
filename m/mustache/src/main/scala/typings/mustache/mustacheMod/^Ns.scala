package typings.mustache.mustacheMod

import typings.std.RegExp
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
  class Context protected () extends MustacheContext {
    /**
      * Initializes a new instance of the `MustacheContenxt` class.
      */
    def this(view: js.Any, parentContext: MustacheContext) = this()
    /* CompleteClass */
    override var parentContext: MustacheContext = js.native
    /* CompleteClass */
    override var view: js.Any = js.native
    /**
      * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
      *
      * @param name
      * The name to look up.
      */
    /* CompleteClass */
    override def lookup(name: String): js.Any = js.native
    /**
      * Creates a new context using the given view with this context as the parent.
      *
      * @param view
      * The view to create the new context with.
      */
    /* CompleteClass */
    override def push(view: js.Any): MustacheContext = js.native
  }
  
  /**
    * A simple string scanner that is used by the template parser to find tokens in template strings.
    */
  @js.native
  class Scanner protected () extends MustacheScanner {
    /**
      * Initializes a new instance of the `MustacheScanner` class.
      */
    def this(string: String) = this()
    /* CompleteClass */
    override var pos: Double = js.native
    /* CompleteClass */
    override var string: String = js.native
    /* CompleteClass */
    override var tail: String = js.native
    /**
      * Returns `true` if the tail is empty (end of string).
      */
    /* CompleteClass */
    override def eos(): Boolean = js.native
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
    override def scan(re: RegExp): String = js.native
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
    override def scanUntil(re: RegExp): String = js.native
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
  class Writer () extends MustacheWriter
  
}

