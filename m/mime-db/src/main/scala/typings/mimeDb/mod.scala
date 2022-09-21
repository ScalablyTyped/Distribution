package typings.mimeDb

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mime-db", JSImport.Namespace)
  @js.native
  val ^ : js.Object & MimeDatabase = js.native
  
  /**
    * @see {@link https://github.com/jshttp/mime-db#data-structure}
    */
  type MimeDatabase = StringDictionary[MimeEntry]
  
  /**
    * @see {@link https://github.com/jshttp/mime-db#data-structure}
    */
  trait MimeEntry extends StObject {
    
    /** The default charset associated with this type, if any. */
    val charset: js.UndefOr[String] = js.undefined
    
    /** Whether a file of this type can be gzipped. */
    val compressible: js.UndefOr[Boolean] = js.undefined
    
    /** Known extensions associated with this mime type. */
    val extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Where the mime type is defined.
      * If not set, it's probably a custom media type.
      */
    val source: js.UndefOr[MimeSource] = js.undefined
  }
  object MimeEntry {
    
    inline def apply(): MimeEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimeEntry]
    }
    
    extension [Self <: MimeEntry](x: Self) {
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setCompressible(value: Boolean): Self = StObject.set(x, "compressible", value.asInstanceOf[js.Any])
      
      inline def setCompressibleUndefined: Self = StObject.set(x, "compressible", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setSource(value: MimeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  /**
    * Sources:
    * http://www.iana.org/assignments/media-types/media-types.xhtml
    * http://svn.apache.org/repos/asf/httpd/httpd/trunk/docs/conf/mime.types
    * http://hg.nginx.org/nginx/raw-file/default/conf/mime.types
    */
  /* Rewritten from type alias, can be one of: 
    - typings.mimeDb.mimeDbStrings.iana
    - typings.mimeDb.mimeDbStrings.apache
    - typings.mimeDb.mimeDbStrings.nginx
  */
  trait MimeSource extends StObject
  object MimeSource {
    
    inline def apache: typings.mimeDb.mimeDbStrings.apache = "apache".asInstanceOf[typings.mimeDb.mimeDbStrings.apache]
    
    inline def iana: typings.mimeDb.mimeDbStrings.iana = "iana".asInstanceOf[typings.mimeDb.mimeDbStrings.iana]
    
    inline def nginx: typings.mimeDb.mimeDbStrings.nginx = "nginx".asInstanceOf[typings.mimeDb.mimeDbStrings.nginx]
  }
  
  type _To = js.Object & MimeDatabase
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & MimeDatabase = ^
}
