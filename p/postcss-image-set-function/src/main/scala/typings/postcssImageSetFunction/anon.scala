package typings.postcssImageSetFunction

import typings.postcss.mod.AcceptedPlugin
import typings.postcss.mod.Declaration
import typings.postcss.mod.Postcss
import typings.postcss.mod.Result
import typings.postcss.processorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Decl extends StObject {
    
    var decl: Declaration
    
    var oninvalid: String
    
    /**
      * Create a new `Processor` instance that will apply `plugins`
      * as CSS processors.
      *
      * ```js
      * let postcss = require('postcss')
      *
      * postcss(plugins).process(css, { from, to }).then(result => {
      *   console.log(result.css)
      * })
      * ```
      *
      * @param plugins PostCSS plugins.
      * @return Processor to process multiple CSS.
      */
    def postcss(): default
    def postcss(plugins: AcceptedPlugin*): default
    def postcss(plugins: js.Array[AcceptedPlugin]): default
    @JSName("postcss")
    var postcss_Original: Postcss
    
    var preserve: Boolean
    
    var result: Result
  }
  object Decl {
    
    inline def apply(decl: Declaration, oninvalid: String, postcss: Postcss, preserve: Boolean, result: Result): Decl = {
      val __obj = js.Dynamic.literal(decl = decl.asInstanceOf[js.Any], oninvalid = oninvalid.asInstanceOf[js.Any], postcss = postcss.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Decl]
    }
    
    extension [Self <: Decl](x: Self) {
      
      inline def setDecl(value: Declaration): Self = StObject.set(x, "decl", value.asInstanceOf[js.Any])
      
      inline def setOninvalid(value: String): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      inline def setPostcss(value: Postcss): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Oninvalid extends StObject {
    
    var oninvalid: String
    
    var preserve: Boolean
  }
  object Oninvalid {
    
    inline def apply(oninvalid: String, preserve: Boolean): Oninvalid = {
      val __obj = js.Dynamic.literal(oninvalid = oninvalid.asInstanceOf[js.Any], preserve = preserve.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oninvalid]
    }
    
    extension [Self <: Oninvalid](x: Self) {
      
      inline def setOninvalid(value: String): Self = StObject.set(x, "oninvalid", value.asInstanceOf[js.Any])
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
    }
  }
}
