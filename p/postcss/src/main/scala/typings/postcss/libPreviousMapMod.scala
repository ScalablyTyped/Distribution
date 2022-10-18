package typings.postcss

import typings.postcss.mod.ProcessOptions
import typings.sourceMapJs.mod.SourceMapConsumer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPreviousMapMod {
  
  @JSImport("postcss/lib/previous-map", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PreviousMap {
    /**
      * @param css  Input CSS source.
      * @param opts Process options.
      */
    def this(css: String) = this()
    def this(css: String, opts: ProcessOptions) = this()
    
    /**
      * Create a instance of `SourceMapGenerator` class
      * from the `source-map` library to work with source map information.
      *
      * It is lazy method, so it will create object only on first call
      * and then it will use cache.
      *
      * @return Object with source map information.
      */
    /* CompleteClass */
    override def consumer(): SourceMapConsumer = js.native
    
    /**
      * Was source map inlined by data-uri to input CSS.
      */
    /* CompleteClass */
    var `inline`: Boolean = js.native
    
    /**
      * Does source map contains `sourcesContent` with input source text.
      *
      * @return Is `sourcesContent` present.
      */
    /* CompleteClass */
    override def withContent(): Boolean = js.native
  }
  
  trait PreviousMap extends StObject {
    
    /**
      * `sourceMappingURL` content.
      */
    var annotation: js.UndefOr[String] = js.undefined
    
    /**
      * Create a instance of `SourceMapGenerator` class
      * from the `source-map` library to work with source map information.
      *
      * It is lazy method, so it will create object only on first call
      * and then it will use cache.
      *
      * @return Object with source map information.
      */
    def consumer(): SourceMapConsumer
    
    /**
      * The CSS source identifier. Contains `Input#file` if the user
      * set the `from` option, or `Input#id` if they did not.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * Was source map inlined by data-uri to input CSS.
      */
    var `inline`: Boolean
    
    /**
      * Path to source map file.
      */
    var mapFile: js.UndefOr[String] = js.undefined
    
    /**
      * The directory with source map file, if source map is in separated file.
      */
    var root: js.UndefOr[String] = js.undefined
    
    /**
      * Source map file content.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * Does source map contains `sourcesContent` with input source text.
      *
      * @return Is `sourcesContent` present.
      */
    def withContent(): Boolean
  }
  object PreviousMap {
    
    inline def apply(consumer: () => SourceMapConsumer, `inline`: Boolean, withContent: () => Boolean): PreviousMap = {
      val __obj = js.Dynamic.literal(consumer = js.Any.fromFunction0(consumer), withContent = js.Any.fromFunction0(withContent))
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviousMap]
    }
    
    extension [Self <: PreviousMap](x: Self) {
      
      inline def setAnnotation(value: String): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      inline def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      inline def setConsumer(value: () => SourceMapConsumer): Self = StObject.set(x, "consumer", js.Any.fromFunction0(value))
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setMapFile(value: String): Self = StObject.set(x, "mapFile", value.asInstanceOf[js.Any])
      
      inline def setMapFileUndefined: Self = StObject.set(x, "mapFile", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWithContent(value: () => Boolean): Self = StObject.set(x, "withContent", js.Any.fromFunction0(value))
    }
  }
}
