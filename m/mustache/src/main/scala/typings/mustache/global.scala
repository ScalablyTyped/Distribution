package typings.mustache

import org.scalablytyped.runtime.Shortcut
import typings.mustache.mod.MustacheContext
import typings.mustache.mod.MustacheScanner
import typings.mustache.mod.MustacheStatic
import typings.mustache.mod.MustacheWriter
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Provides the functionality to render templates with `{{mustaches}}`.
    */
  object Mustache extends Shortcut {
    
    @JSGlobal("Mustache")
    @js.native
    val ^ : MustacheStatic = js.native
    
    /**
      * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Mustache.Context")
    @js.native
    class Context protected ()
      extends StObject
         with MustacheContext {
      /**
        * Initializes a new instance of the `MustacheContext` class.
        */
      def this(view: js.Any) = this()
      def this(view: js.Any, parentContext: MustacheContext) = this()
      
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
      
      /* CompleteClass */
      var view: js.Any = js.native
    }
    
    /**
      * A simple string scanner that is used by the template parser to find tokens in template strings.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Mustache.Scanner")
    @js.native
    class Scanner protected ()
      extends StObject
         with MustacheScanner {
      /**
        * Initializes a new instance of the `MustacheScanner` class.
        */
      def this(string: String) = this()
      
      /**
        * Returns `true` if the tail is empty (end of string).
        */
      /* CompleteClass */
      override def eos(): Boolean = js.native
      
      /* CompleteClass */
      var pos: Double = js.native
      
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
      
      /* CompleteClass */
      var string: String = js.native
      
      /* CompleteClass */
      var tail: String = js.native
    }
    
    /**
      * A Writer knows how to take a stream of tokens and render them to a `string`, given a context.
      *
      * It also maintains a cache of templates to avoid the need to parse the same template twice.
      */
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("Mustache.Writer")
    @js.native
    /**
      * Initializes a new instance of the `MustacheWriter` class.
      */
    class Writer ()
      extends StObject
         with MustacheWriter
    
    type _To = MustacheStatic
    
    /* This means you don't have to write `^`, but can instead just say `Mustache.foo` */
    override def _to: MustacheStatic = ^
  }
}
