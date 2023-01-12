package typings.nodemailerExpressHandlebars

import typings.nodemailer.libMailerMod.PluginFunction
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: NodemailerExpressHandlebarsOptions): PluginFunction[Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[PluginFunction[Any]]
  
  @JSImport("nodemailer-express-handlebars", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Exphbs = ReturnType[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof create */ Any
  ]
  
  type ExphbsOptions = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof create * / any>[0] */ js.Any
  
  @js.native
  trait HbsTransporter
    extends typings.nodemailer.libMailerMod.^[Any]
  
  trait NodemailerExpressHandlebarsOptions extends StObject {
    
    var extName: js.UndefOr[String] = js.undefined
    
    var viewEngine: Exphbs | ExphbsOptions
    
    var viewPath: String
  }
  object NodemailerExpressHandlebarsOptions {
    
    inline def apply(viewEngine: Exphbs | ExphbsOptions, viewPath: String): NodemailerExpressHandlebarsOptions = {
      val __obj = js.Dynamic.literal(viewEngine = viewEngine.asInstanceOf[js.Any], viewPath = viewPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodemailerExpressHandlebarsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodemailerExpressHandlebarsOptions] (val x: Self) extends AnyVal {
      
      inline def setExtName(value: String): Self = StObject.set(x, "extName", value.asInstanceOf[js.Any])
      
      inline def setExtNameUndefined: Self = StObject.set(x, "extName", js.undefined)
      
      inline def setViewEngine(value: Exphbs | ExphbsOptions): Self = StObject.set(x, "viewEngine", value.asInstanceOf[js.Any])
      
      inline def setViewPath(value: String): Self = StObject.set(x, "viewPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait TemplateOptions extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object TemplateOptions {
    
    inline def apply(): TemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
