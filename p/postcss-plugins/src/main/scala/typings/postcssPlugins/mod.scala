package typings.postcssPlugins

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Array[Plugin] = js.native
  
  trait Plugin extends StObject {
    
    var author: String
    
    var description: String
    
    var name: String
    
    var stars: Double
    
    var tags: js.Array[String]
    
    var url: String
  }
  object Plugin {
    
    inline def apply(
      author: String,
      description: String,
      name: String,
      stars: Double,
      tags: js.Array[String],
      url: String
    ): Plugin = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stars = stars.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStars(value: Double): Self = StObject.set(x, "stars", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Array[Plugin]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Array[Plugin] = ^
}
