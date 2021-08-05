package typings.piscina

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Env extends StObject {
    
    var env: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  }
  object Env {
    
    inline def apply(env: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Env = {
      val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
      __obj.asInstanceOf[Env]
    }
    
    extension [Self <: Env](x: Self) {
      
      inline def setEnv(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable1[/* filename */ scala.Nothing, Worker]
       with Instantiable2[/* filename */ scala.Nothing, /* options */ Env, Worker]
  
  trait PostMessage extends StObject {
    
    def postMessage(
      value: js.Any,
      transferList: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ): js.Any
  }
  object PostMessage {
    
    inline def apply(
      postMessage: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any) => js.Any
    ): PostMessage = {
      val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction2(postMessage))
      __obj.asInstanceOf[PostMessage]
    }
    
    extension [Self <: PostMessage](x: Self) {
      
      inline def setPostMessage(
        value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any) => js.Any
      ): Self = StObject.set(x, "postMessage", js.Any.fromFunction2(value))
    }
  }
  
  trait ResourceLimits extends StObject {
    
    var resourceLimits: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
      ] = js.undefined
  }
  object ResourceLimits {
    
    inline def apply(): ResourceLimits = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceLimits]
    }
    
    extension [Self <: ResourceLimits](x: Self) {
      
      inline def setResourceLimits(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "resourceLimits", value.asInstanceOf[js.Any])
      
      inline def setResourceLimitsUndefined: Self = StObject.set(x, "resourceLimits", js.undefined)
    }
  }
}
