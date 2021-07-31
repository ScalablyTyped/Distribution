package typings.multimatch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Extends [`minimatch.match()`](https://github.com/isaacs/minimatch#minimatchmatchlist-pattern-options) with support for multiple patterns.
  @param paths - Paths to match against.
  @param patterns - Globbing patterns to use. For example: `['*', '!cake']`. See supported [`minimatch` patterns](https://github.com/isaacs/minimatch#usage).
  @returns The matching paths in the order of input paths.
  @example
  ```
  import multimatch = require('multimatch');
  multimatch(['unicorn', 'cake', 'rainbows'], ['*', '!cake']);
  //=> ['unicorn', 'rainbows']
  ```
  */
  @scala.inline
  def apply(paths: String, patterns: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(paths: String, patterns: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(paths: String, patterns: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(paths: String, patterns: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(paths: js.Array[String], patterns: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(paths: js.Array[String], patterns: String, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(paths: js.Array[String], patterns: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @scala.inline
  def apply(paths: js.Array[String], patterns: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(paths.asInstanceOf[js.Any], patterns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("multimatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<minimatch.minimatch.IOptions> */
  trait Options extends StObject {
    
    val debug: js.UndefOr[Boolean] = js.undefined
    
    val dot: js.UndefOr[Boolean] = js.undefined
    
    val flipNegate: js.UndefOr[Boolean] = js.undefined
    
    val matchBase: js.UndefOr[Boolean] = js.undefined
    
    val nobrace: js.UndefOr[Boolean] = js.undefined
    
    val nocase: js.UndefOr[Boolean] = js.undefined
    
    val nocomment: js.UndefOr[Boolean] = js.undefined
    
    val noext: js.UndefOr[Boolean] = js.undefined
    
    val noglobstar: js.UndefOr[Boolean] = js.undefined
    
    val nonegate: js.UndefOr[Boolean] = js.undefined
    
    val nonull: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setFlipNegate(value: Boolean): Self = StObject.set(x, "flipNegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipNegateUndefined: Self = StObject.set(x, "flipNegate", js.undefined)
      
      @scala.inline
      def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      @scala.inline
      def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      @scala.inline
      def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      @scala.inline
      def setNocomment(value: Boolean): Self = StObject.set(x, "nocomment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocommentUndefined: Self = StObject.set(x, "nocomment", js.undefined)
      
      @scala.inline
      def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      @scala.inline
      def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      @scala.inline
      def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      @scala.inline
      def setNonull(value: Boolean): Self = StObject.set(x, "nonull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonullUndefined: Self = StObject.set(x, "nonull", js.undefined)
    }
  }
}
