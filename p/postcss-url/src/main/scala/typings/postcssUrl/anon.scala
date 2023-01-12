package typings.postcssUrl

import typings.node.bufferMod.global.Buffer
import typings.postcssUrl.mod.CustomHashFunction
import typings.postcssUrl.postcssUrlStrings.xxhash32
import typings.postcssUrl.postcssUrlStrings.xxhash64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AbsolutePath extends StObject {
    
    /**
      * Absolute path to asset.
      */
    var absolutePath: js.UndefOr[String] = js.undefined
    
    /**
      * Hash from URL.
      */
    var hash: js.UndefOr[String] = js.undefined
    
    /**
      * URL pathname.
      */
    var pathname: js.UndefOr[String] = js.undefined
    
    /**
      * Current relative path to asset.
      */
    var relativePath: js.UndefOr[String] = js.undefined
    
    /**
      * Querystring from URL.
      */
    var search: js.UndefOr[String] = js.undefined
    
    /**
      * Original URL.
      */
    var url: String
  }
  object AbsolutePath {
    
    inline def apply(url: String): AbsolutePath = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsolutePath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbsolutePath] (val x: Self) extends AnyVal {
      
      inline def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
      
      inline def setRelativePathUndefined: Self = StObject.set(x, "relativePath", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Append extends StObject {
    
    /**
      * Append the original filename in resulting filename.
      */
    var append: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hashing method or custom function.
      */
    var method: js.UndefOr[xxhash32 | xxhash64 | CustomHashFunction] = js.undefined
    
    /**
      * Shrink hast to certain length.
      */
    var shrink: js.UndefOr[Double] = js.undefined
  }
  object Append {
    
    inline def apply(): Append = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Append]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Append] (val x: Self) extends AnyVal {
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setMethod(value: xxhash32 | xxhash64 | CustomHashFunction): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction1(value: /* file */ Buffer => String): Self = StObject.set(x, "method", js.Any.fromFunction1(value))
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setShrink(value: Double): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
      
      inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
    }
  }
  
  trait File extends StObject {
    
    /**
      * File path.
      */
    var file: js.UndefOr[String] = js.undefined
    
    /**
      * PostCSS from option.
      */
    var from: js.UndefOr[String] = js.undefined
    
    /**
      * PostCSS to option.
      */
    var to: js.UndefOr[String] = js.undefined
  }
  object File {
    
    inline def apply(): File = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
}
